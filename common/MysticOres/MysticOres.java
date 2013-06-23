package MysticOres;

import java.io.File;
import java.util.Random;

import MysticOres.Blocks.BlockHandler;
import MysticOres.Blocks.BlockOres;
import MysticOres.Blocks.BlockReinforcedGlass;
import MysticOres.Blocks.ItemBlockOres;
import MysticOres.Items.ItemAxes;
import MysticOres.Items.ItemHandler;
import MysticOres.Items.ItemHoes;
import MysticOres.Items.ItemPickaxes;
import MysticOres.Items.ItemSatchel;
import MysticOres.Items.ItemShovels;
import MysticOres.Items.ItemSwords;
import MysticOres.Worldgen.WorldGenHandler;
import MysticOres.Worldgen.WorldGenAdamantine;
import MysticOres.Worldgen.WorldGenAgate;
import MysticOres.Worldgen.WorldGenAmethyst;
import MysticOres.Worldgen.WorldGenIridium;
import MysticOres.Worldgen.WorldGenMithril;
import MysticOres.Worldgen.WorldGenMysticNetherMinable;
import MysticOres.Worldgen.WorldGenTopaz;
import MysticOres.Worldgen.WorldGenTourmaline;
import MysticOres.Worldgen.WorldGenVerdite;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockLeaves;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.ForgeVersion;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = "Mystic Ores", name = "Mystic Ores", version = "0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class MysticOres
{
	public static CreativeTabs MysticOresTab = new TabMysticOres(CreativeTabs.getNextID(), "MysticOresTab");

	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{		
        ConfigurationManager.initialize(new File(event.getModConfigurationDirectory(), "Mystic Mods/Mystic Ores.cfg"));
        ConfigurationManager.save();
    }
	
	@Init
	public void load(FMLInitializationEvent event)
	{	
		BlockHandler.init();
		ItemHandler.init();
		GameRegistry.registerFuelHandler(new IridiumFuel());
		RecipeManager.init();
		OreDictManager.init();
		WorldGenHandler.init();
		LanguageManager.init();
	}
	
	@PostInit
    public void postInit(FMLPostInitializationEvent event) 
	{
		ThaumcraftAPIManager.init();
    }
}
