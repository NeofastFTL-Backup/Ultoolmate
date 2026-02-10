package com.neofastftl.ultoolmate.recipes;

import com.neofastftl.ultoolmate.Ultoolmate;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CustomRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(BuiltInRegistries.RECIPE_SERIALIZER, Ultoolmate.MOD_ID);
    public static final DeferredRegister<RecipeType<?>> TYPES =
            DeferredRegister.create(BuiltInRegistries.RECIPE_TYPE, Ultoolmate.MOD_ID);

    public static final DeferredHolder<RecipeType<?>, RecipeType<AlloySmelterRecipe>> ALLOY_SMELTER_TYPE =
            TYPES.register("alloy_smelter", () -> new RecipeType<AlloySmelterRecipe>() {
                @Override
                public String toString() {
                    return "alloy_smelter";
                }
            });

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<AlloySmelterRecipe>> ALLOY_SMELTER_SERIALIZER =
            SERIALIZERS.register("alloy_smelter", () -> AlloySmelterRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
        TYPES.register(eventBus);
    }
}
