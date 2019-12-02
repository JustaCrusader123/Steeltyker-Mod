package com.JustJavadXD.steeltykermod.items.tools;

import com.JustJavadXD.steeltykermod.Main;
import com.JustJavadXD.steeltykermod.init.ModItems;
import com.JustJavadXD.steeltykermod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolDagger extends ItemAxe implements IHasModel {

	public ToolDagger(String name, ToolMaterial material)
	{
		super (material, 4.5F, -1.5F);
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
