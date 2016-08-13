package com.curle.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;

import com.curle.armor.ArmorMaterials;
import com.curle.armor.ArmorSpark;
import com.curle.item.materials.*;
import com.curle.item.tools.*;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemsGalore {
	//Templates
	private static ToolMaterial tmspark;
	private static ToolMaterial tmtopaz;
	private static ToolMaterial tmjade;
	private static ToolMaterial tmlapis;
	
	private static ArmorMaterial amspark;
	// Materials
	public static Item EOR;
	public static Item IngotBrass;
	public static Item IngotIridium;
	public static Item IngotRhodium;
	public static Item Ash;
	public static Item GemSpark;
	public static Item GemTopaz;      //Delta-Seven
	public static Item GemJade;
	public static Item GemRuby;
	public static Item GemSapphire;
	public static Item GemOnyx;
	public static Item GemAmethyst;
	public static Item GemTurqoise;
	public static Item GemHematite;
	public static Item GemOpal;
	public static Item RawSpark;
	public static Item RefinedSpark;
	public static Item FluxPhaser;
	public static Item InfuserBracket;
	public static Item CoreBracket;
	public static Item InfuserCore;
	public static Item BlendBrass;
	// Tools
	public static Item SwordSpark;
	public static Item SwordTopaz;
	public static Item SwordJade;
	public static Item SwordLapis;
	public static Item ShovelSpark;
	public static Item ShovelTopaz;
	public static Item ShovelJade;
	public static Item ShovelLapis;
	public static Item PickaxeSpark;
	public static Item PickaxeTopaz;
	public static Item PickaxeJade;
	public static Item PickaxeLapis;
	public static Item AxeSpark;
	public static Item AxeTopaz;
	public static Item AxeJade;
	public static Item AxeLapis;
	//Armor
	public static Item ArmorSparkHelm;
	public static Item ArmorSparkChest;
	public static Item ArmorSparkLegs;
	public static Item ArmorSparkBoots;
	
	public static void init() {
		tmspark = ToolMaterials.MaterialToolSpark;
		tmtopaz = ToolMaterials.MaterialToolTopaz;
		tmjade = ToolMaterials.MaterialToolJade;
		tmlapis = ToolMaterials.MaterialToolLapis;
		
		amspark = ArmorMaterials.MaterialArmorSpark;
		
		EOR = new EOR();
		IngotBrass = new IngotBrass();
		IngotIridium = new IngotIridium();
		IngotRhodium = new IngotRhodium();
		Ash = new Ash();
		GemSpark = new GemSpark();
		GemTopaz = new GemTopaz();
		GemJade = new GemJade();
		GemRuby = new GemRuby();
		GemSapphire = new GemSapphire();
		GemOnyx = new GemOnyx();
		GemAmethyst = new GemAmethyst();
		GemTurqoise = new GemTurqoise();
		GemHematite = new GemHematite();
		GemOpal = new GemOpal();
		RawSpark = new RawSpark();
		RefinedSpark = new RefinedSpark();
		FluxPhaser = new FluxPhaser();
		InfuserBracket = new InfuserBracket();
		CoreBracket = new CoreBracket();
		InfuserCore = new InfuserCore();
		BlendBrass = new BlendBrass();
		
		SwordSpark = new SwordSpark(tmspark, 50);
		SwordTopaz = new SwordTopaz(tmtopaz, 5);
		SwordJade = new SwordJade(tmjade, 6);
		SwordLapis = new SwordLapis(tmlapis, 8);
		
		ShovelSpark = new ShovelSpark(tmspark);
		ShovelTopaz = new ShovelTopaz(tmtopaz);
		ShovelJade = new ShovelJade(tmjade);
		ShovelLapis = new ShovelLapis(tmlapis);
		
		PickaxeSpark = new PickaxeSpark(tmspark);
		PickaxeTopaz = new PickaxeTopaz(tmtopaz);
		PickaxeJade = new PickaxeJade(tmjade);
		PickaxeLapis = new PickaxeLapis(tmlapis);
		
		AxeSpark = new AxeSpark(tmspark);
		AxeTopaz = new AxeTopaz(tmtopaz);
		AxeJade = new AxeJade(tmjade);
		AxeLapis = new AxeLapis(tmlapis);
		
		ArmorSparkHelm = new ArmorSpark("ArmorSparkHelm", amspark, 1);
		ArmorSparkChest = new ArmorSpark("ArmorSparkChest", amspark, 2);
		ArmorSparkLegs = new ArmorSpark("ArmorSparkLegs", amspark, 3);
		ArmorSparkBoots = new ArmorSpark("ArmorSparkBoots", amspark, 4);
		
		GameRegistry.registerItem(EOR, "EOR");
		GameRegistry.registerItem(IngotBrass, "IngotBrass");
		GameRegistry.registerItem(IngotIridium, "IngotIridium");
		GameRegistry.registerItem(IngotRhodium, "IngotRhodium");
		GameRegistry.registerItem(Ash, "Ash");
		GameRegistry.registerItem(GemSpark, "GemSpark");
		GameRegistry.registerItem(GemTopaz, "GemTopaz");
		GameRegistry.registerItem(GemJade, "GemJade");
		GameRegistry.registerItem(GemRuby, "GemRuby");
		GameRegistry.registerItem(GemSapphire, "GemSapphire");
		GameRegistry.registerItem(GemOnyx, "GemOnyx");
		GameRegistry.registerItem(GemAmethyst, "GemAmethyst");
		GameRegistry.registerItem(GemTurqoise, "GemTurqoise");
		GameRegistry.registerItem(GemHematite, "GemHematite");
		GameRegistry.registerItem(GemOpal, "GemOpal");
		GameRegistry.registerItem(RawSpark, "RawSpark");
		GameRegistry.registerItem(RefinedSpark, "RefinedSpark");
		GameRegistry.registerItem(InfuserCore, "InfuserCore");
		GameRegistry.registerItem(InfuserBracket, "InfuserBracket");
		GameRegistry.registerItem(CoreBracket, "CoreBracket");
		GameRegistry.registerItem(FluxPhaser, "FluxPhaser");
		GameRegistry.registerItem(BlendBrass, "BlendBrass");
		
		GameRegistry.registerItem(SwordSpark, "SwordSpark");
		GameRegistry.registerItem(SwordTopaz, "SwordTopaz");
		GameRegistry.registerItem(SwordJade, "SwordJade");
		GameRegistry.registerItem(SwordLapis, "SwordLapis");
		
		GameRegistry.registerItem(ShovelSpark, "ShovelSpark");
		GameRegistry.registerItem(ShovelTopaz, "ShovelTopaz");
		GameRegistry.registerItem(ShovelJade, "ShovelJade");
		GameRegistry.registerItem(ShovelLapis, "ShovelLapis");
		
		GameRegistry.registerItem(PickaxeSpark, "PickaxeSpark");
		GameRegistry.registerItem(PickaxeTopaz, "PickaxeTopaz");
		GameRegistry.registerItem(PickaxeJade, "PickaxeJade");
		GameRegistry.registerItem(PickaxeLapis, "PickaxeLapis");
		
		GameRegistry.registerItem(AxeSpark, "AxeSpark");
		GameRegistry.registerItem(AxeTopaz, "AxeTopaz");
		GameRegistry.registerItem(AxeJade, "AxeJade");
		GameRegistry.registerItem(AxeLapis, "AxeLapis");
		
		GameRegistry.registerItem(ArmorSparkHelm, "ArmorSparkHelm");
		GameRegistry.registerItem(ArmorSparkChest, "ArmorSparkChest");
		GameRegistry.registerItem(ArmorSparkLegs, "ArmorSparkLegs");
		GameRegistry.registerItem(ArmorSparkBoots, "ArmorSparkBoots");
	}

}
