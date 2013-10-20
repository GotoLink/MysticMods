package mysticores.worldgen;

import java.util.Random;

import mysticores.blocks.BlockHandler;
import mysticores.lib.Rarity;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenTourmaline implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateSurface(World world, Random random, int blockX, int blockZ) {
		for (int i = 0; i < Rarity.TOURMALINE; i++) {
			int Xcoord = blockX + random.nextInt(32);
			int Ycoord = random.nextInt(60);
			int Zcoord = blockZ + random.nextInt(32);
			(new WorldGenMinable(BlockHandler.BlockBase.blockID, 4, 4, Block.stone.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
	}
}