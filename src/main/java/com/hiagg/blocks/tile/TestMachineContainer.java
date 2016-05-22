package com.hiagg.blocks.tile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class TestMachineContainer extends Container {
		

		public boolean canInteractWith(EntityPlayer player) {
			return true;
		}
		
		
		public void bindPlayerInventory(IInventory inventory, int offset_x, int offset_y)
		{
			int j;
	        int k;
	        
			for (j = 0; j < 3; ++j)
	        {
	            for (k = 0; k < 9; ++k)
	            {
	                this.addSlotToContainer(new Slot(inventory, k + j * 9 + 9, offset_x + k * 18, offset_y + j * 18));
	            }
	        }

	        for (j = 0; j < 9; ++j)
	        {
	            this.addSlotToContainer(new Slot(inventory, j, offset_x + j * 18, 58 + offset_y));
	        }
		}

	}


