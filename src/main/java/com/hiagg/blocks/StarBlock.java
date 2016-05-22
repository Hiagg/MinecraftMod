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

public class StarBlock extends Block {
    public StarBlock() {
        super(Material.rock);
        setBlockName("StarBlock");
        setCreativeTab(ModTabs.tabBlocks);
        setBlockTextureName("hiaggium:StarBlock");
        setHardness(7.0f);
        setResistance(80.0f);
        setHarvestLevel("pickaxe", 3);
        setStepSound(soundTypeStone);
    }

    public static void mainRegistry() {
    }
}

