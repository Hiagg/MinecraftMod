/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.Item
 *  net.minecraft.item.Item$ToolMaterial
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 */
package com.hiagg.item;

import com.hiagg.creativetabs.ModTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class HiaggiumSword
extends ItemSword {
    public HiaggiumSword() {
        super(ModItems.HiaggiumT);
        this.setUnlocalizedName("HiaggiumSword");
        this.setCreativeTab(ModTabs.tabGear);
        this.setTextureName("hiaggium:HiaggiumSword");
        this.setFull3D();
    }

    public boolean func_77644_a(ItemStack stack, EntityLivingBase enemy, EntityLivingBase player) {
       
        return true;
    }
}

