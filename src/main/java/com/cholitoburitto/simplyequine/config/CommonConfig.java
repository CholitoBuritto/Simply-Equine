package com.cholitoburitto.simplyequine.config;


import com.cholitoburitto.simplyequine.simply_equine;
import net.minecraftforge.common.ForgeConfigSpec;

final class CommonConfig {
    final ForgeConfigSpec.BooleanValue enablePowderLayers;

    CommonConfig(final ForgeConfigSpec.Builder builder) {
        builder.push("general");
        enablePowderLayers = builder
                .comment("Enable concrete powder layers")
                .translation(simply_equine.MOD_ID + ".config.enablePowderLayers")
                .define("enablePowderLayers", true);
        builder.pop();
    }
}
