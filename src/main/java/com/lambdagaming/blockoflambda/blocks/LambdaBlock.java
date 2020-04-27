package com.lambdagaming.blockoflambda.blocks;

import java.util.ArrayList;
import java.util.Random;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class LambdaBlock extends BlockBase {
	public LambdaBlock( String name, Material material ) {
		super( name, material );
		setSoundType( SoundType.STONE );
		setHardness( 50.0f ); // Same hardness as obsidian
		setResistance( 3.0f ); // Same resistance as other ores
		setHarvestLevel( "pickaxe", 2 );
		setLightLevel( 1.0f ); // Same light level as glowstone
	}
	
	private Item[] ItemList = {
		Items.DIAMOND, // Treasure items start here
		Items.CAKE,
		Items.DIAMOND_CHESTPLATE,
		Items.IRON_INGOT,
		Items.DIAMOND_PICKAXE,
		Items.TOTEM_OF_UNDYING,
		Items.EXPERIENCE_BOTTLE,
		Items.BONE, // Junk items start here
		Items.ARROW,
		Items.BED,
		Items.COAL,
		Items.CHICKEN,
		Items.EGG,
		Items.GUNPOWDER,
		Items.RECORD_13
	};
	
	@Override
	public Item getItemDropped( IBlockState state, Random rand, int fortune ) {
		int randitem = rand.nextInt( ItemList.length );
		return ItemList[randitem]; // Return a random item from the list
	}
	
	@Override
	public int quantityDropped( Random rand ) {
		return rand.nextInt( ( 5 - 2 ) + 1 ) + 2;
	}
}
