package com.JustJavadXD.steeltykermod.items;

import java.util.ArrayList;
import java.util.List;

import com.JustJavadXD.steeltykermod.blocks.BlockBase;
import com.JustJavadXD.steeltykermod.blocks.ChlorophlyteOre;
import com.JustJavadXD.steeltykermod.blocks.RepugtiteBlock;
import com.JustJavadXD.steeltykermod.blocks.RepugtiteOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block REPUGTITE_BLOCK = new RepugtiteBlock("repugtite_block", Material.IRON);
	public static final Block REPUGTITE_ORE = new RepugtiteOre("repugtite_ore", Material.ROCK);
	public static final Block CHLOROPHLYTE_ORE = new ChlorophlyteOre("chlorophlyte_ore", Material.ROCK);
}
