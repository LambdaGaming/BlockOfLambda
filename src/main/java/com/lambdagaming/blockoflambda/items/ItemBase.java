package com.lambdagaming.blockoflambda.items;

import com.lambdagaming.blockoflambda.Main;
import com.lambdagaming.blockoflambda.init.ModItems;
import com.lambdagaming.blockoflambda.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	public ItemBase( String name ) {
		setUnlocalizedName( name );
		setRegistryName( name );
		setCreativeTab( CreativeTabs.BUILDING_BLOCKS );
		ModItems.ITEMS.add( this );
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer( this, 0, "inventory" );
	}
}
