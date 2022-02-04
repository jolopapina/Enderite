package io.github.lieonlion.enderite.core.world;

import java.util.ArrayList;
import java.util.List;

import io.github.lieonlion.enderite.core.init.BlockInit;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

public class OreGeneration {	
	public static final List<PlacedFeature> END_ORES = new ArrayList<>();
	public static final RuleTest END_TEST = new BlockMatchTest(Blocks.END_STONE);
	
	public static void registerOres() {		
		final ConfiguredFeature<?, ?> enderiteOre = FeatureUtils.register("enderite_ore", Feature.ORE.configured(new OreConfiguration(List.of(OreConfiguration.target(END_TEST, BlockInit.ENDERITE_ORE.get().defaultBlockState())), 3)));
		final PlacedFeature placedEnderiteOre = PlacementUtils.register("enderite_ore", enderiteOre.placed(HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(20)), InSquarePlacement.spread(), CountPlacement.of(2)));
		END_ORES.add(placedEnderiteOre);
	}
}