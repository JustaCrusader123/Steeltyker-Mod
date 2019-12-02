package com.JustJavadXD.steeltykermod.init;

import java.util.ArrayList;
import java.util.List;

import com.JustJavadXD.steeltykermod.items.ItemBase;
import com.JustJavadXD.steeltykermod.items.armour.ArmorBase;
import com.JustJavadXD.steeltykermod.items.food.FoodBase;
import com.JustJavadXD.steeltykermod.items.food.FoodEffectBase;
import com.JustJavadXD.steeltykermod.items.tools.ToolAxe;
import com.JustJavadXD.steeltykermod.items.tools.ToolDagger;
import com.JustJavadXD.steeltykermod.items.tools.ToolPickaxe;
import com.JustJavadXD.steeltykermod.items.tools.ToolSpade;
import com.JustJavadXD.steeltykermod.items.tools.ToolSword;
import com.JustJavadXD.steeltykermod.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	
    public static final List<Item> ITEMS = new ArrayList<Item>();
    
    //Materials
    public static final ToolMaterial MATERIAL_REPUGTITE_INGOT = EnumHelper.addToolMaterial("material_repugtite_ingot", 3, 1157, 8.0F, 3.0F, 12);
    public static final ArmorMaterial ARMOR_MATERIAL_REPUGTITE_INGOT = EnumHelper.addArmorMaterial("armour_material_repugtite_ingot", Reference.MOD_ID + ":repugtite_ingot", 13, new int[] {2, 5, 7, 3}, 13, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F);
    public static final ToolMaterial MATERIAL_CHAOS_SHARD = EnumHelper.addToolMaterial("material_chaos_shard", 3, 2104, 8.0F, 9.0F, 12);
    public static final ToolMaterial MATERIAL_HUNTER_STONE = EnumHelper.addToolMaterial("material_hunter_stone", 3, 345, 8.0F, 3.0F, 12);
    public static final ToolMaterial MATERIAL_COBALT = EnumHelper.addToolMaterial("material_cobalt", 2, 248, 6.0F, 2.0F, 12);
    
    //Items
    public static final Item REPUGTITE_INGOT = new ItemBase("repugtite_ingot");
    public static final Item CHAOS_SHARD = new ItemBase("chaos_shard");
    public static final Item CHLOROPHLYTE_INGOT = new ItemBase("chlorophlyte_ingot");
    
    //Tools
    public static final ItemSword REPUGTITE_SWORD = new ToolSword("repugtite_sword", MATERIAL_REPUGTITE_INGOT);
    public static final ItemSpade REPUGTITE_SHOVEL = new ToolSpade("repugtite_shovel", MATERIAL_REPUGTITE_INGOT);
    public static final ItemPickaxe REPUGTITE_PICKAXE = new ToolPickaxe("repugtite_pickaxe", MATERIAL_REPUGTITE_INGOT);
    public static final ItemAxe REPUGTITE_AXE = new ToolAxe("repugtite_axe", MATERIAL_REPUGTITE_INGOT);
    public static final ItemSword REAPER_OF_CHAOS = new ToolSword("reaper_of_chaos", MATERIAL_CHAOS_SHARD);
    public static final ToolDagger HUNTER_DAGGER = new ToolDagger("hunter_dagger", MATERIAL_HUNTER_STONE);
    public static final ItemSword COBALT_SWORD = new ToolSword("cobalt_sword", MATERIAL_COBALT);
    
    //Armour
    public static final Item REPUGTITE_HELMET = new ArmorBase("repugtite_helmet", ARMOR_MATERIAL_REPUGTITE_INGOT, 1, EntityEquipmentSlot.HEAD);
    public static final Item REPUGTITE_CHESTPLATE = new ArmorBase("repugtite_chestplate", ARMOR_MATERIAL_REPUGTITE_INGOT, 1, EntityEquipmentSlot.CHEST);
    public static final Item REPUGTITE_LEGGINGS = new ArmorBase("repugtite_leggings", ARMOR_MATERIAL_REPUGTITE_INGOT, 2, EntityEquipmentSlot.LEGS);
    public static final Item REPUGTITE_BOOTS = new ArmorBase("repugtite_boots", ARMOR_MATERIAL_REPUGTITE_INGOT, 2, EntityEquipmentSlot.FEET);
    
    //Food
    //public static final Item MOMMA_SOUP = new FoodBase("momma_soup", 7, 6.5f, false);
    public static final Item MOMMA_SOUP = new FoodEffectBase("momma_soup", 7, 6.5f, false, new PotionEffect(MobEffects.STRENGTH, (60*15), 3, false, true));
	public static final Item RAINBOW_TROUT = new FoodBase("rainbow_trout", 3, 0.4f, false);
}
