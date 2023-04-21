package net.lambdagaming.bol;

import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.world.World;

public class LambdaBlock extends Block {
	public LambdaBlock( Settings settings ) {
		super( settings );
	}

	@Override
	public void onBreak( World world, BlockPos pos, BlockState state, PlayerEntity ply )
	{
		ply.addExperienceLevels( 10 );
	}
}
