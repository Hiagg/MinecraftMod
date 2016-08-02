/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 */
package com.hiagg.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.hiagg.item.ModItems;

public class CreativeTabMachines extends CreativeTabs {
    public CreativeTabMachines(String label) {
        super(label);
    }

    public Item getTabIconItem() {
        return ModItems.MeltCompDia;
    }
}

