package com.hiagg.blocks;

import com.hiagg.creativetabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TestMachine extends Block {
	protected TestMachine(Material Metal) {
		super(Metal);
		setBlockName("TestMachine");
		setCreativeTab(ModTabs.tabMachines);
		setBlockTextureName("hiaggium:TestMachine");
		this.setHardness(15.0f);
        this.setResistance(270.0f);
        this.setHarvestLevel("pickaxe", 3);
        this.setStepSound(soundTypeStone);
		
	}

	public static void mainRegistry(){
		
	}
}
