package com.curle.item.materials;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;

public class GemAmethyst extends Item {
	public GemAmethyst() {
		setUnlocalizedName("GemAmethyst");
		setTextureName(Essentials.MODID + ":GemAmethyst");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
