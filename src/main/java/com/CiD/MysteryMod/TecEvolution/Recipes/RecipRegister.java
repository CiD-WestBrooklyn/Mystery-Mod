package com.CiD.MysteryMod.TecEvolution.Recipes;

import com.CiD.MysteryMod.MysteryMain;
import com.CiD.MysteryMod.TecEvolution.TecEvolutionMain;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipRegister {

	
	public static void registerAllCraftingRecipies(){

		GameRegistry.addShapedRecipe(new ItemStack(TecEvolutionMain.crafting_station,1), 

 		  new Object[]{
 	   "aaa",
 	   "cic",
 	   "aaa",
 	   'i',Blocks.iron_block, 'c', Blocks.crafting_table
		});


	
	
	}
	
}
