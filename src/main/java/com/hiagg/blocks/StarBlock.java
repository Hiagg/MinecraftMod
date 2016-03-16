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

public class StarBlock
extends Block {
    protected StarBlock(Material p_i45394_1_) {
        super(p_i45394_1_);
        this.setHardness(7.0f);
        this.setResistance(80.0f);
        this.setHarvestLevel("pickaxe", 3);
        this.setStepSound(soundTypeStone);
    }

    public static void mainRegistry() {
    }
}

