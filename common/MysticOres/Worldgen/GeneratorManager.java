package mysticores.worldgen;

import mysticores.blocks.BlockHandler;
import mysticores.lib.Rarity;
import cpw.mods.fml.common.registry.GameRegistry;

public class GeneratorManager {
	public static void initialize() {
		GameRegistry.registerWorldGenerator(new WorldGenOres(), 100);
		GameRegistry.registerWorldGenerator(new NetherGenMineable(BlockHandler.BlockBase, 7, Rarity.BLOODSTONE + 1), 100);
		GameRegistry.registerWorldGenerator(new NetherGenMineable(BlockHandler.BlockBase, 8, Rarity.BLACKSOULSTONE + 1), 100);
		GameRegistry.registerWorldGenerator(new NetherGenMineable(BlockHandler.BlockBase, 9, Rarity.BLUESOULSTONE + 1), 100);
		GameRegistry.registerWorldGenerator(new NetherGenMineable(BlockHandler.BlockBase, 10, Rarity.REDSOULSTONE), 100);
	}
}
