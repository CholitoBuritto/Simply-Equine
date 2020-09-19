package com.cholitoburitto.simplyequine.client.entity.render;

import com.cholitoburitto.simplyequine.client.entity.model.MareThoroughbredEntityModel;
import com.cholitoburitto.simplyequine.entities.MareThoroughbredEntity;
import com.cholitoburitto.simplyequine.simply_equine;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class MareThoroughbredEntityRender extends MobRenderer<MareThoroughbredEntity, MareThoroughbredEntityModel> {

    protected static final ResourceLocation MARE_THOROUGHBRED_BAY = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/mare_thoroughbred_bay.png");
    protected static final ResourceLocation MARE_THOROUGHBRED_BLACK = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/mare_thoroughbred_black.png");
    protected static final ResourceLocation MARE_THOROUGHBRED_BROWN = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/mare_thoroughbred_brown.png");
    protected static final ResourceLocation MARE_THOROUGHBRED_BLUE_ROAN = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/mare_thoroughbred_blue_roan.png");
    protected static final ResourceLocation MARE_THOROUGHBRED_CHESTNUT = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/mare_thoroughbred_chestnut.png");
    protected static final ResourceLocation MARE_THOROUGHBRED_WHITE = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/mare_thoroughbred_white.png");
    protected static final ResourceLocation MARE_THOROUGHBRED_DAPPLE_ROSE_GRAY = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/mare_thoroughbred_dapple_rose_gray.png");
    protected static final ResourceLocation MARE_THOROUGHBRED_FLEABITTEN_GRAY = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/mare_thoroughbred_fleabitten_gray.png");
    protected static final ResourceLocation MARE_THOROUGHBRED_GRAY = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/mare_thoroughbred_gray.png");
    protected static final ResourceLocation MARE_THOROUGHBRED_LIGHT_GRAY = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/mare_thoroughbred_light_gray.png");
    protected static final ResourceLocation MARE_THOROUGHBRED_PALOMINO = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/mare_thoroughbred_palomino.png");
    protected static final ResourceLocation MARE_THOROUGHBRED_REDCHESTNUT = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/mare_thoroughbred_redchestnut.png");
    protected static final ResourceLocation MARE_THOROUGHBRED_ROAN = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/mare_thoroughbred_roan.png");
    protected static final ResourceLocation MARE_THOROUGHBRED_ROSE_GRAY = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/mare_thoroughbred_rose_gray.png");
    protected static final ResourceLocation MARE_THOROUGHBRED_STEEL_GRAY = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/mare_thoroughbred_steel_gray.png");
    protected static final ResourceLocation MARE_THOROUGHBRED_WHITE_GRAY = new ResourceLocation(simply_equine.MOD_ID,
            "textures/entity/mare_thoroughbred_white_gray.png");


    public MareThoroughbredEntityRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new MareThoroughbredEntityModel(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(MareThoroughbredEntity entity) {
        switch (entity.getTextureType()) {
            default:
            case 0:
                return MARE_THOROUGHBRED_BLACK;
            case 1:
                return MARE_THOROUGHBRED_BROWN;
            case 2:
                return MARE_THOROUGHBRED_GRAY;
            case 3:
                return MARE_THOROUGHBRED_CHESTNUT;
            case 4:
                return MARE_THOROUGHBRED_REDCHESTNUT;
            case 5:
                return MARE_THOROUGHBRED_WHITE;
            case 6:
                return MARE_THOROUGHBRED_BAY;
            case 7:
                return MARE_THOROUGHBRED_DAPPLE_ROSE_GRAY;
            case 8:
                return MARE_THOROUGHBRED_WHITE_GRAY;
            case 9:
                return MARE_THOROUGHBRED_STEEL_GRAY;
            case 10:
                return MARE_THOROUGHBRED_ROSE_GRAY;
            case 11:
                return MARE_THOROUGHBRED_ROAN;
            case 12:
                return MARE_THOROUGHBRED_BLUE_ROAN;
            case 13:
                return MARE_THOROUGHBRED_PALOMINO;
            case 14:
                return MARE_THOROUGHBRED_LIGHT_GRAY;
            case 15:
                return MARE_THOROUGHBRED_FLEABITTEN_GRAY;


        }

    }

    private void addLayer() {
        final ResourceLocation MARE_THOROUGHBRED_BLAZE = new ResourceLocation(simply_equine.MOD_ID,
                "textures/entity/mare_thoroughbred_blaze");

    }


}
