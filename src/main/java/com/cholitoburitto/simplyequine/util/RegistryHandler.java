package com.cholitoburitto.simplyequine.util;

import com.cholitoburitto.simplyequine.init.ModEntityTypes;
import com.cholitoburitto.simplyequine.items.ThoroughbredSpawnEggItem;
import com.cholitoburitto.simplyequine.simply_equine;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
@SuppressWarnings("unused")
public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, simply_equine.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    //rosettes
    public static final RegistryObject<Item> BLUE_ROSETTE = ITEMS.register("blue_rosette", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> RED_ROSETTE = ITEMS.register("red_rosette", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> YELLOW_ROSETTE = ITEMS.register("yellow_rosette", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> WHITE_ROSETTE = ITEMS.register("white_rosette", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> PURPLE_ROSETTE = ITEMS.register("purple_rosette", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> PINK_ROSETTE = ITEMS.register("pink_rosette", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_BLUE_ROSETTE = ITEMS.register("light_blue_rosette", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BROWN_ROSETTE = ITEMS.register("brown_rosette", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> CHAMPION_ROSETTE = ITEMS.register("champion_rosette", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> RESERVE_CHAMPION_ROSETTE = ITEMS.register("reserve_champion_rosette", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GRAY_ROSETTE = ITEMS.register("gray_rosette", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GREEN_ROSETTE = ITEMS.register("green_rosette", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));

    //hoof picks
    public static final RegistryObject<Item> BLUE_HOOF_PICK = ITEMS.register("blue_hoof_pick", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> RED_HOOF_PICK = ITEMS.register("red_hoof_pick", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> YELLOW_HOOF_PICK = ITEMS.register("yellow_hoof_pick", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> WHITE_HOOF_PICK = ITEMS.register("white_hoof_pick", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> PURPLE_HOOF_PICK = ITEMS.register("purple_hoof_pick", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> PINK_HOOF_PICK = ITEMS.register("pink_hoof_pick", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_BLUE_HOOF_PICK = ITEMS.register("light_blue_hoof_pick", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BROWN_HOOF_PICK = ITEMS.register("brown_hoof_pick", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> ORANGE_HOOF_PICK = ITEMS.register("orange_hoof_pick", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIME_GREEN_HOOF_PICK = ITEMS.register("lime_green_hoof_pick", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GRAY_HOOF_PICK = ITEMS.register("gray_hoof_pick", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GREEN_HOOF_PICK = ITEMS.register("green_hoof_pick", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> MAGENTA_HOOF_PICK = ITEMS.register("magenta_hoof_pick", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_GRAY_HOOF_PICK = ITEMS.register("light_gray_hoof_pick", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BLACK_HOOF_PICK = ITEMS.register("black_hoof_pick", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> CYAN_HOOF_PICK = ITEMS.register("cyan_hoof_pick", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));

    //rubber curry combs
    public static final RegistryObject<Item> BLUE_RUBBER_CURRY_COMB = ITEMS.register("blue_rubber_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> RED_RUBBER_CURRY_COMB = ITEMS.register("red_rubber_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> YELLOW_RUBBER_CURRY_COMB = ITEMS.register("yellow_rubber_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> WHITE_RUBBER_CURRY_COMB = ITEMS.register("white_rubber_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> PURPLE_RUBBER_CURRY_COMB = ITEMS.register("purple_rubber_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> PINK_RUBBER_CURRY_COMB = ITEMS.register("pink_rubber_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_BLUE_RUBBER_CURRY_COMB = ITEMS.register("light_blue_rubber_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BROWN_RUBBER_CURRY_COMB = ITEMS.register("brown_rubber_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> ORANGE_RUBBER_CURRY_COMB = ITEMS.register("orange_rubber_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIME_GREEN_RUBBER_CURRY_COMB = ITEMS.register("lime_green_rubber_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GRAY__RUBBER_CURRY_COMB = ITEMS.register("gray_rubber_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GREEN__RUBBER_CURRY_COMB = ITEMS.register("green_rubber_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> MAGENTA_RUBBER_CURRY_COMB = ITEMS.register("magenta_rubber_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_GRAY_RUBBER_CURRY_COMB = ITEMS.register("light_gray_rubber_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BLACK_RUBBER_CURRY_COMB = ITEMS.register("black_rubber_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> CYAN_RUBBER_CURRY_COMB = ITEMS.register("cyan_rubber_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));

    //metal curry combs
    public static final RegistryObject<Item> BLUE_METAL_CURRY_COMB = ITEMS.register("blue_metal_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> RED_METAL_CURRY_COMB = ITEMS.register("red_metal_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> YELLOW_METAL_CURRY_COMB = ITEMS.register("yellow_metal_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> WHITE_METAL_CURRY_COMB = ITEMS.register("white_metal_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> PURPLE_METAL_CURRY_COMB = ITEMS.register("purple_metal_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> PINK_METAL_CURRY_COMB = ITEMS.register("pink_metal_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_BLUE_METAL_CURRY_COMB = ITEMS.register("light_blue_metal_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BROWN_METAL_CURRY_COMB = ITEMS.register("brown_metal_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> ORANGE_METAL_CURRY_COMB = ITEMS.register("orange_metal_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIME_GREEN_METAL_CURRY_COMB = ITEMS.register("lime_green_metal_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GRAY_METAL_CURRY_COMB = ITEMS.register("gray_metal_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GREEN_METAL_CURRY_COMB = ITEMS.register("green_metal_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> MAGENTA_METAL_CURRY_COMB = ITEMS.register("magenta_metal_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_GRAY_METAL_CURRY_COMB = ITEMS.register("light_gray_metal_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BLACK_METAL_CURRY_COMB = ITEMS.register("black_metal_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> CYAN_METAL_CURRY_COMB = ITEMS.register("cyan_metal_curry_comb", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));

    //halters
    public static final RegistryObject<Item> BLUE_HALTER = ITEMS.register("blue_halter", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> RED_HALTER = ITEMS.register("red_halter", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> YELLOW_HALTER = ITEMS.register("yellow_halter", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> WHITE_HALTER = ITEMS.register("white_halter", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> PURPLE_HALTER = ITEMS.register("purple_halter", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> PINK_HALTER = ITEMS.register("pink_halter", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_BLUE_HALTER = ITEMS.register("light_blue_halter", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BROWN_HALTER = ITEMS.register("brown_halter", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> ORANGE_HALTER = ITEMS.register("orange_halter", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIME_GREEN_HALTER = ITEMS.register("lime_green_halter", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GRAY_HALTER = ITEMS.register("gray_halter", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GREEN_HALTER = ITEMS.register("green_halter", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> MAGENTA_HALTER = ITEMS.register("magenta_halter", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_GRAY_HALTER = ITEMS.register("light_gray_halter", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BLACK_HALTER = ITEMS.register("black_halter", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> CYAN_HALTER = ITEMS.register("cyan_halter", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));

    //leads
    public static final RegistryObject<Item> BLUE_LEAD = ITEMS.register("blue_lead", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> RED_LEAD = ITEMS.register("red_lead", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> YELLOW_LEAD = ITEMS.register("yellow_lead", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> WHITE_LEAD = ITEMS.register("white_lead", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> PURPLE_LEAD = ITEMS.register("purple_lead", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> PINK_LEAD = ITEMS.register("pink_lead", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_BLUE_LEAD = ITEMS.register("light_blue_lead", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BROWN_LEAD = ITEMS.register("brown_lead", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> ORANGE_LEAD = ITEMS.register("orange_lead", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIME_GREEN_LEAD = ITEMS.register("lime_green_lead", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GRAY_LEAD = ITEMS.register("gray_lead", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GREEN_LEAD = ITEMS.register("green_lead", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> MAGENTA_LEAD = ITEMS.register("magenta_lead", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_GRAY_LEAD = ITEMS.register("light_gray_lead", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BLACK_LEAD = ITEMS.register("black_lead", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> CYAN_LEAD = ITEMS.register("cyan_lead", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));

    //sponges
    public static final RegistryObject<Item> BLUE_SPONGE = ITEMS.register("blue_sponge", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> RED_SPONGE = ITEMS.register("red_sponge", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> YELLOW_SPONGE = ITEMS.register("yellow_sponge", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> WHITE_SPONGE = ITEMS.register("white_sponge", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> PURPLE_SPONGE = ITEMS.register("purple_sponge", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> PINK_SPONGE = ITEMS.register("pink_sponge", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_BLUE_SPONGE = ITEMS.register("light_blue_sponge", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BROWN_SPONGE = ITEMS.register("brown_sponge", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> ORANGE_SPONGE = ITEMS.register("orange_sponge", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIME_GREEN_SPONGE = ITEMS.register("lime_green_sponge", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GRAY_SPONGE = ITEMS.register("gray_sponge", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GREEN_SPONGE = ITEMS.register("green_sponge", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> MAGENTA_SPONGE = ITEMS.register("magenta_sponge", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_GRAY_SPONGE = ITEMS.register("light_gray_sponge", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BLACK_SPONGE = ITEMS.register("black_sponge", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> CYAN_SPONGE = ITEMS.register("cyan_sponge", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));

    //muckrakes
    public static final RegistryObject<Item> BLUE_MUCK_RAKE = ITEMS.register("blue_muck_rake", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> RED_MUCK_RAKE = ITEMS.register("red_muck_rake", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> YELLOW_MUCK_RAKE = ITEMS.register("yellow_muck_rake", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> WHITE_MUCK_RAKE = ITEMS.register("white_muck_rake", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> PURPLE_MUCK_RAKE = ITEMS.register("purple_muck_rake", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> PINK_MUCK_RAKE = ITEMS.register("pink_muck_rake", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_BLUE_MUCK_RAKE = ITEMS.register("light_blue_muck_rake", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BROWN_MUCK_RAKE = ITEMS.register("brown_muck_rake", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> ORANGE_MUCK_RAKE = ITEMS.register("orange_muck_rake", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIME_GREEN_MUCK_RAKE = ITEMS.register("lime_green_muck_rake", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GRAY_MUCK_RAKE = ITEMS.register("gray_muck_rake", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GREEN_MUCK_RAKE = ITEMS.register("green_muck_rake", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> MAGENTA_MUCK_RAKE = ITEMS.register("magenta_muck_rake", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_GRAY_MUCK_RAKE = ITEMS.register("light_gray_muck_rake", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BLACK_MUCK_RAKE = ITEMS.register("black_muck_rake", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> CYAN_MUCK_RAKE = ITEMS.register("cyan_muck_rake", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));

    //lunge lines
    public static final RegistryObject<Item> BLUE_LUNGE_LINE = ITEMS.register("blue_lunge_line", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> RED_LUNGE_LINE = ITEMS.register("red_lunge_line", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> YELLOW_LUNGE_LINE = ITEMS.register("yellow_lunge_line", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> WHITE_LUNGE_LINE = ITEMS.register("white_lunge_line", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> PURPLE_LUNGE_LINE = ITEMS.register("purple_lunge_line", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> PINK_LUNGE_LINE = ITEMS.register("pink_lunge_line", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_BLUE_LUNGE_LINE = ITEMS.register("light_blue_lunge_line", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BROWN_LUNGE_LINE = ITEMS.register("brown_lunge_line", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> ORANGE_LUNGE_LINE = ITEMS.register("orange_lunge_line", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIME_GREEN_LUNGE_LINE = ITEMS.register("lime_green_lunge_line", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GRAY_LUNGE_LINE = ITEMS.register("gray_lunge_line", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GREEN_LUNGE_LINE = ITEMS.register("green_lunge_line", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> MAGENTA_LUNGE_LINE = ITEMS.register("magenta_lunge_line", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_GRAY_LUNGE_LINE = ITEMS.register("light_gray_lunge_line", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BLACK_LUNGE_LINE = ITEMS.register("black_lunge_line", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> CYAN_LUNGE_LINE = ITEMS.register("cyan_lunge_line", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));

    //riding crops
    public static final RegistryObject<Item> BLACK_RIDING_CROP = ITEMS.register("black_riding_crop", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BROWN_RIDING_CROP = ITEMS.register("brown_riding_crop", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GRAY_RIDING_CROP = ITEMS.register("gray_riding_crop", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> DARK_BROWN_RIDING_CROP = ITEMS.register("dark_brown_riding_crop", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_GRAY_RIDING_CROP = ITEMS.register("light_gray_riding_crop", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_BROWN_RIDING_CROP = ITEMS.register("light_brown_riding_crop", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));

    //lunge whips
    public static final RegistryObject<Item> BLACK_LUNGE_WHIP = ITEMS.register("black_lunge_whip", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BROWN_LUNGE_WHIP = ITEMS.register("brown_lunge_whip", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GRAY_LUNGE_WHIP = ITEMS.register("gray_lunge_whip", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> DARK_BROWN_LUNGE_WHIP = ITEMS.register("dark_brown_lunge_whip", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_GRAY_LUNGE_WHIP = ITEMS.register("light_gray_lunge_whip", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_BROWN_LUNGE_WHIP = ITEMS.register("light_brown_lunge_whip", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));

    //driving whips
    public static final RegistryObject<Item> BLACK_DRIVING_WHIP = ITEMS.register("black_driving_whip", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BROWN_DRIVING_WHIP = ITEMS.register("brown_driving_whip", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GRAY_DRIVING_WHIP = ITEMS.register("gray_driving_whip", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> DARK_BROWN_DRIVING_WHIP = ITEMS.register("dark_brown_driving_whip", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_GRAY_DRIVING_WHIP = ITEMS.register("light_gray_driving_whip", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_BROWN_DRIVING_WHIP = ITEMS.register("light_brown_driving_whip", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));

    //wood muck rakes
    public static final RegistryObject<Item> OAK_MUCK_RAKE = ITEMS.register("oak_muck_rake", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> DARK_OAK_MUCK_RAKE = ITEMS.register("dark_oak_muck_rake", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> ACACIA_MUCK_RAKE = ITEMS.register("acacia_muck_rake", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BIRCH_MUCK_RAKE = ITEMS.register("birch_muck_rake", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> JUNGLE_MUCK_RAKE = ITEMS.register("jungle_muck_rake", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> SPRUCE_MUCK_RAKE = ITEMS.register("spruce_muck_rake", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));

    //dandy brushes
    public static final RegistryObject<Item> BLUE_DANDY_BRUSH = ITEMS.register("blue_dandy_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> RED_DANDY_BRUSH = ITEMS.register("red_dandy_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> YELLOW_DANDY_BRUSH = ITEMS.register("yellow_dandy_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> WHITE_DANDY_BRUSH = ITEMS.register("white_dandy_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> PURPLE_DANDY_BRUSH = ITEMS.register("purple_dandy_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> PINK_DANDY_BRUSH = ITEMS.register("pink_dandy_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_BLUE_DANDY_BRUSH = ITEMS.register("light_blue_dandy_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BROWN_DANDY_BRUSH = ITEMS.register("brown_dandy_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> ORANGE_DANDY_BRUSH = ITEMS.register("orange_dandy_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIME_GREEN_DANDY_BRUSH = ITEMS.register("lime_green_dandy_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GRAY_DANDY_BRUSH = ITEMS.register("gray_dandy_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GREEN_DANDY_BRUSH = ITEMS.register("green_dandy_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> MAGENTA_DANDY_BRUSH = ITEMS.register("magenta_dandy_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_GRAY_DANDY_BRUSH = ITEMS.register("light_gray_dandy_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BLACK_DANDY_BRUSH = ITEMS.register("black_dandy_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> CYAN_DANDY_BRUSH = ITEMS.register("cyan_dandy_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));

    //thatch
    public static final RegistryObject<Item> THATCH = ITEMS.register("thatch", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));

    //body brushes
    public static final RegistryObject<Item> BLUE_BODY_BRUSH = ITEMS.register("blue_body_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> RED_BODY_BRUSH = ITEMS.register("red_body_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> YELLOW_BODY_BRUSH = ITEMS.register("yellow_body_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> WHITE_BODY_BRUSH = ITEMS.register("white_body_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> PURPLE_BODY_BRUSH = ITEMS.register("purple_body_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> PINK_BODY_BRUSH = ITEMS.register("pink_body_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_BLUE_BODY_BRUSH = ITEMS.register("light_blue_body_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BROWN_BODY_BRUSH = ITEMS.register("brown_body_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> ORANGE_BODY_BRUSH = ITEMS.register("orange_body_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIME_GREEN_BODY_BRUSH = ITEMS.register("lime_green_body_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GRAY_BODY_BRUSH = ITEMS.register("gray_body_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> GREEN_BODY_BRUSH = ITEMS.register("green_body_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> MAGENTA_BODY_BRUSH = ITEMS.register("magenta_body_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> LIGHT_GRAY_BODY_BRUSH = ITEMS.register("light_gray_body_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> BLACK_BODY_BRUSH = ITEMS.register("black_body_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> CYAN_BODY_BRUSH = ITEMS.register("cyan_body_brush", () -> new Item(new Item.Properties().maxStackSize(32).group(simply_equine.EQUINE_ITEMS)));

    //block items
    public static final RegistryObject<Item> THATCH_BLOCK = ITEMS.register("thatch_block", () -> new BlockItem(ModBlocks.THATCH_BLOCK.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> THATCH_STAIRS = ITEMS.register("thatch_stairs", () -> new BlockItem(ModBlocks.THATCH_STAIRS.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> THATCH_SLABS = ITEMS.register("thatch_slabs", () -> new BlockItem(ModBlocks.THATCH_SLABS.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> SHAVINGS_BLOCK = ITEMS.register("shavings_block", () -> new BlockItem(ModBlocks.SHAVINGS_BLOCK.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item>  STALL_BARS_1 = ITEMS.register("stall_bars_1", () -> new com.cholitoburitto.simplyequine.blocks.BlockItemBase(ModBlocks.STALL_BARS_1.get()));
    public static final RegistryObject<Item>  OAK_STALL_DOOR = ITEMS.register("oak_stall_door", () -> new com.cholitoburitto.simplyequine.blocks.BlockItemBase(ModBlocks.OAK_STALL_DOOR.get()));
    public static final RegistryObject<Item>  SPRUCE_STALL_DOOR = ITEMS.register("spruce_stall_door", () -> new com.cholitoburitto.simplyequine.blocks.BlockItemBase(ModBlocks.SPRUCE_STALL_DOOR.get()));
    public static final RegistryObject<Item>  ACACIA_STALL_DOOR = ITEMS.register("acacia_stall_door", () -> new com.cholitoburitto.simplyequine.blocks.BlockItemBase(ModBlocks.ACACIA_STALL_DOOR.get()));
    public static final RegistryObject<Item>  JUNGLE_STALL_DOOR = ITEMS.register("jungle_stall_door", () -> new com.cholitoburitto.simplyequine.blocks.BlockItemBase(ModBlocks.JUNGLE_STALL_DOOR.get()));
    public static final RegistryObject<Item>  BIRCH_STALL_DOOR = ITEMS.register("birch_stall_door", () -> new com.cholitoburitto.simplyequine.blocks.BlockItemBase(ModBlocks.BIRCH_STALL_DOOR.get()));
    public static final RegistryObject<Item>  DARK_OAK_STALL_DOOR = ITEMS.register("dark_oak_stall_door", () -> new com.cholitoburitto.simplyequine.blocks.BlockItemBase(ModBlocks.DARK_OAK_STALL_DOOR.get()));

    //stall mats
    public static final RegistryObject<Item> BLACK_CROSSED_STALL_MAT = ITEMS.register("black_crossed_stall_mat", () -> new BlockItem(ModBlocks.BLACK_CROSSED_STALL_MAT.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> GRAY_CROSSED_STALL_MAT = ITEMS.register("gray_crossed_stall_mat", () -> new BlockItem(ModBlocks.GRAY_CROSSED_STALL_MAT.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> LIGHT_GRAY_CROSSED_STALL_MAT = ITEMS.register("light_gray_crossed_stall_mat", () -> new BlockItem(ModBlocks.LIGHT_GRAY_CROSSED_STALL_MAT.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> BLACK_SMOOTH_STALL_MAT = ITEMS.register("black_smooth_stall_mat", () -> new BlockItem(ModBlocks.BLACK_SMOOTH_STALL_MAT.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> GRAY_SMOOTH_STALL_MAT = ITEMS.register("gray_smooth_stall_mat", () -> new BlockItem(ModBlocks.GRAY_SMOOTH_STALL_MAT.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> LIGHT_GRAY_SMOOTH_STALL_MAT = ITEMS.register("light_gray_smooth_stall_mat", () -> new BlockItem(ModBlocks.LIGHT_GRAY_SMOOTH_STALL_MAT.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));

    //rubber
    public static final RegistryObject<Item> RUBBER_EXTRACTOR = ITEMS.register("rubber_extractor", () -> new Item(new Item.Properties().maxStackSize(1).group(simply_equine.EQUINE_ITEMS)));
    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber", () -> new Item(new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));

    //jump poles
    public static final RegistryObject<Item> BLACK_JUMP_POLE = ITEMS.register("black_jump_pole", () -> new BlockItem(ModBlocks.BLACK_JUMP_POLE.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> BLUE_JUMP_POLE = ITEMS.register("blue_jump_pole", () -> new BlockItem(ModBlocks.BLUE_JUMP_POLE.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> BROWN_JUMP_POLE = ITEMS.register("brown_jump_pole", () -> new BlockItem(ModBlocks.BROWN_JUMP_POLE.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> CYAN_JUMP_POLE = ITEMS.register("cyan_jump_pole", () -> new BlockItem(ModBlocks.CYAN_JUMP_POLE.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> GRAY_JUMP_POLE = ITEMS.register("gray_jump_pole", () -> new BlockItem(ModBlocks.GRAY_JUMP_POLE.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> GREEN_JUMP_POLE = ITEMS.register("green_jump_pole", () -> new BlockItem(ModBlocks.GREEN_JUMP_POLE.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> LIGHT_BLUE_JUMP_POLE = ITEMS.register("light_blue_jump_pole", () -> new BlockItem(ModBlocks.LIGHT_BLUE_JUMP_POLE.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> LIGHT_GRAY_JUMP_POLE = ITEMS.register("light_gray_jump_pole", () -> new BlockItem(ModBlocks.LIGHT_GRAY_JUMP_POLE.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> LIME_GREEN_JUMP_POLE = ITEMS.register("lime_green_jump_pole", () -> new BlockItem(ModBlocks.LIME_GREEN_JUMP_POLE.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> MAGENTA_JUMP_POLE = ITEMS.register("magenta_jump_pole", () -> new BlockItem(ModBlocks.MAGENTA_JUMP_POLE.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> ORANGE_JUMP_POLE = ITEMS.register("orange_jump_pole", () -> new BlockItem(ModBlocks.ORANGE_JUMP_POLE.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> PINK_JUMP_POLE = ITEMS.register("pink_jump_pole", () -> new BlockItem(ModBlocks.PINK_JUMP_POLE.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> PURPLE_JUMP_POLE = ITEMS.register("purple_jump_pole", () -> new BlockItem(ModBlocks.PURPLE_JUMP_POLE.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> RED_JUMP_POLE = ITEMS.register("red_jump_pole", () -> new BlockItem(ModBlocks.RED_JUMP_POLE.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> WHITE_JUMP_POLE = ITEMS.register("white_jump_pole", () -> new BlockItem(ModBlocks.WHITE_JUMP_POLE.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));
    public static final RegistryObject<Item> YELLOW_JUMP_POLE = ITEMS.register("yellow_jump_pole", () -> new BlockItem(ModBlocks.YELLOW_JUMP_POLE.get(), new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_BLOCKS)));

    //spawn eggs
    public static final RegistryObject<ThoroughbredSpawnEggItem> THOROUGHBRED_SPAWN_EGG = ITEMS.register("thoroughbred_spawn_egg", () -> new ThoroughbredSpawnEggItem(ModEntityTypes.THOROUGHBRED_ENTITY, 0x000000, 0x5B3200, new Item.Properties().maxStackSize(64).group(simply_equine.EQUINE_ITEMS)));
}


