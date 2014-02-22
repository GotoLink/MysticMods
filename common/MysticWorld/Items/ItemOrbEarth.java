package mysticworld.items;

import mysticworld.MysticWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemOrbEarth extends ItemOrb {
	public ItemOrbEarth() {
		super();
	}

	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack)) {
			return false;
		} else {
			if (applyBonemeal(par1ItemStack, par3World, par4, par5, par6, par2EntityPlayer)) {
				if (!par3World.isRemote) {
					par3World.playAuxSFX(2005, par4, par5, par6, 0);
				}
				return true;
			}
			return false;
		}
	}

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int par4, boolean par5) {
		EntityPlayer player = (EntityPlayer) entity;
		if (!world.isRemote && par5) {
			MysticWorld.proxy.earthFX(world, (player.posX - 0.5D) + rand.nextDouble(), player.posY, (player.posZ - 0.5D) + rand.nextDouble(), 1.0F);
		}
	}

	public static boolean applyBonemeal(ItemStack itemStack, World par1World, int par2, int par3, int par4, EntityPlayer player) {
		return ItemDye.applyBonemeal(itemStack, par1World, par2, par3, par4, player);
	}
}
