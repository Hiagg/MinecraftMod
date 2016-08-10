package com.curle.item.materials;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;

public class Ash extends Item {
	public Ash(){
		setUnlocalizedName("Ash");
		setTextureName(Essentials.MODID + ":Ash");
		setCreativeTab(Tab.tabMatGalItems);
	}
}
