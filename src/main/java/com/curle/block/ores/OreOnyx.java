package com.curle.block.ores;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreOnyx extends Block {
	public OreOnyx() {
		super(Material.rock);
		setBlockName("OreOnyx");
		setBlockTextureName(Essentials.MODID + ":OreOnyx");
		setCreativeTab(Tab.tabMatGalBlocks);
		setHardness(30.0F);
	}

}
