package io.github.lieonlion.enderite.core.event;

import java.util.List;
import java.util.function.Supplier;

import io.github.lieonlion.enderite.Enderite;
import io.github.lieonlion.enderite.core.world.OreGeneration;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Enderite.MODID, bus = Bus.FORGE)
public class CommonForgeEvents {
	 @SubscribeEvent(priority = EventPriority.HIGHEST)
	    public static void biomeLoading(BiomeLoadingEvent event) {
	        final List<Supplier<PlacedFeature>> features = event.getGeneration().getFeatures(Decoration.UNDERGROUND_ORES);

	        switch (event.getCategory()) {
	            default -> OreGeneration.END_ORES.forEach(ore -> features.add(() -> ore));
		  }
	 }
}