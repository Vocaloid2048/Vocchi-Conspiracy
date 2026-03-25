package com.voc2048.vocchi_conspiracy;

import com.voc2048.vocchi_conspiracy.utils.GlobalVariables;
import net.fabricmc.api.ModInitializer;

public class vocchi_conspiracy implements ModInitializer {

    @Override
    public void onInitialize() {

        // This method is invoked by the Fabric mod loader when it is ready
        // to load your mod. You can access Fabric and Common code in this
        // project.

        // Use Fabric to bootstrap the Common mod.
        GlobalVariables.LOG.info("Hello Fabric world!");
        VocchiConspiracy.init();
    }
}
