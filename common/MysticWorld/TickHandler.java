package MysticWorld;

import java.util.EnumSet;
import java.util.List;
import java.util.Random;

import MysticWorld.Blocks.BlockBush;
import MysticWorld.Blocks.BlockHandler;
import MysticWorld.Items.ItemHandler$1;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.common.IScheduledTickHandler;
import cpw.mods.fml.common.TickType;

public class TickHandler implements IScheduledTickHandler
{
	private EnumSet ticks;

	Random rand = new Random();
	
	public TickHandler(){
		this.ticks = EnumSet.of(TickType.PLAYER);
	}

	public void tickStart(EnumSet<TickType> type, Object... tickData){
		EntityPlayer player = (EntityPlayer)tickData[0];
		World world = player.worldObj;
		InventoryPlayer inventory = player.inventory;
		ItemStack itemstack = inventory.getCurrentItem();
		
		if (itemstack != null && (itemstack.itemID == ItemHandler$1.fireOrb.itemID || itemstack.itemID == ItemHandler$1.fireStaff.itemID)){
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 20, 0));
			MysticWorld.proxy.fireFX(world, (player.posX - 0.5D) + rand.nextDouble(), player.posY, (player.posZ - 0.5D) + rand.nextDouble(), 1.0F);
		}
		
		if (itemstack != null && (itemstack.itemID == ItemHandler$1.airOrb.itemID || itemstack.itemID == ItemHandler$1.airStaff.itemID)){
			player.fallDistance = 0.0F;
			MysticWorld.proxy.airFX(world, (player.posX - 0.5D) + rand.nextDouble(), player.posY, (player.posZ - 0.5D) + rand.nextDouble(), 1.0F);
		}
		
		if (itemstack != null && (itemstack.itemID == ItemHandler$1.energyOrb.itemID || itemstack.itemID == ItemHandler$1.energyStaff.itemID)){
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 20, 2));
			MysticWorld.proxy.energyFX(world, (player.posX - 0.5D) + rand.nextDouble(), player.posY, (player.posZ - 0.5D) + rand.nextDouble(), 1.0F);
		}
		
		if (itemstack != null && (itemstack.itemID == ItemHandler$1.earthOrb.itemID || itemstack.itemID == ItemHandler$1.earthStaff.itemID)){
			MysticWorld.proxy.earthFX(world, (player.posX - 0.5D) + rand.nextDouble(), player.posY, (player.posZ - 0.5D) + rand.nextDouble(), 1.0F);
		}
		
		if (itemstack != null && (itemstack.itemID == ItemHandler$1.waterOrb.itemID || itemstack.itemID == ItemHandler$1.waterStaff.itemID)){
			MysticWorld.proxy.waterFX(world, (player.posX - 0.5D) + rand.nextDouble(), player.posY, (player.posZ - 0.5D) + rand.nextDouble(), 1.0F);
		}
		
    }

	public void tickEnd(EnumSet<TickType> type, Object... tickData){
		EntityPlayer player = (EntityPlayer)tickData[0];
		World world = player.worldObj;
		InventoryPlayer inventory = player.inventory;
	}
	
	public EnumSet ticks(){
		return this.ticks;
	}

	public String getLabel(){
		return "mystic world tick";
	}

	public int nextTickSpacing(){
		return 10;
	}
}