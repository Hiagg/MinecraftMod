package com.hiagg.item.extracts;

import net.minecraft.item.ItemFood;

import com.hiagg.creativetabs.ModTabs;

public class OpApple extends ItemFood {
	
	public OpApple() {
		super(20, 20, false);
		setUnlocalizedName("OpApple");
		setCreativeTab(ModTabs.tabItems);
		setTextureName("hiaggium:OpApple");
	}

}
