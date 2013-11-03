package mysticworld.blocks;

import java.util.List;
import java.util.Random;

import mysticworld.MysticWorld;
import mysticworld.items.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBush extends BlockFlower {
	Icon[] textures;

	public BlockBush(int id) {
		super(id, Material.leaves);
		setCreativeTab(MysticWorld.MysticWorldTab);
		setHardness(0.3F);
		setResistance(0.1F);
		setStepSound(Block.soundGrassFootstep);
		setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
		int l = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
		return l == -1 ? 16777215 : par1IBlockAccess.getBiomeGenForCoords(par2, par4).getBiomeGrassColor();
	}

	@Override
	public int damageDropped(int j) {
		return j;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getBlockColor() {
		double d0 = 0.5D;
		double d1 = 1.0D;
		return ColorizerGrass.getGrassColor(d0, d1);
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		return AxisAlignedBB.getAABBPool().getAABB(par2 + this.minX, par3 + this.minY, par4 + this.minZ, par2 + this.maxX, par3 + this.maxY, par4 + this.maxZ);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return textures[meta];
	}

	@Override
	public EnumPlantType getPlantType(World world, int x, int y, int z) {
		return EnumPlantType.Plains;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getRenderColor(int par1) {
		return par1 == -1 ? 16777215 : ColorizerFoliage.getFoliageColorBasic();
	}

	@Override
	public int getRenderType() {
		return 0;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int i, CreativeTabs tab, List list) {
		for (int j = 0; j < 12; j++) {
			list.add(new ItemStack(i, 1, j));
		}
	}

	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return ItemHandler.bushFruit.itemID;
	}

	@Override
	public int quantityDroppedWithBonus(int par1, Random par2Random) {
		return 1 + par2Random.nextInt(par1 * 2 + 1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		textures = new Icon[16];
		for (int i = 0; i < 12; i++) {
			textures[i] = iconRegister.registerIcon("mysticworld:" + ItemBush.BUSH_TYPES[i]);
		}
	}

	@Override
	protected boolean canThisPlantGrowOnThisBlockID(int par1) {
		return par1 == Block.grass.blockID || par1 == Block.dirt.blockID;
	}
}
