package com.doraro.cosmocraft.init;

import com.doraro.cosmocraft.items.ItemCosmoCraft;
import com.doraro.cosmocraft.items.ItemNames;
import com.doraro.cosmocraft.items.ItemWrench;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems {
	
	public static final ItemCosmoCraft wrench = new ItemWrench();
	
	//Register Items
	public static void init() {
		GameRegistry.registerItem(wrench, ItemNames.ItemWrenchName);
	}
}

