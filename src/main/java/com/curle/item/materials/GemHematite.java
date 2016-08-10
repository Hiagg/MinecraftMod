package com.curle.item.materials;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;

public class GemHematite extends Item {
	public GemHematite() {
		setUnlocalizedName("GemHematite");
		setTextureName(Essentials.MODID + ":GemHematite");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
