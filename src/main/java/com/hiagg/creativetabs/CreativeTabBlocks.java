/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 */
package com.hiagg.creativetabs;

import com.hiagg.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBlocks
extends CreativeTabs {
    public CreativeTabBlocks(String lable) {
        super(lable);
    }
    
	public Item getTabIconItem() {
        return Item.getItemFromBlock((Block)ModBlocks.CompDia);
    }
}
