package com.curle.item.materials;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;

public class RefinedSpark extends Item {
	public RefinedSpark() {
		setUnlocalizedName("RefinedSpark");
		setTextureName(Essentials.MODID + ":RefinedSpark");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
