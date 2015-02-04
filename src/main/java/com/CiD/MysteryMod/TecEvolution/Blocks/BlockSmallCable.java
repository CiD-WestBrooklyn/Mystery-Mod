package com.CiD.MysteryMod.TecEvolution.Blocks;

import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.CiD.MysteryMod.Blocks.BlockBase;
import com.CiD.MysteryMod.TecEvolution.TileEntity.TileEntityCable;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSmallCable extends BlockBase{

	public BlockSmallCable(Material material, Float hardness,
			 String BlockName) {
		super(material, hardness, TileEntityCable.class, BlockName);
		setLightOpacity(0);

		setLightLevel(0.1F);
		setBlockBounds(0.3F, 0.3F, 0.3F, 0.7F, 0.7F, 0.7F);
	
	}
//0 == down
//1 == up
//2 == MZ
//3 == Z
//4 == MX
//5 == X	

	@Override
	public boolean isOpaqueCube() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isNormalCube() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess p_149646_1_,
			int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void onBlockAdded(World world, int x,
			int y, int z) {
		world.markBlockRangeForRenderUpdate(x, y, z, x, y, z);
		world.markBlockForUpdate(x, y, z);
		world.markBlockForUpdate(x+1, y, z);
		world.markBlockForUpdate(x-1, y, z);
		world.markBlockForUpdate(x, y, z+1);
		world.markBlockForUpdate(x, y, z-1);
		world.markBlockForUpdate(x, y+1, z);
		world.markBlockForUpdate(x, y-1, z);

		super.onBlockAdded(world, x, y, z);
	}
	@Override
	public TileEntity createNewTileEntity(World world, int i) {
		TileEntityCable tl = new TileEntityCable();
		tl.ini(1, 1);
		return tl;
	}
}

