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

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
    public static Block CompDia;
    public static Block CompEmerald;
    public static Block CompDEmerald;
    public static Block StarBlock;
    public static Block DEStarBlock;
    public static Block AntiQuantum;
    public static Block TestMachine;

    public static void mainRegistry() {
        ModBlocks.initializeBlock();
        ModBlocks.registerItem();
    }

    public static void initializeBlock() {
    	AntiQuantum = new AntiQuantum();
        CompDia = new CompDia();
        CompEmerald = new CompEmerald();
        CompDEmerald = new CompDEmerald();
        StarBlock = new StarBlock();
        DEStarBlock = new DEStarBlock();
        TestMachine = new TestMachine();
    }

    public static void registerItem() {
    	GameRegistry.registerBlock(AntiQuantum, AntiQuantum.getUnlocalizedName());
        GameRegistry.registerBlock(CompDia, CompDia.getUnlocalizedName());
        GameRegistry.registerBlock(CompEmerald, CompEmerald.getUnlocalizedName());
        GameRegistry.registerBlock(CompDEmerald, CompDEmerald.getUnlocalizedName());
        GameRegistry.registerBlock(StarBlock, StarBlock.getUnlocalizedName());
        GameRegistry.registerBlock(DEStarBlock, DEStarBlock.getUnlocalizedName());
        GameRegistry.registerBlock(TestMachine, TestMachine.getUnlocalizedName());
    }
}

