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

public class HiaggiumHoe extends ItemHoe {
    public HiaggiumHoe() {
        super(ModItems.HiaggiumT);
        setUnlocalizedName("HiaggiumHoe");
        setCreativeTab(ModTabs.tabGear);
        setTextureName("hiaggium:HiaggiumHoe");
    }
}

