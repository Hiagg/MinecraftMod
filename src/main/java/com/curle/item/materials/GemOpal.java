package com.curle.item.materials;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;

public class GemOpal extends Item {
	public GemOpal() {
		setUnlocalizedName("GemOpal");
		setTextureName(Essentials.MODID + ":GemOpal");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
