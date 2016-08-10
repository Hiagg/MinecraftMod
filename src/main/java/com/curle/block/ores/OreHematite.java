package com.curle.block.ores;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreHematite extends Block {
	public OreHematite() {
		super(Material.rock);
		setBlockName("OreHematite");
		setBlockTextureName(Essentials.MODID + ":OreHematite");
		setCreativeTab(Tab.tabMatGalBlocks);
		setHardness(30.0F);
	}

}
