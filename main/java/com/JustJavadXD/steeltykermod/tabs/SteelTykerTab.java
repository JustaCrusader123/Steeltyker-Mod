package com.JustJavadXD.steeltykermod.tabs;

import com.JustJavadXD.steeltykermod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SteelTykerTab extends CreativeTabs
{
	public SteelTykerTab(String label) { super("steeltykertab");
	this.setBackgroundImageName("steeltykermod.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.REPUGTITE_INGOT);}
}
