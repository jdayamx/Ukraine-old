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
}