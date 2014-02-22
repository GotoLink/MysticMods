package mysticruins;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "MysticRuins", name = "Mystic Ruins", version = "0.1")
public class MysticRuins {
    public static boolean ENABLE = true;
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Config.initialize(event.getSuggestedConfigurationFile());
        if(ENABLE)
		    GameRegistry.registerWorldGenerator(new WorldGenMystic(), 20);
	}
}
