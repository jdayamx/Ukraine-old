package jday.ukraine.item;

import jday.ukraine.Ukraine;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class UkraineItemsValut {
    public static final Item UKRAINE_VALUT_1 = registerItem("ukraine_valut_1",
            new Item(new FabricItemSettings().group(Ukraine.UKRAINE_GENERAL)));
    public static final Item UKRAINE_VALUT_2 = registerItem("ukraine_valut_2",
            new Item(new FabricItemSettings().group(Ukraine.UKRAINE_GENERAL)));
    public static final Item UKRAINE_VALUT_5 = registerItem("ukraine_valut_5",
            new Item(new FabricItemSettings().group(Ukraine.UKRAINE_GENERAL)));
    public static final Item UKRAINE_VALUT_10 = registerItem("ukraine_valut_10",
            new Item(new FabricItemSettings().group(Ukraine.UKRAINE_GENERAL)));
    public static final Item UKRAINE_VALUT_20 = registerItem("ukraine_valut_20",
            new Item(new FabricItemSettings().group(Ukraine.UKRAINE_GENERAL)));
    public static final Item UKRAINE_VALUT_50 = registerItem("ukraine_valut_50",
            new Item(new FabricItemSettings().group(Ukraine.UKRAINE_GENERAL)));
    public static final Item UKRAINE_VALUT_100 = registerItem("ukraine_valut_100",
            new Item(new FabricItemSettings().group(Ukraine.UKRAINE_GENERAL)));
    public static final Item UKRAINE_VALUT_200 = registerItem("ukraine_valut_200",
            new Item(new FabricItemSettings().group(Ukraine.UKRAINE_GENERAL)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Ukraine.MOD_ID, name), item);
    }
    public static void registerItemsValute() {

    }
}
