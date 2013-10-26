package mysticruins;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.minecraftforge.common.Configuration;

public class Config {
	public static Configuration config;
	public static int RuinRarity;
	public static int DunRarity;
	public static List<Integer>[] allowId = new ArrayList[4];
	public static final String[] allows = { "Ruin allowed dimension id", "Dungeon allowed dimension id", "Ruin allowed biome id", "Dungeon allowed biome id" };

	public static void initialize(File file) {
		config = new Configuration(file);
		config.load();
		RuinRarity = config.get("General", "Ruin Rarity", 2, "Tries per chunk : lower to make rarer").getInt();
		DunRarity = config.get("General", "Mystic Dungeon Rarity", 1, "Tries per chunk : lower to make rarer").getInt();
		String[] ID;
		for (int i = 0; i < allows.length; i++) {
			ID = config.get("General", allows[i], i < 2 ? "0," : "1,2,3,4,5,6,7,21,22").getString().split(",");
			allowId[i] = new ArrayList();
			for (String txt : ID) {
				try {
					allowId[i].add(Integer.parseInt(txt.trim()));
				} catch (NumberFormatException e) {
				}
			}
		}
		config.save();
	}
}