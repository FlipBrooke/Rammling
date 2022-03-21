package io.notjustjosh.rammling.mixin;

import io.github.apace100.apoli.component.PowerHolderComponent;
import io.notjustjosh.rammling.power.WalkOnSnowPower;
import net.minecraft.block.PowderSnowBlock;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PowderSnowBlock.class)
public class PowderSnowBlockMixin {
	@Inject(at = @At("HEAD"), method = "canWalkOnPowderSnow", cancellable = true)
	private static void walkOnSnowPower(Entity entity, CallbackInfoReturnable<Boolean> cir) {
		if (PowerHolderComponent.hasPower(entity, WalkOnSnowPower.class)) {
			cir.setReturnValue(true);
		}
	}
}