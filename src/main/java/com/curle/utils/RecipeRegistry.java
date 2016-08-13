package com.curle.utils;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.curle.block.BlocksGalore;
import com.curle.item.ItemsGalore;

import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeRegistry {
	public static void init() {
		registerCrafting();
		registerShapeless();
		registerFurnace();
	}
	
	private static void registerCrafting() {
		GameRegistry.addRecipe(new ItemStack(ItemsGalore.AxeJade, 1), new Object[] {
			"J J X",
			"J S X",
			"X S X",
			'J', ItemsGalore.GemJade, 'S', Items.stick 
		});
		GameRegistry.addRecipe(new ItemStack(ItemsGalore.AxeLapis, 1), new Object[] {
			"L L X",
			"L S X",
			"X S X",
			'L', Items.dye, 'S', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemsGalore.AxeSpark, 1), new Object[] {
			"S S X",
			"S T X",
			"X T X",
			'S', ItemsGalore.GemSpark, 'T', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemsGalore.AxeTopaz, 1), new Object[] {
			"T T X",
			"T S X",
			"X S X",
			'T', ItemsGalore.GemTopaz, 'S', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemsGalore.PickaxeJade, 1), new Object[] {
			"J J J",
			"X S X",
			"X S X",
			'J', ItemsGalore.GemJade, 'S', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemsGalore.PickaxeLapis, 1), new Object[] {
			"L L L",
			"X S X",
			"X S X",
			'L', Items.dye, 'S', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemsGalore.PickaxeSpark, 1), new Object[] {
			"S S S",
			"X T X",
			"X T X",
			'S', ItemsGalore.GemSpark, 'T', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemsGalore.PickaxeTopaz, 1), new Object[] {
			"T T T",
			"X S X",
			"X S X",
			'T', ItemsGalore.GemTopaz, 'S', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemsGalore.ShovelJade, 1), new Object[] {
			"X J X",
			"X S X",
			"X S X",
			'J', ItemsGalore.GemJade, 'S', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemsGalore.ShovelLapis, 1), new Object[] {
			"X L X",
			"X S X",
			"X S X",
			'L', Items.dye, 'S', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemsGalore.ShovelSpark, 1), new Object[] {
			"X P X",
			"X S X",
			"X S X",
			'P', ItemsGalore.GemSpark, 'S', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemsGalore.ShovelTopaz, 1), new Object[] {
			"X T X",
			"X S X",
			"X S X",
			'T', ItemsGalore.GemTopaz, 'S', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemsGalore.SwordJade, 1), new Object[] {
			"X J X",
			"X J X",
			"X S X",
			'J', ItemsGalore.GemJade, 'S', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemsGalore.SwordLapis, 1), new Object[] {
			"X L X",
			"X L X",
			"X S X",
			'L', Items.dye, 'S', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemsGalore.SwordSpark, 1), new Object[] {
			"X P X",
			"X P X",
			"X S X",
			'P', ItemsGalore.GemSpark, 'S', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ItemsGalore.SwordTopaz, 1), new Object[] {
			"X T X",
			"X T X",
			"X S X",
			'T', ItemsGalore.GemTopaz, 'S', Items.stick
		});

		GameRegistry.addRecipe(new ItemStack(ItemsGalore.InfuserCore, 1), new Object[] {
			"B F B",
			"F N F",
			"B F B",
			'N', Items.nether_star, 'B', ItemsGalore.CoreBracket, 'F', ItemsGalore.FluxPhaser
		});
		
		GameRegistry.addRecipe(new ItemStack(Item.getItemFromBlock(BlocksGalore.MaterialInfuser)), new Object[] {
			"D D D",
			"B C B",
			"I B I",
			'D', Items.diamond, 'B', ItemsGalore.InfuserBracket, 'C', ItemsGalore.InfuserCore, 'I', Items.iron_ingot
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemsGalore.FluxPhaser), new Object[] {
			"O S O",
			"S W S",
			"O S O",
			'O', ItemsGalore.GemOnyx, 'S', Items.string, 'W', Blocks.wool
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemsGalore.CoreBracket), new Object[] {
			"I S I",
			"S I S",
			"I S I",
			'I', Items.iron_ingot, 'S', ItemsGalore.GemSpark
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemsGalore.InfuserBracket), new Object[] {
			"I R I",
			"I R I",
			"I R I",
			'I', Items.iron_ingot, 'R', ItemsGalore.GemRuby
		});
		
	}
	
	private static void registerShapeless() {
		
	}
	
	private static void registerFurnace() {
		//am he ja on op rh ru sa sp to tu
		GameRegistry.addSmelting(BlocksGalore.OreAmethyst, new ItemStack(ItemsGalore.GemAmethyst, 1), 10.0F);
		GameRegistry.addSmelting(BlocksGalore.OreHematite, new ItemStack(ItemsGalore.GemHematite, 1), 20.0F);
		GameRegistry.addSmelting(BlocksGalore.OreJade, new ItemStack(ItemsGalore.GemJade, 1), 20.0F);
		GameRegistry.addSmelting(BlocksGalore.OreOnyx, new ItemStack(ItemsGalore.GemOnyx, 1), 20.0F);
		GameRegistry.addSmelting(BlocksGalore.OreOpal, new ItemStack(ItemsGalore.GemOpal, 1), 20.0F);
		GameRegistry.addSmelting(BlocksGalore.OreRhodium, new ItemStack(ItemsGalore.IngotRhodium, 1), 20.0F);
		GameRegistry.addSmelting(BlocksGalore.OreRuby, new ItemStack(ItemsGalore.GemRuby, 1), 20.0F);
		GameRegistry.addSmelting(BlocksGalore.OreSapphire, new ItemStack(ItemsGalore.GemSapphire, 1), 20.0F);
		GameRegistry.addSmelting(BlocksGalore.OreSpark, new ItemStack(ItemsGalore.GemSpark, 1), 100.0F);
		GameRegistry.addSmelting(BlocksGalore.OreTopaz, new ItemStack(ItemsGalore.GemTopaz, 1), 20.0F);
		GameRegistry.addSmelting(BlocksGalore.OreTurqoise, new ItemStack(ItemsGalore.GemTurqoise, 1), 10.0F);
		GameRegistry.addSmelting(ItemsGalore.BlendBrass, new ItemStack(ItemsGalore.IngotBrass, 1), 20.0F);
		GameRegistry.addSmelting(BlocksGalore.OreRhodium)), new ItemStack(ItemsGalore.IngotRhodium, 1), 30.0F);
	}
	

}
