package com.CiD.MysteryMod.TecEvolution.Factory.MultiBlock;

public interface ITileMultiBlock {

	/** Called when it should turn into a MultiBlock*/
	public void setTileInMultiblockForm();
	
	public void disableMultiBlock();
	
	public boolean isInterface();
	
	public int getGUIid();
	
	
	public boolean isHull();

}
