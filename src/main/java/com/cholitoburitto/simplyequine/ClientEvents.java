package com.cholitoburitto.simplyequine;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import util.ModBlocks;

public class ClientEvents {
    public static void subscribeClientEvents(IEventBus modBus, IEventBus forgeBus) {
        // subscribe client-only events
        // client-only classes like Minecraft can be safely referred to in this class
        modBus.addListener(ClientEvents::onClientSetup);
    }

    public static void onClientSetup(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(ModBlocks.STALL_BARS_1.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_STALL_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_STALL_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_STALL_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_STALL_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_STALL_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_STALL_DOOR.get(), RenderType.getCutout());

    }


}

