package net.lambdagaming.bol;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockOfLambda implements ModInitializer {
	public static final Block LAMBDA_BLOCK = new LambdaBlock(
			FabricBlockSettings.of( Material.STONE ).strength( 3.0f ).luminance( 15 ).hardness( 1.0f ) );
	@Override
	public void onInitialize() {
		Registry.register( Registry.BLOCK, new Identifier( "bol", "lambda_block" ), LAMBDA_BLOCK );
		Registry.register( Registry.ITEM, new Identifier( "bol", "lambda_block" ),
				new BlockItem( LAMBDA_BLOCK, new FabricItemSettings() ) );
	}
}
