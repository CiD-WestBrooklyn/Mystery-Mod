package com.CiD.MysteryMod.GUI;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

import org.lwjgl.opengl.GL11;

import com.CiD.MysteryMod.MysteryMain;
import com.CiD.MysteryMod.Player.ExtendedPlayer;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GUIexPlayer extends Gui
{
private Minecraft mc;

private static final ResourceLocation texturepath = new ResourceLocation(MysteryMain.MODID+":textures/gui/chi_bar.png");

public GUIexPlayer(Minecraft mc)
{
super();
this.mc = mc;
}

@SubscribeEvent(priority = EventPriority.NORMAL)
public void onRenderExperienceBar(RenderGameOverlayEvent event)
{

if (event.isCancelable() || event.type != ElementType.EXPERIENCE)
{
return;
}

	
	ExtendedPlayer props = ExtendedPlayer.get(this.mc.thePlayer);
	
	
	if (props == null || props.getMaxChi() == 0)
	{
	return;
	}
	
	int xPos = 2;
	int yPos = 2;
	
	GL11.glColor4f(1.0F, 1.0F, 1.0F,1.0F);
	
	GL11.glDisable(GL11.GL_LIGHTING);
	
	this.mc.getTextureManager().bindTexture(texturepath);
	
	
	this.drawTexturedModalRect(xPos, yPos, 0, 0, 200, 5);
	int maxChi = props.getMaxChi();
	int momChi = props.getChi();
	
	double percent = (100/maxChi*momChi);
	//int barW = (int) ((200/100)*percent);
	int barW = (int)(((float) props.getChi() / props.getMaxChi()) * 200);
	
	this.drawTexturedModalRect(xPos, yPos + 1, 0, 5, barW, 3);
	}
}