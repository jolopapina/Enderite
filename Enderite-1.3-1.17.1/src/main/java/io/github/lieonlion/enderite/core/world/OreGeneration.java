package io.github.lieonlion.enderite.core.world;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import io.github.lieonlion.enderite.Enderite;
import io.github.lieonlion.enderite.core.init.BlockInit;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class OreGeneration {

	public static final RuleTest END_TEST = new BlockMatchTest(Blocks.END_STONE);
	
	public static final List<ConfiguredFeature<?, ?>> END_ORES = new ArrayList<>();

	public static void registerOres() {
		ConfiguredFeature<?, ?> enderiteOre = Feature.ORE.configured(new OreConfiguration(List.of(OreConfiguration.target(END_TEST, BlockInit.ENDERITE_ORE.get().defaultBlockState())), 3)).rangeUniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(20)).squared().count(2);
		END_ORES.add(register("enderite_ore_gen", enderiteOre));
	}
	
	private static <Config extends FeatureConfiguration> ConfiguredFeature<Config, ?> register(String name,
            ConfiguredFeature<Config, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(Enderite.MODID, name),
                configuredFeature);
    }
	
	@Mod.EventBusSubscriber(modid = Enderite.MODID, bus = Bus.FORGE)
    public static class ForgeBusSubscriber {
        @SubscribeEvent
        public static void biomeLoading(BiomeLoadingEvent event) {
            List<Supplier<ConfiguredFeature<?, ?>>> features = event.getGeneration()
                    .getFeatures(Decoration.UNDERGROUND_ORES);

            switch(event.getCategory()) {
                default -> OreGeneration.END_ORES.forEach(ore -> features.add(() -> ore));
            }
        }
    }
}