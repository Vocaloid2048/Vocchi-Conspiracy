package com.voc2048.vocchi_conspiracy.mixin;

import com.voc2048.vocchi_conspiracy.utils.GlobalVariables;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MixinMinecraft {

    @Inject(at = @At("TAIL"), method = "<init>")
    private void init(CallbackInfo info) {
        GlobalVariables.LOG.info("This line is printed by the Vocchi Conspiracy common mixin!");
        GlobalVariables.LOG.info("MC Version: {}", Minecraft.getInstance().getVersionType());
    }
}
