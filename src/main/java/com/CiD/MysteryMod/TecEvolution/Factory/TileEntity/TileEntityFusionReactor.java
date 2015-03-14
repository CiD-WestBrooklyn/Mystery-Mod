package com.CiD.MysteryMod.TecEvolution.Factory.TileEntity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fluids.IFluidHandler;

import com.CiD.MysteryMod.GUIHandler;
import com.CiD.MysteryMod.TecEvolution.Tank;
import com.CiD.MysteryMod.TecEvolution.Factory.MultiBlock.MultiBlockType;
import com.CiD.MysteryMod.TecEvolution.TileEntity.IRGBcoloredTile;

public class TileEntityFusionReactor extends TileEntityFactoryBase implements ISidedInventory, IRGBcoloredTile, IFluidHandler{
	public final Tank tank = new Tank("fusion_tank", FluidContainerRegistry.BUCKET_VOLUME * 32, this);

	@Override
	public void setTileInMultiblockForm() {
		isMultiBlock = true;
	}
	
	@Override
	public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {

		return true;
	}
	
	@Override
	public void disableMultiBlock() {

		isMultiBlock = false;
	}
	
	@Override
	public MultiBlockType getType() {
		
		return MultiBlockType.FusionReactor;
	}
	@Override
	public boolean isInterface() {

		return true;
	}

	@Override
	public int getGUIid() {

		return GUIHandler.FUISON_REACTOR_GUI_ID;
	}

	@Override
	public boolean isHull() {

		return false;
	}

	
	
	
	
	@Override
	public int fill(ForgeDirection from, FluidStack resource, boolean doFill) {

		return 0;
	}

	@Override
	public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) {

		return null;
	}

	@Override
	public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) {

		return null;
	}

	@Override
	public boolean canFill(ForgeDirection from, Fluid fluid) {

		return false;
	}

	@Override
	public boolean canDrain(ForgeDirection from, Fluid fluid) {

		return true;
	}

	@Override
	public FluidTankInfo[] getTankInfo(ForgeDirection from) {

		return null;
	}

}
