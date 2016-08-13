package com.hiagg.item.extracts;

import com.hiagg.creativetabs.ModTabs;
import com.hiagg.item.HiaggiumArmor;
import com.hiagg.item.ModItems;

public class HiaggiumChestplate extends HiaggiumArmor {

	public HiaggiumChestplate() {
		super(ModItems.HiaggiumA, 0, 1);
		setUnlocalizedName("HiaggiumChestplate");
		setCreativeTab(ModTabs.tabGear);
		setTextureName("hiaggium:HiaggiumChestplate");
	}

}
