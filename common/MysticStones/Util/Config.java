package mysticstones.util;

import java.util.List;
import java.io.File;
import java.util.ArrayList;

import net.minecraftforge.common.Configuration;

public class Config {
	public static final String[] keys = { "anorthosite", "limestone", "marble", "migmatite", "orthogneiss", "slate", "travertine" };
	public static int planksID;
	public static int stonesID;
	public static int stoneBricksID;
	public static int reinforcedBricksID;
	public static int[] rare = new int[keys.length];
	public static List<Integer> allowed = new ArrayList<Integer>();

	public static void initialize(File file) {
		Configuration config = new Configuration(file);
		config.load();
		planksID = config.getBlock("Plank IDs", 509).getInt();
		stonesID = config.getBlock("Stone IDs", 510).getInt();
		stoneBricksID = config.getBlock("Stone Brick IDs", 511).getInt();
		reinforcedBricksID = config.getBlock("Reinforced Brick IDs", 512).getInt();
		for (int i = 0; i < rare.length; i++) {
			rare[i] = config.get("Generation", "Rarity of " + keys[i], 3).getInt();
		}
		for (String id : config.get("Generation", "Allowed Dimension ID", "0,").getString().split(",")) {
			try {
				allowed.add(Integer.parseInt(id.trim()));
			} catch (NumberFormatException e) {
			}
		}
		config.save();
	}
}