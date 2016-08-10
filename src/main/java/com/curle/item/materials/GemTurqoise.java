package com.curle.item.materials;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;

public class GemTurqoise extends Item {
	public GemTurqoise() {
		setUnlocalizedName("GemTurqoise");
		setTextureName(Essentials.MODID + ":GemTurqoise");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
