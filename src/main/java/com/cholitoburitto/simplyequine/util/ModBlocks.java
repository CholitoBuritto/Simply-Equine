package com.cholitoburitto.simplyequine.util;

import com.cholitoburitto.simplyequine.blocks.*;
import com.cholitoburitto.simplyequine.blocks.doors.OakStallDoor;
import com.cholitoburitto.simplyequine.simply_equine;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
@SuppressWarnings({"WeakerAccess", "unused"})
public class ModBlocks {
    //blocks
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, simply_equine.MOD_ID);
    public static final RegistryObject<Block> THATCH_BLOCK = BLOCKS.register("thatch_block", () -> new Block(Block.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.5F,0.5F)));
    public static final RegistryObject<Block> THATCH_STAIRS = BLOCKS.register("thatch_stairs", () -> new StairsBlock(() -> ModBlocks.THATCH_BLOCK.get().getDefaultState() , Block.Properties.from(ModBlocks.THATCH_BLOCK.get())));
    public static final RegistryObject<Block> THATCH_SLABS = BLOCKS.register("thatch_slabs", () -> new SlabBlock(Block.Properties.from(ModBlocks.THATCH_BLOCK.get())));
    public static final RegistryObject<Block> SHAVINGS_BLOCK = BLOCKS.register("shavings_block", ShavingsBlockLayers::new);
    public static final RegistryObject<Block> STALL_BARS_1 = BLOCKS.register("stall_bars_1", () -> new com.cholitoburitto.simplyequine.blocks.BlockBarsBase(Block.Properties.create(Material.IRON)));

    //stall mats
    public static final RegistryObject<Block> BLACK_CROSSED_STALL_MAT = BLOCKS.register("black_crossed_stall_mat", () -> new Block(Block.Properties.create(Material.CLAY)));
    public static final RegistryObject<Block> GRAY_CROSSED_STALL_MAT = BLOCKS.register("gray_crossed_stall_mat", () -> new Block(Block.Properties.create(Material.CLAY)));
    public static final RegistryObject<Block> LIGHT_GRAY_CROSSED_STALL_MAT = BLOCKS.register("light_gray_crossed_stall_mat", () -> new Block(Block.Properties.create(Material.CLAY)));
    public static final RegistryObject<Block> BLACK_SMOOTH_STALL_MAT = BLOCKS.register("black_smooth_stall_mat", () -> new Block(Block.Properties.create(Material.CLAY)));
    public static final RegistryObject<Block> GRAY_SMOOTH_STALL_MAT = BLOCKS.register("gray_smooth_stall_mat", () -> new Block(Block.Properties.create(Material.CLAY)));
    public static final RegistryObject<Block> LIGHT_GRAY_SMOOTH_STALL_MAT = BLOCKS.register("light_gray_smooth_stall_mat", () -> new Block(Block.Properties.create(Material.CLAY)));
    public static final RegistryObject<Block> OAK_STALL_DOOR = BLOCKS.register("oak_stall_door",() -> new OakStallDoor(Block.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> BIRCH_STALL_DOOR = BLOCKS.register("birch_stall_door",() -> new OakStallDoor(Block.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> SPRUCE_STALL_DOOR = BLOCKS.register("spruce_stall_door",() -> new OakStallDoor(Block.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> DARK_OAK_STALL_DOOR = BLOCKS.register("dark_oak_stall_door",() -> new OakStallDoor(Block.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> ACACIA_STALL_DOOR = BLOCKS.register("acacia_stall_door",() -> new OakStallDoor(Block.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> JUNGLE_STALL_DOOR = BLOCKS.register("jungle_stall_door",() -> new OakStallDoor(Block.Properties.from(Blocks.OAK_DOOR)));

    //jump poles
    public static final RegistryObject<Block> BLACK_JUMP_POLE = BLOCKS.register("black_jump_pole", () -> new JumpPoles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLUE_JUMP_POLE = BLOCKS.register("blue_jump_pole", () -> new JumpPoles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BROWN_JUMP_POLE = BLOCKS.register("brown_jump_pole", () -> new JumpPoles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CYAN_JUMP_POLE = BLOCKS.register("cyan_jump_pole", () -> new JumpPoles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GRAY_JUMP_POLE = BLOCKS.register("gray_jump_pole", () -> new JumpPoles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREEN_JUMP_POLE = BLOCKS.register("green_jump_pole", () -> new JumpPoles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_BLUE_JUMP_POLE = BLOCKS.register("light_blue_jump_pole", () -> new JumpPoles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_GRAY_JUMP_POLE = BLOCKS.register("light_gray_jump_pole", () -> new JumpPoles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIME_GREEN_JUMP_POLE = BLOCKS.register("lime_green_jump_pole", () -> new JumpPoles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAGENTA_JUMP_POLE = BLOCKS.register("magenta_jump_pole", () -> new JumpPoles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ORANGE_JUMP_POLE = BLOCKS.register("orange_jump_pole", () -> new JumpPoles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINK_JUMP_POLE = BLOCKS.register("pink_jump_pole", () -> new JumpPoles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PURPLE_JUMP_POLE = BLOCKS.register("purple_jump_pole", () -> new JumpPoles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RED_JUMP_POLE = BLOCKS.register("red_jump_pole", () -> new JumpPoles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WHITE_JUMP_POLE = BLOCKS.register("white_jump_pole", () -> new JumpPoles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> YELLOW_JUMP_POLE = BLOCKS.register("yellow_jump_pole", () -> new JumpPoles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));

    //poles
    public static final RegistryObject<Block> BLACK_POLE = BLOCKS.register("black_pole", () -> new Poles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLUE_POLE = BLOCKS.register("blue_pole", () -> new Poles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BROWN_POLE = BLOCKS.register("brown_pole", () -> new Poles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CYAN_POLE = BLOCKS.register("cyan_pole", () -> new Poles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GRAY_POLE = BLOCKS.register("gray_pole", () -> new Poles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREEN_POLE = BLOCKS.register("green_pole", () -> new Poles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_BLUE_POLE = BLOCKS.register("light_blue_pole", () -> new Poles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_GRAY_POLE = BLOCKS.register("light_gray_pole", () -> new Poles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIME_GREEN_POLE = BLOCKS.register("lime_green_pole", () -> new Poles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAGENTA_POLE = BLOCKS.register("magenta_pole", () -> new Poles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ORANGE_POLE = BLOCKS.register("orange_pole", () -> new Poles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINK_POLE = BLOCKS.register("pink_pole", () -> new Poles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PURPLE_POLE = BLOCKS.register("purple_pole", () -> new Poles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RED_POLE = BLOCKS.register("red_pole", () -> new Poles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WHITE_POLE = BLOCKS.register("white_pole", () -> new Poles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> YELLOW_POLE = BLOCKS.register("yellow_pole", () -> new Poles(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));

    //jump standard
    public static final RegistryObject<Block> BLACK_JUMP_STANDARD = BLOCKS.register("black_jump_standard", () -> new JumpStandard(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLUE_JUMP_STANDARD = BLOCKS.register("blue_jump_standard", () -> new JumpStandard(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BROWN_JUMP_STANDARD = BLOCKS.register("brown_jump_standard", () -> new JumpStandard(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CYAN_JUMP_STANDARD = BLOCKS.register("cyan_jump_standard", () -> new JumpStandard(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GRAY_JUMP_STANDARD = BLOCKS.register("gray_jump_standard", () -> new JumpStandard(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREEN_JUMP_STANDARD = BLOCKS.register("green_jump_standard", () -> new JumpStandard(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_BLUE_JUMP_STANDARD = BLOCKS.register("light_blue_jump_standard", () -> new JumpStandard(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_GRAY_JUMP_STANDARD = BLOCKS.register("light_gray_jump_standard", () -> new JumpStandard(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIME_GREEN_JUMP_STANDARD = BLOCKS.register("lime_green_jump_standard", () -> new JumpStandard(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAGENTA_JUMP_STANDARD = BLOCKS.register("magenta_jump_standard", () -> new JumpStandard(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ORANGE_JUMP_STANDARD = BLOCKS.register("orange_jump_standard", () -> new JumpStandard(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINK_JUMP_STANDARD = BLOCKS.register("pink_jump_standard", () -> new JumpStandard(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PURPLE_JUMP_STANDARD = BLOCKS.register("purple_jump_standard", () -> new JumpStandard(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RED_JUMP_STANDARD = BLOCKS.register("red_jump_standard", () -> new JumpStandard(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WHITE_JUMP_STANDARD = BLOCKS.register("white_jump_standard", () -> new JumpStandard(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> YELLOW_JUMP_STANDARD = BLOCKS.register("yellow_jump_standard", () -> new JumpStandard(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> BLACK_MOUNTING_BLOCK = BLOCKS.register("black_mounting_block", () -> new MountingBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLUE_MOUNTING_BLOCK = BLOCKS.register("blue_mounting_block", () -> new MountingBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BROWN_MOUNTING_BLOCK = BLOCKS.register("brown_mounting_block", () -> new MountingBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CYAN_MOUNTING_BLOCK = BLOCKS.register("cyan_mounting_block", () -> new MountingBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GRAY_MOUNTING_BLOCK = BLOCKS.register("gray_mounting_block", () -> new MountingBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREEN_MOUNTING_BLOCK = BLOCKS.register("green_mounting_block", () -> new MountingBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_BLUE_MOUNTING_BLOCK = BLOCKS.register("light_blue_mounting_block", () -> new MountingBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_GRAY_MOUNTING_BLOCK = BLOCKS.register("light_gray_mounting_block", () -> new MountingBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIME_GREEN_MOUNTING_BLOCK = BLOCKS.register("lime_green_mounting_block", () -> new MountingBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAGENTA_MOUNTING_BLOCK = BLOCKS.register("magenta_mounting_block", () -> new MountingBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ORANGE_MOUNTING_BLOCK = BLOCKS.register("orange_mounting_block", () -> new MountingBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINK_MOUNTING_BLOCK = BLOCKS.register("pink_mounting_block", () -> new MountingBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PURPLE_MOUNTING_BLOCK = BLOCKS.register("purple_mounting_block", () -> new MountingBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RED_MOUNTING_BLOCK = BLOCKS.register("red_mounting_block", () -> new MountingBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WHITE_MOUNTING_BLOCK = BLOCKS.register("white_mounting_block", () -> new MountingBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> YELLOW_MOUNTING_BLOCK = BLOCKS.register("yellow_mounting_block", () -> new MountingBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));

}
