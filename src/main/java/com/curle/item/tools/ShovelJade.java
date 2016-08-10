package com.curle.item.tools;

import net.minecraft.item.ItemSpade;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

public class ShovelJade extends ItemSpade {
	public ShovelJade(ToolMaterial mat) {
		super(mat);
		setUnlocalizedName("ShovelJade");
		setTextureName(Essentials.MODID + ":ShovelJade");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
