package io.github.lieonlion.enderite.core.init;

import io.github.lieonlion.enderite.Enderite;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class BlockInit {
	private BlockInit() {}
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Enderite.MODID);
	
	public static final RegistryObject<Block> ENDERITE_BLOCK = BLOCKS.register("enderite_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_MAGENTA).requiresCorrectToolForDrops().strength(60.0F, 1300.0F)));
	public static final RegistryObject<Block> ENDERITE_ORE = BLOCKS.register("enderite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_MAGENTA).requiresCorrectToolForDrops().strength(35.0F, 1000.0F)));
}