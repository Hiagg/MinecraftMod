/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 *  net.minecraft.item.Item$ToolMaterial
 *  net.minecraft.item.ItemAxe
 */
package com.hiagg.item;

import com.hiagg.creativetabs.ModTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class UnrefHiaggAxe
extends ItemAxe {
    protected UnrefHiaggAxe(Item.ToolMaterial p_i45327_1_) {
        super(p_i45327_1_);
        this.setUnlocalizedName("UnrefHiaggAxe").setCreativeTab(ModTabs.tabGear);
        this.setTextureName("hiaggium:UnrefHiaggAxe");
    }
}

