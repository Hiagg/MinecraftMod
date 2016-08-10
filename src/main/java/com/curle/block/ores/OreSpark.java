package com.curle.block.ores;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreSpark extends Block {
	public OreSpark() {
		super(Material.rock);
		setBlockName("OreSpark");
		setBlockTextureName(Essentials.MODID + ":OreSpark");
		setCreativeTab(Tab.tabMatGalBlocks);
		setHardness(30.0F);
	}

}
