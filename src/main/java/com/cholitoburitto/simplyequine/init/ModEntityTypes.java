package com.cholitoburitto.simplyequine.init;

import com.cholitoburitto.simplyequine.entities.MareThoroughbredEntity;
import com.cholitoburitto.simplyequine.entities.StallionThoroughbredEntity;
import com.cholitoburitto.simplyequine.simply_equine;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, simply_equine.MOD_ID);

    public static final RegistryObject<EntityType<MareThoroughbredEntity>> MARE_THOROUGHBRED_ENTITY = ENTITY_TYPES.register("mare_thoroughbred_entity", () -> EntityType.Builder.<MareThoroughbredEntity>create(com.cholitoburitto.simplyequine.entities.MareThoroughbredEntity::new, EntityClassification.CREATURE).size(0.9F,1.3F).build(new ResourceLocation(simply_equine.MOD_ID, "mare_thoroughbred_entity").toString()));
    public static final RegistryObject<EntityType<StallionThoroughbredEntity>> STALLION_THOROUGHBRED_ENTITY = ENTITY_TYPES.register("stallion_thoroughbred_entity", () -> EntityType.Builder.<StallionThoroughbredEntity>create(com.cholitoburitto.simplyequine.entities.StallionThoroughbredEntity::new, EntityClassification.CREATURE).size(0.9F,1.3F).build(new ResourceLocation(simply_equine.MOD_ID, "stallon_thoroughbred_entity").toString()));
}