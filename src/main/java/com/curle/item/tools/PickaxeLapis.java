package com.curle.item.tools;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.ItemPickaxe;

public class PickaxeLapis extends ItemPickaxe {
	public PickaxeLapis(ToolMaterial mat) {
		super(mat);
		setUnlocalizedName("PickaxeLapis");
		setTextureName(Essentials.MODID + ":PickaxeLapis");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
