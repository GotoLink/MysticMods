package mysticores.items;

import mysticores.MysticOres;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSatchel extends Item {
	public ItemSatchel(int par1) {
		super(par1);
		setCreativeTab(MysticOres.MysticOresTab);
		setMaxStackSize(1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer player) {
		if (!player.isSneaking()) {
			player.displayGUIChest(player.getInventoryEnderChest());
		}
		return is;
	}

	@Override
	@SideOnly(Side.CLIENT)
	protected String getIconString() {
		return "mysticores:" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1);
	}
}
