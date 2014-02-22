package mysticworld.biome;

import java.util.Random;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenHugeTrees;
import net.minecraft.world.gen.feature.WorldGenMegaJungle;
import net.minecraft.world.gen.feature.WorldGenTrees;

public class BiomeGenJungle extends net.minecraft.world.biome.BiomeGenJungle {
	public BiomeGenJungle(int par1) {
		super(par1, false);
	}

	@Override
	public WorldGenAbstractTree func_150567_a(Random par1Random) {
		return par1Random.nextInt(10) == 0 ? this.worldGeneratorBigTree : (par1Random.nextInt(2) == 0 ? new WorldGenMegaJungle(false, 10, 20, 3, 3) : new WorldGenTrees(false,
				4 + par1Random.nextInt(7), 3, 3, true));
	}
}
