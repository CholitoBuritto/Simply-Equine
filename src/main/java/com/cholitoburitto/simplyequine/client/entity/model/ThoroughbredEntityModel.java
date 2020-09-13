package com.cholitoburitto.simplyequine.client.entity.model;

import com.cholitoburitto.simplyequine.entities.ThoroughbredEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;
//import net.minecraft.util.ResourceLocation;
//import software.bernie.geckolib.animation.model.AnimatedEntityModel;
//import software.bernie.geckolib.animation.render.ModelRenderer;

public class ThoroughbredEntityModel<T extends ThoroughbredEntity> extends EntityModel<T> {

        private final ModelRenderer body;
        private final ModelRenderer main;
        private final ModelRenderer neck;
        private final ModelRenderer head;
        private final ModelRenderer leftfrontleg;
        private final ModelRenderer shoulder;
        private final ModelRenderer fore;
        private final ModelRenderer cannon;
        private final ModelRenderer hoof;
        private final ModelRenderer leftbackleg;
        private final ModelRenderer stifle;
        private final ModelRenderer gaskin;
        private final ModelRenderer cannonrear;
        private final ModelRenderer hoof2;
        private final ModelRenderer rightfrontleg;
        private final ModelRenderer shoulder2;
        private final ModelRenderer fore2;
        private final ModelRenderer cannon2;
        private final ModelRenderer hoof3;
        private final ModelRenderer tail;
        private final ModelRenderer hair;
        private final ModelRenderer dock;
        private final ModelRenderer rightbackleg;
        private final ModelRenderer stifle2;
        private final ModelRenderer gaskin2;
        private final ModelRenderer cannonrear2;
        private final ModelRenderer hoof4;

    public ThoroughbredEntityModel()
        {
            textureWidth = 128;
            textureHeight = 128;
            body = new ModelRenderer(this);
            body.setRotationPoint(0.0F, 18.0F, -4.0F);
            setRotationAngle(body, -3.1416F, 0.0F, 3.1416F);

            main = new ModelRenderer(this);
            main.setRotationPoint(-1.0F, -9.75F, 4.0F);
            body.addChild(main);
            main.setTextureOffset(25, 29).addBox(-2.5F, -7.0F, -4.0F, 7.0F, 10.0F, 7.0F, 0.1F, false);
            main.setTextureOffset(26, 10).addBox(-2.0F, -7.0F, -11.0F, 6.0F, 9.0F, 8.0F, -0.1F, false);
            main.setTextureOffset(0, 39).addBox(-2.5F, -7.0F, -18.0F, 7.0F, 9.0F, 7.0F, 0.1F, false);
            main.setTextureOffset(21, 0).addBox(-0.9F, -3.0F, 0.5F, 4.0F, 5.0F, 4.0F, 0.1F, false);
          
            neck = new ModelRenderer(this);
            neck.setRotationPoint(-0.25F, -14.0F, 6.0F);
            body.addChild(neck);
            setRotationAngle(neck, 1.1345F, 0.0F, 0.0F);
            neck.setTextureOffset(0, 0).addBox(-1.6F, -7.0937F, -1.0774F, 4.0F, 5.0F, 13.0F, -0.8F, false);
            neck.setTextureOffset(0, 18).addBox(-1.6F, -4.091F, -2.3334F, 4.0F, 6.0F, 12.0F, 0.2F, false);
         
            head = new ModelRenderer(this);
            head.setRotationPoint(-0.1F, -21.0F, 10.0F);
            body.addChild(head);
            setRotationAngle(head, -0.3491F, 0.0F, 0.0F);
            head.setTextureOffset(47, 20).addBox(-2.25F, -2.908F, -3.9397F, 5.0F, 5.0F, 7.0F, -0.1F, false);
            head.setTextureOffset(53, 32).addBox(-1.25F, -1.908F, -0.1897F, 3.0F, 4.0F, 7.0F, -0.1F, false);
          
            leftfrontleg = new ModelRenderer(this);
            leftfrontleg.setRotationPoint(-2.5F, -9.0F, 6.25F);
            body.addChild(leftfrontleg);

            shoulder = new ModelRenderer(this);
            shoulder.setRotationPoint(-1.5F, -1.0F, 0.0F);
            leftfrontleg.addChild(shoulder);
            shoulder.setTextureOffset(60, 60).addBox(-1.0F, -4.0F, -3.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);
          
            fore = new ModelRenderer(this);
            fore.setRotationPoint(-2.0F, 0.0F, 1.0F);
            leftfrontleg.addChild(fore);
            fore.setTextureOffset(0, 0).addBox(0.0F, -1.0F, -3.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);
         
            cannon = new ModelRenderer(this);
            cannon.setRotationPoint(-0.5F, 8.0F, 0.0F);
            leftfrontleg.addChild(cannon);
            cannon.setTextureOffset(64, 13).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 8.0F, 3.0F, 0.0F, false);
         
            hoof = new ModelRenderer(this);
            hoof.setRotationPoint(-0.5F, 13.0F, -0.25F);
            leftfrontleg.addChild(hoof);
            hoof.setTextureOffset(65, 52).addBox(-1.5F, 0.0F, -1.75F, 3.0F, 2.0F, 3.0F, 0.1F, false);

            leftbackleg = new ModelRenderer(this);
            leftbackleg.setRotationPoint(-1.0F, 6.0F, -5.0F);
            body.addChild(leftbackleg);

            stifle = new ModelRenderer(this);
            stifle.setRotationPoint(-2.5F, -15.0F, -5.0F);
            leftbackleg.addChild(stifle);
            stifle.setTextureOffset(45, 45).addBox(-1.0F, -6.0F, -4.75F, 2.0F, 8.0F, 8.0F, 0.0F, false);

            gaskin = new ModelRenderer(this);
            gaskin.setRotationPoint(-1.5F, -18.5F, -9.75F);
            leftbackleg.addChild(gaskin);
            setRotationAngle(gaskin, 1.309F, 0.0F, 0.0F);
            gaskin.setTextureOffset(30, 51).addBox(-1.0F, 2.2588F, -8.9659F, 1.0F, 2.0F, 10.0F, 0.9F, false);

            cannonrear = new ModelRenderer(this);
            cannonrear.setRotationPoint(5.0F, -4.0F, -7.5F);
            leftbackleg.addChild(cannonrear);
            cannonrear.setTextureOffset(24, 63).addBox(-8.0F, -5.0F, -3.0F, 2.0F, 8.0F, 3.0F, -0.2F, false);

            hoof2 = new ModelRenderer(this);
            hoof2.setRotationPoint(-2.0F, -2.0F, -8.5F);
            leftbackleg.addChild(hoof2);
            hoof2.setTextureOffset(30, 46).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.1F, false);

            rightfrontleg = new ModelRenderer(this);
            rightfrontleg.setRotationPoint(5.5F, 4.0F, -1.75F);
            body.addChild(rightfrontleg);

            shoulder2 = new ModelRenderer(this);
            shoulder2.setRotationPoint(-1.5F, -15.0F, 7.0F);
            rightfrontleg.addChild(shoulder2);
            shoulder2.setTextureOffset(0, 55).addBox(-3.0F, -3.0F, -2.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);

            fore2 = new ModelRenderer(this);
            fore2.setRotationPoint(-2.0F, -12.0F, 7.0F);
            rightfrontleg.addChild(fore2);
            fore2.setTextureOffset(0, 18).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);

            cannon2 = new ModelRenderer(this);
            cannon2.setRotationPoint(-2.5F, -6.0F, 7.0F);
            rightfrontleg.addChild(cannon2);
            cannon2.setTextureOffset(34, 63).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 3.0F, 0.0F, false);

            hoof3 = new ModelRenderer(this);
            hoof3.setRotationPoint(-3.0F, 0.0F, 8.0F);
            rightfrontleg.addChild(hoof3);
            hoof3.setTextureOffset(58, 0).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.1F, false);

            rightbackleg = new ModelRenderer(this);
            rightbackleg.setRotationPoint(6.0F, 6.0F, -5.0F);
            body.addChild(rightbackleg);

            stifle2 = new ModelRenderer(this);
            stifle2.setRotationPoint(-2.5F, -15.0F, -5.0F);
            rightbackleg.addChild(stifle2);
            stifle2.setTextureOffset(46, 0).addBox(-1.0F, -6.0F, -4.75F, 2.0F, 8.0F, 8.0F, 0.0F, false);

            gaskin2 = new ModelRenderer(this);
            gaskin2.setRotationPoint(-2.5F, -18.5F, -9.75F);
            rightbackleg.addChild(gaskin2);
            setRotationAngle(gaskin2, 1.2217F, 0.0F, 0.0F);
            gaskin2.setTextureOffset(18, 46).addBox(-1.0F, 3.342F, -8.9397F, 1.0F, 2.0F, 10.0F, 0.9F, false);

            cannonrear2 = new ModelRenderer(this);
            cannonrear2.setRotationPoint(-3.0F, -9.0F, -8.5F);
            rightbackleg.addChild(cannonrear2);
            cannonrear2.setTextureOffset(49, 61).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 3.0F, -0.2F, false);

            hoof4 = new ModelRenderer(this);
            hoof4.setRotationPoint(-1.5F, 1.0F, -8.5F);
            rightbackleg.addChild(hoof4);
            hoof4.setTextureOffset(37, 0).addBox(-3.0F, -3.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.1F, false);

            tail = new ModelRenderer(this);
            tail.setRotationPoint(0.0F, -15.75F, -14.0F);
            body.addChild(tail);
            setRotationAngle(tail, -0.4363F, 0.0F, 0.0F);

            hair = new ModelRenderer(this);
            hair.setRotationPoint(-0.5F, 2.2337F, -2.6711F);
            tail.addChild(hair);
            setRotationAngle(hair, 0.3054F, 0.0F, 0.0F);
            hair.setTextureOffset(18, 58).addBox(0.0F, -1.1215F, -1.0343F, 1.0F, 15.0F, 2.0F, 1.0F, false);
            hair.setTextureOffset(0, 0).addBox(-2.0F, -2.2696F, 2.1134F, 5.0F, 3.0F, 2.0F, 0.0F, false);
            hair.setTextureOffset(0, 0).addBox(-2.0F, -15.1862F, 23.6114F, 1.0F, 3.0F, 2.0F, 0.0F, false);
            hair.setTextureOffset(0, 0).addBox(2.0F, -15.1862F, 23.6114F, 1.0F, 3.0F, 2.0F, 0.0F, false);

            dock = new ModelRenderer(this);
            dock.setRotationPoint(4.0F, -0.3997F, 1.4575F);
            tail.addChild(dock);
            dock.setTextureOffset(57, 43).addBox(-5.5F, -0.8121F, -0.7522F, 3.0F, 6.0F, 3.0F, -0.2F, false);

        }

        @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
        super.setLivingAnimations(entityIn, limbSwing, limbSwingAmount, partialTick);
    }

    public ModelRenderer getBody() {
        return body;
    }

    public ModelRenderer getCannon() {
        return cannon;
    }

    public ModelRenderer getFore() {
        return fore;
    }

    public ModelRenderer getHead() {
        return head;
    }

    public ModelRenderer getGaskin() {
        return gaskin;
    }

    public ModelRenderer getHoof() {
        return hoof;
    }

    public ModelRenderer getLeftfrontleg() {
        return leftfrontleg;
    }

    public ModelRenderer getMain() {
        return main;
    }

    public ModelRenderer getNeck() {
        return neck;
    }

    public ModelRenderer getShoulder() {
        return shoulder;
    }

    public ModelRenderer getLeftbackleg() {
        return leftbackleg;
    }

    public ModelRenderer getCannon2() {
        return cannon2;
    }

    public ModelRenderer getStifle() {
        return stifle;
    }

    public ModelRenderer getCannonrear() {
        return cannonrear;
    }

    public ModelRenderer getHoof2() {
        return hoof2;
    }

    public ModelRenderer getCannonrear2() {
        return cannonrear2;
    }

    public ModelRenderer getDock() {
        return dock;
    }

    public ModelRenderer getFore2() {
        return fore2;
    }

    public ModelRenderer getGaskin2() {
        return gaskin2;
    }

    public ModelRenderer getHair() {
        return hair;
    }

    public ModelRenderer getHoof3() {
        return hoof3;
    }

    public ModelRenderer getHoof4() {
        return hoof4;
    }

    public ModelRenderer getRightbackleg() {
        return rightbackleg;
    }

    public ModelRenderer getRightfrontleg() {
        return rightfrontleg;
    }

    public ModelRenderer getShoulder2() {
        return shoulder2;
    }

    public ModelRenderer getStifle2() {
        return stifle2;
    }

    public ModelRenderer getTail() {
        return tail;
    }
}
