package com.hiagg.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.hiagg.blocks.tile.TileEntityTestMachine;
import com.hiagg.creativetabs.ModTabs;

public class TestMachine extends BlockContainer {
	protected TestMachine(Material Metal) {
		super(Metal);
		setBlockName("TestMachine");
		setCreativeTab(ModTabs.tabMachines);
		//setBlockTextureName("hiaggium:TestMachine");
		this.setHardness(15.0f);
        this.setResistance(270.0f);
        this.setHarvestLevel("pickaxe", 3);
        //this.setStepSound(soundTypeStone);
		//Move all operative code to the TileEntityTestMachine class.
		
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityTestMachine();
	}
	
    public void registerIcons(IIconRegister icon) {
        this.blockIcon = icon.registerIcon("hiaggium:TestMachine");
    }
    

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase placer, ItemStack item) {
        if (item.hasDisplayName()) {
            ((TileEntityTestMachine) world.getTileEntity(x, y, z)).setCustomName(item.getDisplayName());
        }
    }

}
