package com.cholitoburitto.simplyequine.config;

import net.minecraftforge.fml.config.ModConfig;

public final class ConfigHelper {
    private static ModConfig commonConfig;

    public static void bakeCommon(final ModConfig config) {
        commonConfig = config;

        TutorialConfig.enablePowderLayers = ConfigHolder.COMMON.enablePowderLayers.get();
    }

    public static void setValueAndSave(final ModConfig modConfig, final String path, final Object newValue) {
        modConfig.getConfigData().set(path, newValue);
        modConfig.save();
    }
}
