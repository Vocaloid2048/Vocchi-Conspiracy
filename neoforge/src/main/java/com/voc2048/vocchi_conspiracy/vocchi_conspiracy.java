package com.voc2048.vocchi_conspiracy;


import com.voc2048.vocchi_conspiracy.utils.GlobalVariables;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(GlobalVariables.MOD_ID)
public class vocchi_conspiracy {

    public vocchi_conspiracy(IEventBus eventBus) {
        // This method is invoked by the NeoForge mod loader when it is ready
        // to load your mod. You can access NeoForge and Common code in this
        // project.

        // Use NeoForge to bootstrap the Common mod.
        GlobalVariables.LOG.info("Hello NeoForge world!");
        VocchiConspiracy.init();
    }
}
