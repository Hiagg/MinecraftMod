package com.curle.item.materials;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;

public class IngotBrass extends Item {
	public IngotBrass(){
		setUnlocalizedName("IngotBrass");
		setTextureName(Essentials.MODID + ":IngotBrass");
		setCreativeTab(Tab.tabMatGalItems);
	}
}
