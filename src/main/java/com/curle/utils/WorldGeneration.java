package com.curle.utils;

import java.util.Random;

import com.curle.block.BlocksGalore;
import com.curle.deltaseven.Main;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGeneration implements IWorldGenerator{
	public static void init() {
		GameRegistry.registerWorldGenerator(Main.worldGen, 1);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if(world.provider.dimensionId == 0) {
			generateOverworld(world, random, chunkX * 16, chunkZ * 16);
		}
		
	}
	
	public void generateOverworld(World world, Random random, int chunkX, int chunkZ) {
			for (int i = 0; i < 20; i++){
				int randPosX = chunkX + random.nextInt(16);
				int randPosY = random.nextInt(64);
				int randPosZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(BlocksGalore.OreJade, 3)).generate(world, random, randPosX, randPosY, randPosZ);
				(new WorldGenMinable(BlocksGalore.OreHematite, 5)).generate(world, random, randPosX, randPosY, randPosZ);
				(new WorldGenMinable(BlocksGalore.OreOnyx, 4)).generate(world, random, randPosX, randPosY, randPosZ);
				(new WorldGenMinable(BlocksGalore.OreOpal, 2)).generate(world, random, randPosX, randPosY, randPosZ);
				(new WorldGenMinable(BlocksGalore.OreRhodium, 1)).generate(world, random, randPosX, randPosY, randPosZ);
				(new WorldGenMinable(BlocksGalore.OreRuby, 8)).generate(world, random, randPosX, randPosY, randPosZ);
				(new WorldGenMinable(BlocksGalore.OreSapphire, 9)).generate(world, random, randPosX, randPosY, randPosZ);
				(new WorldGenMinable(BlocksGalore.OreTopaz, 3)).generate(world, random, randPosX, randPosY, randPosZ);
				(new WorldGenMinable(BlocksGalore.OreTurqoise, 10)).generate(world, random, randPosX, randPosY, randPosZ);
				(new WorldGenMinable(BlocksGalore.OreAmethyst, 4)).generate(world, random, randPosX, randPosY, randPosZ);
				(new WorldGenMinable(BlocksGalore.OreSpark, 1)).generate(world, random, randPosX, randPosY, randPosZ);


				
			}
	}

}
