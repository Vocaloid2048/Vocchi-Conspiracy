package com.voc2048;

import com.voc2048.utils.GlobalVariables;
import net.minecraftforge.fml.common.Mod;

@Mod(GlobalVariables.MOD_ID)
public class vocchi_conspiracy {

    public vocchi_conspiracy() {
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.

        // Use Forge to bootstrap the Common mod.
        GlobalVariables.LOG.info("Hello Forge world!");
        VocchiConspiracy.init();

    }
}
