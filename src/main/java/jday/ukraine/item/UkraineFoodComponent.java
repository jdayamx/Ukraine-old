package jday.ukraine.item;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
public class UkraineFoodComponent {
    public static final FoodComponent ONION = new FoodComponent.Builder()
            .hunger(1)
            .saturationModifier(0.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 10 * 20), 1.0f)
            .build();
    public static final FoodComponent SHUBA_SALAD = new FoodComponent.Builder()
            .hunger(10)
            .saturationModifier(0.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 25 * 20), 0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 5 * 20), 0.2f)
            .build();
    public static final FoodComponent KVASS = new FoodComponent.Builder()
            .hunger(1)
            .saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 30 * 20), 0.3f)
            .build();
}