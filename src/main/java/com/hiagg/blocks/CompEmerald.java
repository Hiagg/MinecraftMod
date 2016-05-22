/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.Block$SoundType
 *  net.minecraft.block.material.Material
 */
package com.hiagg.blocks;

import com.hiagg.creativetabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CompEmerald extends Block {
    public CompEmerald() {
        super(Material.rock);
        setBlockName("CompEmerald");
        setCreativeTab(ModTabs.tabBlocks);
        setBlockTextureName("hiaggium:CompressedEmerald");
        setHardness(45.0f);
        setResistance(270.0f);
        setHarvestLevel("pickaxe", 3);
        setStepSound(soundTypeStone);
    }

    public static void mainRegistry() {
    }
}

