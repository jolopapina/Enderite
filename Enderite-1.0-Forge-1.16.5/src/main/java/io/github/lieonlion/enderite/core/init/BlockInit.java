package io.github.lieonlion.enderite.core.init;

import io.github.lieonlion.enderite.Enderite;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class BlockInit 
{
	private BlockInit() {}
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Enderite.MODID);

	public static final RegistryObject<Block> ENDERITE_BLOCK = BLOCKS.register("enderite_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_MAGENTA)
			.harvestTool(ToolType.PICKAXE).harvestLevel(4).requiresCorrectToolForDrops()
			.requiresCorrectToolForDrops().strength(60.0F, 1300.0F)));
	
	public static final RegistryObject<Block> ENDERITE_ORE = BLOCKS.register("enderite_ore", 
			() -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_MAGENTA)
			.harvestTool(ToolType.PICKAXE).harvestLevel(4).requiresCorrectToolForDrops()
			.requiresCorrectToolForDrops().strength(35.0F, 1000.0F)));
}