package mysticworld.util;

import java.io.File;

import mysticworld.MysticWorld;
import mysticworld.lib.Booleans;
import net.minecraftforge.common.config.Configuration;

public class Config {
	public static Configuration config;

	public static void initialize(File file) {
		config = new Configuration(file);
        MysticWorld.instance.ENABLE = config.get("General", "Enable", true).getBoolean(true);
		//Boolean Configurations
		Booleans.ENABLE_BUSH_GEN = config.get("World Generation", "Enable Bush Generation", true).getBoolean(true);
		Booleans.ENABLE_GLACIER_GEN = config.get("World Generation", "Enable Glacier Biome", true).getBoolean(true);
		Booleans.ENABLE_JUNGLE_REWRITE = config.get("World Generation", "Enable Vanilla Jungle Biome Modification", true).getBoolean(true);
		Booleans.ENABLE_MOUNTAIN_GEN = config.get("World Generation", "Enable Mountain Biome", true).getBoolean(true);
		Booleans.ENABLE_STEPPE_GEN = config.get("World Generation", "Enable Steppe Biome", true).getBoolean(true);
		Booleans.ENABLE_TUNDRA_GEN = config.get("World Generation", "Enable Tundra Biome", true).getBoolean(true);
		config.save();
	}
}