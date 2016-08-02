/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.Block$SoundType
 *  net.minecraft.block.material.Material
 */
package com.hiagg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.hiagg.creativetabs.ModTabs;

public class CompDia extends Block {
    public CompDia() {
        super(Material.rock);
        setBlockName("CompDia");
        setCreativeTab(ModTabs.tabBlocks);
        setBlockTextureName("hiaggium:CompressedDiamondBlock");
        setHardness(45.0f);
        setResistance(270.0f);
        setHarvestLevel("pickaxe", 3);
        setStepSound(soundTypeStone);
    }

    public static void mainRegistry() {
    }
}

