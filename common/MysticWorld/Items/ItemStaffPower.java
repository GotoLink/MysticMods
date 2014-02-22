package mysticworld.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemStaffPower extends Item {
	private IIcon[] icons;
	private static final String[] CHARGE_NAMES = new String[] { "Fire", "Water", "Earth", "Air", "Energy" };

	public ItemStaffPower() {
		super();
		this.setHasSubtypes(true);
		this.setCreativeTab(null);
		maxStackSize = 64;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int meta) {
		int j = MathHelper.clamp_int(meta, 0, 5);
		return icons[j];
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, 5);
		return super.getUnlocalizedName() + CHARGE_NAMES[meta];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		icons = new IIcon[CHARGE_NAMES.length];
		for (int i = 0; i < CHARGE_NAMES.length; ++i) {
			icons[i] = iconRegister.registerIcon("mysticworld:Charge" + CHARGE_NAMES[i]);
		}
	}
}
