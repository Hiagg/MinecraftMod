package com.curle.block;

import com.curle.block.machines.*;
import com.curle.block.ores.*;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlocksGalore {
	//Ores
	public static Block OreAmethyst;
	public static Block OreHematite;
	public static Block OreJade;
	public static Block OreOnyx;
	public static Block OreOpal;
	public static Block OreRhodium;
	public static Block OreRuby;
	public static Block OreSapphire;
	public static Block OreSpark;
	public static Block OreTopaz;
	public static Block OreTurqoise;
	//Blocks
	public static Block SoundBlock;                //
	public static Block MaterialInfuserActive;     //
	public static Block MaterialInfuser;           //
	public static Block ObsRhydian;
	
	public static void init() {
		OreAmethyst = new OreAmethyst();
		OreHematite = new OreHematite();
		OreJade = new OreJade();
		OreOnyx = new OreOnyx();
		OreOpal = new OreOpal();
		OreRhodium = new OreRhodium();
		OreRuby = new OreRuby();
		OreSapphire = new OreSapphire();
		OreSpark = new OreSpark();
		OreTopaz = new OreTopaz();
		OreTurqoise = new OreTurqoise();
		
		ObsRhydian = new ObsRhydian();
		
		GameRegistry.registerBlock(OreAmethyst, "OreAmethyst");
		GameRegistry.registerBlock(OreHematite, "OreHematite");
		GameRegistry.registerBlock(OreJade, "OreJade");
		GameRegistry.registerBlock(OreOnyx, "OreOnyx");
		GameRegistry.registerBlock(OreOpal, "OreOpal");
		GameRegistry.registerBlock(OreRhodium, "OreRhodium");
		GameRegistry.registerBlock(OreRuby, "OreRuby");
		GameRegistry.registerBlock(OreSapphire, "OreSapphire");
		GameRegistry.registerBlock(OreSpark, "OreSpark");
		GameRegistry.registerBlock(OreTopaz, "OreTopaz");
		GameRegistry.registerBlock(OreTurqoise, "OreTurqoise");
		
		GameRegistry.registerBlock(ObsRhydian, "ObsRhydian");
	}
	  
}
