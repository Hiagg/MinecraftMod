package com.curle.item.tools;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

public class AxeLapis extends ItemAxe {
	public AxeLapis(ToolMaterial mat) {
		super(mat);
		setUnlocalizedName("AxeLapis");
		setTextureName(Essentials.MODID + ":AxeLapis");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
