package mysticworld;

import cpw.mods.fml.common.FMLCommonHandler;
import mysticworld.biome.BiomeHandler;
import mysticworld.blocks.BlockHandler;
import mysticworld.entity.EntityHandler;
import mysticworld.items.ItemHandler;
import mysticworld.tiles.TileEntityHandler;
import mysticworld.util.Config;
import mysticworld.util.RecipeHandler;
import mysticworld.util.Reference;
import mysticworld.util.TickHandler;
import mysticworld.worldgen.WorldGenerators;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER)
public class MysticWorld {
	@Instance(Reference.MOD_ID)
	public static MysticWorld instance;
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	public static CreativeTabs MysticWorldTab;
    public boolean ENABLE = true;

	@EventHandler
	public void load(FMLInitializationEvent event) {
        if(ENABLE){
            FMLCommonHandler.instance().bus().register(new TickHandler());
            GameRegistry.registerWorldGenerator(new WorldGenerators(), 100);
            EntityHandler.init();
            proxy.registerRenders();
        }
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Config.initialize(event.getSuggestedConfigurationFile());
        if(ENABLE){
            MysticWorldTab = new CreativeTabs("MysticWorldTab") {
                @Override
                public Item getTabIconItem() {
                    return ItemHandler.earthStaff;
                }
            };
            BiomeHandler.init();
            BlockHandler.init();
            ItemHandler.init();
            TileEntityHandler.init();
            RecipeHandler.init();
        }
	}
}
