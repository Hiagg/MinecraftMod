package com.curle.item.materials;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;

public class GemSpark extends Item {
	public GemSpark() {
		setUnlocalizedName("GemSpark");
		setTextureName(Essentials.MODID + ":GemSpark");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
