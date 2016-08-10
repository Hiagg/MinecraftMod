package com.curle.item.tools;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.ItemSpade;

public class ShovelSpark extends ItemSpade {
	public ShovelSpark(ToolMaterial mat) {
		super(mat);
		setUnlocalizedName("ShovelSpark");
		setTextureName(Essentials.MODID + ":ShovelSpark");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
