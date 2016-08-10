package com.curle.block.ores;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreOpal extends Block {
	public OreOpal() {
		super(Material.rock);
		setBlockName("OreOpal");
		setBlockTextureName(Essentials.MODID + ":OreOpal");
		setCreativeTab(Tab.tabMatGalBlocks);
		setHardness(30.0F);
	}

}
