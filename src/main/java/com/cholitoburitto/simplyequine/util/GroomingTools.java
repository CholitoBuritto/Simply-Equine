package com.cholitoburitto.simplyequine.util;

import net.minecraft.entity.passive.horse.HorseEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import java.util.Random;
@Mod.EventBusSubscriber
public class GroomingTools {
    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void groomingTools(PlayerInteractEvent.EntityInteract event) {
        PlayerEntity player = event.getPlayer();
        if (player.getHeldItemMainhand().getItem() == RegistryHandler.BLACK_RUBBER_CURRY_COMB.get()) {
            boolean p_110216_1_ = true;
            IParticleData iparticledata = p_110216_1_ ? ParticleTypes.HEART : ParticleTypes.SMOKE;
            Random rand = new Random();
            for(int i = 0; i < 5; ++i) {
                double d0 = rand.nextGaussian() * 0.02D;
                double d1 = rand.nextGaussian() * 0.02D;
                double d2 = rand.nextGaussian() * 0.02D;
            event.getTarget().world.addParticle(iparticledata, event.getTarget().getPosXRandom(1.0D), event.getTarget().getPosYRandom() + 0.5D, event.getTarget().getPosZRandom(1.0D), d0, d1, d2);


            }
    }}}


