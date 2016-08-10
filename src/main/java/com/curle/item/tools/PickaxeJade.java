package com.curle.item.tools;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.item.ItemPickaxe;

public class PickaxeJade extends ItemPickaxe {
	public PickaxeJade(ToolMaterial mat) {
		super(mat);
		setUnlocalizedName("PickaxeJade");
		setTextureName(Essentials.MODID + ":PickaxeJade");
		setCreativeTab(Tab.tabMatGalItems);
	}

}
