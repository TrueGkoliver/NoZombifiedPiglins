package com.gkoliver.nozombifiedpiglins;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("nozombifiedpiglins")
public class NoZombifiedPiglins {

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public NoZombifiedPiglins() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::commonSetup);
    }
    public void commonSetup(FMLCommonSetupEvent event) {
        //This doesn't do anything, but I'm pretty sure this is required to work.
    }
}
