package com.curle.item.materials;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;

public class BlendBrass extends Item {
	public BlendBrass() {
		setUnlocalizedName("BlendBrass");
		setTextureName(Essentials.MODID + ":BlendBrass");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
