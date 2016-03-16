/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.registry.GameRegistry
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.creativetab.CreativeTabs
 */
package com.hiagg.blocks;

import com.hiagg.blocks.CompDEmerald;
import com.hiagg.blocks.CompDia;
import com.hiagg.blocks.CompEmerald;
import com.hiagg.blocks.DEStarBlock;
import com.hiagg.blocks.StarBlock;
import com.hiagg.creativetabs.ModTabs;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks {
    public static Block CompDia;
    public static Block CompEmerald;
    public static Block CompDEmerald;
    public static Block StarBlock;
    public static Block DEStarBlock;
    public static Block TestMachine;

    public static void mainRegistry() {
        ModBlocks.initializeBlock();
        ModBlocks.registerItem();
    }

    public static void initializeBlock() {
        CompDia = new CompDia(Material.rock).setBlockName("CompDia").setCreativeTab(ModTabs.tabBlocks).setBlockTextureName("hiaggium:CompressedDiamondBlock");
        CompEmerald = new CompEmerald(Material.rock).setBlockName("CompEmerald").setCreativeTab(ModTabs.tabBlocks).setBlockTextureName("hiaggium:CompressedEmerald");
        CompDEmerald = new CompDEmerald(Material.rock).setBlockName("CompDEmerald").setCreativeTab(ModTabs.tabBlocks).setBlockTextureName("hiaggium:CompDEmerald");
        StarBlock = new StarBlock(Material.rock).setBlockName("StarBlock").setCreativeTab(ModTabs.tabBlocks).setBlockTextureName("hiaggium:StarBlock");
        DEStarBlock = new DEStarBlock(Material.rock).setBlockName("DEStarBlock").setCreativeTab(ModTabs.tabBlocks).setBlockTextureName("hiaggium:DEStarBlock");
        TestMachine = new TestMachine(Material.iron).setBlockName("TestMachine").setCreativeTab(ModTabs.tabMachines).setBlockTextureName("hiaggium:TestMachine");
    }

    public static void registerItem() {
        GameRegistry.registerBlock(CompDia, CompDia.getUnlocalizedName());
        GameRegistry.registerBlock(CompEmerald, CompEmerald.getUnlocalizedName());
        GameRegistry.registerBlock(CompDEmerald, CompDEmerald.getUnlocalizedName());
        GameRegistry.registerBlock(StarBlock, StarBlock.getUnlocalizedName());
        GameRegistry.registerBlock(DEStarBlock, DEStarBlock.getUnlocalizedName());
        GameRegistry.registerBlock(TestMachine, TestMachine.getUnlocalizedName());
    }
}

