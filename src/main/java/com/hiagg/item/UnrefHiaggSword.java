/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 *  net.minecraft.item.Item$ToolMaterial
 *  net.minecraft.item.ItemSword
 */
package com.hiagg.item;

import com.hiagg.creativetabs.ModTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class UnrefHiaggSword
extends ItemSword {
    public UnrefHiaggSword(Item.ToolMaterial p_i45356_1_) {
        super(p_i45356_1_);
        this.setUnlocalizedName("UnrefHiaggSword").setCreativeTab(ModTabs.tabGear).setTextureName("hiaggium:UnrefHiaggSword");
    }
}

