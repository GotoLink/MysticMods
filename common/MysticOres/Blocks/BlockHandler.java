package mysticores.blocks;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.Arrays;

public class BlockHandler {
    public static ArrayList<String> BLOCK_NAMES = new ArrayList<String>(Arrays.asList("Adamantine Ore", "Amethyst Ore", "Iridium Ore", "Mithril Ore", "Tourmaline Ore", "Topaz Ore", "Verdite Ore", "Bloodstone", "Black Soulstone",
            "Blue Soulstone", "Red Soulstone", "Agate Ore", "Tempered Glass"));
	public static Block BlockBase;

	public static void initialize() {
		BlockBase = GameRegistry.registerBlock(new BlockBase().setStepSound(Block.soundTypeStone), ItemBase.class, "Base Blocks", "mysticores", BLOCK_NAMES);
	}
}
