package com.doraro.cosmocraft.Blocks;

import com.doraro.cosmocraft.items.ItemNames;
import net.minecraft.block.material.Material;

public class BlockFurnace extends BlockCosmoCraft{
	public BlockFurnace(){
		super(Material.iron);
		this.setBlockName(ItemNames.BlockNameFurnace);
		this.setBlockTextureName(ItemNames.BlockNameFurnace);
		this.setHardness(3.5F);
		this.setStepSound(soundTypeAnvil);
	}

}
