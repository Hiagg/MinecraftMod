package com.curle.item.tools;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

public class AxeSpark extends ItemAxe {
	public AxeSpark(ToolMaterial mat) {
		super(mat);
		setUnlocalizedName("AxeSpark");
		setTextureName(Essentials.MODID + ":AxeSpark");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
