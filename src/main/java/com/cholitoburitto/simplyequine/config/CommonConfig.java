package com.cholitoburitto.simplyequine.config;

import com.cholitoburitto.simplyequine.simply_equine;
import net.minecraftforge.common.ForgeConfigSpec;

final class CommonConfig {
    final ForgeConfigSpec.BooleanValue enableLayers;

    CommonConfig(final ForgeConfigSpec.Builder builder) {
        builder.push("general");
        enableLayers = builder
                .comment("Enable Layers")
                .translation(simply_equine.MOD_ID + ".config.enableLayers")
                .define("enableLayers", true);
        builder.pop();
    }
}
