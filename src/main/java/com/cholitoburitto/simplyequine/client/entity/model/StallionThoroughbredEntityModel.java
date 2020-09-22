// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package com.cholitoburitto.simplyequine.client.entity.model;

import com.cholitoburitto.simplyequine.entities.StallionThoroughbredEntity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class StallionThoroughbredEntityModel extends AnimatedEntityModel<StallionThoroughbredEntity> {

    private final AnimatedModelRenderer body;
    private final AnimatedModelRenderer main;
    private final AnimatedModelRenderer bone;
    private final AnimatedModelRenderer neck;
    private final AnimatedModelRenderer head;
    private final AnimatedModelRenderer leftfrontleg;
    private final AnimatedModelRenderer shoulder;
    private final AnimatedModelRenderer fore;
    private final AnimatedModelRenderer cannon;
    private final AnimatedModelRenderer hoof;
    private final AnimatedModelRenderer leftbackleg;
    private final AnimatedModelRenderer stifle;
    private final AnimatedModelRenderer gaskin;
    private final AnimatedModelRenderer cannonrear;
    private final AnimatedModelRenderer hoof2;
    private final AnimatedModelRenderer rightfrontleg;
    private final AnimatedModelRenderer shoulder2;
    private final AnimatedModelRenderer fore2;
    private final AnimatedModelRenderer cannon2;
    private final AnimatedModelRenderer hoof3;
    private final AnimatedModelRenderer rightbackleg;
    private final AnimatedModelRenderer stifle2;
    private final AnimatedModelRenderer gaskin2;
    private final AnimatedModelRenderer cannonrear2;
    private final AnimatedModelRenderer hoof4;
    private final AnimatedModelRenderer tail;
    private final AnimatedModelRenderer hair;
    private final AnimatedModelRenderer dock;

    public StallionThoroughbredEntityModel()
    {
        textureWidth = 128;
        textureHeight = 128;
        body = new AnimatedModelRenderer(this);
        body.setRotationPoint(0.0F, 18.0F, -4.0F);
        setRotationAngle(body, -3.1416F, 0.0F, 3.1416F);

        body.setModelRendererName("body");
        this.registerModelRenderer(body);

        main = new AnimatedModelRenderer(this);
        main.setRotationPoint(-1.0F, -9.75F, 4.0F);
        body.addChild(main);
        main.setTextureOffset(25, 29).addBox(-2.5F, -7.0F, -4.0F, 7.0F, 10.0F, 7.0F, 0.1F, false);
        main.setTextureOffset(26, 10).addBox(-2.0F, -7.0F, -11.0F, 6.0F, 9.0F, 8.0F, -0.1F, false);
        main.setTextureOffset(0, 39).addBox(-2.5F, -7.0F, -18.0F, 7.0F, 9.0F, 7.0F, 0.1F, false);
        main.setTextureOffset(21, 0).addBox(-0.9F, -3.0F, 0.5F, 4.0F, 5.0F, 4.0F, 0.1F, false);
        main.setTextureOffset(0, 0).addBox(-0.5F, 2.0F, -16.5F, 3.0F, 2.0F, 2.0F, 0.0F, false);
        main.setModelRendererName("main");
        this.registerModelRenderer(main);

        bone = new AnimatedModelRenderer(this);
        bone.setRotationPoint(0.0F, 0.0F, -12.0F);
        main.addChild(bone);
        setRotationAngle(bone, -0.2618F, 0.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(0.0F, 1.113F, -1.4617F, 2.0F, 2.0F, 4.0F, 0.0F, false);
        bone.setModelRendererName("bone");
        this.registerModelRenderer(bone);

        neck = new AnimatedModelRenderer(this);
        neck.setRotationPoint(-0.25F, -14.75F, 7.0F);
        body.addChild(neck);
        setRotationAngle(neck, 1.1345F, 0.0F, 0.0F);
        neck.setTextureOffset(0, 0).addBox(-1.6F, -7.0937F, -1.0774F, 4.0F, 5.0F, 13.0F, -0.8F, false);
        neck.setTextureOffset(0, 18).addBox(-1.6F, -4.091F, -2.3334F, 4.0F, 6.0F, 12.0F, 0.2F, false);
        neck.setModelRendererName("neck");
        this.registerModelRenderer(neck);

        head = new AnimatedModelRenderer(this);
        head.setRotationPoint(-0.1F, -21.75F, 10.5F);
        body.addChild(head);
        setRotationAngle(head, -0.3491F, 0.0F, 0.0F);
        head.setTextureOffset(47, 20).addBox(-2.25F, -2.908F, -3.9397F, 5.0F, 5.0F, 7.0F, -0.1F, false);
        head.setTextureOffset(53, 32).addBox(-1.25F, -2.3778F, -0.3607F, 3.0F, 4.0F, 7.0F, -0.1F, false);
        head.setTextureOffset(0, 0).addBox(1.6F, -4.7025F, -3.0597F, 1.0F, 3.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(0, 0).addBox(-1.9F, -4.7025F, -3.0597F, 1.0F, 3.0F, 2.0F, 0.0F, false);
        head.setModelRendererName("head");
        this.registerModelRenderer(head);

        leftfrontleg = new AnimatedModelRenderer(this);
        leftfrontleg.setRotationPoint(-2.5F, -9.0F, 6.25F);
        body.addChild(leftfrontleg);

        leftfrontleg.setModelRendererName("leftfrontleg");
        this.registerModelRenderer(leftfrontleg);

        shoulder = new AnimatedModelRenderer(this);
        shoulder.setRotationPoint(-1.5F, -1.0F, 0.0F);
        leftfrontleg.addChild(shoulder);
        shoulder.setTextureOffset(60, 60).addBox(-1.0F, -4.0F, -3.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);
        shoulder.setModelRendererName("shoulder");
        this.registerModelRenderer(shoulder);

        fore = new AnimatedModelRenderer(this);
        fore.setRotationPoint(-0.5F, 1.0F, -1.0F);
        leftfrontleg.addChild(fore);
        fore.setTextureOffset(0, 0).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);
        fore.setModelRendererName("fore");
        this.registerModelRenderer(fore);

        cannon = new AnimatedModelRenderer(this);
        cannon.setRotationPoint(-0.5F, 7.0F, -1.0F);
        leftfrontleg.addChild(cannon);
        cannon.setTextureOffset(64, 13).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 3.0F, 0.0F, false);
        cannon.setModelRendererName("cannon");
        this.registerModelRenderer(cannon);

        hoof = new AnimatedModelRenderer(this);
        hoof.setRotationPoint(-0.5F, 13.0F, 0.0F);
        leftfrontleg.addChild(hoof);
        hoof.setTextureOffset(65, 52).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.1F, false);
        hoof.setModelRendererName("hoof");
        this.registerModelRenderer(hoof);

        leftbackleg = new AnimatedModelRenderer(this);
        leftbackleg.setRotationPoint(-1.0F, 6.0F, -5.0F);
        body.addChild(leftbackleg);

        leftbackleg.setModelRendererName("leftbackleg");
        this.registerModelRenderer(leftbackleg);

        stifle = new AnimatedModelRenderer(this);
        stifle.setRotationPoint(-2.5F, -15.0F, -5.0F);
        leftbackleg.addChild(stifle);
        stifle.setTextureOffset(45, 45).addBox(-1.0F, -6.0F, -4.75F, 2.0F, 8.0F, 8.0F, 0.0F, false);
        stifle.setModelRendererName("stifle");
        this.registerModelRenderer(stifle);

        gaskin = new AnimatedModelRenderer(this);
        gaskin.setRotationPoint(-1.5F, -18.5F, -9.75F);
        leftbackleg.addChild(gaskin);
        setRotationAngle(gaskin, 1.2217F, 0.0F, 0.0F);
        gaskin.setTextureOffset(30, 51).addBox(-1.0F, 3.8781F, -8.4745F, 1.0F, 2.0F, 10.0F, 0.9F, false);
        gaskin.setModelRendererName("gaskin");
        this.registerModelRenderer(gaskin);

        cannonrear = new AnimatedModelRenderer(this);
        cannonrear.setRotationPoint(-2.0F, -9.0F, -8.5F);
        leftbackleg.addChild(cannonrear);
        cannonrear.setTextureOffset(24, 63).addBox(-1.0F, 0.0F, -1.25F, 2.0F, 8.0F, 3.0F, -0.2F, false);
        cannonrear.setModelRendererName("cannonrear");
        this.registerModelRenderer(cannonrear);

        hoof2 = new AnimatedModelRenderer(this);
        hoof2.setRotationPoint(-1.5F, -2.0F, -7.75F);
        leftbackleg.addChild(hoof2);
        hoof2.setTextureOffset(30, 46).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.1F, false);
        hoof2.setModelRendererName("hoof2");
        this.registerModelRenderer(hoof2);

        rightfrontleg = new AnimatedModelRenderer(this);
        rightfrontleg.setRotationPoint(5.5F, 4.0F, -1.75F);
        body.addChild(rightfrontleg);

        rightfrontleg.setModelRendererName("rightfrontleg");
        this.registerModelRenderer(rightfrontleg);

        shoulder2 = new AnimatedModelRenderer(this);
        shoulder2.setRotationPoint(-1.5F, -15.0F, 7.0F);
        rightfrontleg.addChild(shoulder2);
        shoulder2.setTextureOffset(0, 55).addBox(-3.0F, -3.0F, -2.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);
        shoulder2.setModelRendererName("shoulder2");
        this.registerModelRenderer(shoulder2);

        fore2 = new AnimatedModelRenderer(this);
        fore2.setRotationPoint(-2.0F, -12.0F, 7.0F);
        rightfrontleg.addChild(fore2);
        fore2.setTextureOffset(0, 18).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
        fore2.setModelRendererName("fore2");
        this.registerModelRenderer(fore2);

        cannon2 = new AnimatedModelRenderer(this);
        cannon2.setRotationPoint(-2.5F, -6.0F, 7.0F);
        rightfrontleg.addChild(cannon2);
        cannon2.setTextureOffset(34, 63).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 3.0F, 0.0F, false);
        cannon2.setModelRendererName("cannon2");
        this.registerModelRenderer(cannon2);

        hoof3 = new AnimatedModelRenderer(this);
        hoof3.setRotationPoint(-3.0F, 0.0F, 8.0F);
        rightfrontleg.addChild(hoof3);
        hoof3.setTextureOffset(58, 0).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.1F, false);
        hoof3.setModelRendererName("hoof3");
        this.registerModelRenderer(hoof3);

        rightbackleg = new AnimatedModelRenderer(this);
        rightbackleg.setRotationPoint(6.0F, 6.0F, -5.0F);
        body.addChild(rightbackleg);

        rightbackleg.setModelRendererName("rightbackleg");
        this.registerModelRenderer(rightbackleg);

        stifle2 = new AnimatedModelRenderer(this);
        stifle2.setRotationPoint(-2.5F, -15.0F, -5.0F);
        rightbackleg.addChild(stifle2);
        stifle2.setTextureOffset(46, 0).addBox(-1.0F, -6.0F, -4.75F, 2.0F, 8.0F, 8.0F, 0.0F, false);
        stifle2.setModelRendererName("stifle2");
        this.registerModelRenderer(stifle2);

        gaskin2 = new AnimatedModelRenderer(this);
        gaskin2.setRotationPoint(-2.5F, -18.5F, -9.75F);
        rightbackleg.addChild(gaskin2);
        setRotationAngle(gaskin2, 1.2217F, 0.0F, 0.0F);
        gaskin2.setTextureOffset(18, 46).addBox(-1.0F, 3.8781F, -8.4745F, 1.0F, 2.0F, 10.0F, 0.9F, false);
        gaskin2.setModelRendererName("gaskin2");
        this.registerModelRenderer(gaskin2);

        cannonrear2 = new AnimatedModelRenderer(this);
        cannonrear2.setRotationPoint(-3.0F, -9.0F, -8.5F);
        rightbackleg.addChild(cannonrear2);
        cannonrear2.setTextureOffset(49, 61).addBox(-1.0F, 0.0F, -1.25F, 2.0F, 8.0F, 3.0F, -0.2F, false);
        cannonrear2.setModelRendererName("cannonrear2");
        this.registerModelRenderer(cannonrear2);

        hoof4 = new AnimatedModelRenderer(this);
        hoof4.setRotationPoint(-3.5F, -2.0F, -7.75F);
        rightbackleg.addChild(hoof4);
        hoof4.setTextureOffset(37, 0).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.1F, false);
        hoof4.setModelRendererName("hoof4");
        this.registerModelRenderer(hoof4);

        tail = new AnimatedModelRenderer(this);
        tail.setRotationPoint(0.0F, -15.75F, -14.0F);
        body.addChild(tail);
        setRotationAngle(tail, -0.4363F, 0.0F, 0.0F);

        tail.setModelRendererName("tail");
        this.registerModelRenderer(tail);

        hair = new AnimatedModelRenderer(this);
        hair.setRotationPoint(-0.5F, 2.2337F, -2.6711F);
        tail.addChild(hair);
        setRotationAngle(hair, 0.3054F, 0.0F, 0.0F);
        hair.setTextureOffset(18, 58).addBox(0.0F, -1.1215F, -1.0343F, 1.0F, 15.0F, 2.0F, 1.0F, false);
        hair.setModelRendererName("hair");
        this.registerModelRenderer(hair);

        dock = new AnimatedModelRenderer(this);
        dock.setRotationPoint(4.0F, 0.9292F, 0.9738F);
        tail.addChild(dock);
        setRotationAngle(dock, -1.1781F, 0.0F, 0.0F);
        dock.setTextureOffset(57, 43).addBox(-5.5F, -1.5311F, -2.02F, 3.0F, 6.0F, 3.0F, -0.2F, false);
        dock.setModelRendererName("dock");
        this.registerModelRenderer(dock);

        this.rootBones.add(body);
    }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation("simply_equine", "animations/thoroughbred_walk.json");
    }
}