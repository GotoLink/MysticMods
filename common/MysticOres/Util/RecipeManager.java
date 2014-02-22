package mysticores.util;

import mysticores.blocks.BlockHandler;
import mysticores.items.Items;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeManager {
	public static void initialize() {
		recipes();
		toolRecipes();
		powderRecipes();
		smelting();
	}

	private static void powderRecipes() {
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.gold_ore, 2), OreDictManager.INGOTS[9], "oreGold"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.iron_ore, 2), OreDictManager.INGOTS[9], "oreIron"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.Resource, 2, 10), OreDictManager.INGOTS[9], OreDictManager.INGOTS[10]));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(net.minecraft.init.Items.gunpowder, 2), OreDictManager.INGOTS[9], net.minecraft.init.Items.gunpowder));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.Resource, 2, 4), OreDictManager.INGOTS[9], OreDictManager.INGOTS[4]));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.coal_ore, 2), OreDictManager.INGOTS[9], Blocks.coal_ore));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.iron_ore, 3), OreDictManager.INGOTS[9], "oreIron"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.gold_ore, 3), OreDictManager.INGOTS[9], "oreGold"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.redstone_ore, 2), OreDictManager.INGOTS[9], "oreRedstone"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.lapis_ore, 2), OreDictManager.INGOTS[9], "oreLapis"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.diamond_ore, 2), OreDictManager.INGOTS[9], "oreDiamond"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(net.minecraft.init.Items.sugar, 18), OreDictManager.INGOTS[9], net.minecraft.init.Items.sugar));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(net.minecraft.init.Items.redstone, 12), OreDictManager.INGOTS[9], net.minecraft.init.Items.redstone));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(net.minecraft.init.Items.glowstone_dust, 6), OreDictManager.INGOTS[9], net.minecraft.init.Items.glowstone_dust));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(net.minecraft.init.Items.gunpowder, 3), OreDictManager.INGOTS[9], net.minecraft.init.Items.gunpowder));
	}

	private static void recipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.glass, 1), "##", "##", '#', OreDictManager.INGOTS[11]));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.obsidian, 1), "##", "##", '#', OreDictManager.INGOTS[12]));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockHandler.BlockBase, 8, 7), "XXX", "XOX", "XXX", Character.valueOf('X'), Blocks.dirt, Character.valueOf('O'),
				OreDictManager.INGOTS[6]));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockHandler.BlockBase, 16, 7), "XXX", "XOX", "XXX", Character.valueOf('X'), OreDictManager.ORES[3], Character.valueOf('O'),
				OreDictManager.INGOTS[6]));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockHandler.BlockBase, 8, 3), "XXX", "XOX", "XXX", Character.valueOf('X'), Blocks.dirt, Character.valueOf('O'),
				OreDictManager.INGOTS[8]));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockHandler.BlockBase, 8, 12), "###", "#D#", "###", '#', OreDictManager.INGOTS[11], 'D', OreDictManager.INGOTS[12]));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockHandler.BlockBase, 1, 7), "##", "##", '#', OreDictManager.INGOTS[10]));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BlockHandler.BlockBase, 2, 7), OreDictManager.INGOTS[9], OreDictManager.ORES[7]));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BlockHandler.BlockBase, 2, 3), OreDictManager.INGOTS[9], OreDictManager.ORES[3]));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BlockHandler.BlockBase, 2, 0), OreDictManager.INGOTS[9], OreDictManager.ORES[0]));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.Resource, 2, 13), "#", "#", '#', OreDictManager.INGOTS[12]));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.Resource, 1, 3), "###", "#O#", "###", '#', OreDictManager.INGOTS[4], 'O', OreDictManager.INGOTS[2]));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.Resource, 4, 11), Blocks.glass);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.Resource, 4, 12), Blocks.obsidian);
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.Resource, 8, 9), OreDictManager.INGOTS[5], OreDictManager.INGOTS[7], OreDictManager.INGOTS[8], OreDictManager.INGOTS[6]));
	}

	private static void smelting() {
		FurnaceRecipes.smelting().func_151394_a(new ItemStack(BlockHandler.BlockBase,1, 6), new ItemStack(Items.Resource, 1, 0), 0.4F);
		FurnaceRecipes.smelting().func_151394_a(new ItemStack(BlockHandler.BlockBase,1, 3), new ItemStack(Items.Resource, 1, 1), 0.7F);
		FurnaceRecipes.smelting().func_151394_a(new ItemStack(BlockHandler.BlockBase,1, 0), new ItemStack(Items.Resource, 1, 2), 0.9F);
		FurnaceRecipes.smelting().func_151394_a(new ItemStack(BlockHandler.BlockBase,1, 2), new ItemStack(Items.Resource, 1, 4), 0.4F);
		FurnaceRecipes.smelting().func_151394_a(new ItemStack(BlockHandler.BlockBase,1, 4), new ItemStack(Items.Resource, 1, 5), 0.4F);
		FurnaceRecipes.smelting().func_151394_a(new ItemStack(BlockHandler.BlockBase,1, 11), new ItemStack(Items.Resource, 1, 6), 0.4F);
		FurnaceRecipes.smelting().func_151394_a(new ItemStack(BlockHandler.BlockBase,1, 5), new ItemStack(Items.Resource, 1, 7), 0.4F);
		FurnaceRecipes.smelting().func_151394_a(new ItemStack(BlockHandler.BlockBase,1, 1), new ItemStack(Items.Resource, 1, 8), 0.4F);
		FurnaceRecipes.smelting().func_151394_a(new ItemStack(BlockHandler.BlockBase,1, 7), new ItemStack(Items.Resource, 1, 10), 0.4F);
	}

	private static void toolRecipes() {
		ToolRecipes.SwordRecipe(Items.VerditeSword, OreDictManager.INGOTS[0]);
		ToolRecipes.PickaxeRecipe(Items.VerditePickaxe, OreDictManager.INGOTS[0]);
		ToolRecipes.ShovelRecipe(Items.VerditeShovel, OreDictManager.INGOTS[0]);
		ToolRecipes.AxeRecipe(Items.VerditeAxe, OreDictManager.INGOTS[0]);
		ToolRecipes.HoeRecipe(Items.VerditeHoe, OreDictManager.INGOTS[0]);
		ToolRecipes.SwordRecipe(Items.MithrilSword, OreDictManager.INGOTS[1]);
		ToolRecipes.PickaxeRecipe(Items.MithrilPickaxe, OreDictManager.INGOTS[1]);
		ToolRecipes.ShovelRecipe(Items.MithrilShovel, OreDictManager.INGOTS[1]);
		ToolRecipes.AxeRecipe(Items.MithrilAxe, OreDictManager.INGOTS[1]);
		ToolRecipes.HoeRecipe(Items.MithrilHoe, OreDictManager.INGOTS[1]);
		ToolRecipes.AdvancedSwordRecipe(Items.AdamantineSword, OreDictManager.INGOTS[2]);
		ToolRecipes.AdvancedPickaxeRecipe(Items.AdamantinePickaxe, OreDictManager.INGOTS[2]);
		ToolRecipes.AdvancedShovelRecipe(Items.AdamantineShovel, OreDictManager.INGOTS[2]);
		ToolRecipes.AdvancedAxeRecipe(Items.AdamantineAxe, OreDictManager.INGOTS[2]);
		ToolRecipes.AdvancedHoeRecipe(Items.AdamantineHoe, OreDictManager.INGOTS[2]);
		ToolRecipes.AdvancedSwordRecipe(Items.IridiumSword, OreDictManager.INGOTS[3]);
		ToolRecipes.AdvancedPickaxeRecipe(Items.IridiumPickaxe, OreDictManager.INGOTS[3]);
		ToolRecipes.AdvancedShovelRecipe(Items.IridiumShovel, OreDictManager.INGOTS[3]);
		ToolRecipes.AdvancedAxeRecipe(Items.IridiumAxe, OreDictManager.INGOTS[3]);
		ToolRecipes.AdvancedHoeRecipe(Items.IridiumHoe, OreDictManager.INGOTS[3]);
		ToolRecipes.AdvancedSwordRecipe(Items.IridiumSword, OreDictManager.INGOTS[3]);
		ToolRecipes.AdvancedPickaxeRecipe(Items.IridiumPickaxe, OreDictManager.INGOTS[3]);
		ToolRecipes.AdvancedShovelRecipe(Items.IridiumShovel, OreDictManager.INGOTS[3]);
		ToolRecipes.AdvancedAxeRecipe(Items.IridiumAxe, OreDictManager.INGOTS[3]);
		ToolRecipes.AdvancedHoeRecipe(Items.IridiumHoe, OreDictManager.INGOTS[3]);
		ToolRecipes.AdvancedSwordRecipe(Items.ObsidianSword, new ItemStack(Blocks.obsidian));
		ToolRecipes.AdvancedPickaxeRecipe(Items.ObsidianPickaxe, new ItemStack(Blocks.obsidian));
		ToolRecipes.AdvancedShovelRecipe(Items.ObsidianShovel, new ItemStack(Blocks.obsidian));
		ToolRecipes.AdvancedAxeRecipe(Items.ObsidianAxe, new ItemStack(Blocks.obsidian));
		ToolRecipes.AdvancedHoeRecipe(Items.ObsidianHoe, new ItemStack(Blocks.obsidian));
		ToolRecipes.AdvancedSwordRecipe(Items.BloodstoneSword, OreDictManager.ORES[7]);
		ToolRecipes.AdvancedPickaxeRecipe(Items.BloodstonePickaxe, OreDictManager.ORES[7]);
		ToolRecipes.AdvancedShovelRecipe(Items.BloodstoneShovel, OreDictManager.ORES[7]);
		ToolRecipes.AdvancedAxeRecipe(Items.BloodstoneAxe, OreDictManager.ORES[7]);
		ToolRecipes.AdvancedHoeRecipe(Items.BloodstoneHoe, OreDictManager.ORES[7]);
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.Satchel, 1), "#$#", "$%$", "#$#", '#', net.minecraft.init.Items.string, '$', OreDictManager.INGOTS[9], '%', Blocks.ender_chest));
	}
}
