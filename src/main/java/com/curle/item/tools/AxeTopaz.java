package com.curle.item.tools;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

public class AxeTopaz extends ItemAxe {
	public AxeTopaz(ToolMaterial mat) {
		super(mat);
		setUnlocalizedName("AxeTopaz");
		setTextureName(Essentials.MODID + ":AxeTopaz");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
