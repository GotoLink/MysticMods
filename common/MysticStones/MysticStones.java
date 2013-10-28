package mysticstones;

import mysticstones.blocks.BlockPlanks;
import mysticstones.blocks.BlockReinforced;
import mysticstones.blocks.BlockStoneBricks;
import mysticstones.blocks.BlockStones;
import mysticstones.blocks.ItemPlanks;
import mysticstones.blocks.ItemReinforced;
import mysticstones.blocks.ItemStoneBricks;
import mysticstones.blocks.ItemStones;
import mysticstones.util.Config;
import mysticstones.util.RecipeHandler;
import mysticstones.worldgen.WorldGeneratorStones;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "mysticstones", name = "Mystic Stones", version = "0.1")
@NetworkMod(clientSideRequired = true)
public class MysticStones {
	@Instance("mysticstones")
	public static MysticStones instance;
	public static Block planks, stones, stoneBricks, reinforcedBricks;
	public static final CreativeTabs MysticStonesTab = new CreativeTabs("MysticStonesTab") {
		@Override
		public ItemStack getIconItemStack() {
			return new ItemStack(MysticStones.reinforcedBricks, 1, 4);
		}
	};

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Config.initialize(event.getSuggestedConfigurationFile());
		planks = new BlockPlanks(Config.planksID);
		stones = new BlockStones(Config.stonesID);
		stoneBricks = new BlockStoneBricks(Config.stoneBricksID);
		reinforcedBricks = new BlockReinforced(Config.reinforcedBricksID);
		GameRegistry.registerBlock(planks, ItemPlanks.class, "Planks");
		GameRegistry.registerBlock(stones, ItemStones.class, "Stones");
		GameRegistry.registerBlock(stoneBricks, ItemStoneBricks.class, "StoneBricks");
		GameRegistry.registerBlock(reinforcedBricks, ItemReinforced.class, "Reinforcedbricks");
		RecipeHandler.craftPlanks();
		RecipeHandler.craftStoneBricks();
		RecipeHandler.craftReinforced();
		RecipeHandler.craftElse();
		GameRegistry.registerWorldGenerator(new WorldGeneratorStones());
	}
}
