package com.curle.item.materials;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;

public class GemRuby extends Item {
	public GemRuby() {
		setUnlocalizedName("GemRuby");
		setTextureName(Essentials.MODID + ":GemRuby");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
