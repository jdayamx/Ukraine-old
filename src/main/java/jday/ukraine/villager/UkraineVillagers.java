package jday.ukraine.villager;


import com.google.common.collect.ImmutableSet;
import jday.ukraine.Ukraine;
import jday.ukraine.item.UkraineItemsValut;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.mixin.object.builder.PointOfInterestTypeAccessor;
import net.fabricmc.fabric.mixin.object.builder.VillagerProfessionAccessor;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class UkraineVillagers {
    public static final PointOfInterestType UKRAINEK_POI = registerPOI("ukrainekpoi", Blocks.GOLD_BLOCK);
    public static final VillagerProfession UKRAINEK_MASTER = registerProfession("ukrainekmaster", UKRAINEK_POI);
    public static VillagerProfession registerProfession(String name, PointOfInterestType type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(Ukraine.MOD_ID, name),
                VillagerProfessionAccessor.create(name, type, ImmutableSet.of(), ImmutableSet.of(),
                        SoundEvents.ENTITY_VILLAGER_WORK_ARMORER));
    }
    public static PointOfInterestType registerPOI(String name, Block block) {
        return Registry.register(Registry.POINT_OF_INTEREST_TYPE, new Identifier(Ukraine.MOD_ID, name),
                PointOfInterestTypeAccessor.callCreate(name,
                        ImmutableSet.copyOf(block.getStateManager().getStates()), 2, 3));
    }
    public static void registerVillagersPOIs() {
        PointOfInterestTypeAccessor.callSetup(UKRAINEK_POI);
    }
    public static void registerVillagers() {
        TradeOfferHelper.registerVillagerOffers(UkraineVillagers.UKRAINEK_MASTER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(UkraineItemsValut.UKRAINE_VALUT_50, 1),
                            new ItemStack(Ukraine.UKRAINE_SHUBA_SALAD, 1),
                            12, 7, 0.08f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(UkraineVillagers.UKRAINEK_MASTER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(UkraineItemsValut.UKRAINE_VALUT_20, 2),
                            new ItemStack(Ukraine.UKRAINE_CREESH, 2),
                            12, 2, 0.08f
                    ));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(UkraineItemsValut.UKRAINE_VALUT_5, 3),
                            new ItemStack(Ukraine.UKRAINE_ONION, 3),
                            12, 2, 0.08f
                    ));

                });
        TradeOfferHelper.registerVillagerOffers(UkraineVillagers.UKRAINEK_MASTER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(UkraineItemsValut.UKRAINE_VALUT_200, 1),
                            new ItemStack(Ukraine.UKRAINE_EMBLEM, 1),
                            3, 2, 0.08f
                    ));
                });
    }
}
