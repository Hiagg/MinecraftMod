package com.curle.block.machines;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ObsRhydian extends Block {
	public ObsRhydian() {
		super(Material.rock);
		setBlockName("ObsRhydian");
		setBlockTextureName(Essentials.MODID + ":ObsRhydian");
		setCreativeTab(Tab.tabMatGalBlocks);
		setHardness(30.0F);
	}

}
