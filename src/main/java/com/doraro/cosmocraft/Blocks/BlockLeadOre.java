package com.doraro.cosmocraft.Blocks;

import javax.tools.Tool;

import com.doraro.cosmocraft.items.ItemNames;

import net.minecraft.block.material.Material;

public class BlockLeadOre extends BlockCosmoCraft{
	public BlockLeadOre(){
		super(Material.rock);
		this.setBlockName(ItemNames.BlockNameLeadOre);
		this.setBlockTextureName(ItemNames.BlockNameLeadOre);
		this.setHardness(3.5F);
		this.setHarvestLevel("pickaxe", 2);
	}
	

}
