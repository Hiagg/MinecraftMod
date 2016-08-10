package com.curle.item.tools;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.ItemSpade;

public class ShovelTopaz extends ItemSpade {
	public ShovelTopaz(ToolMaterial mat) {
		super(mat);
		setUnlocalizedName("ShovelTopaz");
		setTextureName(Essentials.MODID + ":ShovelTopaz");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
