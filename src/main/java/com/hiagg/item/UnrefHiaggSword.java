package com.hiagg.item;

import com.hiagg.creativetabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class UnrefHiaggSword extends ItemSword {
    public UnrefHiaggSword() {
        super(ModItems.UnrefHiaggIngot);
        setUnlocalizedName("UnrefHiaggSword");
        setCreativeTab(ModTabs.tabGear);
        setTextureName("hiaggium:UnrefHiaggSword");
    }
}

