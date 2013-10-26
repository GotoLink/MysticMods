package mysticworld.biome;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenBasic extends BiomeGenBase {
	public BiomeGenBasic(int id, int blockTop, int blockFiller) {
		super(id);
		this.topBlock = (byte) blockTop;
		this.fillerBlock = (byte) blockFiller;
	}

	public BiomeGenBasic(int id, int treesChunk, int grassChunk, int flowerChunk, int reedsChunk) {
		super(id);
		this.theBiomeDecorator.treesPerChunk = treesChunk;
		this.theBiomeDecorator.grassPerChunk = grassChunk;
		this.theBiomeDecorator.flowersPerChunk = flowerChunk;
		this.theBiomeDecorator.reedsPerChunk = reedsChunk;
	}

	public BiomeGenBasic(int id, int treesChunk, int grassChunk, int flowerChunk, int reedsChunk, int blockTop, int blockFiller) {
		this(id, treesChunk, grassChunk, flowerChunk, reedsChunk);
		this.topBlock = (byte) blockTop;
		this.fillerBlock = (byte) blockFiller;
	}
}
