package mysticruins;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandom;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DungeonHooks.DungeonMob;

public class Config {
	public static Configuration config;
	public static int RuinRarity;
	public static int DunRarity;
	public static Set<Integer>[] allowId = new HashSet[4];
	public static final String[] allows = { "Ruin allowed dimension id", "Dungeon allowed dimension id", "Ruin allowed biome id", "Dungeon allowed biome id" };
	public static Set<Type>[] allowType = new HashSet[2];
	public static List<DungeonMob> dungeonMobs = new ArrayList<DungeonMob>();
	public static final String commonItems = Item.pickaxeIron.itemID + "," + Item.axeIron.itemID + "," + Item.swordIron.itemID + "," + Item.shovelIron.itemID + "," + Item.ingotGold.itemID + ","
			+ Item.ingotIron.itemID;
	public static final String rareItems = Item.enderPearl.itemID + ":4," + Item.diamond.itemID + "," + Item.emerald.itemID + "," + Item.appleGold.itemID + "," + Item.ingotGold.itemID + ","
			+ Item.ingotIron.itemID;

	public static void addDungeonMob(String name, int rarity) {
		for (DungeonMob mob : dungeonMobs) {
			if (name.equals(mob.type)) {
				mob.itemWeight += rarity;
				return;
			}
		}
		dungeonMobs.add(new DungeonMob(rarity, name));
	}

	public static String getRandomDungeonMob(Random rand) {
		DungeonMob mob = (DungeonMob) WeightedRandom.getRandomItem(rand, dungeonMobs);
		if (mob == null) {
			return "";
		}
		return mob.type;
	}

	public static void initialize(File file) {
		config = new Configuration(file);
		config.load();
		String[] mobs = config.get("DungeonMobs", "Spawner Type & Relative Chance", "Skeleton-50,Spider-50,Zombie-20,Cavepider-10,Blaze-1", "MobName-RelativeWeight").getString().split(",");
		String[] mob;
		for (String txt : mobs) {
			mob = txt.split("-");
			if (mob.length == 2) {
				try {
					addDungeonMob(mob[0].trim(), Integer.parseInt(mob[1].trim()));
				} catch (NumberFormatException e) {
				}
			}
		}
		setChest("Common Items", commonItems, ChestFiller.valuables);
		setChest("Rare Items", rareItems, ChestFiller.rares);
		StringBuilder build = new StringBuilder("Available biome tags are: ");
		for (Type t : Type.values()) {
			build.append(t);
			build.append(",");
		}
		config.addCustomCategoryComment("General", build.toString());
		RuinRarity = config.get("General", "Ruin Rarity", 2, "Tries per chunk : lower to make rarer").getInt();
		DunRarity = config.get("General", "Mystic Dungeon Rarity", 1, "Tries per chunk : lower to make rarer").getInt();
		String[] ID;
		for (int i = 0; i < allows.length; i++) {
			ID = config
					.get("General", allows[i], i < 2 ? "0,[2;10]" : "ALL,-WATER",
							i < 2 ? "Use [id1;id2] to add a range of id, prefix with - to exclude" : "Use ALL or * for all biomes, select with biome id or biome tags, prefix with - to exclude")
					.getString().split(",");
			allowId[i] = new HashSet();
			if (i > 1) {
				allowType[i - 2] = new HashSet();
			}
			for (String txt : ID) {
				if (i > 1 && txt.startsWith("-")) {
					txt = txt.substring(1).trim();
					try {
						allowId[i].remove(Integer.parseInt(txt));
					} catch (NumberFormatException e) {
						try {
							allowType[i - 2].remove(Type.valueOf(txt.toUpperCase()));
						} catch (IllegalArgumentException l) {
						}
					}
				} else if (i < 1 && txt.contains("[") && txt.contains("]")) {
					boolean remove = txt.startsWith("-");
					txt = txt.substring(txt.indexOf("["), txt.indexOf("]"));
					if (txt.split(";").length == 2) {
						try {
							int a = Integer.parseInt(txt.split(";")[0]);
							int b = Integer.parseInt(txt.split(";")[1]);
							int c;
							if (a > b) {
								c = a;
								a = b;
								b = c;
							}
							for (int x = a; x <= b; x++) {
								if (remove) {
									allowId[i].remove(x);
								} else {
									allowId[i].add(x);
								}
							}
						} catch (NumberFormatException n) {
						}
					}
				} else {
					try {
						int j = Integer.parseInt(txt.trim());
						allowId[i].add(j);
						if (i > 1) {
							allowType[i - 2].addAll(Arrays.asList(BiomeDictionary.getTypesForBiome(BiomeGenBase.biomeList[j])));
						}
					} catch (NumberFormatException e) {
						if (i > 1) {
							if (txt.equals("*") || txt.equalsIgnoreCase("ALL")) {
								for (int j = 0; j < BiomeGenBase.biomeList.length; j++) {
									allowId[i].add(j);
								}
								for (Type t : Type.values()) {
									allowType[i - 2].add(t);
								}
							} else {
								try {
									Type type = Type.valueOf(txt.toUpperCase());
									allowType[i - 2].add(type);
									for (BiomeGenBase biome : BiomeDictionary.getBiomesForType(type)) {
										allowId[i].add(biome.biomeID);
									}
								} catch (IllegalArgumentException l) {
								}
							}
						}
					}
				}
			}
		}
		config.save();
	}

	private static void setChest(String type, String list, List<ItemStack> valuables) {
		String[] items = config.get("Chests", type, list, "itemid:stacksize:damage").getString().split(",");
		String[] item;
		for (String txt : items) {
			item = txt.split(":");
			int id = -1, amount = 1, data = 0;
			try {
				switch (item.length) {
				case 3:
					data = Integer.parseInt(item[2]);
				case 2:
					amount = Integer.parseInt(item[1]);
				case 1:
					id = Integer.parseInt(item[0]);
					break;
				default:
					continue;
				}
			} catch (NumberFormatException n) {
				continue;
			}
			if (id > 0 && amount > 0 && data >= 0) {
				valuables.add(new ItemStack(id, amount, data));
			}
		}
	}
}