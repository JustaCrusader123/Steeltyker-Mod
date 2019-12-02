package com.JustJavadXD.steeltykermod;

import com.JustJavadXD.steeltykermod.init.ModRecipes;
import com.JustJavadXD.steeltykermod.proxy.CommonProxy;
import com.JustJavadXD.steeltykermod.tabs.SteelTykerTab;
import com.JustJavadXD.steeltykermod.util.Reference;
import com.JustJavadXD.steeltykermod.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID)  
public class Main {
	
	@Instance
	public static Main instance;
	
	public static final CreativeTabs steeltykertab = new SteelTykerTab("steeltykertab");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}

}
