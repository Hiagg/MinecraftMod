package com.curle.item.tools;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

public class AxeJade extends ItemAxe {
	public AxeJade(ToolMaterial mat) {
		super(mat);
		setUnlocalizedName("AxeJade");
		setTextureName(Essentials.MODID + ":AxeJade");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
