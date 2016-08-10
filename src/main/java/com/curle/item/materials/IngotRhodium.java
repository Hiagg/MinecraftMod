package com.curle.item.materials;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;

public class IngotRhodium extends Item {
	public IngotRhodium() {
		setUnlocalizedName("IngotRhodium");
		setTextureName(Essentials.MODID + ":IngotRhodium");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
