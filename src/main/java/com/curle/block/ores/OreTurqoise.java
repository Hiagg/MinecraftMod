package com.curle.block.ores;

import com.curle.deltaseven.Tab;
import com.curle.utils.Essentials;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreTurqoise extends Block {
	public OreTurqoise() {
		super(Material.rock);
		setBlockName("OreTurqoise");
		setBlockTextureName(Essentials.MODID + ":OreTurqoise");
		setCreativeTab(Tab.tabMatGalBlocks);
		setHardness(30.0F);
	}

}
