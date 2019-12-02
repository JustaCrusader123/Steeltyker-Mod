package com.JustJavadXD.steeltykermod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RepugtiteOre extends BlockBase 
{
	
	public RepugtiteOre(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.6F);
		setResistance(28.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.4F);
	}

}
