package com.neofastftl.ultoolmate.recipes;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;

public class AlloySmelterRecipe implements Recipe<RecipeInput> {
    private final ItemStack result;
    private final NonNullList<Ingredient> ingredients;

    public AlloySmelterRecipe(ItemStack result, NonNullList<Ingredient> ingredients) {
        this.result = result;
        this.ingredients = ingredients;
    }

    @Override
    public boolean matches(RecipeInput input, Level level) {
        if (level.isClientSide()) return false;
        // Simple matching logic: all ingredients must be present in the input
        // This is a placeholder as the actual input might vary depending on implementation
        return false;
    }

    @Override
    public ItemStack assemble(RecipeInput input, HolderLookup.Provider registries) {
        return result.copy();
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider registries) {
        return result;
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return CustomRecipes.ALLOY_SMELTER_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return CustomRecipes.ALLOY_SMELTER_TYPE.get();
    }

    public static class Serializer implements RecipeSerializer<AlloySmelterRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final MapCodec<AlloySmelterRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                ItemStack.STRICT_CODEC.fieldOf("result").forGetter(r -> r.result),
                Ingredient.CODEC_NONEMPTY.listOf().fieldOf("ingredients").xmap(
                        ingredients -> {
                            NonNullList<Ingredient> nonNullList = NonNullList.create();
                            nonNullList.addAll(ingredients);
                            return nonNullList;
                        },
                        ingredients -> ingredients
                ).forGetter(r -> r.ingredients)
        ).apply(inst, AlloySmelterRecipe::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, AlloySmelterRecipe> STREAM_CODEC = StreamCodec.of(
                Serializer::toNetwork, Serializer::fromNetwork
        );

        @Override
        public MapCodec<AlloySmelterRecipe> codec() {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, AlloySmelterRecipe> streamCodec() {
            return STREAM_CODEC;
        }

        private static AlloySmelterRecipe fromNetwork(RegistryFriendlyByteBuf buffer) {
            ItemStack result = ItemStack.STREAM_CODEC.decode(buffer);
            int size = buffer.readInt();
            NonNullList<Ingredient> ingredients = NonNullList.withSize(size, Ingredient.EMPTY);
            for (int i = 0; i < size; i++) {
                ingredients.set(i, Ingredient.CONTENTS_STREAM_CODEC.decode(buffer));
            }
            return new AlloySmelterRecipe(result, ingredients);
        }

        private static void toNetwork(RegistryFriendlyByteBuf buffer, AlloySmelterRecipe recipe) {
            ItemStack.STREAM_CODEC.encode(buffer, recipe.result);
            buffer.writeInt(recipe.ingredients.size());
            for (Ingredient ingredient : recipe.ingredients) {
                Ingredient.CONTENTS_STREAM_CODEC.encode(buffer, ingredient);
            }
        }
    }
}
