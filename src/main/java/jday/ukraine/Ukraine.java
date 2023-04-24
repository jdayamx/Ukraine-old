package jday.ukraine;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;

public class Ukraine implements ModInitializer {
    public static final Item UKRAINE_EMBLEM = new Item(
            new FabricItemSettings()
                    //.group(Ukraine.UKRAINE)
                    //.maxCount(1)
                    //.rarity(Rarity.EPIC)
    );
    @Override
    public void onInitialize() {
        LogManager.getLogger().info("Started Ukraine mod!");
        Registry.register(Registry.ITEM, new Identifier("ukraine","ukraine_emblem"), UKRAINE_EMBLEM);
    }
}
