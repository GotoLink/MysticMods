package mysticores.worldgen;

import java.util.Random;

import mysticores.blocks.BlockHandler;
import mysticores.lib.Rarity;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenOres implements IWorldGenerator {
	public static final WorldGenMinable adamantine = new WorldGenMinable(BlockHandler.BlockBase, 0, 3, Blocks.stone);
	public static final WorldGenMinable amethyst = new WorldGenMinable(BlockHandler.BlockBase, 1, 4, Blocks.stone);
	public static final WorldGenMinable iridium = new WorldGenMinable(BlockHandler.BlockBase, 2, 6, Blocks.stone);
	public static final WorldGenMinable mithril = new WorldGenMinable(BlockHandler.BlockBase, 3, 6, Blocks.stone);
	public static final WorldGenMinable tourmaline = new WorldGenMinable(BlockHandler.BlockBase, 4, 4, Blocks.stone);
	public static final WorldGenMinable topaz = new WorldGenMinable(BlockHandler.BlockBase, 5, 4, Blocks.stone);
	public static final WorldGenMinable verdite = new WorldGenMinable(BlockHandler.BlockBase, 6, 9, Blocks.stone);
	public static final WorldGenMinable agate = new WorldGenMinable(BlockHandler.BlockBase, 11, 4, Blocks.stone);

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if (!world.provider.isHellWorld) {
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateSurface(World world, Random random, int blockX, int blockZ) {
		for (int i = 0; i < Rarity.ADAMANTINE; i++) {
			int Xcoord = blockX + random.nextInt(8);
			int Ycoord = random.nextInt(13) + 3;
			int Zcoord = blockZ + random.nextInt(8);
			adamantine.generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < Rarity.AGATE; i++) {
			int Xcoord = blockX + random.nextInt(32);
			int Ycoord = random.nextInt(57) + 3;
			int Zcoord = blockZ + random.nextInt(32);
			agate.generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < Rarity.AMETHYST; i++) {
			int Xcoord = blockX + random.nextInt(24);
			int Ycoord = random.nextInt(57) + 3;
			int Zcoord = blockZ + random.nextInt(24);
			amethyst.generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < Rarity.IRIDIUM; i++) {
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = random.nextInt(9) + 3;
			int Zcoord = blockZ + random.nextInt(16);
			iridium.generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < Rarity.MITHRIL; i++) {
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = random.nextInt(61) + 3;
			int Zcoord = blockZ + random.nextInt(16);
			mithril.generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < Rarity.TOPAZ; i++) {
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = random.nextInt(57) + 3;
			int Zcoord = blockZ + random.nextInt(16);
			topaz.generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < Rarity.TOURMALINE; i++) {
			int Xcoord = blockX + random.nextInt(32);
			int Ycoord = random.nextInt(57) + 3;
			int Zcoord = blockZ + random.nextInt(32);
			tourmaline.generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < Rarity.VERDITE; i++) {
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = random.nextInt(20) + 80;
			int Zcoord = blockZ + random.nextInt(16);
			verdite.generate(world, random, Xcoord, Ycoord, Zcoord);
		}
	}
}