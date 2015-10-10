package com.doraro.cosmocraft;

import com.doraro.cosmocraft.Reference.Reference;
import com.doraro.cosmocraft.Utility.LogHelper;
import com.doraro.cosmocraft.client.gui.GuiFactory;
import com.doraro.cosmocraft.handlers.ConfigurationHandler;
import com.doraro.cosmocraft.init.ModBlock;
import com.doraro.cosmocraft.init.ModItems;
import com.doraro.cosmocraft.proxy.IProxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import sun.rmi.log.LogHandler;

@cpw.mods.fml.common.Mod(modid=Reference.Mod_ID, name=Reference.Mod_Name, version=Reference.Mod_Ver, guiFactory = Reference.GUI_Factory_Class)
public class CosmoCraft {
	
	@Mod.Instance(Reference.Mod_ID)
	public static CosmoCraft instance;
	
	//Proxy
	@SidedProxy(clientSide = Reference.ClientProxy, serverSide = Reference.ServerProxy)
	public static IProxy proxy;
	
	
	
	//handle for Pre-Initialization phase
	@Mod.EventHandler
	public void PreInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		LogHelper.info("Pre Initialization Compleat!");
		//Initialize items
		ModItems.init();
		
		//Initialize Blocks
		ModBlock.init();
	}
	
	//handle for Initialization phase
	@Mod.EventHandler
	public void Initialization(FMLInitializationEvent event) {
		LogHelper.info("Initialization Compleat!");
		
	}
}
