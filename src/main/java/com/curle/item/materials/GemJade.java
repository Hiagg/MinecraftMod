package com.curle.item.materials;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;

public class GemJade extends Item {
	public GemJade() {
		setUnlocalizedName("GemJade");
		setTextureName(Essentials.MODID + ":GemJade");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
