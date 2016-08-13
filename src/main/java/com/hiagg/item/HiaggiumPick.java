/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 *  net.minecraft.item.Item$ToolMaterial
 *  net.minecraft.item.ItemPickaxe
 */
package com.hiagg.item;

import com.hiagg.creativetabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class HiaggiumPick extends ItemPickaxe {
    public HiaggiumPick() {
        super(ModItems.HiaggiumT);
        setCreativeTab(ModTabs.tabGear);
        setUnlocalizedName("HiaggiumPick");
        setTextureName("hiaggium:HiaggiumPickaxe");
    }
}

