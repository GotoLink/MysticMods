package mysticworld.items;

import mysticworld.lib.Strings;
import net.minecraft.item.Item;

public class ItemHandler {
	public static Item staffParts;
	public static Item imbuedShard;
	public static Item fireStaff;
	public static Item waterStaff;
	public static Item earthStaff;
	public static Item airStaff;
	public static Item energyStaff;
	public static Item fireStaffPower;
	public static Item waterStaffPower;
	public static Item earthStaffPower;
	public static Item airStaffPower;
	public static Item energyStaffPower;
	public static Item staffPower;
	public static Item fireOrb;
	public static Item waterOrb;
	public static Item earthOrb;
	public static Item airOrb;
	public static Item energyOrb;
	public static Item bushFruit;
	public static Item verditeHelmet;
	public static Item verditeChestplate;
	public static Item verditeLeggings;
	public static Item verditeBoots;
	public static Item adamantineHelmet;
	public static Item adamantineChestplate;
	public static Item adamantineLeggings;
	public static Item adamantineBoots;
	public static Item mithrilHelmet;
	public static Item mithrilChestplate;
	public static Item mithrilLeggings;
	public static Item mithrilBoots;
	public static Item iridiumHelmet;
	public static Item iridiumChestplate;
	public static Item iridiumLeggings;
	public static Item iridiumBoots;
	public static Item voidShard;

	public static void init() {
		staffParts = new ItemStaffParts();
		imbuedShard = new ItemImbuedShard();
		bushFruit = new ItemBushFruit(2);
		fireStaff = new ItemStaffFire().setUnlocalizedName(Strings.FIRE_STAFF_NAME);
		waterStaff = new ItemStaffWater().setUnlocalizedName(Strings.WATER_STAFF_NAME);
		earthStaff = new ItemStaffEarth().setUnlocalizedName(Strings.EARTH_STAFF_NAME);
		airStaff = new ItemStaffAir().setUnlocalizedName(Strings.AIR_STAFF_NAME);
		energyStaff = new ItemStaffEnegy().setUnlocalizedName(Strings.ENERGY_STAFF_NAME);
		staffPower = new ItemStaffPower();
		fireOrb = new ItemOrbFire().setUnlocalizedName(Strings.FIRE_ORB_NAME);
		waterOrb = new ItemOrbWater().setUnlocalizedName(Strings.WATER_ORB_NAME);
		earthOrb = new ItemOrbEarth().setUnlocalizedName(Strings.EARTH_ORB_NAME);
		airOrb = new ItemOrbAir().setUnlocalizedName(Strings.AIR_ORB_NAME);
		energyOrb = new ItemOrbEnergy().setUnlocalizedName(Strings.ENERGY_ORB_NAME);
		verditeHelmet = new ItemArmorVerdite(EnumArmor.Verdite, 0).setUnlocalizedName(Strings.VERDITE_HELMET_NAME);
		verditeChestplate = new ItemArmorVerdite(EnumArmor.Verdite, 1)
				.setUnlocalizedName(Strings.VERDITE_CHESTPLATE_NAME);
		verditeLeggings = new ItemArmorVerdite(EnumArmor.Verdite, 2).setUnlocalizedName(Strings.VERDITE_LEGGINGS_NAME);
		verditeBoots = new ItemArmorVerdite(EnumArmor.Verdite, 3).setUnlocalizedName(Strings.VERDITE_BOOTS_NAME);
		mithrilHelmet = new ItemArmorMithril(EnumArmor.Mithril, 0).setUnlocalizedName(Strings.MITHRIL_HELMET_NAME);
		mithrilChestplate = new ItemArmorMithril(EnumArmor.Mithril, 1)
				.setUnlocalizedName(Strings.MITHRIL_CHESTPLATE_NAME);
		mithrilLeggings = new ItemArmorMithril(EnumArmor.Mithril, 2).setUnlocalizedName(Strings.MITHRIL_LEGGINGS_NAME);
		mithrilBoots = new ItemArmorMithril(EnumArmor.Mithril, 3).setUnlocalizedName(Strings.MITHRIL_BOOTS_NAME);
		adamantineHelmet = new ItemArmorAdamantine(EnumArmor.Adamantine, 0)
				.setUnlocalizedName(Strings.ADAMANTINE_HELMET_NAME);
		adamantineChestplate = new ItemArmorAdamantine(EnumArmor.Adamantine, 1)
				.setUnlocalizedName(Strings.ADAMANTINE_CHESTPLATE_NAME);
		adamantineLeggings = new ItemArmorAdamantine(EnumArmor.Adamantine, 2)
				.setUnlocalizedName(Strings.ADAMANTINE_LEGGINGS_NAME);
		adamantineBoots = new ItemArmorAdamantine(EnumArmor.Adamantine, 3)
				.setUnlocalizedName(Strings.ADAMANTINE_BOOTS_NAME);
		iridiumHelmet = new ItemArmorIridium(EnumArmor.Iridium, 0).setUnlocalizedName(Strings.IRIDIUM_HELMET_NAME);
		iridiumChestplate = new ItemArmorIridium(EnumArmor.Iridium, 1)
				.setUnlocalizedName(Strings.IRIDIUM_CHESTPLATE_NAME);
		iridiumLeggings = new ItemArmorIridium(EnumArmor.Iridium, 2).setUnlocalizedName(Strings.IRIDIUM_LEGGINGS_NAME);
		iridiumBoots = new ItemArmorIridium(EnumArmor.Iridium, 3).setUnlocalizedName(Strings.IRIDIUM_BOOTS_NAME);
		voidShard = new ItemVoidShard().setUnlocalizedName(Strings.VOID_SHARD_NAME).setTextureName("mysticworld:ShardVoid");
	}
}
