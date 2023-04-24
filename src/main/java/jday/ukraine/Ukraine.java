package jday.ukraine;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;

public class Ukraine implements ModInitializer {
    @Override
    public void onInitialize() {
        LogManager.getLogger().info("Started Ukraine mod!");
    }
}
