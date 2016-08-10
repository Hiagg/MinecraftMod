package com.hiagg.item.extracts;

import com.hiagg.creativetabs.ModTabs;
import com.hiagg.item.ModItems;
import com.hiagg.item.UnrefHiaggArmor;

public class UnrefHiaggChestplate extends UnrefHiaggArmor {

	public UnrefHiaggChestplate() {
		super(ModItems.UnrefHiaggArmor, 0, 1);
		setUnlocalizedName("UnrefHiaggChestplate");
		setCreativeTab(ModTabs.tabGear);
		setTextureName("hiaggium:UnrefHiaggChestplate");
	}

}
