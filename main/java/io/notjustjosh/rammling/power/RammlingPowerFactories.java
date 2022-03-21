package io.notjustjosh.rammling.power;

import io.github.apace100.apoli.power.Power;
import io.github.apace100.apoli.power.factory.PowerFactory;
import io.github.apace100.apoli.registry.ApoliRegistries;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RammlingPowerFactories {
    public static void register() {
        register(Power.createSimpleFactory(WalkOnSnowPower::new, new Identifier("rammling", "walk_on_snow")));
    }
    public static void register(PowerFactory<?> serializer) {
        Registry.register(ApoliRegistries.POWER_FACTORY, serializer.getSerializerId(), serializer);
    }
}
