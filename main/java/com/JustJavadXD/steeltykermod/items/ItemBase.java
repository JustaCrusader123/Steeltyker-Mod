package com.JustJavadXD.steeltykermod.items;

import com.JustJavadXD.steeltykermod.Main;
import com.JustJavadXD.steeltykermod.init.ModItems;
import com.JustJavadXD.steeltykermod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.steeltykertab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{	
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
