package com.cholitoburitto.simplyequine.client.entity.render;

import com.cholitoburitto.simplyequine.client.entity.model.MareThoroughbredEntityModel;
import com.cholitoburitto.simplyequine.entities.MareThoroughbredEntity;
import com.cholitoburitto.simplyequine.simply_equine;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class MareThoroughbredEntityRender extends MobRenderer<MareThoroughbredEntity, MareThoroughbredEntityModel> {

    protected static final ResourceLocation THOROUGHBRED_BLACK = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/thoroughbred_black.png");
    protected static final ResourceLocation THOROUGHBRED_PURPLE = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/thoroughbred_purple.png");
    protected static final ResourceLocation THOROUGHBRED_YELLOW = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/thoroughbred_yellow.png");
    protected static final ResourceLocation THOROUGHBRED_WHITE = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/thoroughbred_white.png");
    protected static final ResourceLocation THOROUGHBRED_PINK = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/thoroughbred_pink.png");

    public MareThoroughbredEntityRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new MareThoroughbredEntityModel(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(MareThoroughbredEntity entity) {
        switch (entity.getTextureType()) {
            default:
            case 0:
                return THOROUGHBRED_BLACK;
            case 1:
                return THOROUGHBRED_PINK;
            case 2:
                return THOROUGHBRED_PURPLE;
            case 3:
                return THOROUGHBRED_YELLOW;
            case 4:
                return THOROUGHBRED_WHITE;
        }
    }
}