package com.JustJavadXD.steeltykermod.init;

import com.JustJavadXD.steeltykermod.items.ModBlocks;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.REPUGTITE_ORE, new ItemStack(ModItems.REPUGTITE_INGOT, 1), 1.5f);
	}
}
