package com.doraro.cosmocraft.init;

import com.doraro.cosmocraft.Blocks.BlockCopperOre;
import com.doraro.cosmocraft.Blocks.BlockCosmoCraft;
import com.doraro.cosmocraft.Blocks.BlockFurnace;
import com.doraro.cosmocraft.Blocks.BlockLeadOre;
import com.doraro.cosmocraft.Reference.Reference;
import com.doraro.cosmocraft.items.ItemNames;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.GUI_Factory_Class)
public class ModBlock {
	
	public static final BlockCosmoCraft furnace = new BlockFurnace();
	public static final BlockCosmoCraft leadore = new BlockLeadOre();
	public static final BlockCosmoCraft copperore = new BlockCopperOre();
	
	//register blocks
	public static void init(){
		GameRegistry.registerBlock(furnace, ItemNames.BlockNameFurnace);
		GameRegistry.registerBlock(leadore, ItemNames.BlockNameLeadOre);
		GameRegistry.registerBlock(copperore, ItemNames.BlockNameCopperOre);
	}

}
