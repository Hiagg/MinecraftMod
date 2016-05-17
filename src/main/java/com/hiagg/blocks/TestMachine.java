package com.hiagg.blocks;

import com.hiagg.blocks.tile.TileEntityTestMachine;
import com.hiagg.creativetabs.ModTabs;
import com.hiagg.hiaggium.Hiaggium;
import com.hiagg.lib.RefStrings;
import com.hiagg.lib.Util;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class TestMachine extends BlockContainer {
	
	@SideOnly(Side.CLIENT)
	private IIcon top;
	@SideOnly(Side.CLIENT)
	private IIcon front;
	
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
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconregister) {
		blockIcon = iconregister.registerIcon(RefStrings.MODID + ":TestMachineSide");
		front = iconregister.registerIcon(RefStrings.MODID + ":TestMachineFront");
		top = iconregister.registerIcon("minecraft:diamond_block");
	}

	public IIcon getIcon(int side, int meta) {
		if (side == 1) {
			return top;
		} else if (side == 3) {
			return front;
		} else {
			return blockIcon;
		}
	}
    
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i1, float f1, float f2, float f3) {
        Util.postToDebug(EnumChatFormatting.YELLOW + "Received packet $192BlockUsed on block at " + x + y + z);
        player.openGui(Hiaggium.instance, 0, world, x, y, z);
    	return false;
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase placer, ItemStack item) {
        if (item.hasDisplayName()) {
            ((TileEntityTestMachine) world.getTileEntity(x, y, z)).setCustomName(item.getDisplayName());
        }
    }

}
