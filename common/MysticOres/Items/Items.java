package mysticores.items;

import mysticores.MysticOres;
import mysticores.lib.ItemID;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

public class Items {
	public static Item VerditeSword, VerditePickaxe, VerditeShovel, VerditeAxe, VerditeHoe;
	public static Item MithrilSword, MithrilPickaxe, MithrilShovel, MithrilAxe, MithrilHoe;
	public static Item AdamantineSword, AdamantinePickaxe, AdamantineShovel, AdamantineAxe, AdamantineHoe;
	public static Item IridiumSword, IridiumPickaxe, IridiumShovel, IridiumAxe, IridiumHoe;
	public static Item BloodstoneSword, BloodstonePickaxe, BloodstoneShovel, BloodstoneAxe, BloodstoneHoe;
	public static Item ObsidianSword, ObsidianPickaxe, ObsidianShovel, ObsidianAxe, ObsidianHoe;
	public static Item Resource;
	public static Item Satchel;

	public static void initialize() {
		Resource = new ItemResource(ItemID.RESOURCES);
		VerditeSword = new ItemSword(ItemID.VERDITESWORD, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeSword").setTextureName("mysticmods:VerditeSword")
				.setCreativeTab(MysticOres.MysticOresTab);
		VerditePickaxe = new ItemPickaxe(ItemID.VERDITEPICKAXE, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditePickaxe").setTextureName("mysticmods:VerditePickaxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		VerditeShovel = new ItemSpade(ItemID.VERDITESHOVEL, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeShovel").setTextureName("mysticmods:VerditeShovel")
				.setCreativeTab(MysticOres.MysticOresTab);
		VerditeAxe = new ItemAxe(ItemID.VERDITEAXE, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeAxe").setTextureName("mysticmods:VerditeAxe").setCreativeTab(MysticOres.MysticOresTab);
		VerditeHoe = new ItemHoe(ItemID.VERDITEHOE, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeHoe").setTextureName("mysticmods:VerditeHoe").setCreativeTab(MysticOres.MysticOresTab);
		MithrilSword = new ItemSword(ItemID.MITHRILSWORD, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilSword").setTextureName("mysticmods:MithrilSword")
				.setCreativeTab(MysticOres.MysticOresTab);
		MithrilPickaxe = new ItemPickaxe(ItemID.MITHRILPICKAXE, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilPickaxe").setTextureName("mysticmods:MithrilPickaxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		MithrilShovel = new ItemSpade(ItemID.MITHRILSHOVEL, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilShovel").setTextureName("mysticmods:MithrilShovel")
				.setCreativeTab(MysticOres.MysticOresTab);
		MithrilAxe = new ItemAxe(ItemID.MITHRILAXE, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilAxe").setTextureName("mysticmods:MithrilAxe").setCreativeTab(MysticOres.MysticOresTab);
		MithrilHoe = new ItemHoe(ItemID.MITHRILHOE, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilHoe").setTextureName("mysticmods:MithrilHoe").setCreativeTab(MysticOres.MysticOresTab);
		AdamantineSword = new ItemSword(ItemID.ADAMANTINESWORD, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineSword").setTextureName("mysticmods:AdamantineSword")
				.setCreativeTab(MysticOres.MysticOresTab);
		AdamantinePickaxe = new ItemPickaxe(ItemID.ADAMANTINEPICKAXE, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantinePickaxe").setTextureName("mysticmods:AdamantinePickaxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		AdamantineShovel = new ItemSpade(ItemID.ADAMANTINESHOVEL, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineShovel").setTextureName("mysticmods:AdamantineShovel")
				.setCreativeTab(MysticOres.MysticOresTab);
		AdamantineAxe = new ItemAxe(ItemID.ADAMANTINEAXE, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineAxe").setTextureName("mysticmods:AdamantineAxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		AdamantineHoe = new ItemHoe(ItemID.ADAMANTINEHOE, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineHoe").setTextureName("mysticmods:AdamantineHoe")
				.setCreativeTab(MysticOres.MysticOresTab);
		IridiumSword = new ItemSword(ItemID.IRIDIUMSWORD, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumSword").setTextureName("mysticmods:IridiumSword")
				.setCreativeTab(MysticOres.MysticOresTab);
		IridiumPickaxe = new ItemPickaxe(ItemID.IRIDIUMPICKAXE, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumPickaxe").setTextureName("mysticmods:IridiumPickaxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		IridiumShovel = new ItemSpade(ItemID.IRIDIUMSHOVEL, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumShovel").setTextureName("mysticmods:IridiumShovel")
				.setCreativeTab(MysticOres.MysticOresTab);
		IridiumAxe = new ItemAxe(ItemID.IRIDIUMAXE, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumAxe").setTextureName("mysticmods:IridiumAxe").setCreativeTab(MysticOres.MysticOresTab);
		IridiumHoe = new ItemHoe(ItemID.IRIDIUMHOE, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumHoe").setTextureName("mysticmods:IridiumHoe").setCreativeTab(MysticOres.MysticOresTab);
		BloodstoneSword = new ItemSword(ItemID.BLOODSTONESWORD, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneSword").setTextureName("mysticmods:BloodstoneSword")
				.setCreativeTab(MysticOres.MysticOresTab);
		BloodstonePickaxe = new ItemPickaxe(ItemID.BLOODSTONEPICKAXE, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstonePickaxe").setTextureName("mysticmods:BloodstonePickaxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		BloodstoneShovel = new ItemSpade(ItemID.BLOODSTONESHOVEL, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneShovel").setTextureName("mysticmods:BloodstoneShovel")
				.setCreativeTab(MysticOres.MysticOresTab);
		BloodstoneAxe = new ItemAxe(ItemID.BLOODSTONEAXE, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneAxe").setTextureName("mysticmods:BloodstoneAxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		BloodstoneHoe = new ItemHoe(ItemID.BLOODSTONEHOE, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneHoe").setTextureName("mysticmods:BloodstoneHoe")
				.setCreativeTab(MysticOres.MysticOresTab);
		ObsidianSword = new ItemSword(ItemID.OBSIDIANSWORD, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianSword").setTextureName("mysticmods:ObsidianSword")
				.setCreativeTab(MysticOres.MysticOresTab);
		ObsidianPickaxe = new ItemPickaxe(ItemID.OBSIDIANPICKAXE, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianPickaxe").setTextureName("mysticmods:ObsidianPickaxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		ObsidianShovel = new ItemSpade(ItemID.OBSIDIANSHOVEL, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianShovel").setTextureName("mysticmods:ObsidianShovel")
				.setCreativeTab(MysticOres.MysticOresTab);
		ObsidianAxe = new ItemAxe(ItemID.OBSIDIANAXE, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianAxe").setTextureName("mysticmods:ObsidianAxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		ObsidianHoe = new ItemHoe(ItemID.OBSIDIANHOE, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianHoe").setTextureName("mysticmods:ObsidianHoe")
				.setCreativeTab(MysticOres.MysticOresTab);
		Satchel = new ItemSatchel(ItemID.SATCHEL).setUnlocalizedName("Satchel");
	}
}
