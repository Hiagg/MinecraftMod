/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 *  net.minecraft.item.Item$ToolMaterial
 *  net.minecraft.item.ItemHoe
 */
package com.hiagg.item;

import com.hiagg.creativetabs.ModTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class UnrefHiaggHoe
extends ItemHoe {
    public UnrefHiaggHoe(Item.ToolMaterial p_i45343_1_) {
        super(p_i45343_1_);
        this.setUnlocalizedName("UnrefHiaggHoe").setCreativeTab(ModTabs.tabGear);
        this.setTextureName("hiaggium:UnrefHiaggHoe");
    }
}

