package com.cholitoburitto.simplyequine;

import com.cholitoburitto.simplyequine.init.ModEntityTypes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import com.cholitoburitto.simplyequine.util.GroomingTools;
import com.cholitoburitto.simplyequine.util.ModBlocks;
import com.cholitoburitto.simplyequine.util.RegistryHandler;


/**
 * The main class of the mod, this is the class that looks like a mod to forge.
 */

@Mod(simply_equine.MOD_ID)
public class simply_equine {


    /**
     * The modid of this mod, this has to match the modid in the mods.toml and has to be in the format defined in {@link net.minecraftforge.fml.loading.moddiscovery.ModInfo}
     */

    public static final String MOD_ID = "simply_equine";
    public static final ItemGroup EQUINE_ITEMS = new ItemGroup("Equine_Items") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.BLUE_ROSETTE.get());
        }

        public boolean hasSearchBar() {
            return true;

        }

    };

    public static final ItemGroup EQUINE_BLOCKS = new ItemGroup("Equine_Blocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.THATCH_BLOCK.get());
        }

        public boolean hasSearchBar() {
            return true;

        }


    };

    public simply_equine() {
        RegistryHandler.ITEMS.register(FMLJavaModLoadingContext.get().

                getModEventBus());
        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().

                getModEventBus());
        ModEntityTypes.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().

                getModEventBus());
        MinecraftForge.EVENT_BUS.register(GroomingTools .class);



        // invoked by forge due to @Mod
        {
            // mod bus has modloading init events and registry events
            IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
            // forge bus is for server starting events and in-game events
            IEventBus forgeBus = MinecraftForge.EVENT_BUS;

            if (FMLEnvironment.dist == Dist.CLIENT)
            {
                ClientEvents.subscribeClientEvents(modBus, forgeBus);
            }

            // add listeners to mod bus and forge bus, register deferred registers to mod bus

            // add listeners to clientjar events separately
            if (FMLEnvironment.dist == Dist.CLIENT) {
                ClientEvents.subscribeClientEvents(modBus, forgeBus);
            }
        }

    }
}