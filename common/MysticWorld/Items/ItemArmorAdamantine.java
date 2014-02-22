package mysticworld.items;

import mysticworld.MysticWorld;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorAdamantine extends ItemArmor {
	int ArmorType;

	public ItemArmorAdamantine(ArmorMaterial par2EnumArmorMaterial, int par4) {
		super(par2EnumArmorMaterial, 0, par4);
		this.ArmorType = par4;
		this.setMaxDamage(3000);
		this.setCreativeTab(MysticWorld.MysticWorldTab);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer) {
		int suffix = this.armorType == 2 ? 2 : 1;
		return "mysticworld:textures/models/armor/Adamantine_layer_" + suffix + ".png";
	}

	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("mysticworld:AdamantineArmor_" + ArmorType);
	}
}
