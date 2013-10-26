package mysticruins;

import java.io.File;
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

	public static void initialize(File file) {
		config = new Configuration(file);
		config.load();
		RuinRarity = config.get("General", "Ruin Rarity", 2, "Tries per chunk : lower to make rarer").getInt();
		DunRarity = config.get("General", "Mystic Dungeon Rarity", 1, "Tries per chunk : lower to make rarer").getInt();
		String[] ID;
		for (int i = 0; i < allows.length; i++) {
			ID = config.get("General", allows[i], i < 2 ? "0," : "1,2,3,4,5,6,7,21,22", i < 2 ? "" : "Use ALL or * for all biomes, biome id or biome tags").getString().split(",");
			allowId[i] = new HashSet();
			for (String txt : ID) {
				try {
					allowId[i].add(Integer.parseInt(txt.trim()));
				} catch (NumberFormatException e) {
					if (i > 1) {
						if (txt.equals("*") || txt.equalsIgnoreCase("ALL")) {
							allowId[i].clear();
							for (BiomeGenBase biome : BiomeGenBase.biomeList) {
								if (biome != null) {
									allowId[i].add(biome.biomeID);
								}
							}
							break;
						} else {
							try {
								for (BiomeGenBase biome : BiomeDictionary.getBiomesForType(Type.valueOf(txt.toUpperCase()))) {
									if (biome != null) {
										allowId[i].add(biome.biomeID);
									}
								}
							} catch (IllegalArgumentException l) {
							}
						}
					}
				}
			}
		}
		config.save();
	}
}