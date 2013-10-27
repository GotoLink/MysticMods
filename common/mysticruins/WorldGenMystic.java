package mysticruins;

import java.util.Arrays;
import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenMystic implements IWorldGenerator {
	public static final WorldGenerator ruin = new StructureRuin();
	public static final WorldGenerator ruin1 = new StructureRuin$1();
	public static final WorldGenerator dungeon = new StructureMysticDungeon();

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if (Config.allowId[0].contains(world.provider.dimensionId)) {
			generateRuins(world, random, chunkX * 16, chunkZ * 16);
		}
		if (world.getWorldInfo().getTerrainType() == WorldType.FLAT) {
			return;
		}
		if (Config.allowId[1].contains(world.provider.dimensionId)) {
			generateDungeon(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateDungeon(World world, Random random, int blockX, int blockZ) {
		int Xcoord1, Ycoord1, Zcoord1;
		BiomeGenBase biome;
		for (int i = 0; i < Config.DunRarity; i++) {
			Xcoord1 = blockX + random.nextInt(16) + 8;
			Ycoord1 = random.nextInt(9) + 28;
			Zcoord1 = blockZ + random.nextInt(16) + 8;
			biome = world.getBiomeGenForCoords(Xcoord1, Zcoord1);
			if (Config.allowId[3].contains(biome.biomeID) && Config.allowType[1].containsAll(Arrays.asList(BiomeDictionary.getTypesForBiome(biome)))) {
				if (dungeon.generate(world, random, Xcoord1, Ycoord1, Zcoord1))
					break;
			}
		}
	}

	private void generateRuins(World world, Random random, int blockX, int blockZ) {
		int Xcoord1, Ycoord1, Zcoord1;
		BiomeGenBase biome;
		for (int i = 0; i < Config.RuinRarity; i++) {
			Xcoord1 = blockX + random.nextInt(16) + 8;
			Ycoord1 = random.nextInt(11) + 60;
			Zcoord1 = blockZ + random.nextInt(16) + 8;
			biome = world.getBiomeGenForCoords(Xcoord1, Zcoord1);
			if (Config.allowId[2].contains(biome.biomeID) && Config.allowType[0].containsAll(Arrays.asList(BiomeDictionary.getTypesForBiome(biome)))) {
				if (ruin.generate(world, random, Xcoord1, Ycoord1, Zcoord1) || ruin1.generate(world, random, Xcoord1, Ycoord1, Zcoord1))
					break;
			}
		}
	}
}