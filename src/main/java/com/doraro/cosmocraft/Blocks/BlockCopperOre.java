package com.doraro.cosmocraft.Blocks;

import com.doraro.cosmocraft.items.ItemNames;

import net.minecraft.block.material.Material;

public class BlockCopperOre extends BlockCosmoCraft{
	public BlockCopperOre(){
		super(Material.rock);
		this.setBlockName(ItemNames.BlockNameCopperOre);
		this.setBlockTextureName(ItemNames.BlockNameCopperOre);
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 1);
	}

}
