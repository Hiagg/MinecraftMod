package com.curle.item.materials;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;

public class GemSapphire extends Item {
	public GemSapphire() {
		setUnlocalizedName("GemSapphire");
		setTextureName(Essentials.MODID + ":GemSapphire");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
