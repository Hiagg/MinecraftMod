package com.curle.block.ores;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreRuby extends Block {
	public OreRuby() {
		super(Material.rock);
		setBlockName("OreRuby");
		setBlockTextureName(Essentials.MODID + ":OreRuby");
		setCreativeTab(Tab.tabMatGalBlocks);
		setHardness(30.0F);
	}

}
