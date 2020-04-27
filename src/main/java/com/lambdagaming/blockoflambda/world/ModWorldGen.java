package com.lambdagaming.blockoflambda.world;

import java.util.Random;
import com.lambdagaming.blockoflambda.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator {
	@Override
	public void generate( Random rand, int chunkX, int chunkZ, World world, IChunkGenerator generator, IChunkProvider providor ) {
		if ( world.provider.getDimension() == 0 ) {
			generateOverworld( rand, chunkX, chunkZ, world, generator, providor );
		}
	}
	
	private void generateOverworld( Random rand, int chunkX, int chunkZ, World world, IChunkGenerator generator, IChunkProvider providor ) {
		generateOre( ModBlocks.LAMBDA_BLOCK.getDefaultState(), world, rand, chunkX * 16, chunkZ * 16, 10, 35, 3, 2 );
	}
	
	private void generateOre( IBlockState ore, World world, Random rand, int x, int z, int minY, int maxY, int size, int chances ) {
		int deltaY = maxY - minY;
		for ( int i=0; i < chances; i++ ) {
			BlockPos pos = new BlockPos( x + rand.nextInt( 16 ), minY + rand.nextInt( deltaY ), z + rand.nextInt( 16 ) );
			WorldGenMinable gen = new WorldGenMinable( ore, size );
			gen.generate( world, rand, pos );
		}
	}
}
