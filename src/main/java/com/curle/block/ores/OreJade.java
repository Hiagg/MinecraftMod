package com.curle.block.ores;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreJade extends Block {
	public OreJade() {
		super(Material.rock);
		setBlockName("OreJade");
		setBlockTextureName(Essentials.MODID + ":OreJade");
		setCreativeTab(Tab.tabMatGalBlocks);
		setHardness(30.0F);
	}

}
