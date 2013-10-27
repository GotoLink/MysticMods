package mysticruins;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.Configuration;

public class Config {
	public static Configuration config;
	public static int RuinRarity;
	public static int DunRarity;
	public static Set<Integer>[] allowId = new HashSet[4];
	public static final String[] allows = { "Ruin allowed dimension id", "Dungeon allowed dimension id", "Ruin allowed biome id", "Dungeon allowed biome id" };
	public static Set<Type>[] allowType = new HashSet[2];

	public static void initialize(File file) {
		config = new Configuration(file);
		config.load();
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
			ID = config.get("General", allows[i], i < 2 ? "0," : "ALL,-WATER", i < 2 ? "" : "Use ALL or * for all biomes, select with biome id or biome tags, prefix with - to exclude").getString()
					.split(",");
			allowId[i] = new HashSet();
			if (i > 1) {
				allowType[i - 2] = new HashSet();
			}
			for (String txt : ID) {
				if (txt.startsWith("-") && i > 1) {
					txt = txt.substring(1).trim();
					try {
						allowId[i].remove(Integer.parseInt(txt));
					} catch (NumberFormatException e) {
						try {
							allowType[i - 2].remove(Type.valueOf(txt.toUpperCase()));
						} catch (IllegalArgumentException l) {
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
}