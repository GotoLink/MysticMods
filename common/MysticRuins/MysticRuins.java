package mysticruins;

import java.io.File;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "MysticRuins", name = "Mystic Ruins", version = "0.1")
public class MysticRuins {
	public static File file;

	@EventHandler
	public void modsLoaded(FMLPostInitializationEvent event) {
		Config.initialize(file);
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		file = event.getSuggestedConfigurationFile();
		GameRegistry.registerWorldGenerator(new WorldGenMystic());
	}
}
