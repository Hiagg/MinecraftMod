/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 */
package com.hiagg.creativetabs;

import com.hiagg.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabComponents extends CreativeTabs {
    public CreativeTabComponents(String label) {
        super(label);
    }

    public Item getTabIconItem() {
        return ModItems.UnrefHiagg;
    }
}

