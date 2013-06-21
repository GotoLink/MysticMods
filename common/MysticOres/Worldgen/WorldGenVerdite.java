package MysticOres.Worldgen;

import java.util.Random;

import MysticOres.Config;
import MysticOres.MysticOres;
import MysticOres.Blocks.BlockHandler;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenVerdite implements IWorldGenerator {
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.dimensionId)
		{
			case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		}
	}
	
	private void generateSurface(World world, Random random, int blockX, int blockZ) 
	{
		for (int i = 0; i < Config.VerditeRarity; i++)
		{
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = random.nextInt(30) + 70;
			int Zcoord = blockZ + random.nextInt(16);
		  
			(new WorldGenMinable(BlockHandler.BlockOres.blockID, 6, 9, Block.stone.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
	}
}