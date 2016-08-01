package com.hiagg.blocks;

import com.hiagg.creativetabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AntiQuantum extends Block {
    public AntiQuantum() {
        super(Material.rock);
        setBlockName("AntiQuantum");
        setCreativeTab(ModTabs.tabBlocks);
        setBlockTextureName("hiaggium:AntiQuantum");
        setHardness(45.0f);
        setResistance(270.0f);
        setHarvestLevel("pickaxe", 3);
        setStepSound(soundTypeStone);
    }

    public static void mainRegistry() {
    }
}

