package com.curle.item.materials;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;

public class CoreBracket extends Item {
	public CoreBracket() {
		setUnlocalizedName("CoreBracket");
		setTextureName(Essentials.MODID + ":CoreBracket");
		setCreativeTab(Tab.tabMatGalItems);
	}
}
