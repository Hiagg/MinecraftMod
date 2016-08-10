package com.curle.item.tools;

import net.minecraft.item.ItemSpade;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

public class ShovelLapis extends ItemSpade {
	public ShovelLapis(ToolMaterial mat) {
		super(mat);
		setUnlocalizedName("ShovelLapis");
		setTextureName(Essentials.MODID + ":ShovelLapis");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
