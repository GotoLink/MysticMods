package mysticworld.items;

import cpw.mods.fml.common.ObfuscationReflectionHelper;
import mysticworld.MysticWorld;
import mysticworld.entity.EntityChargeAir;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStaffAir extends ItemStaff {
	public ItemStaffAir() {
		super();
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        player.setItemInUse(itemStack, this.getMaxItemUseDuration(itemStack));
		return itemStack;
	}

    @Override
    public int getMaxItemUseDuration(ItemStack itemStack){
        return 3*20;
    }

    @Override
    public void onPlayerStoppedUsing(ItemStack itemStack, World world, EntityPlayer player, int time) {
        int charge = getMaxItemUseDuration(itemStack)-time;
        if (charge > 0) {
            if (!world.isRemote) {
                world.playAuxSFXAtEntity(null, 1009, (int) player.posX, (int) player.posY, (int) player.posZ, 0);
                world.spawnEntityInWorld(new EntityChargeAir(world, player, 1.0f + charge * (5.0f * (1 / (float) getMaxItemUseDuration(itemStack))), charge * (2.5D * (1.0D / getMaxItemUseDuration(itemStack)))));
                itemStack.damageItem(1, player);
            }
        }
    }

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int par4, boolean current) {
		if (current) {
            entity.fallDistance = 0.0F;
            if(entity instanceof EntityPlayer){
                if(((EntityPlayer) entity).isUsingItem()){
                    int charge = ObfuscationReflectionHelper.getPrivateValue(EntityPlayer.class,(EntityPlayer) entity, "itemInUseCount", "field_71072_f");
                    chargeEffect(itemStack, world, entity, getMaxItemUseDuration(itemStack) - charge);
                }
            }
		}
	}

	private void chargeEffect(ItemStack itemStack, World world, Entity player, int charge) {
		double particleX = (player.posX - 0.5D) + rand.nextDouble();
		double particleY = player.posY + (charge * player.height / getMaxItemUseDuration(itemStack));
		double particleZ = (player.posZ - 0.5D) + rand.nextDouble();
		float particleScale = charge * (5.0f * (1 / (float) getMaxItemUseDuration(itemStack)));
        MysticWorld.proxy.airFeetFX(world, particleX, particleY, particleZ, 1.0f + particleScale, 15);
	}
}
