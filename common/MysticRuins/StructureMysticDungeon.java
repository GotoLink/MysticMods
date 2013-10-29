package mysticruins;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class StructureMysticDungeon extends WorldGenerator {
	public StructureMysticDungeon() {
	}

	@Override
	public boolean generate(World world, Random random, int i, int j, int k) {
		int j1 = (i + random.nextInt(8)) - random.nextInt(8);
		int k1 = (j + random.nextInt(4)) - random.nextInt(4);
		int l1 = (k + random.nextInt(8)) - random.nextInt(8);
		boolean flag = false;
		if (k1 <= 0) {
			return false;
		}
		if (world.isAirBlock(j1 - 1, k1 + 1, l1) && world.isAirBlock(j1 - 1, k1 + 1, l1 + 1) && world.isAirBlock(j1 - 1, k1 + 2, l1) && world.isAirBlock(j1 - 1, k1 + 2, l1 + 1)
				&& world.getBlockId(j1, k1, l1) == Block.stone.blockID && world.getBlockId(j1, k1, l1 + 1) == Block.stone.blockID && world.getBlockId(j1 - 1, k1, l1) == Block.stone.blockID
				&& world.getBlockId(j1 - 1, k1, l1 + 1) == Block.stone.blockID && world.getBlockId(j1, k1 + 1, l1) == Block.stone.blockID
				&& world.getBlockId(j1, k1 + 1, l1 + 1) == Block.stone.blockID)
			flag = true;
		if (!flag) {
			return false;
		}
		setBlock(world, j1, k1 + 1, l1, 0);
		setBlock(world, j1, k1 + 2, l1, 0);
		setBlock(world, j1 - 1, k1 + 1, l1 + 2, 0);
		setBlock(world, j1 - 1, k1 + 1, l1 + 3, 0);
		setBlock(world, j1 - 1, k1 + 2, l1 + 2, 0);
		for (int y = k1 + 1; y < k1 + 4; y++) {
			for (int x = 1; x < 6; x++) {
				setBlock(world, j1 - x, y, l1, 0);
				setBlock(world, j1 - x, y, l1 + 1, 0);
				setBlock(world, j1 - x, y, l1 - 1, 0);
			}
		}
		setBlock(world, j1 - 2, k1 + 1, l1 + 2, 0);
		for (int x = 6; x < 17; x++) {
			for (int y = 1; y < 5; y++) {
				setBlock(world, j1 - x, k1 + y, l1, 0);
			}
		}
		setBlock(world, j1 - 15, k1 + 14, l1, 0);
		int i2 = random.nextInt(100);
		if (i2 <= 40) {
			for (int z = 1; z < 9; z++) {
				setBlock(world, j1 - 16, k1 + 11, l1 - z, 0);
				setBlock(world, j1 - 16, k1 + 12, l1 - z, 0);
			}
			setBlock(world, j1 - 16, k1 + 13, l1 - 8, 0);
			setBlock(world, j1 - 16, k1 + 14, l1 - 8, 0);
			for (int z = 0; z < 5; z++) {
				for (int y = 12; y < 16; y++) {
					setBlock(world, j1 - 16, k1 + y + z, l1 - 9 + z, 0);
				}
			}
			setBlock(world, j1 - 16, k1 + 20, l1 - 13, 0);
			int j2 = random.nextInt(100);
			if (j2 <= 20) {
				for (int x = 0; x < 3; x++) {
					for (int z = 15; z < 18; z++) {
						setBlock(world, j1 - 15 - x, k1 + 17, l1 - z, 0);
						setBlock(world, j1 - 15 - x, k1 + 18, l1 - z, 0);
					}
				}
				setBlock(world, j1 - 16, k1 + 16, l1 - 15, Block.blockLapis.blockID);
				setBlock(world, j1 - 16, k1 + 16, l1 - 16, pickBlock(random));
				setBlock(world, j1 - 16, k1 + 16, l1 - 17, Block.blockLapis.blockID);
				for (int z = 15; z < 18; z++) {
					setBlock(world, j1 - 15, k1 + 16, l1 - z, Block.blockLapis.blockID);
					setBlock(world, j1 - 17, k1 + 16, l1 - z, Block.blockLapis.blockID);
				}
				setBlock(world, j1 - 16, k1 + 17, l1 - 16, Block.chest.blockID);
				ChestFiller.fillWithRares(world.getBlockTileEntity(j1 - 16, k1 + 17, l1 - 16));
			}
		}
		for (int z = 0; z < 12; z++) {
			for (int y = k1 + 12 + z; y < k1 + 16 + z; y++) {
				setBlock(world, j1 - 16, y, l1 + 1 + z, 0);
			}
		}
		setBlock(world, j1 - 16, k1 + 24, l1 + 9, 0);
		setBlock(world, j1, k1 + 1, l1, 0);
		setBlock(world, j1, k1 + 2, l1, 0);
		setBlock(world, j1, k1, l1, pickBlock(random));
		setBlock(world, j1, k1, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1, l1 - 1, pickBlock(random));
		setBlock(world, j1, k1 + 1, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 + 1, l1 - 1, pickBlock(random));
		setBlock(world, j1, k1 + 2, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 + 2, l1 - 1, pickBlock(random));
		setBlock(world, j1, k1 + 3, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 + 3, l1 - 1, pickBlock(random));
		setBlock(world, j1, k1 + 3, l1, pickBlock(random));
		int k2 = random.nextInt(100);
		if (k2 <= 40) {
			setBlock(world, j1 - 1, k1 + 3, l1, Block.vine.blockID);
			setBlock(world, j1 - 1, k1 + 3, l1 + 1, Block.vine.blockID);
			setBlock(world, j1 - 2, k1 + 3, l1 - 1, Block.vine.blockID);
			setBlock(world, j1 - 3, k1 + 3, l1 + 2, Block.vine.blockID);
		}
		j1++;
		setBlock(world, j1, k1, l1, pickBlock(random));
		setBlock(world, j1, k1, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1, l1 - 1, pickBlock(random));
		for (int y = 1; y < 4; y++) {
			setBlock(world, j1, k1 + y, l1, 0);
			setBlock(world, j1, k1 + y, l1 + 1, 0);
			setBlock(world, j1, k1 + y, l1 - 1, 0);
		}
		setBlock(world, j1, k1 + 1, l1 - 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1, l1, pickBlock(random));
		setBlock(world, j1, k1, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1, l1 - 1, pickBlock(random));
		for (int y = 1; y < 4; y++) {
			setBlock(world, j1, k1 + y, l1, 0);
			setBlock(world, j1, k1 + y, l1 + 1, 0);
			setBlock(world, j1, k1 + y, l1 - 1, 0);
		}
		setBlock(world, j1, k1 + 2, l1 + 2, pickBlock(random));
		setBlock(world, j1, k1 + 3, l1 + 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1, l1, pickBlock(random));
		setBlock(world, j1, k1, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1, l1 - 1, pickBlock(random));
		for (int y = 1; y < 4; y++) {
			setBlock(world, j1, k1 + y, l1, 0);
			setBlock(world, j1, k1 + y, l1 + 1, 0);
			setBlock(world, j1, k1 + y, l1 - 1, 0);
		}
		j1++;
		setBlock(world, j1, k1, l1, pickBlock(random));
		setBlock(world, j1, k1, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1, l1 - 1, pickBlock(random));
		for (int y = 1; y < 4; y++) {
			setBlock(world, j1, k1 + y, l1, 0);
			setBlock(world, j1, k1 + y, l1 + 1, 0);
			setBlock(world, j1, k1 + y, l1 - 1, 0);
		}
		setBlock(world, j1, k1 + 1, l1 + 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1, l1, pickBlock(random));
		setBlock(world, j1, k1, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1, l1 - 1, pickBlock(random));
		for (int y = 1; y < 4; y++) {
			setBlock(world, j1, k1 + y, l1, 0);
			setBlock(world, j1, k1 + y, l1 + 1, 0);
			setBlock(world, j1, k1 + y, l1 - 1, 0);
		}
		setBlock(world, j1, k1 + 1, l1 - 2, pickBlock(random));
		setBlock(world, j1, k1 + 2, l1 - 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1, l1, pickBlock(random));
		setBlock(world, j1, k1, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1, l1 - 1, pickBlock(random));
		for (int y = 1; y < 4; y++) {
			setBlock(world, j1, k1 + y, l1, 0);
			setBlock(world, j1, k1 + y, l1 + 1, 0);
			setBlock(world, j1, k1 + y, l1 - 1, 0);
		}
		int l2 = random.nextInt(100);
		if (l2 <= 30) {
			setBlock(world, j1 - 1, k1 + 3, l1, Block.vine.blockID);
			setBlock(world, j1 - 1, k1 + 3, l1 + 2, Block.vine.blockID);
			setBlock(world, j1 - 2, k1 + 3, l1 - 1, Block.vine.blockID);
			setBlock(world, j1 - 3, k1 + 3, l1 + 1, Block.vine.blockID);
			setBlock(world, j1 - 5, k1 + 3, l1, Block.vine.blockID);
		}
		int i3 = random.nextInt(100);
		if (i3 <= 40) {
			for (int z = 2; z < 10; z++) {
				setBlock(world, j1, k1 + 1, l1 - z, 0);
				setBlock(world, j1, k1 + 2, l1 - z, 0);
			}
			for (int z = 0; z < 14; z++) {
				for (int y = k1 + 1 + z; y < k + 5 + z; y++) {
					setBlock(world, j1, y, l1 - 10 - z, 0);
				}
			}
			setBlock(world, j1, k1 + 15, l1 - 20, 0);
			setBlock(world, j1, k1 + 16, l1 - 21, 0);
			int j3 = random.nextInt(100);
			if (j3 <= 20) {
				for (int x = -1; x < 2; x++) {
					setBlock(world, j1 + x, k1 + 15, l1 - 25, 0);
					setBlock(world, j1 + x, k1 + 16, l1 - 25, 0);
					setBlock(world, j1 + x, k1 + 15, l1 - 26, 0);
					setBlock(world, j1 + x, k1 + 16, l1 - 26, 0);
					setBlock(world, j1 + x, k1 + 15, l1 - 27, 0);
					setBlock(world, j1 + x, k1 + 16, l1 - 27, 0);
				}
				setBlock(world, j1 - 16, k1 + 14, l1 - 15, 0);
				setBlock(world, j1 - 16, k1 + 14, l1 - 16, pickBlock(random));
				setBlock(world, j1 - 16, k1 + 14, l1 - 17, 0);
				setBlock(world, j1 - 15, k1 + 14, l1 - 15, 0);
				setBlock(world, j1 - 15, k1 + 14, l1 - 16, 0);
				setBlock(world, j1 - 15, k1 + 14, l1 - 17, 0);
				setBlock(world, j1 - 17, k1 + 14, l1 - 15, 0);
				setBlock(world, j1 - 17, k1 + 14, l1 - 16, 0);
				setBlock(world, j1 - 17, k1 + 14, l1 - 17, 0);
				setBlock(world, j1 - 16, k1 + 15, l1 - 16, Block.chest.blockID);
				ChestFiller.fillWithValuables(world.getBlockTileEntity(j1 - 16, k1 + 15, l1 - 16));
			}
		}
		j1++;
		setBlock(world, j1, k1, l1, pickBlock(random));
		setBlock(world, j1, k1, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1, l1 - 1, pickBlock(random));
		for (int y = 1; y < 4; y++) {
			setBlock(world, j1, k1 + y, l1, 0);
			setBlock(world, j1, k1 + y, l1 + 1, 0);
			setBlock(world, j1, k1 + y, l1 - 1, 0);
		}
		setBlock(world, j1, k1 + 1, l1 + 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1, l1, pickBlock(random));
		setBlock(world, j1, k1, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1, l1 - 1, pickBlock(random));
		for (int y = 1; y < 4; y++) {
			setBlock(world, j1, k1 + y, l1, 0);
			setBlock(world, j1, k1 + y, l1 + 1, 0);
			setBlock(world, j1, k1 + y, l1 - 1, 0);
		}
		j1++;
		setBlock(world, j1, k1, l1, pickBlock(random));
		setBlock(world, j1, k1, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1, l1 - 1, pickBlock(random));
		for (int y = 1; y < 4; y++) {
			setBlock(world, j1, k1 + y, l1, 0);
			setBlock(world, j1, k1 + y, l1 + 1, 0);
			setBlock(world, j1, k1 + y, l1 - 1, 0);
		}
		setBlock(world, j1, k1 + 3, l1 + 2, pickBlock(random));
		setBlock(world, j1, k1 + 1, l1 - 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1, l1, pickBlock(random));
		setBlock(world, j1, k1, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1, l1 - 1, pickBlock(random));
		for (int y = 1; y < 4; y++) {
			setBlock(world, j1, k1 + y, l1, 0);
			setBlock(world, j1, k1 + y, l1 + 1, 0);
			setBlock(world, j1, k1 + y, l1 - 1, 0);
		}
		setBlock(world, j1, k1 + 1, l1 + 2, 0);
		setBlock(world, j1, k1 + 1, l1 - 2, 0);
		setBlock(world, j1, k1 + 2, l1 + 2, 0);
		j1++;
		setBlock(world, j1, k1, l1, pickBlock(random));
		setBlock(world, j1, k1, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1, l1 - 1, pickBlock(random));
		for (int y = 1; y < 4; y++) {
			for (int z = -2; z < 3; z++) {
				setBlock(world, j1, k1 + y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 + 1, l1 + 3, 0);
		setBlock(world, j1, k1 + 3, l1 - 3, 0);
		setBlock(world, j1, k1 + 1, l1 + 2, pickBlock(random));
		setBlock(world, j1, k1 + 2, l1 + 2, pickBlock(random));
		setBlock(world, j1, k1 + 1, l1 - 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1 + 1, l1, 0);
		setBlock(world, j1, k1 + 2, l1, 0);
		setBlock(world, j1, k1, l1, pickBlock(random));
		setBlock(world, j1, k1, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1, l1 - 1, pickBlock(random));
		setBlock(world, j1, k1 + 1, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 + 1, l1 - 1, pickBlock(random));
		setBlock(world, j1, k1 + 2, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 + 2, l1 - 1, pickBlock(random));
		setBlock(world, j1, k1 + 3, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 + 3, l1 - 1, pickBlock(random));
		setBlock(world, j1, k1 + 3, l1, pickBlock(random));
		j1++;
		int k3 = random.nextInt(2) + 1;
		if (k3 == 1) {
			int l3 = random.nextInt(2) + 1;
			setBlock(world, j1, k1, l1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 2, pickBlock(random));
			setBlock(world, j1, k1, l1 + 3, pickBlock(random));
			setBlock(world, j1, k1, l1 + 4, pickBlock(random));
			setBlock(world, j1, k1, l1 - 1, pickBlock(random));
			setBlock(world, j1, k1, l1 - 2, pickBlock(random));
			setBlock(world, j1, k1, l1 - 3, pickBlock(random));
			setBlock(world, j1, k1, l1 - 4, pickBlock(random));
			for (int y = 1; y < 5; y++) {
				for (int z = -4; z < 5; z++) {
					setBlock(world, j1, k1 + y, l1 + z, 0);
				}
			}
			setBlock(world, j1, k1 + 1, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1 + 1, l1 - 5, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 - 5, pickBlock(random));
			j1++;
			setBlock(world, j1, k1, l1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 2, pickBlock(random));
			setBlock(world, j1, k1, l1 + 3, pickBlock(random));
			setBlock(world, j1, k1, l1 + 4, pickBlock(random));
			setBlock(world, j1, k1, l1 - 1, pickBlock(random));
			setBlock(world, j1, k1, l1 - 2, pickBlock(random));
			setBlock(world, j1, k1, l1 - 3, pickBlock(random));
			setBlock(world, j1, k1, l1 - 4, pickBlock(random));
			for (int u = 0; u < 5; u++) {
				for (int y = 1; y < 5; y++) {
					setBlock(world, j1, k1 + y, l1 + u, 0);
					setBlock(world, j1, k1 + y, l1 - u, 0);
				}
			}
			setBlock(world, j1, k1 + 1, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1 + 3, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1 + 1, l1 - 5, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 - 5, pickBlock(random));
			if (l3 == 1) {
				int k4 = random.nextInt(100);
				if (k4 <= 60) {
					for (int u = 1; u < 4; u++) {
						setBlock(world, j1, k1 + u, l1 + u, Block.bookShelf.blockID);
					}
				}
			}
			if (l3 == 2) {
				int l4 = random.nextInt(100);
				if (l4 <= 40) {
					setBlock(world, j1, k1 + 1, l1 + 1, Block.blockIron.blockID);
					setBlock(world, j1, k1 + 2, l1 + 1, Block.blockIron.blockID);
					setBlock(world, j1, k1 + 1, l1 + 2, Block.blockIron.blockID);
					setBlock(world, j1, k1 + 2, l1 + 2, 0);
					setBlock(world, j1, k1 + 3, l1 + 2, 0);
					setBlock(world, j1, k1 + 1, l1 + 3, 0);
				}
			}
			j1++;
			setBlock(world, j1, k1, l1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 2, pickBlock(random));
			setBlock(world, j1, k1, l1 + 3, pickBlock(random));
			setBlock(world, j1, k1, l1 + 4, pickBlock(random));
			setBlock(world, j1, k1, l1 - 1, pickBlock(random));
			setBlock(world, j1, k1, l1 - 2, pickBlock(random));
			setBlock(world, j1, k1, l1 - 3, pickBlock(random));
			setBlock(world, j1, k1, l1 - 4, pickBlock(random));
			for (int u = 0; u < 5; u++) {
				for (int y = 1; y < 5; y++) {
					setBlock(world, j1, k1 + y, l1 + u, 0);
					setBlock(world, j1, k1 + y, l1 - u, 0);
				}
			}
			setBlock(world, j1, k1 + 2, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1 + 1, l1 - 5, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 - 5, pickBlock(random));
			if (l3 == 2) {
				int i5 = random.nextInt(100);
				if (i5 <= 40) {
					setBlock(world, j1, k1 + 1, l1 + 1, Block.blockIron.blockID);
					setBlock(world, j1, k1 + 1, l1 + 2, Block.blockIron.blockID);
					setBlock(world, j1, k1 + 2, l1 + 2, 0);
					setBlock(world, j1, k1 + 1, l1 + 3, 0);
				}
			}
			j1++;
			setBlock(world, j1, k1, l1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 2, pickBlock(random));
			setBlock(world, j1, k1, l1 + 3, pickBlock(random));
			setBlock(world, j1, k1, l1 + 4, pickBlock(random));
			setBlock(world, j1, k1, l1 - 1, pickBlock(random));
			setBlock(world, j1, k1, l1 - 2, pickBlock(random));
			setBlock(world, j1, k1, l1 - 3, pickBlock(random));
			setBlock(world, j1, k1, l1 - 4, pickBlock(random));
			for (int u = 0; u < 5; u++) {
				for (int y = 1; y < 5; y++) {
					setBlock(world, j1, k1 + y, l1 + u, 0);
					setBlock(world, j1, k1 + y, l1 - u, 0);
				}
			}
			setBlock(world, j1, k1 + 1, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1 + 3, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 - 5, pickBlock(random));
			if (l3 == 1) {
				int j5 = random.nextInt(100);
				if (j5 <= 15) {
					setBlock(world, j1, k1 + 1, l1 + 1, Block.mobSpawner.blockID);
					TileEntityMobSpawner spawner = (TileEntityMobSpawner) world.getBlockTileEntity(j1, k1 + 1, l1 + 1);
					if (spawner != null) {
						spawner.getSpawnerLogic().setMobID(Config.getRandomDungeonMob(random));
					}
					setBlock(world, j1, k1 + 2, l1 + 1, Block.chest.blockID);
					ChestFiller.fillWithRares(world.getBlockTileEntity(j1, k1 + 2, l1 + 1));
					setBlock(world, j1, k1 + 3, l1 + 1, Block.mobSpawner.blockID);
					spawner = (TileEntityMobSpawner) world.getBlockTileEntity(j1, k1 + 3, l1 + 1);
					if (spawner != null) {
						spawner.getSpawnerLogic().setMobID(Config.getRandomDungeonMob(random));
					}
					setBlock(world, j1, k1 + 1, l1 + 2, 0);
					setBlock(world, j1, k1 + 2, l1 + 2, 0);
					setBlock(world, j1, k1 + 3, l1 + 2, 0);
					setBlock(world, j1, k1 + 1, l1 + 3, 0);
					setBlock(world, j1, k1 + 2, l1 + 3, 0);
					setBlock(world, j1, k1 + 3, l1 + 3, 0);
				}
				setBlock(world, j1, k1 + 1, l1 - 2, Block.planks.blockID);
				setBlock(world, j1, k1 + 1, l1 - 3, Block.planks.blockID);
			}
			j1++;
			setBlock(world, j1, k1, l1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 2, pickBlock(random));
			setBlock(world, j1, k1, l1 + 3, pickBlock(random));
			setBlock(world, j1, k1, l1 + 4, pickBlock(random));
			setBlock(world, j1, k1, l1 - 1, pickBlock(random));
			setBlock(world, j1, k1, l1 - 2, pickBlock(random));
			setBlock(world, j1, k1, l1 - 3, pickBlock(random));
			setBlock(world, j1, k1, l1 - 4, pickBlock(random));
			for (int u = 0; u < 5; u++) {
				for (int y = 1; y < 5; y++) {
					setBlock(world, j1, k1 + y, l1 + u, 0);
					setBlock(world, j1, k1 + y, l1 - u, 0);
				}
			}
			setBlock(world, j1, k1 + 1, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1 + 1, l1 - 5, pickBlock(random));
			if (l3 == 1) {
				setBlock(world, j1, k1 + 1, l1 - 2, Block.planks.blockID);
				setBlock(world, j1, k1 + 1, l1 - 3, Block.planks.blockID);
			}
			if (l3 == 2) {
				int k5 = random.nextInt(100);
				if (k5 <= 30) {
					setBlock(world, j1, k1 + 1, l1 + 1, Block.blockIron.blockID);
					setBlock(world, j1, k1 + 1, l1 + 2, Block.blockIron.blockID);
					setBlock(world, j1, k1 + 2, l1 + 2, Block.blockIron.blockID);
					setBlock(world, j1, k1 + 1, l1 + 3, Block.mobSpawner.blockID);
					TileEntityMobSpawner spawner = (TileEntityMobSpawner) world.getBlockTileEntity(j1, k1 + 1, l1 + 3);
					if (spawner != null) {
						spawner.getSpawnerLogic().setMobID(Config.getRandomDungeonMob(random));
					}
				}
			}
			j1++;
			setBlock(world, j1, k1, l1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 2, pickBlock(random));
			setBlock(world, j1, k1, l1 + 3, pickBlock(random));
			setBlock(world, j1, k1, l1 + 4, pickBlock(random));
			setBlock(world, j1, k1, l1 - 1, pickBlock(random));
			setBlock(world, j1, k1, l1 - 2, pickBlock(random));
			setBlock(world, j1, k1, l1 - 3, pickBlock(random));
			setBlock(world, j1, k1, l1 - 4, pickBlock(random));
			for (int u = 0; u < 5; u++) {
				for (int y = 1; y < 5; y++) {
					setBlock(world, j1, k1 + y, l1 + u, 0);
					setBlock(world, j1, k1 + y, l1 - u, 0);
				}
			}
			setBlock(world, j1, k1 + 1, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1 + 3, l1 + 5, pickBlock(random));
			if (l3 == 1) {
				int l5 = random.nextInt(100);
				if (l5 <= 60) {
					setBlock(world, j1, k1 + 1, l1 + 1, Block.bookShelf.blockID);
					setBlock(world, j1, k1 + 2, l1 + 1, Block.bookShelf.blockID);
					setBlock(world, j1, k1 + 3, l1 + 1, Block.bookShelf.blockID);
					setBlock(world, j1, k1 + 1, l1 + 2, Block.bookShelf.blockID);
					setBlock(world, j1, k1 + 2, l1 + 2, Block.mobSpawner.blockID);
					TileEntityMobSpawner spawner = (TileEntityMobSpawner) world.getBlockTileEntity(j1, k1 + 2, l1 + 2);
					if (spawner != null) {
						spawner.getSpawnerLogic().setMobID(Config.getRandomDungeonMob(random));
					}
					setBlock(world, j1, k1 + 3, l1 + 2, Block.bookShelf.blockID);
					setBlock(world, j1, k1 + 1, l1 + 3, Block.bookShelf.blockID);
					setBlock(world, j1, k1 + 2, l1 + 3, Block.bookShelf.blockID);
					setBlock(world, j1, k1 + 3, l1 + 3, Block.bookShelf.blockID);
				}
				setBlock(world, j1, k1 + 1, l1 - 2, Block.planks.blockID);
				setBlock(world, j1, k1 + 1, l1 - 3, Block.planks.blockID);
			}
			int i6 = random.nextInt(100);
			if (i6 <= 30) {
				setBlock(world, j1 - 1, k1 + 4, l1 + 3, Block.vine.blockID);
				setBlock(world, j1 - 1, k1 + 4, l1 + 2, Block.vine.blockID);
				setBlock(world, j1 - 3, k1 + 4, l1 - 1, Block.vine.blockID);
				setBlock(world, j1 - 3, k1 + 4, l1 + 1, Block.vine.blockID);
				setBlock(world, j1 - 3, k1 + 4, l1, Block.vine.blockID);
				setBlock(world, j1 - 3, k1 + 4, l1 - 3, Block.vine.blockID);
			}
			j1++;
			setBlock(world, j1, k1, l1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 2, pickBlock(random));
			setBlock(world, j1, k1, l1 + 3, pickBlock(random));
			setBlock(world, j1, k1, l1 + 4, pickBlock(random));
			setBlock(world, j1, k1, l1 - 1, pickBlock(random));
			setBlock(world, j1, k1, l1 - 2, pickBlock(random));
			setBlock(world, j1, k1, l1 - 3, pickBlock(random));
			setBlock(world, j1, k1, l1 - 4, pickBlock(random));
			for (int u = 0; u < 5; u++) {
				for (int y = 1; y < 5; y++) {
					setBlock(world, j1, k1 + y, l1 + u, 0);
					setBlock(world, j1, k1 + y, l1 - u, 0);
				}
			}
			setBlock(world, j1, k1 + 1, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1 + 1, l1 - 5, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 - 5, pickBlock(random));
			if (l3 == 2) {
				int l6 = random.nextInt(100);
				if (l6 <= 30) {
					setBlock(world, j1, k1 + 1, l1 + 1, Block.blockGold.blockID);
					setBlock(world, j1, k1 + 1, l1 + 2, Block.mobSpawner.blockID);
					TileEntityMobSpawner spawner = (TileEntityMobSpawner) world.getBlockTileEntity(j1, k1 + 1, l1 + 2);
					if (spawner != null) {
						spawner.getSpawnerLogic().setMobID(Config.getRandomDungeonMob(random));
					}
					setBlock(world, j1, k1 + 1, l1 + 3, Block.blockGold.blockID);
				}
			}
			j1++;
			setBlock(world, j1, k1, l1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 2, pickBlock(random));
			setBlock(world, j1, k1, l1 + 3, pickBlock(random));
			setBlock(world, j1, k1, l1 + 4, pickBlock(random));
			setBlock(world, j1, k1, l1 - 1, pickBlock(random));
			setBlock(world, j1, k1, l1 - 2, pickBlock(random));
			setBlock(world, j1, k1, l1 - 3, pickBlock(random));
			setBlock(world, j1, k1, l1 - 4, pickBlock(random));
			for (int u = 0; u < 5; u++) {
				for (int y = 1; y < 5; y++) {
					setBlock(world, j1, k1 + y, l1 + u, 0);
					setBlock(world, j1, k1 + y, l1 - u, 0);
				}
			}
			setBlock(world, j1, k1 + 1, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1 + 1, l1 - 5, pickBlock(random));
			setBlock(world, j1, k1 + 3, l1 - 5, pickBlock(random));
			if (l3 == 1) {
				int i7 = random.nextInt(100);
				if (i7 <= 60) {
					for (int y = 1; y < 4; y++) {
						for (int z = 1; z < 4; z++) {
							setBlock(world, j1, k1 + y, l1 + z, Block.bookShelf.blockID);
						}
					}
				}
			}
			if (l3 == 2) {
				int j7 = random.nextInt(100);
				if (j7 <= 20) {
					setBlock(world, j1, k1 + 1, l1 + 1, Block.blockGold.blockID);
					setBlock(world, j1, k1 + 2, l1 + 1, Block.blockGold.blockID);
					setBlock(world, j1, k1 + 1, l1 + 2, Block.blockGold.blockID);
					setBlock(world, j1, k1 + 2, l1 + 2, Block.blockGold.blockID);
					setBlock(world, j1, k1 + 1, l1 + 3, Block.blockGold.blockID);
				}
				int j8 = random.nextInt(100);
				if (j8 <= 30) {
					setBlock(world, j1, k1 + 1, l1 - 1, 0);
					setBlock(world, j1, k1 + 2, l1 - 1, Block.mobSpawner.blockID);
					TileEntityMobSpawner spawner = (TileEntityMobSpawner) world.getBlockTileEntity(j1, k1 + 2, l1 - 1);
					if (spawner != null) {
						spawner.getSpawnerLogic().setMobID(Config.getRandomDungeonMob(random));
					}
					setBlock(world, j1, k1 + 1, l1 - 2, 0);
					setBlock(world, j1, k1 + 2, l1 - 2, 0);
					setBlock(world, j1 - 1, k1 + 1, l1 - 1, 0);
					setBlock(world, j1 - 1, k1 + 2, l1 - 2, 0);
					setBlock(world, j1 - 1, k1 + 1, l1 - 2, 0);
				}
				int j9 = random.nextInt(100);
				if (j9 <= 10) {
					setBlock(world, j1 - 3, k1 + 1, l1 - 1, Block.blockDiamond.blockID);
					setBlock(world, j1 - 3, k1 + 1, l1 - 2, Block.blockDiamond.blockID);
				}
				int j10 = random.nextInt(100);
				if (j10 <= 10) {
					setBlock(world, j1 - 3, k1 + 1, l1 - 2, Block.blockDiamond.blockID);
				}
				int j11 = random.nextInt(100);
				if (j11 <= 15) {
					setBlock(world, j1 - 5, k1 + 1, l1 - 2, Block.chest.blockID);
					ChestFiller.fillWithValuables(world.getBlockTileEntity(j1 - 5, k1 + 1, l1 - 2));
					setBlock(world, j1 - 5, k1 + 1, l1 - 3, 0);
				}
			}
			j1++;
			setBlock(world, j1, k1, l1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 2, pickBlock(random));
			setBlock(world, j1, k1, l1 + 3, pickBlock(random));
			setBlock(world, j1, k1, l1 + 4, pickBlock(random));
			setBlock(world, j1, k1, l1 - 1, pickBlock(random));
			setBlock(world, j1, k1, l1 - 2, pickBlock(random));
			setBlock(world, j1, k1, l1 - 3, pickBlock(random));
			setBlock(world, j1, k1, l1 - 4, pickBlock(random));
			for (int u = 0; u < 5; u++) {
				for (int y = 1; y < 5; y++) {
					setBlock(world, j1, k1 + y, l1 + u, 0);
					setBlock(world, j1, k1 + y, l1 - u, 0);
				}
			}
			setBlock(world, j1, k1 + 2, l1 - 5, pickBlock(random));
			int k7 = random.nextInt(100);
			if (k7 <= 30) {
				setBlock(world, j1 - 2, k1 + 5, l1 - 3, 0);
				setBlock(world, j1 - 2, k1 + 5, l1 - 2, 0);
				setBlock(world, j1 - 2, k1 + 5, l1 - 1, 0);
				setBlock(world, j1 - 1, k1 + 5, l1 - 2, 0);
				setBlock(world, j1 - 3, k1 + 5, l1 - 2, 0);
				setBlock(world, j1 - 5, k1 + 5, l1 - 2, 0);
				setBlock(world, j1 - 2, k1 + 6, l1 - 2, 0);
				setBlock(world, j1 - 2, k1 + 6, l1 - 1, 0);
				setBlock(world, j1 - 1, k1 + 6, l1 - 2, 0);
				setBlock(world, j1 - 3, k1 + 6, l1 - 2, 0);
				setBlock(world, j1 - 2, k1 + 7, l1 - 2, 0);
				setBlock(world, j1 - 2, k1 + 7, l1 - 1, 0);
				setBlock(world, j1 - 1, k1 + 7, l1 - 2, 0);
				setBlock(world, j1 - 3, k1 + 7, l1 - 2, 0);
				setBlock(world, j1 - 2, k1 + 8, l1 - 2, 0);
				setBlock(world, j1 - 2, k1 + 8, l1 - 1, 0);
				setBlock(world, j1 - 1, k1 + 8, l1 - 2, 0);
				setBlock(world, j1 - 2, k1 + 9, l1 - 2, 0);
				setBlock(world, j1 - 2, k1 + 9, l1 - 1, 0);
				setBlock(world, j1 - 1, k1 + 9, l1 - 2, 0);
				setBlock(world, j1 - 2, k1 + 10, l1 - 1, 0);
				setBlock(world, j1 - 1, k1 + 10, l1 - 2, 0);
				setBlock(world, j1 - 2, k1 + 1, l1 - 2, Block.stone.blockID);
				setBlock(world, j1 - 2, k1 + 1, l1 - 3, Block.gravel.blockID);
				setBlock(world, j1 - 1, k1 + 1, l1 - 2, Block.stone.blockID);
				setBlock(world, j1 - 1, k1 + 1, l1 - 3, Block.gravel.blockID);
				setBlock(world, j1 - 2, k1 + 1, l1 - 1, Block.stone.blockID);
				setBlock(world, j1 - 3, k1 + 1, l1 - 2, Block.stone.blockID);
				setBlock(world, j1 - 2, k1 + 2, l1 - 2, Block.stone.blockID);
				setBlock(world, j1 - 2, k1 + 2, l1 - 1, Block.gravel.blockID);
				setBlock(world, j1 - 2, k1 + 3, l1 - 2, Block.stone.blockID);
				setBlock(world, j1 - 2, k1 + 3, l1 - 1, Block.stone.blockID);
				setBlock(world, j1 - 4, k1 + 3, l1 - 1, Block.gravel.blockID);
				setBlock(world, j1 - 2, k1 + 3, l1, Block.gravel.blockID);
				setBlock(world, j1 - 1, k1 + 3, l1 - 3, Block.stone.blockID);
			}
		}
		if (k3 == 2) {
			setBlock(world, j1, k1, l1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 2, pickBlock(random));
			setBlock(world, j1, k1, l1 + 3, pickBlock(random));
			setBlock(world, j1, k1, l1 + 4, pickBlock(random));
			setBlock(world, j1, k1, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1, l1 + 6, pickBlock(random));
			setBlock(world, j1, k1, l1 + 7, pickBlock(random));
			setBlock(world, j1, k1, l1 + 8, pickBlock(random));
			setBlock(world, j1, k1, l1 - 1, pickBlock(random));
			setBlock(world, j1, k1, l1 - 2, pickBlock(random));
			setBlock(world, j1, k1, l1 - 3, pickBlock(random));
			setBlock(world, j1, k1, l1 - 4, pickBlock(random));
			setBlock(world, j1, k1, l1 - 5, pickBlock(random));
			setBlock(world, j1, k1, l1 - 6, pickBlock(random));
			setBlock(world, j1, k1, l1 - 7, pickBlock(random));
			setBlock(world, j1, k1, l1 - 8, pickBlock(random));
			for (int u = 0; u < 9; u++) {
				for (int y = 1; y < 6; y++) {
					setBlock(world, j1, k1 + y, l1 + u, 0);
					setBlock(world, j1, k1 + y, l1 - u, 0);
				}
			}
			setBlock(world, j1, k1 + 1, l1 + 9, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 + 9, pickBlock(random));
			setBlock(world, j1, k1 + 1, l1 - 9, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 - 9, pickBlock(random));
			setBlock(world, j1, k1 + 3, l1 - 9, pickBlock(random));
			int i4 = random.nextInt(100);
			if (i4 <= 60) {
				for (int y = 0; y < 15; y++) {
					setBlock(world, j1 + 7, k1 - y, l1, 0);
				}
				setBlock(world, j1, k1 - 13, l1 + 1, 0);
				setBlock(world, j1, k1 - 13, l1 - 1, 0);
				setBlock(world, j1, k1 - 14, l1 + 1, 0);
				setBlock(world, j1, k1 - 14, l1 - 1, 0);
				setBlock(world, j1 + 1, k1 - 13, l1 + 1, 0);
				setBlock(world, j1 + 1, k1 - 13, l1 - 1, 0);
				setBlock(world, j1 + 1, k1 - 14, l1 + 1, 0);
				setBlock(world, j1 + 1, k1 - 14, l1 - 1, 0);
			}
			int j6 = random.nextInt(100);
			if (j6 <= 70) {
				for (int y = 0; y < 13; y++) {
					setBlock(world, j1 + 7, k1 - y, l1 + 6, 0);
				}
				setBlock(world, j1, k1 - 11, l1 + 7, 0);
				setBlock(world, j1, k1 - 11, l1 + 5, 0);
				setBlock(world, j1, k1 - 12, l1 + 7, 0);
				setBlock(world, j1, k1 - 12, l1 + 5, 0);
				setBlock(world, j1 + 1, k1 - 11, l1 + 7, 0);
				setBlock(world, j1 + 1, k1 - 11, l1 + 5, 0);
				setBlock(world, j1 + 1, k1 - 12, l1 + 7, 0);
				setBlock(world, j1 + 1, k1 - 12, l1 + 5, 0);
			}
			int l7 = random.nextInt(100);
			if (l7 <= 50) {
				for (int y = 0; y < 17; y++) {
					setBlock(world, j1 + 7, k1 - y, l1 - 4, 0);
				}
				setBlock(world, j1 + 7, k1 - 15, l1 - 5, 0);
				setBlock(world, j1 + 7, k1 - 15, l1 - 3, 0);
				setBlock(world, j1 + 7, k1 - 16, l1 - 5, 0);
				setBlock(world, j1 + 7, k1 - 16, l1 - 3, 0);
				setBlock(world, j1 + 8, k1 - 15, l1 - 5, 0);
				setBlock(world, j1 + 8, k1 - 15, l1 - 3, 0);
				setBlock(world, j1 + 8, k1 - 16, l1 - 5, 0);
				setBlock(world, j1 + 8, k1 - 16, l1 - 3, 0);
			}
			j1++;
			setBlock(world, j1, k1, l1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 2, pickBlock(random));
			setBlock(world, j1, k1, l1 + 3, pickBlock(random));
			setBlock(world, j1, k1, l1 + 4, pickBlock(random));
			setBlock(world, j1, k1, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1, l1 + 6, pickBlock(random));
			setBlock(world, j1, k1, l1 + 7, pickBlock(random));
			setBlock(world, j1, k1, l1 + 8, pickBlock(random));
			setBlock(world, j1, k1, l1 - 1, pickBlock(random));
			setBlock(world, j1, k1, l1 - 2, pickBlock(random));
			setBlock(world, j1, k1, l1 - 3, pickBlock(random));
			setBlock(world, j1, k1, l1 - 4, pickBlock(random));
			setBlock(world, j1, k1, l1 - 5, pickBlock(random));
			setBlock(world, j1, k1, l1 - 6, pickBlock(random));
			setBlock(world, j1, k1, l1 - 7, pickBlock(random));
			setBlock(world, j1, k1, l1 - 8, pickBlock(random));
			setBlock(world, j1, k1 + 6, l1, 0);
			setBlock(world, j1, k1 + 6, l1 + 1, 0);
			setBlock(world, j1, k1 + 6, l1 - 1, 0);
			setBlock(world, j1, k1 + 6, l1 + 2, 0);
			setBlock(world, j1, k1 + 6, l1 - 2, 0);
			setBlock(world, j1, k1 + 7, l1 + 1, 0);
			setBlock(world, j1, k1 + 7, l1, 0);
			setBlock(world, j1, k1 + 7, l1 - 1, 0);
			setBlock(world, j1, k1 + 8, l1, 0);
			for (int y = 1; y < 6; y++) {
				for (int z = -8; z < 9; z++) {
					setBlock(world, j1, k1 + y, l1 + 1, 0);
				}
			}
			setBlock(world, j1, k1 + 1, l1 + 9, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 + 9, pickBlock(random));
			setBlock(world, j1, k1 + 3, l1 + 9, pickBlock(random));
			setBlock(world, j1, k1 + 1, l1 - 9, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 - 9, pickBlock(random));
			for (int y = 1; y < 6; y++) {
				setBlockAndMetadata(world, j1, k1 + y, l1 + 6, Block.blockNetherQuartz.blockID, 2);
				setBlockAndMetadata(world, j1, k1 + y, l1 - 6, Block.blockNetherQuartz.blockID, 2);
			}
			j1++;
			setBlock(world, j1, k1, l1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 2, pickBlock(random));
			setBlock(world, j1, k1, l1 + 3, pickBlock(random));
			setBlock(world, j1, k1, l1 + 4, pickBlock(random));
			setBlock(world, j1, k1, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1, l1 + 6, pickBlock(random));
			setBlock(world, j1, k1, l1 + 7, pickBlock(random));
			setBlock(world, j1, k1, l1 + 8, pickBlock(random));
			setBlock(world, j1, k1, l1 - 1, pickBlock(random));
			setBlock(world, j1, k1, l1 - 2, pickBlock(random));
			setBlock(world, j1, k1, l1 - 3, pickBlock(random));
			setBlock(world, j1, k1, l1 - 4, pickBlock(random));
			setBlock(world, j1, k1, l1 - 5, pickBlock(random));
			setBlock(world, j1, k1, l1 - 6, pickBlock(random));
			setBlock(world, j1, k1, l1 - 7, pickBlock(random));
			setBlock(world, j1, k1, l1 - 8, pickBlock(random));
			setBlock(world, j1, k1 + 1, l1, 0);
			setBlock(world, j1, k1 + 2, l1, 0);
			setBlock(world, j1, k1 + 3, l1, 0);
			setBlock(world, j1, k1 + 4, l1, 0);
			setBlock(world, j1, k1 + 5, l1, 0);
			setBlock(world, j1, k1 + 6, l1, 0);
			setBlock(world, j1, k1 + 7, l1, 0);
			setBlock(world, j1, k1 + 6, l1 + 1, 0);
			setBlock(world, j1, k1 + 6, l1 - 1, 0);
			setBlock(world, j1, k1 + 6, l1 + 2, 0);
			setBlock(world, j1, k1 + 6, l1 - 2, 0);
			setBlock(world, j1, k1 + 7, l1 + 1, 0);
			setBlock(world, j1, k1 + 7, l1 - 1, 0);
			setBlock(world, j1, k1 + 8, l1, 0);
			for (int u = 1; u < 9; u++) {
				for (int y = 1; y < 6; y++) {
					setBlock(world, j1, k1 + y, l1 + u, 0);
					setBlock(world, j1, k1 + y, l1 - u, 0);
				}
			}
			setBlock(world, j1, k1 + 2, l1 + 9, pickBlock(random));
			setBlock(world, j1, k1 + 1, l1 - 9, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 - 9, pickBlock(random));
			setBlock(world, j1, k1 + 1, l1, Block.stoneSingleSlab.blockID);
			setBlock(world, j1, k1 + 1, l1 + 1, Block.stoneSingleSlab.blockID);
			setBlock(world, j1, k1 + 1, l1 + 2, Block.stoneSingleSlab.blockID);
			setBlock(world, j1, k1 + 1, l1 + 3, Block.stoneSingleSlab.blockID);
			setBlock(world, j1, k1 + 1, l1 - 1, Block.stoneSingleSlab.blockID);
			setBlock(world, j1, k1 + 1, l1 - 2, Block.stoneSingleSlab.blockID);
			setBlock(world, j1, k1 + 1, l1 - 3, Block.stoneSingleSlab.blockID);
			j1++;
			setBlock(world, j1, k1, l1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 2, pickBlock(random));
			setBlock(world, j1, k1, l1 + 3, pickBlock(random));
			setBlock(world, j1, k1, l1 + 4, pickBlock(random));
			setBlock(world, j1, k1, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1, l1 + 6, pickBlock(random));
			setBlock(world, j1, k1, l1 + 7, pickBlock(random));
			setBlock(world, j1, k1, l1 + 8, pickBlock(random));
			setBlock(world, j1, k1, l1 - 1, pickBlock(random));
			setBlock(world, j1, k1, l1 - 2, pickBlock(random));
			setBlock(world, j1, k1, l1 - 3, pickBlock(random));
			setBlock(world, j1, k1, l1 - 4, pickBlock(random));
			setBlock(world, j1, k1, l1 - 5, pickBlock(random));
			setBlock(world, j1, k1, l1 - 6, pickBlock(random));
			setBlock(world, j1, k1, l1 - 7, pickBlock(random));
			setBlock(world, j1, k1, l1 - 8, pickBlock(random));
			setBlock(world, j1, k1 + 6, l1, 0);
			setBlock(world, j1, k1 + 6, l1 + 1, 0);
			setBlock(world, j1, k1 + 6, l1 - 1, 0);
			setBlock(world, j1, k1 + 6, l1 + 2, 0);
			setBlock(world, j1, k1 + 6, l1 - 2, 0);
			setBlock(world, j1, k1 + 7, l1, 0);
			setBlock(world, j1, k1 + 7, l1 + 1, 0);
			setBlock(world, j1, k1 + 7, l1 - 1, 0);
			setBlock(world, j1, k1 + 8, l1, 0);
			for (int y = 1; y < 6; y++) {
				for (int z = -8; z < 9; z++) {
					setBlock(world, j1, k1 + y, l1 + 1, 0);
				}
			}
			setBlock(world, j1, k1 + 1, l1 + 9, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 + 9, pickBlock(random));
			setBlock(world, j1, k1 + 3, l1 + 9, pickBlock(random));
			setBlock(world, j1, k1 + 1, l1 - 9, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 - 9, pickBlock(random));
			setBlock(world, j1, k1 + 1, l1 + 3, Block.stoneSingleSlab.blockID);
			for (int z = -2; z < 3; z++) {
				setBlock(world, j1, k1, l1 + z, Block.obsidian.blockID);
				setBlock(world, j1, k1 + 1, l1 + z, Block.obsidian.blockID);
				setBlock(world, j1, k1 + 2, l1 + z, Block.obsidian.blockID);
			}
			setBlock(world, j1, k1 + 1, l1 - 3, Block.stoneSingleSlab.blockID);
			for (int y = 1; y < 6; y++) {
				setBlockAndMetadata(world, j1, k1 + y, l1 + 6, Block.blockNetherQuartz.blockID, 2);
				setBlockAndMetadata(world, j1, k1 + y, l1 - 6, Block.blockNetherQuartz.blockID, 2);
			}
			int k8 = random.nextInt(100);
			if (k8 <= 15) {
				setBlock(world, j1, k1 + 1, l1 - 7, Block.chest.blockID);
				ChestFiller.fillWithValuables(world.getBlockTileEntity(j1, k1 + 1, l1 - 7));
			}
			j1++;
			setBlock(world, j1, k1, l1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 2, pickBlock(random));
			setBlock(world, j1, k1, l1 + 3, pickBlock(random));
			setBlock(world, j1, k1, l1 + 4, pickBlock(random));
			setBlock(world, j1, k1, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1, l1 + 6, pickBlock(random));
			setBlock(world, j1, k1, l1 + 7, pickBlock(random));
			setBlock(world, j1, k1, l1 + 8, pickBlock(random));
			setBlock(world, j1, k1, l1 - 1, pickBlock(random));
			setBlock(world, j1, k1, l1 - 2, pickBlock(random));
			setBlock(world, j1, k1, l1 - 3, pickBlock(random));
			setBlock(world, j1, k1, l1 - 4, pickBlock(random));
			setBlock(world, j1, k1, l1 - 5, pickBlock(random));
			setBlock(world, j1, k1, l1 - 6, pickBlock(random));
			setBlock(world, j1, k1, l1 - 7, pickBlock(random));
			setBlock(world, j1, k1, l1 - 8, pickBlock(random));
			setBlock(world, j1, k1 + 6, l1, 0);
			setBlock(world, j1, k1 + 6, l1 + 1, 0);
			setBlock(world, j1, k1 + 6, l1 - 1, 0);
			setBlock(world, j1, k1 + 6, l1 + 2, 0);
			setBlock(world, j1, k1 + 6, l1 - 2, 0);
			setBlock(world, j1, k1 + 7, l1, 0);
			setBlock(world, j1, k1 + 7, l1 + 1, 0);
			setBlock(world, j1, k1 + 7, l1 - 1, 0);
			setBlock(world, j1, k1 + 8, l1, 0);
			for (int y = 1; y < 6; y++) {
				for (int z = -8; z < 9; z++) {
					setBlock(world, j1, k1 + y, l1 + 1, 0);
				}
			}
			setBlock(world, j1, k1 + 2, l1 + 9, pickBlock(random));
			setBlock(world, j1, k1 + 3, l1 + 9, pickBlock(random));
			setBlock(world, j1, k1 + 1, l1 - 9, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 - 9, pickBlock(random));
			setBlock(world, j1, k1 + 4, l1 - 9, pickBlock(random));
			setBlock(world, j1, k1 + 1, l1 + 3, Block.stoneSingleSlab.blockID);
			setBlock(world, j1, k1 + 1, l1, Block.chest.blockID);
			ChestFiller.fillWithValuables(world.getBlockTileEntity(j1, k1 + 1, l1));
			for (int z = -2; z < 3; z++) {
				setBlock(world, j1, k1, l1 + z, Block.obsidian.blockID);
				if (z != 0)
					setBlock(world, j1, k1 + 1, l1 + z, Block.obsidian.blockID);
				setBlock(world, j1, k1 + 2, l1 + z, Block.obsidian.blockID);
			}
			setBlock(world, j1, k1 + 1, l1 - 3, Block.stoneSingleSlab.blockID);
			int k9 = random.nextInt(100);
			if (k9 <= 75) {
				setBlock(world, j1, k1 + 1, l1, 0);
				setBlock(world, j1, k1 + 2, l1, 0);
				setBlock(world, j1, k1 + 1, l1 + 1, 0);
				setBlock(world, j1, k1 + 2, l1 + 1, 0);
				setBlock(world, j1, k1 + 1, l1 - 1, 0);
				setBlock(world, j1, k1 + 1, l1, 0);
				setBlock(world, j1 - 1, k1 + 1, l1, 0);
				setBlock(world, j1 - 1, k1 + 2, l1, 0);
				setBlock(world, j1 - 1, k1 + 2, l1 - 1, 0);
				setBlock(world, j1 - 3, k1 + 1, l1 + 2, Block.obsidian.blockID);
				setBlock(world, j1 - 2, k1 + 1, l1, Block.obsidian.blockID);
				setBlock(world, j1 - 3, k1 + 1, l1 - 3, Block.obsidian.blockID);
			}
			j1++;
			setBlock(world, j1, k1, l1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 2, pickBlock(random));
			setBlock(world, j1, k1, l1 + 3, pickBlock(random));
			setBlock(world, j1, k1, l1 + 4, pickBlock(random));
			setBlock(world, j1, k1, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1, l1 + 6, pickBlock(random));
			setBlock(world, j1, k1, l1 + 7, pickBlock(random));
			setBlock(world, j1, k1, l1 + 8, pickBlock(random));
			setBlock(world, j1, k1, l1 - 1, pickBlock(random));
			setBlock(world, j1, k1, l1 - 2, pickBlock(random));
			setBlock(world, j1, k1, l1 - 3, pickBlock(random));
			setBlock(world, j1, k1, l1 - 4, pickBlock(random));
			setBlock(world, j1, k1, l1 - 5, pickBlock(random));
			setBlock(world, j1, k1, l1 - 6, pickBlock(random));
			setBlock(world, j1, k1, l1 - 7, pickBlock(random));
			setBlock(world, j1, k1, l1 - 8, pickBlock(random));
			setBlock(world, j1, k1 + 6, l1, 0);
			setBlock(world, j1, k1 + 6, l1 + 1, 0);
			setBlock(world, j1, k1 + 6, l1 - 1, 0);
			setBlock(world, j1, k1 + 6, l1 + 2, 0);
			setBlock(world, j1, k1 + 6, l1 - 2, 0);
			setBlock(world, j1, k1 + 7, l1, 0);
			setBlock(world, j1, k1 + 7, l1 + 1, 0);
			setBlock(world, j1, k1 + 7, l1 - 1, 0);
			setBlock(world, j1, k1 + 8, l1, 0);
			for (int y = 1; y < 6; y++) {
				for (int z = -8; z < 9; z++) {
					setBlock(world, j1, k1 + y, l1 + 1, 0);
				}
			}
			setBlock(world, j1, k1 + 1, l1 + 9, pickBlock(random));
			setBlock(world, j1, k1 + 1, l1 - 9, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 - 9, pickBlock(random));
			setBlock(world, j1, k1 + 1, l1 + 3, Block.stoneSingleSlab.blockID);
			for (int z = -2; z < 3; z++) {
				setBlock(world, j1, k1, l1 + z, Block.obsidian.blockID);
				setBlock(world, j1, k1 + 1, l1 + z, Block.obsidian.blockID);
				setBlock(world, j1, k1 + 2, l1 + z, Block.obsidian.blockID);
			}
			setBlock(world, j1, k1 + 1, l1 - 3, Block.stoneSingleSlab.blockID);
			for (int y = 1; y < 6; y++) {
				setBlockAndMetadata(world, j1, k1 + y, l1 + 6, Block.blockNetherQuartz.blockID, 2);
				setBlockAndMetadata(world, j1, k1 + y, l1 - 6, Block.blockNetherQuartz.blockID, 2);
			}
			int k10 = random.nextInt(100);
			if (k10 <= 50) {
				setBlockAndMetadata(world, j1, k1 + 1, l1 + 7, Block.blockNetherQuartz.blockID, 2);
				setBlockAndMetadata(world, j1 - 2, k1 + 1, l1 + 8, Block.blockNetherQuartz.blockID, 2);
				setBlockAndMetadata(world, j1 - 1, k1 + 1, l1 + 5, Block.blockNetherQuartz.blockID, 2);
				setBlock(world, j1, k1 + 2, l1 + 6, 0);
				setBlock(world, j1, k1 + 3, l1 + 6, 0);
				setBlock(world, j1, k1 + 4, l1 + 6, 0);
			}
			int k11 = random.nextInt(100);
			if (k11 <= 30) {
				setBlock(world, j1 + 1, k1 + 5, l1 + 3, Block.vine.blockID);
				setBlock(world, j1 - 1, k1 + 5, l1 + 3, Block.vine.blockID);
				setBlock(world, j1 - 1, k1 + 6, l1 + 2, Block.vine.blockID);
				setBlock(world, j1 - 1, k1 + 5, l1 + 2, Block.vine.blockID);
				setBlock(world, j1 - 2, k1 + 7, l1 - 1, Block.vine.blockID);
				setBlock(world, j1 - 2, k1 + 7, l1 + 1, Block.vine.blockID);
				setBlock(world, j1 - 2, k1 + 6, l1 + 1, Block.vine.blockID);
				setBlock(world, j1 - 3, k1 + 8, l1, Block.vine.blockID);
				setBlock(world, j1 + 1, k1 + 5, l1 - 3, Block.vine.blockID);
			}
			j1++;
			setBlock(world, j1, k1, l1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 2, pickBlock(random));
			setBlock(world, j1, k1, l1 + 3, pickBlock(random));
			setBlock(world, j1, k1, l1 + 4, pickBlock(random));
			setBlock(world, j1, k1, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1, l1 + 6, pickBlock(random));
			setBlock(world, j1, k1, l1 + 7, pickBlock(random));
			setBlock(world, j1, k1, l1 + 8, pickBlock(random));
			setBlock(world, j1, k1, l1 - 1, pickBlock(random));
			setBlock(world, j1, k1, l1 - 2, pickBlock(random));
			setBlock(world, j1, k1, l1 - 3, pickBlock(random));
			setBlock(world, j1, k1, l1 - 4, pickBlock(random));
			setBlock(world, j1, k1, l1 - 5, pickBlock(random));
			setBlock(world, j1, k1, l1 - 6, pickBlock(random));
			setBlock(world, j1, k1, l1 - 7, pickBlock(random));
			setBlock(world, j1, k1, l1 - 8, pickBlock(random));
			setBlock(world, j1, k1 + 6, l1, 0);
			setBlock(world, j1, k1 + 6, l1 + 1, 0);
			setBlock(world, j1, k1 + 6, l1 - 1, 0);
			setBlock(world, j1, k1 + 6, l1 + 2, 0);
			setBlock(world, j1, k1 + 6, l1 - 2, 0);
			setBlock(world, j1, k1 + 7, l1, 0);
			setBlock(world, j1, k1 + 7, l1 + 1, 0);
			setBlock(world, j1, k1 + 7, l1 - 1, 0);
			setBlock(world, j1, k1 + 8, l1, 0);
			for (int y = 1; y < 6; y++) {
				for (int z = -8; z < 9; z++) {
					setBlock(world, j1, k1 + y, l1 + 1, 0);
				}
			}
			setBlock(world, j1, k1 + 1, l1 + 9, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 + 9, pickBlock(random));
			setBlock(world, j1, k1 + 4, l1 + 9, pickBlock(random));
			setBlock(world, j1, k1 + 1, l1 - 9, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 - 9, pickBlock(random));
			setBlock(world, j1, k1 + 3, l1 - 9, pickBlock(random));
			for (int z = -3; z < 4; z++) {
				setBlock(world, j1, k1 + 1, l1 + z, Block.stoneSingleSlab.blockID);
			}
			j1++;
			setBlock(world, j1, k1, l1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 2, pickBlock(random));
			setBlock(world, j1, k1, l1 + 3, pickBlock(random));
			setBlock(world, j1, k1, l1 + 4, pickBlock(random));
			setBlock(world, j1, k1, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1, l1 + 6, pickBlock(random));
			setBlock(world, j1, k1, l1 + 7, pickBlock(random));
			setBlock(world, j1, k1, l1 + 8, pickBlock(random));
			setBlock(world, j1, k1, l1 - 1, pickBlock(random));
			setBlock(world, j1, k1, l1 - 2, pickBlock(random));
			setBlock(world, j1, k1, l1 - 3, pickBlock(random));
			setBlock(world, j1, k1, l1 - 4, pickBlock(random));
			setBlock(world, j1, k1, l1 - 5, pickBlock(random));
			setBlock(world, j1, k1, l1 - 6, pickBlock(random));
			setBlock(world, j1, k1, l1 - 7, pickBlock(random));
			setBlock(world, j1, k1, l1 - 8, pickBlock(random));
			setBlock(world, j1, k1 + 6, l1, 0);
			setBlock(world, j1, k1 + 6, l1 + 1, 0);
			setBlock(world, j1, k1 + 6, l1 - 1, 0);
			setBlock(world, j1, k1 + 6, l1 + 2, 0);
			setBlock(world, j1, k1 + 6, l1 - 2, 0);
			setBlock(world, j1, k1 + 7, l1, 0);
			setBlock(world, j1, k1 + 7, l1 + 1, 0);
			setBlock(world, j1, k1 + 7, l1 - 1, 0);
			setBlock(world, j1, k1 + 8, l1, 0);
			for (int y = 1; y < 6; y++) {
				for (int z = -8; z < 9; z++) {
					setBlock(world, j1, k1 + y, l1 + 1, 0);
				}
			}
			setBlock(world, j1, k1 + 1, l1 + 9, pickBlock(random));
			setBlock(world, j1, k1 + 3, l1 + 9, pickBlock(random));
			setBlock(world, j1, k1 + 1, l1 - 9, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 - 9, pickBlock(random));
			for (int y = 1; y < 6; y++) {
				setBlockAndMetadata(world, j1, k1 + y, l1 + 6, Block.blockNetherQuartz.blockID, 2);
				setBlockAndMetadata(world, j1, k1 + y, l1 - 6, Block.blockNetherQuartz.blockID, 2);
			}
			int j12 = random.nextInt(100);
			if (j12 <= 50) {
				setBlockAndMetadata(world, j1, k1 + 1, l1 - 7, Block.blockNetherQuartz.blockID, 2);
				setBlockAndMetadata(world, j1 - 1, k1 + 1, l1 - 8, Block.blockNetherQuartz.blockID, 2);
				setBlockAndMetadata(world, j1 - 3, k1 + 1, l1 - 5, Block.blockNetherQuartz.blockID, 2);
				setBlock(world, j1, k1 + 3, l1 - 6, 0);
				setBlock(world, j1, k1 + 4, l1 - 6, 0);
				setBlock(world, j1, k1 + 5, l1 - 6, 0);
			}
			j1++;
			setBlock(world, j1, k1, l1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 1, pickBlock(random));
			setBlock(world, j1, k1, l1 + 2, pickBlock(random));
			setBlock(world, j1, k1, l1 + 3, pickBlock(random));
			setBlock(world, j1, k1, l1 + 4, pickBlock(random));
			setBlock(world, j1, k1, l1 + 5, pickBlock(random));
			setBlock(world, j1, k1, l1 + 6, pickBlock(random));
			setBlock(world, j1, k1, l1 + 7, pickBlock(random));
			setBlock(world, j1, k1, l1 + 8, pickBlock(random));
			setBlock(world, j1, k1, l1 - 1, pickBlock(random));
			setBlock(world, j1, k1, l1 - 2, pickBlock(random));
			setBlock(world, j1, k1, l1 - 3, pickBlock(random));
			setBlock(world, j1, k1, l1 - 4, pickBlock(random));
			setBlock(world, j1, k1, l1 - 5, pickBlock(random));
			setBlock(world, j1, k1, l1 - 6, pickBlock(random));
			setBlock(world, j1, k1, l1 - 7, pickBlock(random));
			setBlock(world, j1, k1, l1 - 8, pickBlock(random));
			setBlock(world, j1, k1 + 6, l1, 0);
			setBlock(world, j1, k1 + 6, l1 + 1, 0);
			setBlock(world, j1, k1 + 6, l1 - 1, 0);
			setBlock(world, j1, k1 + 6, l1 + 2, 0);
			setBlock(world, j1, k1 + 6, l1 - 2, 0);
			setBlock(world, j1, k1 + 7, l1, 0);
			setBlock(world, j1, k1 + 7, l1 + 1, 0);
			setBlock(world, j1, k1 + 7, l1 - 1, 0);
			setBlock(world, j1, k1 + 8, l1, 0);
			for (int y = 1; y < 6; y++) {
				for (int z = -8; z < 9; z++) {
					setBlock(world, j1, k1 + y, l1 + 1, 0);
				}
			}
			setBlock(world, j1, k1 + 1, l1 + 9, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 + 9, pickBlock(random));
			setBlock(world, j1, k1 + 1, l1 - 9, pickBlock(random));
			setBlock(world, j1, k1 + 2, l1 - 9, pickBlock(random));
			setBlock(world, j1, k1 + 3, l1 - 9, pickBlock(random));
		}
		j1++;
		setBlock(world, j1, k1 + 1, l1, 0);
		setBlock(world, j1, k1 + 2, l1, 0);
		setBlock(world, j1, k1, l1, pickBlock(random));
		setBlock(world, j1, k1, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1, l1 - 1, pickBlock(random));
		setBlock(world, j1, k1 + 1, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 + 1, l1 + 2, pickBlock(random));
		setBlock(world, j1, k1 + 1, l1 + 3, pickBlock(random));
		setBlock(world, j1, k1 + 2, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 + 2, l1 + 2, pickBlock(random));
		setBlock(world, j1, k1 + 3, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 + 3, l1, pickBlock(random));
		setBlock(world, j1, k1 + 1, l1 - 1, pickBlock(random));
		setBlock(world, j1, k1 + 2, l1 - 1, pickBlock(random));
		j1++;
		for (int y = 1; y < 4; y++) {
			for (int z = -1; z < 2; z++) {
				setBlock(world, j1, k1 + y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1, l1, pickBlock(random));
		setBlock(world, j1, k1, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1, l1 - 1, pickBlock(random));
		j1++;
		for (int y = 1; y < 4; y++) {
			for (int z = -1; z < 2; z++) {
				setBlock(world, j1, k1 + y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1, l1, pickBlock(random));
		setBlock(world, j1, k1, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1, l1 - 1, pickBlock(random));
		j1++;
		setBlock(world, j1, k1, l1, 0);
		setBlock(world, j1, k1 + 1, l1, 0);
		setBlock(world, j1, k1 + 2, l1, 0);
		setBlock(world, j1, k1 + 3, l1, 0);
		j1++;
		setBlock(world, j1, k1 - 1, l1, 0);
		setBlock(world, j1, k1, l1, 0);
		setBlock(world, j1, k1 + 1, l1, 0);
		setBlock(world, j1, k1 + 2, l1, 0);
		j1++;
		setBlock(world, j1, k1 - 2, l1, 0);
		setBlock(world, j1, k1 - 1, l1, 0);
		setBlock(world, j1, k1, l1, 0);
		setBlock(world, j1, k1 + 1, l1, 0);
		j1++;
		setBlock(world, j1, k1 - 3, l1, 0);
		setBlock(world, j1, k1 - 2, l1, 0);
		setBlock(world, j1, k1 - 1, l1, 0);
		setBlock(world, j1, k1, l1, 0);
		j1++;
		setBlock(world, j1, k1 - 4, l1, 0);
		setBlock(world, j1, k1 - 3, l1, 0);
		setBlock(world, j1, k1 - 2, l1, 0);
		setBlock(world, j1, k1 - 1, l1, 0);
		j1++;
		setBlock(world, j1, k1 - 5, l1, 0);
		setBlock(world, j1, k1 - 4, l1, 0);
		setBlock(world, j1, k1 - 3, l1, 0);
		setBlock(world, j1, k1 - 2, l1, 0);
		j1++;
		setBlock(world, j1, k1 - 5, l1, 0);
		setBlock(world, j1, k1 - 4, l1, 0);
		j1++;
		setBlock(world, j1, k1 - 5, l1, 0);
		setBlock(world, j1, k1 - 4, l1, 0);
		j1++;
		setBlock(world, j1, k1 - 5, l1, 0);
		setBlock(world, j1, k1 - 4, l1, 0);
		j1++;
		setBlock(world, j1, k1 - 5, l1, 0);
		setBlock(world, j1, k1 - 4, l1, 0);
		j1++;
		setBlock(world, j1, k1 - 5, l1, 0);
		setBlock(world, j1, k1 - 4, l1, 0);
		j1++;
		setBlock(world, j1, k1 - 5, l1, 0);
		setBlock(world, j1, k1 - 4, l1, 0);
		j1++;
		setBlock(world, j1, k1 - 5, l1, 0);
		setBlock(world, j1, k1 - 4, l1, 0);
		j1++;
		for (int z = 0; z < 21; z++) {
			setBlock(world, j1, k1 - 5, l1, 0);
			setBlock(world, j1, k1 - 4, l1, 0);
		}
		setBlock(world, j1, k1 - 4, l1 + 21, 0);
		setBlock(world, j1, k1 - 5, l1 + 21, 0);
		setBlock(world, j1, k1 - 6, l1 + 21, 0);
		for (int z = 0; z < 8; z++) {
			for (int y = 4; y < 7; y++) {
				setBlock(world, j1, k1 - y - z, l1 + 22 + z, 0);
			}
		}
		int j4 = random.nextInt(100);
		if (j4 <= 20) {
			for (int x = -1; x < 2; x++) {
				setBlock(world, j1 + x, k1 - 12, l1 + 31, 0);
				setBlock(world, j1 + x, k1 - 13, l1 + 31, 0);
				setBlock(world, j1 + x, k1 - 12, l1 + 32, 0);
				setBlock(world, j1 + x, k1 - 13, l1 + 32, 0);
				setBlock(world, j1 + x, k1 - 12, l1 + 33, 0);
				setBlock(world, j1 + x, k1 - 13, l1 + 33, 0);
			}
			setBlock(world, j1, k1 - 10, l1 + 31, Block.blockLapis.blockID);
			setBlock(world, j1, k1 - 10, l1 + 32, pickBlock(random));
			setBlock(world, j1, k1 - 10, l1 + 33, Block.blockLapis.blockID);
			setBlock(world, j1 + 1, k1 - 10, l1 + 31, Block.blockLapis.blockID);
			setBlock(world, j1 + 1, k1 - 10, l1 + 32, Block.blockLapis.blockID);
			setBlock(world, j1 + 1, k1 - 10, l1 + 33, Block.blockLapis.blockID);
			setBlock(world, j1 - 1, k1 - 10, l1 + 31, Block.blockLapis.blockID);
			setBlock(world, j1 - 1, k1 - 10, l1 + 32, Block.blockLapis.blockID);
			setBlock(world, j1 - 1, k1 - 10, l1 + 33, Block.blockLapis.blockID);
			setBlock(world, j1, k1 - 11, l1 + 32, Block.chest.blockID);
			ChestFiller.fillWithRares(world.getBlockTileEntity(j1, k1 - 11, l1 + 32));
		}
		j1++;
		setBlock(world, j1, k1 - 4, l1, 0);
		setBlock(world, j1, k1 - 5, l1, 0);
		setBlock(world, j1, k1 - 6, l1, 0);
		j1++;
		setBlock(world, j1, k1 - 4, l1, 0);
		setBlock(world, j1, k1 - 5, l1, 0);
		setBlock(world, j1, k1 - 6, l1, 0);
		setBlock(world, j1, k1 - 7, l1, 0);
		j1++;
		setBlock(world, j1, k1 - 5, l1, 0);
		setBlock(world, j1, k1 - 6, l1, 0);
		setBlock(world, j1, k1 - 7, l1, 0);
		setBlock(world, j1, k1 - 8, l1, 0);
		j1++;
		setBlock(world, j1, k1 - 6, l1, 0);
		setBlock(world, j1, k1 - 7, l1, 0);
		setBlock(world, j1, k1 - 8, l1, 0);
		setBlock(world, j1, k1 - 9, l1, 0);
		j1++;
		setBlock(world, j1, k1 - 7, l1, 0);
		setBlock(world, j1, k1 - 8, l1, 0);
		setBlock(world, j1, k1 - 9, l1, 0);
		setBlock(world, j1, k1 - 10, l1, 0);
		j1++;
		setBlock(world, j1, k1 - 9, l1, 0);
		setBlock(world, j1, k1 - 10, l1, 0);
		j1++;
		setBlock(world, j1, k1 - 9, l1, 0);
		setBlock(world, j1, k1 - 10, l1, 0);
		j1++;
		setBlock(world, j1, k1 - 9, l1, 0);
		setBlock(world, j1, k1 - 10, l1, 0);
		j1++;
		setBlock(world, j1, k1 - 9, l1, 0);
		setBlock(world, j1, k1 - 10, l1, 0);
		setBlock(world, j1, k1 - 8, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 - 1, pickBlock(random));
		setBlock(world, j1, k1 - 10, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 - 10, l1 - 1, pickBlock(random));
		setBlock(world, j1, k1 - 10, l1 - 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1 - 11, l1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 - 1, pickBlock(random));
		for (int y = 0; y < 3; y++) {
			for (int z = -1; z < 2; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 - 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1 - 11, l1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 - 1, pickBlock(random));
		for (int y = 0; y < 3; y++) {
			for (int z = -1; z < 2; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 2, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 + 2, pickBlock(random));
		setBlock(world, j1, k1 - 10, l1 - 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1 - 11, l1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 - 1, pickBlock(random));
		for (int y = 0; y < 3; y++) {
			for (int z = -1; z < 2; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 2, pickBlock(random));
		setBlock(world, j1, k1 - 10, l1 - 2, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 - 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1 - 11, l1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 - 1, pickBlock(random));
		for (int y = 0; y < 3; y++) {
			for (int z = -1; z < 2; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1 - 11, l1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 - 1, pickBlock(random));
		for (int y = 0; y < 3; y++) {
			for (int z = -1; z < 2; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 2, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 + 2, pickBlock(random));
		setBlock(world, j1, k1 - 10, l1 - 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1 - 11, l1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 - 1, pickBlock(random));
		for (int y = 0; y < 3; y++) {
			for (int z = -1; z < 2; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 2, pickBlock(random));
		setBlock(world, j1, k1 - 10, l1 - 2, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 - 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1 - 11, l1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 - 1, pickBlock(random));
		for (int y = 0; y < 3; y++) {
			for (int z = -1; z < 2; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 2, Block.stone.blockID);
		setBlock(world, j1, k1 - 10, l1 - 2, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 - 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1 - 11, l1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 - 1, pickBlock(random));
		for (int y = 0; y < 3; y++) {
			for (int z = -1; z < 2; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 2, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 + 2, pickBlock(random));
		setBlock(world, j1, k1 - 10, l1 - 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1 - 11, l1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 - 1, pickBlock(random));
		for (int y = 0; y < 3; y++) {
			for (int z = -1; z < 2; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 2, pickBlock(random));
		setBlock(world, j1, k1 - 8, l1 + 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1 - 11, l1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 - 1, pickBlock(random));
		for (int y = 0; y < 3; y++) {
			for (int z = -1; z < 2; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 2, pickBlock(random));
		setBlock(world, j1, k1 - 10, l1 - 2, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 - 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1 - 11, l1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 - 1, pickBlock(random));
		for (int y = 0; y < 3; y++) {
			for (int z = -1; z < 2; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1 - 11, l1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 - 1, pickBlock(random));
		for (int y = 0; y < 3; y++) {
			for (int z = -1; z < 2; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1 - 11, l1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 - 1, pickBlock(random));
		for (int y = 0; y < 3; y++) {
			for (int z = -1; z < 2; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 2, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 + 2, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 - 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1 - 11, l1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 - 1, pickBlock(random));
		for (int y = 0; y < 3; y++) {
			for (int z = -1; z < 2; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 - 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1 - 11, l1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 - 1, pickBlock(random));
		for (int y = 0; y < 3; y++) {
			for (int z = -1; z < 2; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 2, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 + 2, pickBlock(random));
		j1++;
		setBlock(world, j1, k1 - 10, l1, 0);
		setBlock(world, j1, k1 - 9, l1, 0);
		setBlock(world, j1, k1 - 11, l1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 - 11, l1 - 1, pickBlock(random));
		setBlock(world, j1, k1 - 10, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 - 10, l1 - 1, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 - 1, pickBlock(random));
		setBlock(world, j1, k1 - 8, l1 + 1, pickBlock(random));
		setBlock(world, j1, k1 - 8, l1 - 1, pickBlock(random));
		setBlock(world, j1, k1 - 8, l1, pickBlock(random));
		int k6 = random.nextInt(100);
		if (k6 <= 30) {
			setBlock(world, j1 - 1, k1 - 8, l1 + 3, Block.vine.blockID);
			setBlock(world, j1 - 2, k1 - 8, l1, Block.vine.blockID);
			setBlock(world, j1 - 2, k1 - 9, l1, Block.vine.blockID);
			setBlock(world, j1 - 4, k1 - 8, l1 + 2, Block.vine.blockID);
			setBlock(world, j1 - 6, k1 - 8, l1 - 1, Block.vine.blockID);
		}
		j1++;
		for (int z = -4; z < 5; z++) {
			setBlock(world, j1, k1 - 11, l1 + z, pickBlock(random));
		}
		for (int y = 0; y < 4; y++) {
			for (int z = -4; z < 5; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 10, l1 - 5, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 - 5, pickBlock(random));
		setBlock(world, j1, k1 - 8, l1 - 5, pickBlock(random));
		j1++;
		for (int z = -4; z < 5; z++) {
			setBlock(world, j1, k1 - 11, l1 + z, pickBlock(random));
		}
		for (int y = 0; y < 4; y++) {
			for (int z = -4; z < 5; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 - 5, pickBlock(random));
		j1++;
		for (int z = -4; z < 5; z++) {
			setBlock(world, j1, k1 - 11, l1 + z, pickBlock(random));
		}
		for (int y = 0; y < 4; y++) {
			for (int z = -4; z < 5; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 8, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 - 5, pickBlock(random));
		setBlock(world, j1, k1 - 8, l1 - 5, pickBlock(random));
		j1++;
		for (int z = -4; z < 5; z++) {
			setBlock(world, j1, k1 - 11, l1 + z, pickBlock(random));
		}
		for (int y = 0; y < 4; y++) {
			for (int z = -4; z < 5; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 10, l1 - 5, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 - 5, pickBlock(random));
		setBlock(world, j1, k1 - 8, l1 - 5, pickBlock(random));
		j1++;
		for (int z = -4; z < 5; z++) {
			setBlock(world, j1, k1 - 11, l1 + z, pickBlock(random));
		}
		for (int y = 0; y < 4; y++) {
			for (int z = -4; z < 5; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 8, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 - 5, pickBlock(random));
		setBlock(world, j1, k1 - 8, l1 - 5, pickBlock(random));
		j1++;
		for (int z = -4; z < 5; z++) {
			setBlock(world, j1, k1 - 11, l1 + z, pickBlock(random));
		}
		for (int y = 0; y < 4; y++) {
			for (int z = -4; z < 5; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 8, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 - 5, pickBlock(random));
		j1++;
		for (int z = -4; z < 5; z++) {
			setBlock(world, j1, k1 - 11, l1 + z, pickBlock(random));
		}
		for (int y = 0; y < 4; y++) {
			for (int z = -4; z < 5; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 8, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 - 5, pickBlock(random));
		j1++;
		for (int z = -4; z < 5; z++) {
			setBlock(world, j1, k1 - 11, l1 + z, pickBlock(random));
		}
		for (int y = 0; y < 4; y++) {
			for (int z = -4; z < 5; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 8, l1 + 5, pickBlock(random));
		j1++;
		for (int z = -4; z < 5; z++) {
			setBlock(world, j1, k1 - 11, l1 + z, pickBlock(random));
		}
		for (int y = 0; y < 4; y++) {
			for (int z = -4; z < 5; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 10, l1 - 5, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 - 5, pickBlock(random));
		setBlock(world, j1, k1 - 8, l1 - 5, pickBlock(random));
		j1++;
		for (int z = -4; z < 5; z++) {
			setBlock(world, j1, k1 - 11, l1 + z, pickBlock(random));
		}
		for (int y = 0; y < 4; y++) {
			for (int z = -4; z < 5; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 - 5, pickBlock(random));
		setBlock(world, j1, k1 - 8, l1 - 5, pickBlock(random));
		j1++;
		for (int z = -4; z < 5; z++) {
			setBlock(world, j1, k1 - 11, l1 + z, pickBlock(random));
		}
		for (int y = 0; y < 4; y++) {
			for (int z = -4; z < 5; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 8, l1 + 5, pickBlock(random));
		j1++;
		for (int z = -4; z < 5; z++) {
			setBlock(world, j1, k1 - 11, l1 + z, pickBlock(random));
		}
		for (int y = 0; y < 4; y++) {
			for (int z = -4; z < 5; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 5, pickBlock(random));
		j1++;
		for (int z = -4; z < 5; z++) {
			setBlock(world, j1, k1 - 11, l1 + z, pickBlock(random));
		}
		for (int y = 0; y < 4; y++) {
			for (int z = -4; z < 5; z++) {
				setBlock(world, j1, k1 - 10 - y, l1 + z, 0);
			}
		}
		setBlock(world, j1, k1 - 10, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 9, l1 + 5, pickBlock(random));
		setBlock(world, j1, k1 - 8, l1 + 5, pickBlock(random));
		int i8 = random.nextInt(2) + 1;
		if (i8 == 1) {
			for (int y = 0; y < 4; y++) {
				setBlock(world, j1 - 2, k1 - 10 - y, l1, pickBlock(random));
				setBlock(world, j1 - 6, k1 - 10 - y, l1, pickBlock(random));
				setBlock(world, j1 - 10, k1 - 10 - y, l1, pickBlock(random));
			}
			int l8 = random.nextInt(100);
			if (l8 <= 50) {
				setBlock(world, j1 - 1, k1 - 10, l1 + 2, Block.stoneDoubleSlab.blockID);
				setBlock(world, j1 - 1, k1 - 9, l1 + 2, Block.stoneDoubleSlab.blockID);
				setBlock(world, j1 - 1, k1 - 8, l1 + 2, Block.stoneDoubleSlab.blockID);
				setBlock(world, j1 - 1, k1 - 10, l1 + 3, Block.stoneDoubleSlab.blockID);
				setBlock(world, j1 - 1, k1 - 9, l1 + 3, Block.stoneDoubleSlab.blockID);
				setBlock(world, j1 - 1, k1 - 8, l1 + 3, Block.stoneDoubleSlab.blockID);
			}
			int l9 = random.nextInt(100);
			if (l9 <= 60) {
				setBlock(world, j1 - 2, k1 - 10, l1 + 2, Block.stoneDoubleSlab.blockID);
				setBlock(world, j1 - 2, k1 - 9, l1 + 2, Block.stoneDoubleSlab.blockID);
				setBlock(world, j1 - 2, k1 - 8, l1 + 2, Block.stoneDoubleSlab.blockID);
				setBlock(world, j1 - 2, k1 - 10, l1 + 3, Block.stoneDoubleSlab.blockID);
				setBlock(world, j1 - 2, k1 - 9, l1 + 3, Block.stoneDoubleSlab.blockID);
			}
			int l10 = random.nextInt(100);
			if (l10 <= 70) {
				setBlock(world, j1 - 3, k1 - 10, l1 + 2, Block.stoneDoubleSlab.blockID);
				setBlock(world, j1 - 3, k1 - 9, l1 + 2, Block.stoneDoubleSlab.blockID);
				setBlock(world, j1 - 3, k1 - 10, l1 + 3, Block.stoneDoubleSlab.blockID);
				setBlock(world, j1 - 3, k1 - 9, l1 + 3, Block.stoneDoubleSlab.blockID);
			}
			int l11 = random.nextInt(100);
			if (l11 <= 40) {
				setBlock(world, j1 - 1, k1 - 10, l1 - 2, Block.brick.blockID);
				setBlock(world, j1 - 1, k1 - 9, l1 - 2, Block.brick.blockID);
				setBlock(world, j1 - 1, k1 - 8, l1 - 2, Block.brick.blockID);
				setBlock(world, j1 - 1, k1 - 10, l1 - 3, Block.brick.blockID);
				setBlock(world, j1 - 1, k1 - 9, l1 - 3, Block.brick.blockID);
			}
			int k12 = random.nextInt(100);
			if (k12 <= 50) {
				setBlock(world, j1 - 2, k1 - 10, l1 - 2, Block.brick.blockID);
				setBlock(world, j1 - 2, k1 - 9, l1 - 2, Block.brick.blockID);
				setBlock(world, j1 - 2, k1 - 8, l1 - 2, Block.brick.blockID);
				setBlock(world, j1 - 2, k1 - 10, l1 - 3, Block.brick.blockID);
				setBlock(world, j1 - 2, k1 - 9, l1 - 3, Block.brick.blockID);
				setBlock(world, j1 - 2, k1 - 8, l1 - 3, Block.brick.blockID);
			}
			int l12 = random.nextInt(100);
			if (l12 <= 40) {
				setBlock(world, j1 - 4, k1 - 10, l1 - 2, Block.netherBrick.blockID);
				setBlock(world, j1 - 4, k1 - 9, l1 - 2, Block.netherBrick.blockID);
				setBlock(world, j1 - 4, k1 - 10, l1 - 3, Block.netherBrick.blockID);
				setBlock(world, j1 - 4, k1 - 9, l1 - 3, Block.netherBrick.blockID);
			}
			int i13 = random.nextInt(100);
			if (i13 <= 40) {
				setBlock(world, j1 - 5, k1 - 10, l1 - 2, Block.netherBrick.blockID);
				setBlock(world, j1 - 5, k1 - 9, l1 - 2, Block.netherBrick.blockID);
				setBlock(world, j1 - 5, k1 - 10, l1 - 3, Block.netherBrick.blockID);
				setBlock(world, j1 - 5, k1 - 9, l1 - 3, Block.netherBrick.blockID);
				setBlock(world, j1 - 6, k1 - 10, l1 - 2, Block.netherBrick.blockID);
				setBlock(world, j1 - 6, k1 - 9, l1 - 2, Block.netherBrick.blockID);
				setBlock(world, j1 - 6, k1 - 10, l1 - 3, Block.netherBrick.blockID);
			}
			int j13 = random.nextInt(100);
			if (j13 <= 15) {
				setBlock(world, j1 - 9, k1 - 10, l1 + 2, Block.chest.blockID);
				ChestFiller.fillWithValuables(world.getBlockTileEntity(j1 - 9, k1 - 10, l1 + 2));
			}
			if (j13 >= 85) {
				setBlock(world, j1 - 9, k1 - 10, l1 - 2, Block.chest.blockID);
				ChestFiller.fillWithRares(world.getBlockTileEntity(j1 - 9, k1 - 10, l1 - 2));
			}
		}
		if (i8 != 2) {
			return true;
		}
		for (int y = 0; y < 4; y++) {
			setBlockAndMetadata(world, j1 - 1, k1 - 10 - y, l1, Block.blockNetherQuartz.blockID, 2);
			setBlockAndMetadata(world, j1 - 1, k1 - 10 - y, l1 + 3, Block.blockNetherQuartz.blockID, 2);
			setBlockAndMetadata(world, j1 - 1, k1 - 10 - y, l1 - 3, Block.blockNetherQuartz.blockID, 2);
			setBlockAndMetadata(world, j1 - 3, k1 - 10 - y, l1, Block.blockNetherQuartz.blockID, 2);
			setBlockAndMetadata(world, j1 - 3, k1 - 10 - y, l1 + 3, Block.blockNetherQuartz.blockID, 2);
			setBlockAndMetadata(world, j1 - 3, k1 - 10 - y, l1 - 3, Block.blockNetherQuartz.blockID, 2);
		}
		setBlock(world, j1 - 4, k1 - 10, l1, Block.mobSpawner.blockID);
		TileEntityMobSpawner spawner = (TileEntityMobSpawner) world.getBlockTileEntity(j1 - 4, k1 - 10, l1);
		if (spawner != null) {
			spawner.getSpawnerLogic().setMobID(Config.getRandomDungeonMob(random));
		}
		setBlock(world, j1 - 8, k1 - 10, l1, Block.stoneSingleSlab.blockID);
		setBlock(world, j1 - 8, k1 - 10, l1 + 1, Block.stoneSingleSlab.blockID);
		setBlock(world, j1 - 8, k1 - 10, l1 - 1, Block.stoneSingleSlab.blockID);
		setBlock(world, j1 - 5, k1 - 10, l1, pickBlock(random));
		setBlock(world, j1 - 5, k1 - 10, l1 + 1, pickBlock(random));
		setBlock(world, j1 - 5, k1 - 10, l1 - 1, pickBlock(random));
		setBlock(world, j1 - 6, k1 - 10, l1, pickBlock(random));
		setBlock(world, j1 - 6, k1 - 10, l1 + 1, pickBlock(random));
		setBlock(world, j1 - 6, k1 - 10, l1 - 1, pickBlock(random));
		setBlock(world, j1 - 6, k1 - 10, l1 + 2, pickBlock(random));
		setBlock(world, j1 - 6, k1 - 10, l1 - 2, pickBlock(random));
		setBlock(world, j1 - 7, k1 - 10, l1, pickBlock(random));
		setBlock(world, j1 - 7, k1 - 10, l1 + 1, pickBlock(random));
		setBlock(world, j1 - 7, k1 - 10, l1 - 1, pickBlock(random));
		int i9 = random.nextInt(100);
		if (i9 <= 30) {
			setBlock(world, j1 - 6, k1 - 9, l1, Block.chest.blockID);
			ChestFiller.fillWithValuables(world.getBlockTileEntity(j1 - 6, k1 - 9, l1));
		}
		if (i9 <= 10) {
			setBlock(world, j1 - 6, k1 - 9, l1, Block.chest.blockID);
			ChestFiller.fillWithRares(world.getBlockTileEntity(j1 - 6, k1 - 9, l1));
		}
		for (int y = 0; y < 4; y++) {
			setBlockAndMetadata(world, j1 - 9, k1 - 10 - y, l1, Block.blockNetherQuartz.blockID, 2);
			setBlockAndMetadata(world, j1 - 9, k1 - 10 - y, l1 + 3, Block.blockNetherQuartz.blockID, 2);
			setBlockAndMetadata(world, j1 - 9, k1 - 10 - y, l1 - 3, Block.blockNetherQuartz.blockID, 2);
			setBlockAndMetadata(world, j1 - 11, k1 - 10 - y, l1, Block.blockNetherQuartz.blockID, 2);
			setBlockAndMetadata(world, j1 - 11, k1 - 10 - y, l1 + 3, Block.blockNetherQuartz.blockID, 2);
			setBlockAndMetadata(world, j1 - 11, k1 - 10 - y, l1 - 3, Block.blockNetherQuartz.blockID, 2);
		}
		int i10 = random.nextInt(100);
		if (i10 <= 20) {
			setBlock(world, j1 - 2, k1 - 10, l1 + 4, Block.chest.blockID);
			ChestFiller.fillWithValuables(world.getBlockTileEntity(j1 - 2, k1 - 10, l1 + 4));
		}
		int i11 = random.nextInt(100);
		if (i11 <= 40) {
			setBlock(world, j1 - 3, k1 - 9, l1 + 3, 0);
			setBlock(world, j1 - 3, k1 - 8, l1 + 3, 0);
			setBlock(world, j1 - 3, k1 - 7, l1 + 3, 0);
			setBlockAndMetadata(world, j1 - 1, k1 - 10, l1 + 4, Block.blockNetherQuartz.blockID, 2);
			setBlockAndMetadata(world, j1 - 2, k1 - 10, l1 + 4, Block.blockNetherQuartz.blockID, 2);
			setBlockAndMetadata(world, j1, k1 - 10, l1 + 2, Block.blockNetherQuartz.blockID, 2);
		}
		int i12 = random.nextInt(100);
		if (i12 <= 40) {
			setBlock(world, j1 - 9, k1 - 9, l1 - 3, 0);
			setBlock(world, j1 - 9, k1 - 8, l1 - 3, 0);
			setBlock(world, j1 - 9, k1 - 7, l1 - 3, 0);
			setBlockAndMetadata(world, j1 - 7, k1 - 10, l1 - 2, Block.blockNetherQuartz.blockID, 2);
			setBlockAndMetadata(world, j1 - 8, k1 - 10, l1 - 4, Block.blockNetherQuartz.blockID, 2);
			setBlockAndMetadata(world, j1 - 8, k1 - 10, l1 - 2, Block.blockNetherQuartz.blockID, 2);
		}
		return true;
	}

	private static int pickBlock(Random random) {
		return random.nextBoolean() ? Block.cobblestone.blockID : Block.cobblestoneMossy.blockID;
	}
}
