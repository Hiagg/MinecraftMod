package com.curle.item.tools;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.ItemPickaxe;

public class PickaxeSpark extends ItemPickaxe {
	public PickaxeSpark(ToolMaterial mat) {
		super(mat);
		setUnlocalizedName("PickaxeSpark");
		setTextureName(Essentials.MODID + ":PickaxeSpark");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
