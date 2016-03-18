package com.hiagg.hiaggium;

import com.hiagg.blocks.ModBlocks;
import com.hiagg.item.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CraftingManager {
    public static void mainRegistry() {
        CraftingManager.addCraftingRec();
        CraftingManager.addSmeltingRec();
    }

    public static void addCraftingRec() { //X in these means NULL (No item, just helps visualize the recipes)
        GameRegistry.addRecipe(new ItemStack(ModBlocks.CompDia, 1),
        		new Object[]{
        			"AAA",
        			"AAA",
        			"AAA", 'A', Blocks.diamond_block});
        GameRegistry.addRecipe(new ItemStack(ModItems.HardRod, 1),
        		new Object[]{
        			"ABA",
        			"ABA",
        			"ABA",
        			'A', Blocks.obsidian,
        			'B', Items.blaze_rod});
        GameRegistry.addRecipe(new ItemStack(ModItems.UnrefHiaggPick, 1),
        		new Object[]{
        			"AAA",
        			"XBX",
        			"XBX",
        			'A', ModItems.UnrefHiagg,
        			'B', ModItems.HardRod});
        GameRegistry.addRecipe(new ItemStack(ModItems.UnrefHiaggAxe, 1),
        		new Object[]{
        			"AAX",
        			"ABX",
        			"XBX",
        			'A', ModItems.UnrefHiagg,
        			'B', ModItems.HardRod});
        GameRegistry.addRecipe(new ItemStack(ModItems.UnrefHiaggShovel, 1),
        		new Object[]{
        			" A ",
        			" B ",
        			" B ",
        			'A', ModItems.UnrefHiagg,
        			'B', ModItems.HardRod});
        GameRegistry.addRecipe(new ItemStack(ModItems.UnrefHiaggSword, 1),
        		new Object[]{
        			" A ",
        			" A ",
        			" B ",
        			'A', ModItems.UnrefHiagg,
        			'B', ModItems.HardRod});
        GameRegistry.addRecipe(new ItemStack(ModItems.UnrefHiaggHoe, 1),
        		new Object[]{
        			"AAX",
        			"XBX",
        			"XBX",
        			'A', ModItems.UnrefHiagg,
        			'B', ModItems.HardRod});
        GameRegistry.addRecipe(new ItemStack(ModItems.HiaggiumPick, 1),
        		new Object[]{
        			"AAA",
        			"XBX",
        			"XBX",
        			'A', ModItems.Hiaggium,
        			'B', ModItems.HardRod});
        GameRegistry.addRecipe(new ItemStack(ModItems.HiaggiumSword, 1),
        		new Object[]{
        			" A ",
        			" A ",
        			" B ",
        			'A', ModItems.Hiaggium,
        			'B', ModItems.HardRod});
        GameRegistry.addRecipe(new ItemStack(ModItems.HiaggiumShovel, 1),
        		new Object[]{
        			" A ",
        			" B ",
        			" B ",
        			'A', ModItems.Hiaggium,
        			'B', ModItems.HardRod});
        GameRegistry.addRecipe(new ItemStack(ModItems.HiaggiumAxe, 1),
        		new Object[]{
        			"AAX",
        			"ABX",
        			"XBX",
        			'A', ModItems.Hiaggium,
        			'B', ModItems.HardRod});
        GameRegistry.addRecipe(new ItemStack(ModItems.HiaggiumHoe, 1),
        		new Object[]{
        			"AAX",
        			"XBX",
        			"XBX",
        			'A', ModItems.Hiaggium,
        			'B', ModItems.HardRod});
        GameRegistry.addRecipe(new ItemStack(ModItems.UnrefHiaggHelmet, 1),
        		new Object[]{
        			"AAA",
        			"AXA",
        			"XXX",
        			'A', ModItems.UnrefHiagg});
        GameRegistry.addRecipe(new ItemStack(ModItems.UnrefHiaggChestplate, 1),
        		new Object[]{
        			"AXA",
        			"AAA",
        			"AAA",
        			'A', ModItems.UnrefHiagg});
        GameRegistry.addRecipe(new ItemStack(ModItems.UnrefHiaggLeggings, 1),
        		new Object[]{
        			"AAA",
        			"AXA",
        			"AXA",
        			'A', ModItems.UnrefHiagg});
        GameRegistry.addRecipe(new ItemStack(ModItems.UnrefHiaggBoots, 1),
        		new Object[]{
        			"AXA",
        			"AXA",
        			'A', ModItems.UnrefHiagg});
        GameRegistry.addRecipe(new ItemStack(ModItems.HiaggiumHelmet, 1),
        		new Object[]{
        			"AAA",
        			"AXA",
        			"XXX",
        			'A', ModItems.Hiaggium});
        GameRegistry.addRecipe(new ItemStack(ModItems.HiaggiumChestplate, 1),
        		new Object[]{
        			"AXA",
        			"AAA",
        			"AAA",
        			'A', ModItems.Hiaggium});
        GameRegistry.addRecipe(new ItemStack(ModItems.HiaggiumLeggings, 1),
        		new Object[]{
        			"AAA",
        			"AXA",
        			"AXA",
        			'A', ModItems.Hiaggium});
        GameRegistry.addRecipe(new ItemStack(ModItems.HiaggiumBoots, 1),
        		new Object[]{
        			"AXA",
        			"AXA",
        			'A', ModItems.Hiaggium});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.CompEmerald, 1),
        		new Object[]{
        			"AAA",
        			"AAA",
        			"AAA",
        			'A', Blocks.emerald_block});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.CompDEmerald, 1),
        		new Object[]{
        			"ABA",
        			"BAB",
        			"ABA", 
        			'A', ModBlocks.CompEmerald,
        			'B', ModBlocks.CompDia});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.StarBlock, 1),
        		new Object[]{
        			"AAA",
        			"AAA",
        			"AAA",
        			'A', Items.nether_star});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.DEStarBlock, 1),
        		new Object[]{
        			"AAA",
        			"ABA",
        			"AAA",
        			'A', ModBlocks.CompDEmerald,
        			'B', ModBlocks.StarBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.OpApple, 64),
        		new Object[]{
        			Items.apple
        					  });
    }

    public static void addSmeltingRec() {
        GameRegistry.addSmelting(ModBlocks.CompDia, new ItemStack(ModItems.MeltCompDia, 1), (float)100.0f);
    }
}