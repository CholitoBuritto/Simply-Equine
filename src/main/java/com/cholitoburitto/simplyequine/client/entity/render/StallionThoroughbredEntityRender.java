package com.cholitoburitto.simplyequine.client.entity.render;

import com.cholitoburitto.simplyequine.client.entity.model.StallionThoroughbredEntityModel;
import com.cholitoburitto.simplyequine.entities.StallionThoroughbredEntity;
import com.cholitoburitto.simplyequine.simply_equine;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class StallionThoroughbredEntityRender extends MobRenderer<StallionThoroughbredEntity, StallionThoroughbredEntityModel> {

    protected static final ResourceLocation STALLION_THOROUGHBRED_BLACK = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/stallion_thoroughbred_black.png");
    protected static final ResourceLocation STALLION_THOROUGHBRED_BROWN = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/stallion_thoroughbred_brown.png");
    protected static final ResourceLocation STALLION_THOROUGHBRED_GRAY = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/stallion_thoroughbred_gray.png");
    protected static final ResourceLocation STALLION_THOROUGHBRED_CHESTNUT = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/stallion_thoroughbred_chestnut.png");
    protected static final ResourceLocation STALLION_THOROUGHBRED_REDCHESTNUT = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/stallion_thoroughbred_redchestnut.png");
    protected static final ResourceLocation STALLION_THOROUGHBRED_WHITE = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/stallion_thoroughbred_white.png");
    protected static final ResourceLocation STALLION_THOROUGHBRED_BAY = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/stallion_thoroughbred_bay.png");
    protected static final ResourceLocation STALLION_THOROUGHBRED_DAPPLE_ROSE_GRAY = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/stallion_thoroughbred_dapple_rose_gray.png");
    protected static final ResourceLocation STALLION_THOROUGHBRED_FLEABITTEN_GRAY = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/stallion_thoroughbred_fleabitten_gray.png");
    protected static final ResourceLocation STALLION_THOROUGHBRED_LIGHT_GRAY = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/stallion_thoroughbred_light_gray.png");
    protected static final ResourceLocation STALLION_THOROUGHBRED_PALOMINO = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/stallion_thoroughbred_palomino.png");
    protected static final ResourceLocation STALLION_THOROUGHBRED_ROAN = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/stallion_thoroughbred_roan.png");
    protected static final ResourceLocation STALLION_THOROUGHBRED_ROSE_GRAY = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/stallion_thoroughbred_rose_gray.png");
    protected static final ResourceLocation STALLION_THOROUGHBRED_STEEL_GRAY = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/stallion_thoroughbred_steel_gray.png");
    protected static final ResourceLocation STALLION_THOROUGHBRED_WHITE_GRAY = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/stallion_thoroughbred_white_gray.png");
    protected static final ResourceLocation STALLION_THOROUGHBRED_BLUE_ROAN = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/stallion_thoroughbred_blue_roan.png");

    public StallionThoroughbredEntityRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new StallionThoroughbredEntityModel(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(StallionThoroughbredEntity entity) {
        switch (entity.getTextureType()) {
            default:
            case 0:
                return STALLION_THOROUGHBRED_BLACK;
            case 1:
                return STALLION_THOROUGHBRED_BROWN;
            case 2:
                return STALLION_THOROUGHBRED_GRAY;
            case 3:
                return STALLION_THOROUGHBRED_CHESTNUT;
            case 4:
                return STALLION_THOROUGHBRED_REDCHESTNUT;
            case 5:
                return STALLION_THOROUGHBRED_WHITE;
            case 6:
                return STALLION_THOROUGHBRED_BAY;
            case 7:
                return STALLION_THOROUGHBRED_DAPPLE_ROSE_GRAY;
            case 8:
                return STALLION_THOROUGHBRED_FLEABITTEN_GRAY;
            case 9:
                return STALLION_THOROUGHBRED_LIGHT_GRAY;
            case 10:
                return STALLION_THOROUGHBRED_PALOMINO;
            case 11:
                return STALLION_THOROUGHBRED_ROAN;
            case 12:
                return STALLION_THOROUGHBRED_ROSE_GRAY;
            case 13:
                return STALLION_THOROUGHBRED_STEEL_GRAY;
            case 14:
                return STALLION_THOROUGHBRED_WHITE_GRAY;
            case 15:
                return STALLION_THOROUGHBRED_BLUE_ROAN;

        }
    }
}