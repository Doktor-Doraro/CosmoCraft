package com.doraro.cosmocraft.init;

import com.doraro.cosmocraft.items.ItemCosmoCraft;
import com.doraro.cosmocraft.items.ItemNames;
import com.doraro.cosmocraft.items.ItemWrench;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static final ItemCosmoCraft wrench = new ItemWrench();
	
	//Register Items
	public static void init() {
		GameRegistry.registerItem(wrench, ItemNames.ItemWrenchName);
	}
}

