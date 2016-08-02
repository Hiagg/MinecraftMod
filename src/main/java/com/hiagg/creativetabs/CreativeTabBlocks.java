/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 */
package com.hiagg.creativetabs;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.hiagg.blocks.ModBlocks;

public class CreativeTabBlocks extends CreativeTabs {
    public CreativeTabBlocks(String label) {
        super(label);
    }
    
	public Item getTabIconItem() {
        return Item.getItemFromBlock((Block)ModBlocks.CompDia);
    }
}
