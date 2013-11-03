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
		VerditeSword = new ItemSword(ItemID.VERDITESWORD, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeSword").setTextureName("mysticores:VerditeSword")
				.setCreativeTab(MysticOres.MysticOresTab);
		VerditePickaxe = new ItemPickaxe(ItemID.VERDITEPICKAXE, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditePickaxe").setTextureName("mysticores:VerditePickaxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		VerditeShovel = new ItemSpade(ItemID.VERDITESHOVEL, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeShovel").setTextureName("mysticores:VerditeShovel")
				.setCreativeTab(MysticOres.MysticOresTab);
		VerditeAxe = new ItemAxe(ItemID.VERDITEAXE, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeAxe").setTextureName("mysticores:VerditeAxe").setCreativeTab(MysticOres.MysticOresTab);
		VerditeHoe = new ItemHoe(ItemID.VERDITEHOE, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeHoe").setTextureName("mysticores:VerditeHoe").setCreativeTab(MysticOres.MysticOresTab);
		MithrilSword = new ItemSword(ItemID.MITHRILSWORD, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilSword").setTextureName("mysticores:MithrilSword")
				.setCreativeTab(MysticOres.MysticOresTab);
		MithrilPickaxe = new ItemPickaxe(ItemID.MITHRILPICKAXE, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilPickaxe").setTextureName("mysticores:MithrilPickaxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		MithrilShovel = new ItemSpade(ItemID.MITHRILSHOVEL, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilShovel").setTextureName("mysticores:MithrilShovel")
				.setCreativeTab(MysticOres.MysticOresTab);
		MithrilAxe = new ItemAxe(ItemID.MITHRILAXE, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilAxe").setTextureName("mysticores:MithrilAxe").setCreativeTab(MysticOres.MysticOresTab);
		MithrilHoe = new ItemHoe(ItemID.MITHRILHOE, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilHoe").setTextureName("mysticores:MithrilHoe").setCreativeTab(MysticOres.MysticOresTab);
		AdamantineSword = new ItemSword(ItemID.ADAMANTINESWORD, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineSword").setTextureName("mysticores:AdamantineSword")
				.setCreativeTab(MysticOres.MysticOresTab);
		AdamantinePickaxe = new ItemPickaxe(ItemID.ADAMANTINEPICKAXE, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantinePickaxe").setTextureName("mysticores:AdamantinePickaxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		AdamantineShovel = new ItemSpade(ItemID.ADAMANTINESHOVEL, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineShovel").setTextureName("mysticores:AdamantineShovel")
				.setCreativeTab(MysticOres.MysticOresTab);
		AdamantineAxe = new ItemAxe(ItemID.ADAMANTINEAXE, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineAxe").setTextureName("mysticores:AdamantineAxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		AdamantineHoe = new ItemHoe(ItemID.ADAMANTINEHOE, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineHoe").setTextureName("mysticores:AdamantineHoe")
				.setCreativeTab(MysticOres.MysticOresTab);
		IridiumSword = new ItemSword(ItemID.IRIDIUMSWORD, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumSword").setTextureName("mysticores:IridiumSword")
				.setCreativeTab(MysticOres.MysticOresTab);
		IridiumPickaxe = new ItemPickaxe(ItemID.IRIDIUMPICKAXE, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumPickaxe").setTextureName("mysticores:IridiumPickaxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		IridiumShovel = new ItemSpade(ItemID.IRIDIUMSHOVEL, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumShovel").setTextureName("mysticores:IridiumShovel")
				.setCreativeTab(MysticOres.MysticOresTab);
		IridiumAxe = new ItemAxe(ItemID.IRIDIUMAXE, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumAxe").setTextureName("mysticores:IridiumAxe").setCreativeTab(MysticOres.MysticOresTab);
		IridiumHoe = new ItemHoe(ItemID.IRIDIUMHOE, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumHoe").setTextureName("mysticores:IridiumHoe").setCreativeTab(MysticOres.MysticOresTab);
		BloodstoneSword = new ItemSword(ItemID.BLOODSTONESWORD, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneSword").setTextureName("mysticores:BloodstoneSword")
				.setCreativeTab(MysticOres.MysticOresTab);
		BloodstonePickaxe = new ItemPickaxe(ItemID.BLOODSTONEPICKAXE, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstonePickaxe").setTextureName("mysticores:BloodstonePickaxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		BloodstoneShovel = new ItemSpade(ItemID.BLOODSTONESHOVEL, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneShovel").setTextureName("mysticores:BloodstoneShovel")
				.setCreativeTab(MysticOres.MysticOresTab);
		BloodstoneAxe = new ItemAxe(ItemID.BLOODSTONEAXE, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneAxe").setTextureName("mysticores:BloodstoneAxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		BloodstoneHoe = new ItemHoe(ItemID.BLOODSTONEHOE, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneHoe").setTextureName("mysticores:BloodstoneHoe")
				.setCreativeTab(MysticOres.MysticOresTab);
		ObsidianSword = new ItemSword(ItemID.OBSIDIANSWORD, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianSword").setTextureName("mysticores:ObsidianSword")
				.setCreativeTab(MysticOres.MysticOresTab);
		ObsidianPickaxe = new ItemPickaxe(ItemID.OBSIDIANPICKAXE, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianPickaxe").setTextureName("mysticores:ObsidianPickaxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		ObsidianShovel = new ItemSpade(ItemID.OBSIDIANSHOVEL, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianShovel").setTextureName("mysticores:ObsidianShovel")
				.setCreativeTab(MysticOres.MysticOresTab);
		ObsidianAxe = new ItemAxe(ItemID.OBSIDIANAXE, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianAxe").setTextureName("mysticores:ObsidianAxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		ObsidianHoe = new ItemHoe(ItemID.OBSIDIANHOE, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianHoe").setTextureName("mysticores:ObsidianHoe")
				.setCreativeTab(MysticOres.MysticOresTab);
		Satchel = new ItemSatchel(ItemID.SATCHEL).setUnlocalizedName("Satchel");
	}
}
