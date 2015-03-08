package com.CiD.MysteryMod.TecEvolution.Factory.MultiBlock;

import com.CiD.MysteryMod.TecEvolution.TecEvolutionMain;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class Structures {

	public static boolean hasStructure(final MultiBlockType type, World world, final int x, final int y, final int z){
		
		switch(type){
			default: return false;
			case CraftingStation:{
				if(world.getTileEntity(x, y, z) instanceof ITileMultiBlock){
					if(world.getBlock(x, y + 1, z) == Blocks.crafting_table && world.getBlock(x, y - 1, z) == Blocks.crafting_table){
						
						((ITileMultiBlock)world.getTileEntity(x, y, z)).setTileInMultiblockForm();
						return true;
					}else{

						((ITileMultiBlock)world.getTileEntity(x, y, z)).disableMultiBlock();
						return false;
					}
				}
				
				
			}
			//BIG ONE

			case FusionReactor:{
				if(world.getBlock(x + 0, y + 0,z+6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y + 0,z-6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y + 0,z+6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y + 0,z-6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y - 0,z+6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y - 0,z-6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y - 0,z+6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y - 0,z-6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y + 1,z+6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y + 1,z-6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y + 1,z+6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y + 1,z-6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y - 1,z+6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y - 1,z-6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y - 1,z+6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y - 1,z-6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y + 2,z+5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y + 2,z-5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y + 2,z+5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y + 2,z-5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y - 2,z+5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y - 2,z-5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y - 2,z+5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y - 2,z-5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y + 3,z+5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y + 3,z-5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y + 3,z+5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y + 3,z-5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y - 3,z+5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y - 3,z-5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y - 3,z+5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y - 3,z-5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y + 4,z+4)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y + 4,z-4)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y + 4,z+4)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y + 4,z-4)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y - 4,z+4)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y - 4,z-4)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y - 4,z+4)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y - 4,z-4)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y + 5,z+2)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y + 5,z-2)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y + 5,z+2)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y + 5,z-2)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y - 5,z+2)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y - 5,z-2)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y - 5,z+2)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y - 5,z-2)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y + 5,z+3)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y + 5,z-3)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y + 5,z+3)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y + 5,z-3)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y - 5,z+3)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y - 5,z-3)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y - 5,z+3)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y - 5,z-3)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y + 6,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y + 6,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y + 6,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y + 6,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y - 6,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y - 6,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y - 6,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y - 6,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y + 6,z+1)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y + 6,z-1)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y + 6,z+1)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y + 6,z-1)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y - 6,z+1)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 0, y - 6,z-1)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y - 6,z+1)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 0, y - 6,z-1)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 1, y + 0,z+6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 1, y + 0,z-6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 1, y + 0,z+6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 1, y + 0,z-6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 1, y - 0,z+6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 1, y - 0,z-6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 1, y - 0,z+6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 1, y - 0,z-6)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 1, y + 6,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 1, y + 6,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 1, y + 6,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 1, y + 6,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 1, y - 6,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 1, y - 6,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 1, y - 6,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 1, y - 6,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 2, y + 0,z+5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 2, y + 0,z-5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 2, y + 0,z+5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 2, y + 0,z-5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 2, y - 0,z+5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 2, y - 0,z-5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 2, y - 0,z+5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 2, y - 0,z-5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 2, y + 5,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 2, y + 5,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 2, y + 5,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 2, y + 5,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 2, y - 5,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 2, y - 5,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 2, y - 5,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 2, y - 5,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 3, y + 0,z+5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 3, y + 0,z-5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 3, y + 0,z+5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 3, y + 0,z-5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 3, y - 0,z+5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 3, y - 0,z-5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 3, y - 0,z+5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 3, y - 0,z-5)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 3, y + 5,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 3, y + 5,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 3, y + 5,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 3, y + 5,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 3, y - 5,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 3, y - 5,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 3, y - 5,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 3, y - 5,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 4, y + 0,z+4)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 4, y + 0,z-4)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 4, y + 0,z+4)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 4, y + 0,z-4)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 4, y - 0,z+4)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 4, y - 0,z-4)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 4, y - 0,z+4)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 4, y - 0,z-4)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 4, y + 4,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 4, y + 4,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 4, y + 4,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 4, y + 4,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 4, y - 4,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 4, y - 4,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 4, y - 4,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 4, y - 4,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 5, y + 0,z+2)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 5, y + 0,z-2)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 5, y + 0,z+2)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 5, y + 0,z-2)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 5, y - 0,z+2)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 5, y - 0,z-2)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 5, y - 0,z+2)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 5, y - 0,z-2)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 5, y + 0,z+3)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 5, y + 0,z-3)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 5, y + 0,z+3)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 5, y + 0,z-3)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 5, y - 0,z+3)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 5, y - 0,z-3)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 5, y - 0,z+3)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 5, y - 0,z-3)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 5, y + 2,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 5, y + 2,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 5, y + 2,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 5, y + 2,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 5, y - 2,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 5, y - 2,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 5, y - 2,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 5, y - 2,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 5, y + 3,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 5, y + 3,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 5, y + 3,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 5, y + 3,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 5, y - 3,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 5, y - 3,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 5, y - 3,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 5, y - 3,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 6, y + 0,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 6, y + 0,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 6, y + 0,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 6, y + 0,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 6, y - 0,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 6, y - 0,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 6, y - 0,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 6, y - 0,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 6, y + 0,z+1)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 6, y + 0,z-1)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 6, y + 0,z+1)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 6, y + 0,z-1)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 6, y - 0,z+1)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 6, y - 0,z-1)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 6, y - 0,z+1)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 6, y - 0,z-1)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 6, y + 1,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 6, y + 1,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 6, y + 1,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 6, y + 1,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 6, y - 1,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x + 6, y - 1,z-0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 6, y - 1,z+0)==TecEvolutionMain.diamond_hull){
					if(world.getBlock(x - 6, y - 1,z-0)==TecEvolutionMain.diamond_hull){
						
						((ITileMultiBlock)world.getTileEntity(x, y, z)).setTileInMultiblockForm();

						setFusionHullInMultiBlock(world, x, y, z);
						return true;	
					}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}
						}

						
						
					
		((ITileMultiBlock)world.getTileEntity(x, y, z)).disableMultiBlock();
		removeFusionHull(world, x, y, z);
		return false;
		}
			}

	}
	


	// THIS FUNCTION THO hard codeing ftw O_o
	/** ONLY USE THIS INSIDE THE STRUCTURES CLASS*/
	public static void setFusionHullInMultiBlock(World world, int x, int y, int z){
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 0, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 0, z + 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 0, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 0, z - 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 0, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 0, z + 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 0, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 0, z - 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 0, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 0, z + 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 0, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 0, z - 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 0, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 0, z + 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 0, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 0, z - 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 1, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 1, z + 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 1, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 1, z - 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 1, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 1, z + 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 1, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 1, z - 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 1, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 1, z + 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 1, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 1, z - 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 1, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 1, z + 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 1, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 1, z - 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 2, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 2, z + 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 2, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 2, z - 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 2, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 2, z + 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 2, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 2, z - 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 2, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 2, z + 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 2, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 2, z - 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 2, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 2, z + 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 2, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 2, z - 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 3, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 3, z + 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 3, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 3, z - 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 3, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 3, z + 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 3, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 3, z - 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 3, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 3, z + 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 3, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 3, z - 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 3, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 3, z + 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 3, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 3, z - 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 4, z + 4))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 4, z + 4)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 4, z - 4))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 4, z - 4)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 4, z + 4))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 4, z + 4)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 4, z - 4))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 4, z - 4)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 4, z + 4))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 4, z + 4)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 4, z - 4))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 4, z - 4)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 4, z + 4))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 4, z + 4)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 4, z - 4))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 4, z - 4)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 5, z + 2))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 5, z + 2)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 5, z - 2))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 5, z - 2)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 5, z + 2))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 5, z + 2)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 5, z - 2))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 5, z - 2)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 5, z + 2))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 5, z + 2)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 5, z - 2))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 5, z - 2)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 5, z + 2))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 5, z + 2)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 5, z - 2))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 5, z - 2)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 5, z + 3))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 5, z + 3)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 5, z - 3))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 5, z - 3)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 5, z + 3))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 5, z + 3)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 5, z - 3))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 5, z - 3)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 5, z + 3))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 5, z + 3)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 5, z - 3))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 5, z - 3)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 5, z + 3))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 5, z + 3)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 5, z - 3))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 5, z - 3)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 6, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 6, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 6, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 6, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 6, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 6, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 6, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 6, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 6, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 6, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 6, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 6, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 6, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 6, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 6, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 6, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 6, z + 1))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 6, z + 1)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 6, z - 1))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 6, z - 1)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 6, z + 1))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 6, z + 1)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 6, z - 1))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 6, z - 1)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 6, z + 1))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 6, z + 1)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 6, z - 1))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 6, z - 1)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 6, z + 1))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 6, z + 1)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 6, z - 1))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 6, z - 1)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 1, y + 0, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 1, y + 0, z + 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 1, y + 0, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 1, y + 0, z - 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 1, y + 0, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 1, y + 0, z + 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 1, y + 0, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 1, y + 0, z - 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 1, y - 0, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 1, y - 0, z + 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 1, y - 0, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 1, y - 0, z - 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 1, y - 0, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 1, y - 0, z + 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 1, y - 0, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 1, y - 0, z - 6)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 1, y + 6, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 1, y + 6, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 1, y + 6, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 1, y + 6, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 1, y + 6, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 1, y + 6, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 1, y + 6, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 1, y + 6, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 1, y - 6, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 1, y - 6, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 1, y - 6, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 1, y - 6, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 1, y - 6, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 1, y - 6, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 1, y - 6, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 1, y - 6, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 2, y + 0, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 2, y + 0, z + 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 2, y + 0, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 2, y + 0, z - 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 2, y + 0, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 2, y + 0, z + 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 2, y + 0, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 2, y + 0, z - 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 2, y - 0, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 2, y - 0, z + 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 2, y - 0, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 2, y - 0, z - 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 2, y - 0, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 2, y - 0, z + 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 2, y - 0, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 2, y - 0, z - 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 2, y + 5, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 2, y + 5, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 2, y + 5, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 2, y + 5, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 2, y + 5, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 2, y + 5, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 2, y + 5, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 2, y + 5, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 2, y - 5, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 2, y - 5, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 2, y - 5, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 2, y - 5, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 2, y - 5, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 2, y - 5, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 2, y - 5, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 2, y - 5, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 3, y + 0, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 3, y + 0, z + 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 3, y + 0, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 3, y + 0, z - 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 3, y + 0, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 3, y + 0, z + 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 3, y + 0, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 3, y + 0, z - 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 3, y - 0, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 3, y - 0, z + 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 3, y - 0, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 3, y - 0, z - 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 3, y - 0, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 3, y - 0, z + 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 3, y - 0, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 3, y - 0, z - 5)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 3, y + 5, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 3, y + 5, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 3, y + 5, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 3, y + 5, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 3, y + 5, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 3, y + 5, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 3, y + 5, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 3, y + 5, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 3, y - 5, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 3, y - 5, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 3, y - 5, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 3, y - 5, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 3, y - 5, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 3, y - 5, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 3, y - 5, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 3, y - 5, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 4, y + 0, z + 4))!= null)((ITileMultiBlock)world.getTileEntity(x + 4, y + 0, z + 4)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 4, y + 0, z - 4))!= null)((ITileMultiBlock)world.getTileEntity(x + 4, y + 0, z - 4)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 4, y + 0, z + 4))!= null)((ITileMultiBlock)world.getTileEntity(x - 4, y + 0, z + 4)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 4, y + 0, z - 4))!= null)((ITileMultiBlock)world.getTileEntity(x - 4, y + 0, z - 4)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 4, y - 0, z + 4))!= null)((ITileMultiBlock)world.getTileEntity(x + 4, y - 0, z + 4)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 4, y - 0, z - 4))!= null)((ITileMultiBlock)world.getTileEntity(x + 4, y - 0, z - 4)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 4, y - 0, z + 4))!= null)((ITileMultiBlock)world.getTileEntity(x - 4, y - 0, z + 4)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 4, y - 0, z - 4))!= null)((ITileMultiBlock)world.getTileEntity(x - 4, y - 0, z - 4)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 4, y + 4, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 4, y + 4, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 4, y + 4, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 4, y + 4, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 4, y + 4, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 4, y + 4, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 4, y + 4, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 4, y + 4, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 4, y - 4, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 4, y - 4, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 4, y - 4, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 4, y - 4, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 4, y - 4, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 4, y - 4, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 4, y - 4, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 4, y - 4, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y + 0, z + 2))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y + 0, z + 2)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y + 0, z - 2))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y + 0, z - 2)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y + 0, z + 2))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y + 0, z + 2)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y + 0, z - 2))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y + 0, z - 2)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y - 0, z + 2))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y - 0, z + 2)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y - 0, z - 2))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y - 0, z - 2)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y - 0, z + 2))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y - 0, z + 2)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y - 0, z - 2))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y - 0, z - 2)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y + 0, z + 3))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y + 0, z + 3)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y + 0, z - 3))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y + 0, z - 3)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y + 0, z + 3))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y + 0, z + 3)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y + 0, z - 3))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y + 0, z - 3)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y - 0, z + 3))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y - 0, z + 3)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y - 0, z - 3))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y - 0, z - 3)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y - 0, z + 3))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y - 0, z + 3)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y - 0, z - 3))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y - 0, z - 3)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y + 2, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y + 2, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y + 2, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y + 2, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y + 2, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y + 2, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y + 2, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y + 2, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y - 2, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y - 2, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y - 2, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y - 2, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y - 2, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y - 2, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y - 2, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y - 2, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y + 3, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y + 3, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y + 3, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y + 3, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y + 3, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y + 3, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y + 3, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y + 3, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y - 3, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y - 3, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y - 3, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y - 3, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y - 3, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y - 3, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y - 3, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y - 3, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y + 0, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y + 0, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y + 0, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y + 0, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y + 0, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y + 0, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y + 0, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y + 0, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y - 0, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y - 0, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y - 0, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y - 0, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y - 0, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y - 0, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y - 0, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y - 0, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y + 0, z + 1))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y + 0, z + 1)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y + 0, z - 1))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y + 0, z - 1)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y + 0, z + 1))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y + 0, z + 1)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y + 0, z - 1))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y + 0, z - 1)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y - 0, z + 1))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y - 0, z + 1)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y - 0, z - 1))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y - 0, z - 1)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y - 0, z + 1))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y - 0, z + 1)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y - 0, z - 1))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y - 0, z - 1)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y + 1, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y + 1, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y + 1, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y + 1, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y + 1, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y + 1, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y + 1, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y + 1, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y - 1, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y - 1, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y - 1, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y - 1, z - 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y - 1, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y - 1, z + 0)).setTileInMultiblockForm();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y - 1, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y - 1, z - 0)).setTileInMultiblockForm();

		
	}
	public static void removeFusionHull(World world, int x, int y, int z){
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 0, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 0, z + 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 0, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 0, z - 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 0, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 0, z + 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 0, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 0, z - 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 0, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 0, z + 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 0, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 0, z - 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 0, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 0, z + 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 0, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 0, z - 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 1, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 1, z + 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 1, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 1, z - 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 1, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 1, z + 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 1, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 1, z - 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 1, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 1, z + 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 1, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 1, z - 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 1, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 1, z + 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 1, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 1, z - 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 2, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 2, z + 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 2, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 2, z - 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 2, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 2, z + 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 2, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 2, z - 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 2, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 2, z + 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 2, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 2, z - 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 2, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 2, z + 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 2, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 2, z - 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 3, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 3, z + 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 3, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 3, z - 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 3, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 3, z + 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 3, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 3, z - 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 3, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 3, z + 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 3, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 3, z - 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 3, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 3, z + 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 3, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 3, z - 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 4, z + 4))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 4, z + 4)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 4, z - 4))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 4, z - 4)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 4, z + 4))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 4, z + 4)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 4, z - 4))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 4, z - 4)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 4, z + 4))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 4, z + 4)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 4, z - 4))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 4, z - 4)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 4, z + 4))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 4, z + 4)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 4, z - 4))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 4, z - 4)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 5, z + 2))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 5, z + 2)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 5, z - 2))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 5, z - 2)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 5, z + 2))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 5, z + 2)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 5, z - 2))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 5, z - 2)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 5, z + 2))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 5, z + 2)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 5, z - 2))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 5, z - 2)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 5, z + 2))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 5, z + 2)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 5, z - 2))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 5, z - 2)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 5, z + 3))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 5, z + 3)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 5, z - 3))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 5, z - 3)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 5, z + 3))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 5, z + 3)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 5, z - 3))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 5, z - 3)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 5, z + 3))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 5, z + 3)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 5, z - 3))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 5, z - 3)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 5, z + 3))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 5, z + 3)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 5, z - 3))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 5, z - 3)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 6, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 6, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 6, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 6, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 6, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 6, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 6, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 6, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 6, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 6, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 6, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 6, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 6, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 6, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 6, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 6, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 6, z + 1))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 6, z + 1)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y + 6, z - 1))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y + 6, z - 1)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 6, z + 1))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 6, z + 1)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y + 6, z - 1))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y + 6, z - 1)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 6, z + 1))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 6, z + 1)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 0, y - 6, z - 1))!= null)((ITileMultiBlock)world.getTileEntity(x + 0, y - 6, z - 1)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 6, z + 1))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 6, z + 1)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 0, y - 6, z - 1))!= null)((ITileMultiBlock)world.getTileEntity(x - 0, y - 6, z - 1)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 1, y + 0, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 1, y + 0, z + 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 1, y + 0, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 1, y + 0, z - 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 1, y + 0, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 1, y + 0, z + 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 1, y + 0, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 1, y + 0, z - 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 1, y - 0, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 1, y - 0, z + 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 1, y - 0, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x + 1, y - 0, z - 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 1, y - 0, z + 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 1, y - 0, z + 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 1, y - 0, z - 6))!= null)((ITileMultiBlock)world.getTileEntity(x - 1, y - 0, z - 6)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 1, y + 6, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 1, y + 6, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 1, y + 6, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 1, y + 6, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 1, y + 6, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 1, y + 6, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 1, y + 6, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 1, y + 6, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 1, y - 6, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 1, y - 6, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 1, y - 6, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 1, y - 6, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 1, y - 6, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 1, y - 6, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 1, y - 6, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 1, y - 6, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 2, y + 0, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 2, y + 0, z + 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 2, y + 0, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 2, y + 0, z - 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 2, y + 0, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 2, y + 0, z + 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 2, y + 0, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 2, y + 0, z - 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 2, y - 0, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 2, y - 0, z + 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 2, y - 0, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 2, y - 0, z - 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 2, y - 0, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 2, y - 0, z + 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 2, y - 0, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 2, y - 0, z - 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 2, y + 5, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 2, y + 5, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 2, y + 5, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 2, y + 5, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 2, y + 5, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 2, y + 5, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 2, y + 5, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 2, y + 5, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 2, y - 5, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 2, y - 5, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 2, y - 5, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 2, y - 5, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 2, y - 5, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 2, y - 5, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 2, y - 5, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 2, y - 5, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 3, y + 0, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 3, y + 0, z + 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 3, y + 0, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 3, y + 0, z - 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 3, y + 0, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 3, y + 0, z + 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 3, y + 0, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 3, y + 0, z - 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 3, y - 0, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 3, y - 0, z + 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 3, y - 0, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x + 3, y - 0, z - 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 3, y - 0, z + 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 3, y - 0, z + 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 3, y - 0, z - 5))!= null)((ITileMultiBlock)world.getTileEntity(x - 3, y - 0, z - 5)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 3, y + 5, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 3, y + 5, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 3, y + 5, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 3, y + 5, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 3, y + 5, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 3, y + 5, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 3, y + 5, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 3, y + 5, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 3, y - 5, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 3, y - 5, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 3, y - 5, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 3, y - 5, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 3, y - 5, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 3, y - 5, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 3, y - 5, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 3, y - 5, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 4, y + 0, z + 4))!= null)((ITileMultiBlock)world.getTileEntity(x + 4, y + 0, z + 4)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 4, y + 0, z - 4))!= null)((ITileMultiBlock)world.getTileEntity(x + 4, y + 0, z - 4)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 4, y + 0, z + 4))!= null)((ITileMultiBlock)world.getTileEntity(x - 4, y + 0, z + 4)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 4, y + 0, z - 4))!= null)((ITileMultiBlock)world.getTileEntity(x - 4, y + 0, z - 4)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 4, y - 0, z + 4))!= null)((ITileMultiBlock)world.getTileEntity(x + 4, y - 0, z + 4)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 4, y - 0, z - 4))!= null)((ITileMultiBlock)world.getTileEntity(x + 4, y - 0, z - 4)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 4, y - 0, z + 4))!= null)((ITileMultiBlock)world.getTileEntity(x - 4, y - 0, z + 4)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 4, y - 0, z - 4))!= null)((ITileMultiBlock)world.getTileEntity(x - 4, y - 0, z - 4)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 4, y + 4, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 4, y + 4, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 4, y + 4, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 4, y + 4, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 4, y + 4, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 4, y + 4, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 4, y + 4, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 4, y + 4, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 4, y - 4, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 4, y - 4, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 4, y - 4, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 4, y - 4, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 4, y - 4, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 4, y - 4, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 4, y - 4, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 4, y - 4, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y + 0, z + 2))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y + 0, z + 2)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y + 0, z - 2))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y + 0, z - 2)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y + 0, z + 2))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y + 0, z + 2)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y + 0, z - 2))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y + 0, z - 2)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y - 0, z + 2))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y - 0, z + 2)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y - 0, z - 2))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y - 0, z - 2)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y - 0, z + 2))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y - 0, z + 2)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y - 0, z - 2))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y - 0, z - 2)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y + 0, z + 3))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y + 0, z + 3)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y + 0, z - 3))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y + 0, z - 3)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y + 0, z + 3))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y + 0, z + 3)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y + 0, z - 3))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y + 0, z - 3)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y - 0, z + 3))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y - 0, z + 3)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y - 0, z - 3))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y - 0, z - 3)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y - 0, z + 3))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y - 0, z + 3)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y - 0, z - 3))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y - 0, z - 3)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y + 2, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y + 2, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y + 2, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y + 2, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y + 2, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y + 2, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y + 2, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y + 2, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y - 2, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y - 2, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y - 2, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y - 2, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y - 2, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y - 2, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y - 2, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y - 2, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y + 3, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y + 3, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y + 3, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y + 3, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y + 3, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y + 3, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y + 3, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y + 3, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y - 3, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y - 3, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 5, y - 3, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 5, y - 3, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y - 3, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y - 3, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 5, y - 3, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 5, y - 3, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y + 0, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y + 0, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y + 0, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y + 0, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y + 0, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y + 0, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y + 0, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y + 0, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y - 0, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y - 0, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y - 0, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y - 0, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y - 0, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y - 0, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y - 0, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y - 0, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y + 0, z + 1))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y + 0, z + 1)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y + 0, z - 1))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y + 0, z - 1)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y + 0, z + 1))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y + 0, z + 1)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y + 0, z - 1))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y + 0, z - 1)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y - 0, z + 1))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y - 0, z + 1)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y - 0, z - 1))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y - 0, z - 1)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y - 0, z + 1))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y - 0, z + 1)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y - 0, z - 1))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y - 0, z - 1)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y + 1, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y + 1, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y + 1, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y + 1, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y + 1, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y + 1, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y + 1, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y + 1, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y - 1, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y - 1, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x + 6, y - 1, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x + 6, y - 1, z - 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y - 1, z + 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y - 1, z + 0)).disableMultiBlock();
		if(((ITileMultiBlock)world.getTileEntity(x - 6, y - 1, z - 0))!= null)((ITileMultiBlock)world.getTileEntity(x - 6, y - 1, z - 0)).disableMultiBlock();

	}

}
