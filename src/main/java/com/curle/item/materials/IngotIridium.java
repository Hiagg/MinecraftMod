package com.curle.item.materials;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;

public class IngotIridium extends Item {
	public IngotIridium() {
		setUnlocalizedName("IngotIridium");
		setTextureName(Essentials.MODID + ":IngotIridium");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
