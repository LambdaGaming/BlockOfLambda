package com.lambdagaming.blockoflambda.init;

import java.util.ArrayList;
import java.util.List;
import com.lambdagaming.blockoflambda.blocks.LambdaBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block LAMBDA_BLOCK = new LambdaBlock( "lambda_block", Material.ROCK );
}
