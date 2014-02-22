package mysticworld.worldgen;

import java.util.Random;

import mysticworld.lib.Booleans;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;

import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenerators implements IWorldGenerator {
	public static final WorldGenerator bushes = new BushesGen();
    public static final WorldGenerator stones = new StonesGen();

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateSurface(World world, Random random, int blockX, int blockZ) {
        int Xcoord1 = blockX + random.nextInt(16) + 8;
        int Ycoord1 = random.nextInt(11) + 60;
        int Zcoord1 = blockZ + random.nextInt(16) + 8;
        stones.generate(world, random, Xcoord1, Ycoord1, Zcoord1);
        if (Booleans.ENABLE_BUSH_GEN){
            Xcoord1 = blockX + random.nextInt(16) + 8;
            Ycoord1 = random.nextInt(11) + 60;
            Zcoord1 = blockZ + random.nextInt(16) + 8;
            bushes.generate(world, random, Xcoord1, Ycoord1, Zcoord1);
        }
	}
}