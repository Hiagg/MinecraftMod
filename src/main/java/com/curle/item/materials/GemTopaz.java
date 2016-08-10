package com.curle.item.materials;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;

public class GemTopaz extends Item {
	public GemTopaz() {
		setUnlocalizedName("GemTopaz");
		setTextureName(Essentials.MODID + ":GemTopaz");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
