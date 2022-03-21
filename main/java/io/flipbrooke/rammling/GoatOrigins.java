package io.flipbrooke.rammling;

import io.flipbrooke.rammling.power.RammlingPowerFactories;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoatOrigins implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Rammling");

	@Override
	public void onInitialize() {
		RammlingPowerFactories.register();
		LOGGER.info("Goating up your game");
	}
}
