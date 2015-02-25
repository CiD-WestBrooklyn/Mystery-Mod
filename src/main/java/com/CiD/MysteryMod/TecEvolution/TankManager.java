package com.CiD.MysteryMod.TecEvolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.collect.ForwardingList;

import io.netty.buffer.ByteBuf;

import net.minecraft.nbt.NBTTagCompound;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fluids.IFluidHandler;

public class TankManager<T extends Tank> extends ForwardingList<T> implements IFluidHandler, List<T> {

	private List<T> tanks = new ArrayList<T>();

	public TankManager() {
	}

	public TankManager(T... tanks) {
		addAll(Arrays.asList(tanks));
	}

	@Override
	protected List<T> delegate() {
		return tanks;
	}

	@Override
	public int fill(ForgeDirection from, FluidStack resource, boolean doFill) {
		for (Tank tank : tanks) {
			int used = tank.fill(resource, doFill);
			if (used > 0) {
				return used;
			}
		}
		return 0;
	}

	@Override
	public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) {
		if (resource == null) {
			return null;
		}
		for (Tank tank : tanks) {
			if (!resource.isFluidEqual(tank.getFluid())) {
				continue;
			}
			FluidStack drained = tank.drain(resource.amount, doDrain);
			if (drained != null && drained.amount > 0) {
				return drained;
			}
		}
		return null;
	}

	@Override
	public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) {
		for (Tank tank : tanks) {
			FluidStack drained = tank.drain(maxDrain, doDrain);
			if (drained != null && drained.amount > 0) {
				return drained;
			}
		}
		return null;
	}

	@Override
	public boolean canFill(ForgeDirection from, Fluid fluid) {
		return true;
	}

	@Override
	public boolean canDrain(ForgeDirection from, Fluid fluid) {
		return true;
	}

	@Override
	public FluidTankInfo[] getTankInfo(ForgeDirection from) {
		FluidTankInfo[] info = new FluidTankInfo[size()];
		for (int i = 0; i < size(); i++) {
			info[i] = get(i).getInfo();
		}
		return info;
	}

	public void writeToNBT(NBTTagCompound data) {
		for (Tank tank : tanks) {
			tank.writeToNBT(data);
		}
	}

	public void readFromNBT(NBTTagCompound data) {
		for (Tank tank : tanks) {
			tank.readFromNBT(data);
		}
	}

	public void writeData(ByteBuf data) {
		for (Tank tank : tanks) {
			FluidStack fluidStack = tank.getFluid();
			if (fluidStack != null && fluidStack.getFluid() != null) {
				data.writeShort(fluidStack.getFluid().getID());
				data.writeInt(fluidStack.amount);
				data.writeInt(fluidStack.getFluid().getColor(fluidStack));
			} else {
				data.writeShort(-1);
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public void readData(ByteBuf data) {
		for (Tank tank : tanks) {
			int fluidId = data.readShort();
			if (fluidId > 0) {
				tank.setFluid(new FluidStack(fluidId, data.readInt()));
				tank.colorRenderCache = data.readInt();
			} else {
				tank.setFluid(null);
				tank.colorRenderCache = 0xFFFFFF;
			}
		}
	}
}