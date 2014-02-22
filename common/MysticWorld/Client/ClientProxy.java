package mysticworld.client;

import mysticworld.CommonProxy;
import mysticworld.blocks.BlockHandler;
import mysticworld.blocks.BlockPillarInsert;
import mysticworld.client.fx.LightCubeFX;
import mysticworld.client.fx.PowerAirFX;
import mysticworld.client.fx.PowerFX;
import mysticworld.entity.EntityChargeAir;
import mysticworld.entity.EntityChargeEarth;
import mysticworld.entity.EntityChargeEnergy;
import mysticworld.entity.EntityChargeFire;
import mysticworld.entity.EntityChargeWater;
import mysticworld.items.ItemHandler;
import mysticworld.renderer.*;
import mysticworld.tiles.TileEntityPillarInsert;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	public final Minecraft mc = Minecraft.getMinecraft();
	public static final ResourceLocation particle = new ResourceLocation("textures/particle/particles.png");

	//particles
	@Override
	public void airFeetFX(World worldObj, double x, double y, double z, float scale, int age) {
		PowerFX airFX = new PowerAirFX(worldObj, x, y, z, scale, age);
		mc.effectRenderer.addEffect(airFX);
	}

	@Override
	public void earthFX(World worldObj, double x, double y, double z, float scale) {
		PowerFX earthFX = new PowerFX(worldObj, x, y, z, scale).setTexture("earth");
		mc.effectRenderer.addEffect(earthFX);
	}

	@Override
	public void energyFX(World worldObj, double x, double y, double z, float scale) {
		PowerFX energyFX = new PowerFX(worldObj, x, y, z, scale).setTexture("energy");
		mc.effectRenderer.addEffect(energyFX);
	}

	@Override
	public void fireFX(World worldObj, double x, double y, double z, float scale) {
		PowerFX fireFX = new PowerFX(worldObj, x, y, z, scale).setTexture("fire");
		mc.effectRenderer.addEffect(fireFX);
	}

	@Override
	public void lightCubeFX(World worldObj, double x, double y, double z, double motionX, double motionY, double motionZ, float scale) {
		LightCubeFX lightCubeFX = new LightCubeFX(worldObj, x, y, z, motionX, motionY, motionZ, scale);
		mc.effectRenderer.addEffect(lightCubeFX);
	}

	@Override
	public void registerRenders() {
		BlockPillarInsert.RENDER_PILLAR_INSERT = RenderingRegistry.getNextAvailableRenderId();
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockHandler.pillarInsert), new BlockPillarInsertRenderer());
		MinecraftForgeClient.registerItemRenderer(ItemHandler.fireStaff, new StaffItemRenderer("Fire"));
		MinecraftForgeClient.registerItemRenderer(ItemHandler.earthStaff, new StaffItemRenderer("Earth"));
		MinecraftForgeClient.registerItemRenderer(ItemHandler.airStaff, new StaffItemRenderer("Air"));
		MinecraftForgeClient.registerItemRenderer(ItemHandler.energyStaff, new StaffItemRenderer("Energy"));
		MinecraftForgeClient.registerItemRenderer(ItemHandler.waterStaff, new StaffItemRenderer("Water"));
		MinecraftForgeClient.registerItemRenderer(ItemHandler.fireOrb, new OrbItemRenderer("Fire"));
		MinecraftForgeClient.registerItemRenderer(ItemHandler.earthOrb, new OrbItemRenderer("Earth"));
		MinecraftForgeClient.registerItemRenderer(ItemHandler.airOrb, new OrbItemRenderer("Air"));
		MinecraftForgeClient.registerItemRenderer(ItemHandler.energyOrb, new OrbItemRenderer("Energy"));
		MinecraftForgeClient.registerItemRenderer(ItemHandler.waterOrb, new OrbItemRenderer("Water"));
		RenderingRegistry.registerEntityRenderingHandler(EntityChargeFire.class, new RenderStaffPower(0));
		RenderingRegistry.registerEntityRenderingHandler(EntityChargeWater.class, new RenderStaffPower(1));
		RenderingRegistry.registerEntityRenderingHandler(EntityChargeEarth.class, new RenderStaffPower(2));
		RenderingRegistry.registerEntityRenderingHandler(EntityChargeAir.class, new RenderStaffPower(3));
		RenderingRegistry.registerEntityRenderingHandler(EntityChargeEnergy.class, new RenderStaffPower(4));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPillarInsert.class, new TileEntityPillarInsertRenderer());
	}

	@Override
	public void waterFX(World worldObj, double x, double y, double z, float scale) {
		PowerFX waterFX = new PowerFX(worldObj, x, y, z, scale).setTexture("water");
		mc.effectRenderer.addEffect(waterFX);
	}
}
