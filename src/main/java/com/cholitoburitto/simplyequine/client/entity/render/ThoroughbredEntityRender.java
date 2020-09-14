package com.cholitoburitto.simplyequine.client.entity.render;

import com.cholitoburitto.simplyequine.client.entity.model.ThoroughbredEntityModel;
import com.cholitoburitto.simplyequine.entities.ThoroughbredEntity;
import com.cholitoburitto.simplyequine.simply_equine;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ThoroughbredEntityRender extends MobRenderer<ThoroughbredEntity, ThoroughbredEntityModel> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/thoroughbred.png");

    public ThoroughbredEntityRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ThoroughbredEntityModel(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(ThoroughbredEntity entity) {
        return TEXTURE;
    }
}