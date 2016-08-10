package com.curle.item.tools;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.ItemPickaxe;

public class PickaxeTopaz extends ItemPickaxe {
	public PickaxeTopaz(ToolMaterial mat) {
		super(mat);
		setUnlocalizedName("PickaxeTopaz");
		setTextureName(Essentials.MODID + ":PickaxeTopaz");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
