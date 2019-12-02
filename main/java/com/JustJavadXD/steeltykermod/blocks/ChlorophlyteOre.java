package com.JustJavadXD.steeltykermod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ChlorophlyteOre extends BlockBase 
{

	public ChlorophlyteOre(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.4F);
		setResistance(8.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.4F);
	}

}
