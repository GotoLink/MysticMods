package mysticstones;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mysticstones.blocks.*;
import mysticstones.util.Config;
import mysticstones.util.RecipeHandler;
import mysticstones.worldgen.WorldGeneratorStones;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.Arrays;

@Mod(modid = "mysticstones", name = "Mystic Stones", version = "0.2")
public class MysticStones {
	@Instance("mysticstones")
	public static MysticStones instance;
    public static boolean ENABLE = true;
	public static Block planks, stones, stoneBricks, reinforcedBricks;
	public static CreativeTabs MysticStonesTab;
    public static final ArrayList<String> PLANK_TYPE = new ArrayList<String>(Arrays.asList("Purple Planks", "Green Planks", "Black Planks", "Orange Planks", "Red Planks", "Blue Planks", "Yellow Planks"));
    public static final ArrayList<String> STONEBRICK_TYPES = new ArrayList<String>(Arrays.asList("Anorthosite Bricks", "Limestone Bricks", "Marble Bricks", "Migmatite Bricks", "Orthogneiss Bricks", "Slate Bricks",
            "Travertine Bricks"));
    public static final ArrayList<String> STONE_TYPES = new ArrayList<String>(Arrays.asList("Smooth Anorthosite", "Anorthosite", "Smooth Limestone", "Limestone", "Smooth Marble", "Marble", "Smooth Migmatite", "Migmatite",
            "Smooth Orthogneiss", "Orthogneiss", "Smooth Slate", "Slate", "Smooth Travertine", "Travertine"));


    @EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Config.initialize(event.getSuggestedConfigurationFile());
        if(ENABLE){
            MysticStonesTab = new CreativeTabs("MysticStonesTab") {
                @Override
                @SideOnly(Side.CLIENT)
                public int func_151243_f()
                {
                    return 4;
                }
                @Override
                public Item getTabIconItem() {
                    return Item.getItemFromBlock(MysticStones.reinforcedBricks);
                }
            };
            planks = new BlockPlanks();
            stones = new BlockStones();
            stoneBricks = new BlockStoneBricks();
            reinforcedBricks = new BlockReinforced();
            GameRegistry.registerBlock(planks, ItemBlockMulti.class, "Planks", "mysticstones", PLANK_TYPE);
            GameRegistry.registerBlock(stones, ItemBlockMulti.class, "Stones", "mysticstones", STONE_TYPES);
            GameRegistry.registerBlock(stoneBricks, ItemBlockMulti.class, "StoneBricks", "mysticstones", STONEBRICK_TYPES);
            GameRegistry.registerBlock(reinforcedBricks, ItemReinforced.class, "Reinforcedbricks", "mysticstones");
            RecipeHandler.craftPlanks();
            RecipeHandler.craftStoneBricks();
            RecipeHandler.craftReinforced();
            RecipeHandler.craftElse();
            GameRegistry.registerWorldGenerator(new WorldGeneratorStones(), 1);
        }
	}
}
