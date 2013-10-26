package mysticworld.util;

import java.io.File;

import mysticworld.lib.BlockIds;
import mysticworld.lib.Booleans;
import mysticworld.lib.ItemIds;
import mysticworld.lib.Strings;
import net.minecraftforge.common.Configuration;

public class Config {
	public static Configuration config;

	public static void initialize(File file) {
		config = new Configuration(file);
		//Boolean Configurations
		Booleans.ENABLE_BUSH_GEN = config.get("World Generation", "Enable Bush Generation", true).getBoolean(true);
		Booleans.ENABLE_GLACIER_GEN = config.get("World Generation", "Enable Glacier Biome", true).getBoolean(true);
		Booleans.ENABLE_JUNGLE_REWRITE = config.get("World Generation", "Enable Vanilla Jungle Biome Modification", true).getBoolean(true);
		Booleans.ENABLE_MOUNTAIN_GEN = config.get("World Generation", "Enable Mountain Biome", true).getBoolean(true);
		Booleans.ENABLE_STEPPE_GEN = config.get("World Generation", "Enable Steppe Biome", true).getBoolean(true);
		Booleans.ENABLE_TUNDRA_GEN = config.get("World Generation", "Enable Tundra Biome", true).getBoolean(true);
		//Block Configuration
		BlockIds.ORE_STONE_1 = config.getBlock(Strings.IMBUED_STONE_NAME, BlockIds.ORE_STONE_1).getInt(BlockIds.ORE_STONE_1);
		BlockIds.BUSH = config.getBlock(Strings.BUSH_NAME, BlockIds.BUSH).getInt(BlockIds.BUSH);
		BlockIds.LIGHT_CUBE = config.getBlock(Strings.LIGHT_CUBE_NAME, BlockIds.LIGHT_CUBE).getInt(BlockIds.LIGHT_CUBE);
		BlockIds.PLATFORM = config.getBlock(Strings.PLATFORM_NAME, BlockIds.PLATFORM).getInt(BlockIds.PLATFORM);
		BlockIds.PILLAR = config.getBlock(Strings.PILLAR_NAME, BlockIds.PILLAR).getInt(BlockIds.PILLAR);
		BlockIds.PILLAR_INSERT = config.getBlock(Strings.PILLAR_INSERT_NAME, BlockIds.PILLAR_INSERT).getInt(BlockIds.PILLAR_INSERT);
		//Item Configuration
		ItemIds.IMBUED_SHARD = config.getItem(Strings.IMBUED_SHARD_NAME, ItemIds.IMBUED_SHARD).getInt(ItemIds.IMBUED_SHARD);
		ItemIds.STAFF_PARTS = config.getItem(Strings.STAFF_NAME, ItemIds.STAFF_PARTS).getInt(ItemIds.STAFF_PARTS);
		ItemIds.FIRE_STAFF = config.getItem(Strings.FIRE_STAFF_NAME, ItemIds.FIRE_STAFF).getInt(ItemIds.FIRE_STAFF);
		ItemIds.WATER_STAFF = config.getItem(Strings.WATER_STAFF_NAME, ItemIds.WATER_STAFF).getInt(ItemIds.WATER_STAFF);
		ItemIds.EARTH_STAFF = config.getItem(Strings.EARTH_STAFF_NAME, ItemIds.EARTH_STAFF).getInt(ItemIds.EARTH_STAFF);
		ItemIds.AIR_STAFF = config.getItem(Strings.AIR_STAFF_NAME, ItemIds.AIR_STAFF).getInt(ItemIds.AIR_STAFF);
		ItemIds.ENERGY_STAFF = config.getItem(Strings.ENERGY_STAFF_NAME, ItemIds.ENERGY_STAFF).getInt(ItemIds.ENERGY_STAFF);
		ItemIds.STAFF_POWER = config.getItem(Strings.POWER_STAFF_NAME, ItemIds.STAFF_POWER).getInt(ItemIds.STAFF_POWER);
		ItemIds.BUSH_FRUIT = config.getItem(Strings.BUSH_FRUIT_NAME, ItemIds.BUSH_FRUIT).getInt(ItemIds.BUSH_FRUIT);
		ItemIds.VERDITE_HELMET = config.getItem(Strings.VERDITE_HELMET_NAME, ItemIds.VERDITE_HELMET).getInt(ItemIds.VERDITE_HELMET);
		ItemIds.VERDITE_CHESTPLATE = config.getItem(Strings.VERDITE_CHESTPLATE_NAME, ItemIds.VERDITE_CHESTPLATE).getInt(ItemIds.VERDITE_CHESTPLATE);
		ItemIds.VERDITE_LEGGINGS = config.getItem(Strings.VERDITE_LEGGINGS_NAME, ItemIds.VERDITE_LEGGINGS).getInt(ItemIds.VERDITE_LEGGINGS);
		ItemIds.VERDITE_BOOTS = config.getItem(Strings.VERDITE_BOOTS_NAME, ItemIds.VERDITE_BOOTS).getInt(ItemIds.VERDITE_BOOTS);
		ItemIds.MITHRIL_HELMET = config.getItem(Strings.MITHRIL_HELMET_NAME, ItemIds.MITHRIL_HELMET).getInt(ItemIds.MITHRIL_HELMET);
		ItemIds.MITHRIL_CHESTPLATE = config.getItem(Strings.MITHRIL_CHESTPLATE_NAME, ItemIds.MITHRIL_CHESTPLATE).getInt(ItemIds.MITHRIL_CHESTPLATE);
		ItemIds.MITHRIL_LEGGINGS = config.getItem(Strings.MITHRIL_LEGGINGS_NAME, ItemIds.MITHRIL_LEGGINGS).getInt(ItemIds.MITHRIL_LEGGINGS);
		ItemIds.MITHRIL_BOOTS = config.getItem(Strings.MITHRIL_BOOTS_NAME, ItemIds.MITHRIL_BOOTS).getInt(ItemIds.MITHRIL_BOOTS);
		ItemIds.ADAMANTINE_HELMET = config.getItem(Strings.ADAMANTINE_HELMET_NAME, ItemIds.ADAMANTINE_HELMET).getInt(ItemIds.ADAMANTINE_HELMET);
		ItemIds.ADAMANTINE_CHESTPLATE = config.getItem(Strings.ADAMANTINE_CHESTPLATE_NAME, ItemIds.ADAMANTINE_CHESTPLATE).getInt(ItemIds.ADAMANTINE_CHESTPLATE);
		ItemIds.ADAMANTINE_LEGGINGS = config.getItem(Strings.ADAMANTINE_LEGGINGS_NAME, ItemIds.ADAMANTINE_LEGGINGS).getInt(ItemIds.ADAMANTINE_LEGGINGS);
		ItemIds.ADAMANTINE_BOOTS = config.getItem(Strings.ADAMANTINE_BOOTS_NAME, ItemIds.ADAMANTINE_BOOTS).getInt(ItemIds.ADAMANTINE_BOOTS);
		ItemIds.IRIDIUM_HELMET = config.getItem(Strings.IRIDIUM_HELMET_NAME, ItemIds.IRIDIUM_HELMET).getInt(ItemIds.IRIDIUM_HELMET);
		ItemIds.IRIDIUM_CHESTPLATE = config.getItem(Strings.IRIDIUM_CHESTPLATE_NAME, ItemIds.IRIDIUM_CHESTPLATE).getInt(ItemIds.IRIDIUM_CHESTPLATE);
		ItemIds.IRIDIUM_LEGGINGS = config.getItem(Strings.IRIDIUM_LEGGINGS_NAME, ItemIds.IRIDIUM_LEGGINGS).getInt(ItemIds.IRIDIUM_LEGGINGS);
		ItemIds.IRIDIUM_BOOTS = config.getItem(Strings.IRIDIUM_BOOTS_NAME, ItemIds.IRIDIUM_BOOTS).getInt(ItemIds.IRIDIUM_BOOTS);
		ItemIds.FIRE_ORB = config.getItem(Strings.FIRE_ORB_NAME, ItemIds.FIRE_ORB).getInt(ItemIds.FIRE_ORB);
		ItemIds.WATER_ORB = config.getItem(Strings.WATER_ORB_NAME, ItemIds.WATER_ORB).getInt(ItemIds.WATER_ORB);
		ItemIds.EARTH_ORB = config.getItem(Strings.EARTH_ORB_NAME, ItemIds.EARTH_ORB).getInt(ItemIds.EARTH_ORB);
		ItemIds.AIR_ORB = config.getItem(Strings.AIR_ORB_NAME, ItemIds.AIR_ORB).getInt(ItemIds.AIR_ORB);
		ItemIds.ENERGY_ORB = config.getItem(Strings.ENERGY_ORB_NAME, ItemIds.ENERGY_ORB).getInt(ItemIds.ENERGY_ORB);
		ItemIds.VOID_SHARD = config.getItem(Strings.VOID_SHARD_NAME, ItemIds.VOID_SHARD).getInt(ItemIds.VOID_SHARD);
		config.save();
	}
}