package com.voc2048.vocchi_conspiracy.mixin;

import com.voc2048.vocchi_conspiracy.utils.GlobalVariables;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MixinTitleScreen {

    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        GlobalVariables.LOG.info("This line is printed by the Vocchi Conspiracy mixin from NeoForge!");
        GlobalVariables.LOG.info("MC Version: {}", Minecraft.getInstance().getVersionType());
    }
}
