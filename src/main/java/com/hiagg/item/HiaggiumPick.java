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

public class HiaggiumPick
extends ItemPickaxe {
    protected HiaggiumPick(Item.ToolMaterial p_i45347_1_) {
        super(p_i45347_1_);
        this.setCreativeTab(ModTabs.tabGear);
        this.setUnlocalizedName("HiaggiumPick");
        this.setTextureName("hiaggium:HiaggiumPickaxe");
    }
}

