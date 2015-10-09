package com.doraro.cosmocraft.handlers;

import java.io.File;

import com.doraro.cosmocraft.Reference.Reference;
import com.doraro.cosmocraft.Reference.worldGeneration;
import com.doraro.cosmocraft.Utility.LogHelper;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	public static Configuration configuration;
	public static void init(File configFile){
		if (configuration == null){
			configuration = new Configuration(configFile);
			loadConfigurationFile();
		}
	}
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
		if(event.modID.equalsIgnoreCase(Reference.Mod_ID)){
			//resync the configuration file
			LogHelper.info("The config file was changed and will now be updated.");
			loadConfigurationFile();
		}
	}
	private static void loadConfigurationFile(){
		worldGeneration.oreLeadGen = configuration.getBoolean("oreLeadGeneration", "World Generation", true, "Should Lead be generated in the Overworld?");
		worldGeneration.oreCopperGen = configuration.getBoolean("oreCopperGeneration", "World Generation", true, "Should Copper be generated in the Overworld?");
		worldGeneration.liquidOilGen = configuration.getBoolean("liquidOilGeneration", "World Generation", true, "Should Oil be generated in the Overworld?");
			//save the config if there where any changes
		if (configuration.hasChanged()){
			LogHelper.info("Saving Config File.");
			configuration.save();	
		}		
	}	
}