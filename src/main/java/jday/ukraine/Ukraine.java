package jday.ukraine;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.fabricmc.tinyremapper.extension.mixin.common.data.Constant;
import net.minecraft.enchantment.EfficiencyEnchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.item.*;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.UniformLootTableRange;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;

public class Ukraine implements ModInitializer {
    public static final String MOD_ID = "ukraine";
    public static final ItemGroup UKRAINE_GENERAL = FabricItemGroupBuilder.create(
                    new Identifier(MOD_ID, "general"))
            .icon(() -> new ItemStack(Ukraine.UKRAINE_EMBLEM))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Ukraine.UKRAINE_EMBLEM));
                stacks.add(new ItemStack(Items.WHEAT_SEEDS));
                stacks.add(new ItemStack(Items.PUMPKIN_SEEDS));
                stacks.add(new ItemStack(Ukraine.UKRAINE_RYE_SEEDS));
                stacks.add(new ItemStack(Ukraine.UKRAINE_FLOUR));
                stacks.add(new ItemStack(Ukraine.UKRAINE_ONION));
                stacks.add(new ItemStack(Ukraine.UKRAINE_RYE_FLOUR));
                stacks.add(new ItemStack(Items.WHEAT));
                stacks.add(new ItemStack(Items.BEETROOT));
                stacks.add(new ItemStack(Items.PUMPKIN));
                stacks.add(new ItemStack(Items.SUNFLOWER));
                stacks.add(new ItemStack(Ukraine.UKRAINE_LOAF));
                stacks.add(new ItemStack(Ukraine.UKRAINE_RYE_BREAD));
                stacks.add(new ItemStack(Ukraine.UKRAINE_CREESH));
                stacks.add(new ItemStack(Ukraine.UKRAINE_BOILED_DOUGH));
                stacks.add(new ItemStack(Items.BEETROOT_SOUP));
                stacks.add(new ItemStack(Ukraine.UKRAINE_SHUBA_SALAD));
            })
            .build();
    public static final Item UKRAINE_EMBLEM = new Item(
            new FabricItemSettings()
                    .group(Ukraine.UKRAINE_GENERAL)
                    //.maxCount(1)
                    //.rarity(Rarity.EPIC)
    );
    private static final Identifier GRASS = new Identifier("minecraft", "blocks/grass");
    public static final Item UKRAINE_RYE_SEEDS = new Item(
            new FabricItemSettings()
                    .group(Ukraine.UKRAINE_GENERAL)
    );
    public static final Item UKRAINE_RYE_BREAD = new Item(
            new FabricItemSettings()
                    .group(Ukraine.UKRAINE_GENERAL)
                    .food(new FoodComponent
                            .Builder()
                            .snack()
                            .hunger(10)
                            .build()
                    )
    );
    public static final Item UKRAINE_FLOUR = new Item(
            new FabricItemSettings()
                    .group(Ukraine.UKRAINE_GENERAL)
    );
    public static final Item UKRAINE_RYE_FLOUR = new Item(
            new FabricItemSettings()
                    .group(Ukraine.UKRAINE_GENERAL)
    );
    public static final Item UKRAINE_LOAF = new Item(
            new FabricItemSettings()
                    .group(Ukraine.UKRAINE_GENERAL)
                    .food(new FoodComponent
                            .Builder()
                            .snack()
                            .hunger(30)
                            .build()
                    )
    );
    public static final Item UKRAINE_BOILED_DOUGH = new Item(
            new FabricItemSettings()
                    .group(Ukraine.UKRAINE_GENERAL)
                    .food(new FoodComponent
                            .Builder()
                            .snack()
                            .hunger(15)
                            .build()
                    )
    );
    private static final Identifier PIG = new Identifier("minecraft", "entities/pig");
    //Blocks.COAL_ORE.getLootTableId();
    public static final Item UKRAINE_CREESH = new Item(
            new FabricItemSettings()
                    .group(Ukraine.UKRAINE_GENERAL)
                    .food(new FoodComponent
                            .Builder()
                            .snack()
                            .hunger(5)
                            .build()
                    )
    );
    public static final Item UKRAINE_SHUBA_SALAD = new Item(
            new FabricItemSettings()
                    .group(Ukraine.UKRAINE_GENERAL)
                    .food(new FoodComponent
                            .Builder()
                            .snack()
                            .hunger(20)
                            .build()
                    )
    );
    public static final Item UKRAINE_ONION = new Item(
            new FabricItemSettings()
                    .group(Ukraine.UKRAINE_GENERAL)
                    .food(new FoodComponent
                            .Builder()
                            .snack()
                            .hunger(1)
                            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 10 * 20), 1.0f)
                            .build()
                    )
    );
    @Override
    public void onInitialize() {
        LogManager.getLogger().info("Started Ukraine mod!");
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"ukraine_emblem"), UKRAINE_EMBLEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"ukraine_rye_seeds"), UKRAINE_RYE_SEEDS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"ukraine_rye_bread"), UKRAINE_RYE_BREAD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"ukraine_flour"), UKRAINE_FLOUR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"ukraine_rye_flour"), UKRAINE_RYE_FLOUR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"ukraine_loaf"), UKRAINE_LOAF);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"ukraine_creesh"), UKRAINE_CREESH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"ukraine_boiled_dough"), UKRAINE_BOILED_DOUGH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"ukraine_shuba_salad"), UKRAINE_SHUBA_SALAD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"ukraine_onion"), UKRAINE_ONION);

        LootTableLoadingCallback.EVENT.register(
                (
                        (
                                (resourceManager, manager, id, supplier, setter) -> {
                                    if (PIG.equals(id)) {
                                        FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.of(FabricLootPoolBuilder.builder()
                                                .rolls(ConstantLootTableRange.create(1))
                                                .conditionally(RandomChanceLootCondition.builder(1.0f))
                                                .with(ItemEntry.builder(Ukraine.UKRAINE_CREESH))
                                                .withFunction(SetCountLootFunction.builder(UniformLootTableRange.between(1.0f,2.0f)).build())
                                                .build());
                                        supplier.withPool(poolBuilder.build());
                                    }
                                    if (GRASS.equals(id)) {
                                        FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.of(FabricLootPoolBuilder.builder()
                                                .rolls(ConstantLootTableRange.create(1))
                                                .conditionally(RandomChanceLootCondition.builder(0.1f))
                                                .with(ItemEntry.builder(Ukraine.UKRAINE_RYE_SEEDS))
                                                .withFunction(SetCountLootFunction.builder(UniformLootTableRange.between(1.0f,1.0f)).build())
                                                .build());
                                        supplier.withPool(poolBuilder.build());
                                    }
                                }
                                )
                )
        );
    }
}
