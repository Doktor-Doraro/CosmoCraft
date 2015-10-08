package com.doraro.cosmocraft;

import com.sun.tracing.dtrace.ModuleAttributes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="CosmoCraft-core", name="CosmoCraft", version="1.8-0.0.1")
public class CosmoCraft {
	
	@Mod.Instance("CosmoCraft")
	public static CosmoCraft instance;
	
	//handle for Pre-Initialization phase
	@Mod.EventHandler
	public void PreInit(FMLPreInitializationEvent event) {
		
	}
	
	//handle for Initialization phase
	@Mod.EventHandler
	public void Initialization(FMLInitializationEvent event) {
		
	}
}
