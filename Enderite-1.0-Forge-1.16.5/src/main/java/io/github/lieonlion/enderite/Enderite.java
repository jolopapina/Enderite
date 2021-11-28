package io.github.lieonlion.enderite;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.lieonlion.enderite.core.init.BlockInit;
import io.github.lieonlion.enderite.core.init.ItemInit;

@Mod(Enderite.MODID)
public class Enderite
{
    public static final String MODID = "lolenderite";

    public Enderite() {
        
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
        
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	
    }
}
