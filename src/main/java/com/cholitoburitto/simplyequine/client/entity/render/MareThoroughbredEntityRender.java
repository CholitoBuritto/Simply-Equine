package com.cholitoburitto.simplyequine.client.entity.render;

import com.cholitoburitto.simplyequine.client.entity.model.MareThoroughbredEntityModel;
import com.cholitoburitto.simplyequine.entities.MareThoroughbredEntity;
import com.cholitoburitto.simplyequine.simply_equine;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.PigRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.PigModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.util.ResourceLocation;

public class MareThoroughbredEntityRender extends MobRenderer<MareThoroughbredEntity, MareThoroughbredEntityModel> {

    public MareThoroughbredEntityRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new MareThoroughbredEntityModel(), 0.5f);
        addLayer(new MareThoroughbredBlazeLayer(this));
    }

    @Override
    public ResourceLocation getEntityTexture(MareThoroughbredEntity entity) {
        return TextureTypes.getTextureLocation(entity.getTextureType());
    }

    static class MareThoroughbredBlazeLayer extends LayerRenderer<MareThoroughbredEntity, MareThoroughbredEntityModel> {
        public static final ResourceLocation BLAZE_TEXTURE = new ResourceLocation(simply_equine.MOD_ID, "textures/entity/mare_blaze");
        private final MareThoroughbredEntityModel model = new MareThoroughbredEntityModel();

        public MareThoroughbredBlazeLayer(IEntityRenderer<MareThoroughbredEntity, MareThoroughbredEntityModel> entityRendererIn)
        {
            super(entityRendererIn);
        }

        @Override
        public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, MareThoroughbredEntity entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch)
        {
            getEntityModel().copyModelAttributesTo(model);
            model.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks);
            model.setRotationAngles(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEntityCutoutNoCull(BLAZE_TEXTURE));
            model.render(matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    public enum TextureTypes {
        MARE_THOROUGHBRED_BAY(0, "bay"),
        MARE_THOROUGHBRED_BLACK(1, "black"),
        MARE_THOROUGHBRED_BROWN(2, "brown"),
        MARE_THOROUGHBRED_BLUE_ROAN(3, "blue_roan"),
        MARE_THOROUGHBRED_CHESTNUT(4, "chestnut"),
        MARE_THOROUGHBRED_WHITE(5, "white"),
        MARE_THOROUGHBRED_DAPPLE_ROSE_GRAY(6, "dapple_rose_gray"),
        MARE_THOROUGHBRED_FLEABITTEN_GRAY(7, "fleabitten_gray"),
        MARE_THOROUGHBRED_GRAY(8, "gray"),
        MARE_THOROUGHBRED_LIGHT_GRAY(9, "light_gray"),
        MARE_THOROUGHBRED_PALOMINO(10, "palomino"),
        MARE_THOROUGHBRED_REDCHESTNUT(11, "redchestnut"),
        MARE_THOROUGHBRED_ROAN(12, "roan"),
        MARE_THOROUGHBRED_ROSE_GRAY(13, "rose_gray"),
        MARE_THOROUGHBRED_STEEL_GRAY(14, "steel_gray"),
        MARE_THOROUGHBRED_WHITE_GRAY(15, "white_gray");

        public static final int totalTextureTypesCount = 16;

        private final int id;
        public final ResourceLocation textureLocation;

        TextureTypes(int id, String colour)
        {
            this.id = id;
            this.textureLocation = new ResourceLocation(simply_equine.MOD_ID, "textures/entity/mare_thoroughbred_" + colour + ".png");
        }

        public static TextureTypes getById(int id)
        {
            for (TextureTypes type : values())
                if (getId(type) == id)
                    return type;
            return MARE_THOROUGHBRED_BAY;
        }

        public static int getId(TextureTypes type)
        {
            return type.id;
        }

        public static ResourceLocation getTextureLocation(int id)
        {
            return getTextureLocation(getById(id));
        }

        public static ResourceLocation getTextureLocation(TextureTypes type)
        {
            return type.textureLocation;
        }
    }
}