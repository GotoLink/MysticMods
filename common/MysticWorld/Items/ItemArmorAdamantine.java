package mysticworld.items;

import mysticworld.MysticWorld;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorAdamantine extends ItemArmor {
	int ArmorType;

	public ItemArmorAdamantine(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.ArmorType = par4;
		this.setMaxDamage(3000);
		this.setCreativeTab(MysticWorld.MysticWorldTab);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		int suffix = this.armorType == 2 ? 2 : 1;
		return "mysticmods:textures" + "/models/armor/Adamantine_layer_" + suffix + ".png";
	}

	@Override
	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("mysticmods:AdamantineArmor_" + ArmorType);
	}
}
