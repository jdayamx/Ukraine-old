package jday.ukraine.client;

import net.fabricmc.api.ClientModInitializer;
import org.apache.logging.log4j.LogManager;

public class UkraineClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        LogManager.getLogger().info("Started Ukraine client mod!");
    }
}
