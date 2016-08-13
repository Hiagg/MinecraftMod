package com.curle.item.materials;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.Item;

public class InfuserBracket extends Item {
	public InfuserBracket() {
		setUnlocalizedName("InfuserBracket");
		setTextureName(Essentials.MODID + ":InfuserBracket");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
