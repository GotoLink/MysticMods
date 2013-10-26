package mysticworld.biome;

public class BiomeGenGlacier extends BiomeGenTundra {
	public BiomeGenGlacier(int id, int treesChunk, int grassChunk, int flowerChunk, int reedsChunk, int blockTop, int blockFiller) {
		super(id, treesChunk, grassChunk, flowerChunk, reedsChunk, blockTop, blockFiller);
		this.waterColorMultiplier = 15397370;
	}
}
