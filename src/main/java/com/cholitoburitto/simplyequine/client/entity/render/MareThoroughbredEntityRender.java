package com.cholitoburitto.simplyequine.client.entity.render;

import com.cholitoburitto.simplyequine.client.entity.model.MareThoroughbredEntityModel;
import com.cholitoburitto.simplyequine.entities.MareThoroughbredEntity;
import com.cholitoburitto.simplyequine.simply_equine;
import com.google.common.collect.Maps;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.AbstractHorseRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.LeatherHorseArmorLayer;
import net.minecraft.client.renderer.entity.model.HorseModel;
import net.minecraft.client.renderer.texture.LayeredTexture;
import net.minecraft.entity.passive.horse.HorseEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Map;

public class MareThoroughbredEntityRender extends MobRenderer<MareThoroughbredEntity, MareThoroughbredEntityModel> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/thoroughbred_black.png");

    public MareThoroughbredEntityRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new MareThoroughbredEntityModel(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(MareThoroughbredEntity entity) {
        return TEXTURE;
    }
}