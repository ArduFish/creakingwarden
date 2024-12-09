package org.ardufish.creakingwarden.mixin;

import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.CreakingEntity;
import net.minecraft.entity.mob.HostileEntity;
import org.spongepowered.asm.mixin.*;

@Mixin(CreakingEntity.class)
public class creak {
    @Shadow
    @Final
    @Mutable
    private static final float field_54575 = 40.0F;
    /**
     * @author ArduFish
     * @reason Overwrite damage
     */
    @Overwrite
    public static DefaultAttributeContainer.Builder createCreakingAttributes() {
        return HostileEntity.createHostileAttributes().add(EntityAttributes.MAX_HEALTH, (double)1.0F).add(EntityAttributes.MOVEMENT_SPEED, (double)0.4F).add(EntityAttributes.ATTACK_DAMAGE, (double)40.0F).add(EntityAttributes.FOLLOW_RANGE, (double)32.0F).add(EntityAttributes.STEP_HEIGHT, (double)1.0625F);
    }
}