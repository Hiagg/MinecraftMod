/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 *  net.minecraft.item.Item$ToolMaterial
 *  net.minecraft.item.ItemSpade
 */
package com.hiagg.item;

import com.hiagg.creativetabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class HiaggiumShovel extends ItemSpade {
    public HiaggiumShovel() {
        super(ModItems.HiaggiumT);
        setUnlocalizedName("HiaggiumShovel");
        setCreativeTab(ModTabs.tabGear);
        setTextureName("hiaggium:HiaggiumShovel");
    }
}

