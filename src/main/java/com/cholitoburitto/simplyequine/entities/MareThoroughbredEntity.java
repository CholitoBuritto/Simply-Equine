package com.cholitoburitto.simplyequine.entities;

import com.cholitoburitto.simplyequine.init.ModEntityTypes;
import com.cholitoburitto.simplyequine.simply_equine;
import com.cholitoburitto.simplyequine.util.RegistryHandler;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.entity.passive.horse.DonkeyEntity;
import net.minecraft.entity.passive.horse.HorseEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import software.bernie.geckolib.animation.builder.AnimationBuilder;
import software.bernie.geckolib.animation.controller.AnimationController;
import software.bernie.geckolib.animation.controller.EntityAnimationController;
import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.event.AnimationTestEvent;
import software.bernie.geckolib.manager.EntityAnimationManager;
import javax.annotation.Nullable;
import java.sql.Ref;


public class MareThoroughbredEntity extends AbstractHorseEntity implements IAnimatedEntity {
    private static final String[] MARE_TEXTURES = new String[]{"textures/entity/mare_thoroughbred/mare_thoroughbred_black.png", "textures/entity/mare_thoroughbred/mare_thoroughbred_brown.png", "textures/entity/mare_thoroughbred/mare_thoroughbred_gray.png", "textures/entity/mare_thoroughbred/mare_thoroughbred_chestnut.png", "textures/entity/mare_thoroughbred/mare_thoroughbred_redchestnut.png", "textures/entity/mare_thoroughbred/mare_thoroughbred_white.png", "textures/entity/mare_thoroughbred/mare_thoroughbred_bay.png", "textures/entity/mare_thoroughbred/mare_thoroughbred_dapple_rose_gray.png", "textures/entity/mare_thoroughbred/mare_thoroughbred_fleabitten_gray.png", "textures/entity/mare_thoroughbred/mare_thoroughbred_light_gray.png", "textures/entity/mare_thoroughbred/mare_thoroughbred_palomino.png", "textures/entity/mare_thoroughbred/mare_thoroughbred_roan.png", "textures/entity/mare_thoroughbred/mare_thoroughbred_rose_gray.png", "textures/entity/mare_thoroughbred/mare_thoroughbred_steel_gray.png", "textures/entity/mare_thoroughbred/mare_thoroughbred_white_gray.png", "textures/entity/mare_thoroughbred/mare_thoroughbred_blue_roan.png"};
    private static final String[] MT = new String[]{"aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "ii", "jj", "kk", "ll", "mm", "nn", "oo", "pp"};
    private static final String[] MARE_FACE_MARKING_TEXTURES = new String[]{"textures/entity/mare_thoroughbred_markings/mare_thoroughbred_blaze.png", "textures/entity/mare_thoroughbred_markings/mare_thoroughbred_strip.png", "textures/entity/mare_thoroughbred_markings/mare_thoroughbred_star.png"};
    private String texturePrefix;
    private final String[] mareTexturesArray = new String[2];

    private EatGrassGoal eatGrassGoal;
    private int exampleTimer;
    private EntityAnimationManager manager = new EntityAnimationManager();
    private AnimationController controller = new EntityAnimationController(this, "moveController", 20, this::animationPredicate);

    public MareThoroughbredEntity(EntityType<? extends AbstractHorseEntity> type, World worldIn) {
        super(type, worldIn);
        registerAnimationControllers();
    }

    @Override
    public void writeAdditional(CompoundNBT compound) {
        super.writeAdditional(compound);
        compound.putString("textureprefix", getMareTexture());
        compound.putString("texture", getVariantTexturePaths()[0]);
        compound.putString("mark", getVariantTexturePaths()[1]);
    }

    @Override
    public void readAdditional(CompoundNBT compound) {
        super.readAdditional(compound);
        texturePrefix = compound.getString("textureprefix");
        mareTexturesArray[0] = compound.getString("texture");
        mareTexturesArray[1] = compound.getString("mark");
    }

    private void setMareTexturePaths() {
        int i = rand.nextInt(MARE_TEXTURES.length);
        int j = rand.nextInt(MARE_FACE_MARKING_TEXTURES.length);
        this.mareTexturesArray[0] = simply_equine.MOD_ID + ":" + MARE_TEXTURES[i];
        this.mareTexturesArray[1] = simply_equine.MOD_ID + ":" + MARE_FACE_MARKING_TEXTURES[j];
        this.texturePrefix = "mare/" + MT[i] + MT[j];
    }

    public String getMareTexture() {
        if (this.texturePrefix == null) {
            this.setMareTexturePaths();
        }

        return this.texturePrefix;
    }

    public String[] getVariantTexturePaths() {
        if (this.texturePrefix == null) {
            this.setMareTexturePaths();
        }

        return this.mareTexturesArray;
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.eatGrassGoal = new EatGrassGoal(this);
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.25D));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.1D, Ingredient.fromItems(RegistryHandler.THATCH.get()), false));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.1D));
        this.goalSelector.addGoal(5, this.eatGrassGoal);
        this.goalSelector.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
        this.goalSelector.addGoal(7, new LookAtGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
    }

    @Override
    protected void registerAttributes() {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(this.getModifiedMaxHealth());
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(this.getModifiedMovementSpeed());
        this.getAttribute(JUMP_STRENGTH).setBaseValue(this.getModifiedJumpStrength());
    }

    @Override
    protected void updateAITasks() {
        this.exampleTimer = this.eatGrassGoal.getEatingGrassTimer();
        super.updateAITasks();
    }

    @Override
    public void livingTick() {
        if (this.world.isRemote) {
            this.exampleTimer = Math.max(0, this.exampleTimer - 1);
        }
        super.livingTick();
    }

    @Override
    public boolean processInteract(PlayerEntity player, Hand hand) {
        ItemStack itemstack = player.getHeldItem(hand);
        boolean flag = !itemstack.isEmpty();
        if (flag && itemstack.getItem() instanceof SpawnEggItem) {
            return super.processInteract(player, hand);
        } else {
            if (!this.isChild()) {
                if (this.isTame() && player.isSecondaryUseActive()) {
                    this.openGUI(player);
                    return true;
                }

                if (this.isBeingRidden()) {
                    return super.processInteract(player, hand);
                }
            }

            if (flag) {
                if (this.handleEating(player, itemstack)) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }

                    return true;
                }

                if (itemstack.interactWithEntity(player, this, hand)) {
                    return true;
                }

                if (!this.isTame()) {
                    this.makeMad();
                    return true;
                }

                boolean flag1 = !this.isChild() && !this.isHorseSaddled() && itemstack.getItem() == Items.SADDLE;
                if (this.isArmor(itemstack) || flag1) {
                    this.openGUI(player);
                    return true;
                }
            }

            if (this.isChild()) {
                return super.processInteract(player, hand);
            } else {
                this.mountTo(player);
                return true;
            }
        }
    }

    @Override
    public boolean canMateWith(AnimalEntity otherAnimal) {
        if (otherAnimal == this) {
            return false;
        } else if (!(otherAnimal instanceof DonkeyEntity) && !(otherAnimal instanceof HorseEntity)) {
            return false;
        } else {
            return this.canMate() && otherAnimal.canMateWith(MareThoroughbredEntity.this);
        }
    }

    @Override
    public AgeableEntity createChild(AgeableEntity ageable) {
        MareThoroughbredEntity mareThoroughbredEntity;
        mareThoroughbredEntity = ModEntityTypes.MARE_THOROUGHBRED_ENTITY.get().create(this.world);
        this.setOffspringAttributes(ageable, mareThoroughbredEntity);
        return mareThoroughbredEntity;
    }

    @Override
    public EntityAnimationManager getAnimationManager() {
        return manager;
    }

    private <E extends MareThoroughbredEntity> boolean animationPredicate(AnimationTestEvent<E> event) {
        if (event.isWalking()) {
            controller.setAnimation(new AnimationBuilder().addAnimation("simply_equine.animation.walk")
                    .addAnimation("simply_equine.animation.walk", true));
            return true;
        } else {
            return false;
        }
    }

    private void registerAnimationControllers() {
        manager.addAnimationController(controller);
    }
}

