package com.thexfactor117.losteclipse.proxies;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * 
 * @author TheXFactor117
 *
 */
public class ClientProxy extends CommonProxy
{
	public static KeyBinding bindingP;
	
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@Override
	public void init(FMLInitializationEvent event)
	{
		bindingP = new KeyBinding("Player Information", Keyboard.KEY_P, "Mine Hack Slash");
		
		ClientRegistry.registerKeyBinding(bindingP);
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}