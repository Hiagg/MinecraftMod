package com.curle.block.ores;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreAmethyst extends Block {
	public OreAmethyst() {
		super(Material.rock);
		setBlockName("OreAmethyst");
		setBlockTextureName(Essentials.MODID + ":OreAmethyst");
		setCreativeTab(Tab.tabMatGalBlocks);
		setHardness(30.0F);
	}

}
