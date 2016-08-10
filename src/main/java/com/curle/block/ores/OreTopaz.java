package com.curle.block.ores;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreTopaz extends Block {
	public OreTopaz() {
		super(Material.rock);
		setBlockName("OreTopaz");
		setBlockTextureName(Essentials.MODID + ":OreTopaz");
		setCreativeTab(Tab.tabMatGalBlocks);
		setHardness(30.0F);
	}

}
