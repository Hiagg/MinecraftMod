package com.curle.item.materials;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;

public class EOR extends Item {
	public EOR() {
		setUnlocalizedName("EOR");
		setTextureName(Essentials.MODID + ":EOR");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
