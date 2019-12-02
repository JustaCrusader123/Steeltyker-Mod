package com.JustJavadXD.steeltykermod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RepugtiteBlock extends BlockBase 
{

	public RepugtiteBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.6F);
		setResistance(32.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.6F);
	}

}
