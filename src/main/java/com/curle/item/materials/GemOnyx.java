package com.curle.item.materials;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;

public class GemOnyx extends Item {
	public GemOnyx() {
		setUnlocalizedName("GemOnyx");
		setTextureName(Essentials.MODID + ":GemOnyx");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
