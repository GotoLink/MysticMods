package mysticores.items;

import java.lang.reflect.Field;

import cpw.mods.fml.common.registry.GameRegistry;
import mysticores.MysticOres;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
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
		Resource = new ItemResource().setUnlocalizedName("mysticores:resources");
		VerditeSword = new ItemSword(EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeSword").setTextureName("mysticores:VerditeSword")
				.setCreativeTab(MysticOres.MysticOresTab);
		VerditePickaxe = new ItemPick(EnumTools.verditeToolMaterial).setUnlocalizedName("VerditePickaxe").setTextureName("mysticores:VerditePickaxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		VerditeShovel = new ItemSpade(EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeShovel").setTextureName("mysticores:VerditeShovel")
				.setCreativeTab(MysticOres.MysticOresTab);
		VerditeAxe = new ItemHatchet(EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeAxe").setTextureName("mysticores:VerditeAxe").setCreativeTab(MysticOres.MysticOresTab);
		VerditeHoe = new ItemHoe(EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeHoe").setTextureName("mysticores:VerditeHoe").setCreativeTab(MysticOres.MysticOresTab);
		MithrilSword = new ItemSword(EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilSword").setTextureName("mysticores:MithrilSword")
				.setCreativeTab(MysticOres.MysticOresTab);
		MithrilPickaxe = new ItemPick(EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilPickaxe").setTextureName("mysticores:MithrilPickaxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		MithrilShovel = new ItemSpade(EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilShovel").setTextureName("mysticores:MithrilShovel")
				.setCreativeTab(MysticOres.MysticOresTab);
		MithrilAxe = new ItemHatchet(EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilAxe").setTextureName("mysticores:MithrilAxe").setCreativeTab(MysticOres.MysticOresTab);
		MithrilHoe = new ItemHoe(EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilHoe").setTextureName("mysticores:MithrilHoe").setCreativeTab(MysticOres.MysticOresTab);
		AdamantineSword = new ItemSword(EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineSword").setTextureName("mysticores:AdamantineSword")
				.setCreativeTab(MysticOres.MysticOresTab);
		AdamantinePickaxe = new ItemPick(EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantinePickaxe").setTextureName("mysticores:AdamantinePickaxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		AdamantineShovel = new ItemSpade(EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineShovel").setTextureName("mysticores:AdamantineShovel")
				.setCreativeTab(MysticOres.MysticOresTab);
		AdamantineAxe = new ItemHatchet(EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineAxe").setTextureName("mysticores:AdamantineAxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		AdamantineHoe = new ItemHoe(EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineHoe").setTextureName("mysticores:AdamantineHoe")
				.setCreativeTab(MysticOres.MysticOresTab);
		IridiumSword = new ItemSword(EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumSword").setTextureName("mysticores:IridiumSword")
				.setCreativeTab(MysticOres.MysticOresTab);
		IridiumPickaxe = new ItemPick(EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumPickaxe").setTextureName("mysticores:IridiumPickaxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		IridiumShovel = new ItemSpade(EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumShovel").setTextureName("mysticores:IridiumShovel")
				.setCreativeTab(MysticOres.MysticOresTab);
		IridiumAxe = new ItemHatchet(EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumAxe").setTextureName("mysticores:IridiumAxe").setCreativeTab(MysticOres.MysticOresTab);
		IridiumHoe = new ItemHoe(EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumHoe").setTextureName("mysticores:IridiumHoe").setCreativeTab(MysticOres.MysticOresTab);
		BloodstoneSword = new ItemSword(EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneSword").setTextureName("mysticores:BloodstoneSword")
				.setCreativeTab(MysticOres.MysticOresTab);
		BloodstonePickaxe = new ItemPick(EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstonePickaxe").setTextureName("mysticores:BloodstonePickaxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		BloodstoneShovel = new ItemSpade(EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneShovel").setTextureName("mysticores:BloodstoneShovel")
				.setCreativeTab(MysticOres.MysticOresTab);
		BloodstoneAxe = new ItemHatchet(EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneAxe").setTextureName("mysticores:BloodstoneAxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		BloodstoneHoe = new ItemHoe(EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneHoe").setTextureName("mysticores:BloodstoneHoe")
				.setCreativeTab(MysticOres.MysticOresTab);
		ObsidianSword = new ItemSword(EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianSword").setTextureName("mysticores:ObsidianSword")
				.setCreativeTab(MysticOres.MysticOresTab);
		ObsidianPickaxe = new ItemPick(EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianPickaxe").setTextureName("mysticores:ObsidianPickaxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		ObsidianShovel = new ItemSpade(EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianShovel").setTextureName("mysticores:ObsidianShovel")
				.setCreativeTab(MysticOres.MysticOresTab);
		ObsidianAxe = new ItemHatchet(EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianAxe").setTextureName("mysticores:ObsidianAxe")
				.setCreativeTab(MysticOres.MysticOresTab);
		ObsidianHoe = new ItemHoe(EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianHoe").setTextureName("mysticores:ObsidianHoe")
				.setCreativeTab(MysticOres.MysticOresTab);
		Satchel = new ItemSatchel().setUnlocalizedName("Satchel");
		try {
			for(Field f:Items.class.getFields()){
				Item it = (Item) f.get(null);
				GameRegistry.registerItem(it,it.getUnlocalizedName());
			}
		} catch (Exception e) {
		}
	}
}
