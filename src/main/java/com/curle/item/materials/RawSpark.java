package com.curle.item.materials;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;

public class RawSpark extends Item {
	public RawSpark() {
		setUnlocalizedName("RawSpark");
		setTextureName(Essentials.MODID + ":RawSpark");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
