package com.doraro.cosmocraft;

import com.doraro.cosmocraft.Referance.Referance;
import com.doraro.cosmocraft.proxy.IProxy;
import com.sun.tracing.dtrace.ModuleAttributes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Referance.Mod_ID, name=Referance.Mod_Name, version=Referance.Mod_Ver)
public class CosmoCraft {
	
	@Mod.Instance(Referance.Mod_ID)
	public static CosmoCraft instance;
	
	//Proxy
	@SidedProxy(clientSide = Referance.ClientProxy, serverSide = Referance.ServerProxy)
	public static IProxy proxy;
	
	
	
	//handle for Pre-Initialization phase
	@Mod.EventHandler
	public void PreInit(FMLPreInitializationEvent event) {
		
	}
	
	//handle for Initialization phase
	@Mod.EventHandler
	public void Initialization(FMLInitializationEvent event) {
		
	}
}
