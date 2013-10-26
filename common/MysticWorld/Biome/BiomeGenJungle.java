package mysticworld.biome;

import java.util.Random;
import net.minecraft.world.gen.feature.WorldGenHugeTrees;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenJungle extends net.minecraft.world.biome.BiomeGenJungle {
	public BiomeGenJungle(int par1) {
		super(par1);
	}

	@Override
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random) {
		return par1Random.nextInt(10) == 0 ? this.worldGeneratorBigTree : (par1Random.nextInt(2) == 0 ? new WorldGenHugeTrees(false, 10 + par1Random.nextInt(20), 3, 3) : new WorldGenTrees(false,
				4 + par1Random.nextInt(7), 3, 3, true));
	}
}
