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

public class DEStarBlock
extends Block {
    protected DEStarBlock(Material p_i45394_1_) {
        super(p_i45394_1_);
        this.setHardness(50.0f);
        this.setResistance(500.0f);
        this.setHarvestLevel("pickaxe", 4);
        this.setStepSound(soundTypeStone);
    }

    public static void mainRegistry() {
    }
}

