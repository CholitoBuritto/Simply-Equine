package com.cholitoburitto.simplyequine.init;

import com.cholitoburitto.simplyequine.entities.ThoroughbredEntity;
import com.cholitoburitto.simplyequine.simply_equine;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, simply_equine.MOD_ID);

    public static final RegistryObject<EntityType<ThoroughbredEntity>> THOROUGHBRED_ENTITY = ENTITY_TYPES.register("thoroughbred_entity", () -> EntityType.Builder.<ThoroughbredEntity>create(ThoroughbredEntity::new, EntityClassification.CREATURE).size(0.9F,1.3F).build(new ResourceLocation(simply_equine.MOD_ID, "thoroughbred_entity").toString()));

}