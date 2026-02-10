package com.neofastftl.ultoolmate.items.tools;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.common.Tags;

public class CustomTiers {
    public static final Tier ENDSTONE = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            500, 10.0f, 7f, 30, () -> Ingredient.of(Items.END_STONE));
    public static final Tier NETHERRACK = new SimpleTier(BlockTags.NEEDS_IRON_TOOL,
            500, 6.0f, 7f, 30, () -> Ingredient.of(Items.NETHERRACK));
    public static final Tier COPPER = new SimpleTier(BlockTags.NEEDS_STONE_TOOL,
            250, 9.5f, 1F, 30, () -> Ingredient.of(Items.COPPER_INGOT));
    public static final Tier AMETHYST = new SimpleTier(BlockTags.NEEDS_IRON_TOOL,
            250, 18.0f, 1F, 30, () -> Ingredient.of(Items.AMETHYST_SHARD));

    // Paxel Tiers
    public static final Tier ENDSTONE_PAXEL = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            1250, 10.0f, 7f, 30, () -> Ingredient.of(Items.END_STONE_BRICKS));
    public static final Tier NETHERRACK_PAXEL = new SimpleTier(BlockTags.NEEDS_IRON_TOOL,
            1250, 6.0f, 7f, 30, () -> Ingredient.of(Items.END_STONE_BRICKS));
    public static final Tier COPPER_PAXEL = new SimpleTier(BlockTags.NEEDS_STONE_TOOL,
            1250, 9.5f, 7f, 30, () -> Ingredient.of(Items.END_STONE_BRICKS));
    public static final Tier AMETHYST_PAXEL = new SimpleTier(BlockTags.NEEDS_IRON_TOOL,
            1250, 18.0f, 7f, 30, () -> Ingredient.of(Items.END_STONE_BRICKS));

    // Sworoe Tiers
    public static final Tier ENDSTONE_SWOROE = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            2500, 40.0f, 10f, 30, () -> Ingredient.of(Items.END_STONE_BRICKS));
    public static final Tier NETHERRACK_SWOROE = new SimpleTier(BlockTags.NEEDS_IRON_TOOL,
            2500, 20.0f, 10f, 30, () -> Ingredient.of(Items.END_STONE_BRICKS));
    public static final Tier COPPER_SWOROE = new SimpleTier(BlockTags.NEEDS_STONE_TOOL,
            2500, 37.0f, 10f, 30, () -> Ingredient.of(Items.END_STONE_BRICKS));
    public static final Tier AMETHYST_SWOROE = new SimpleTier(BlockTags.NEEDS_IRON_TOOL,
            2500, 70.0f, 10f, 30, () -> Ingredient.of(Items.END_STONE_BRICKS));

    // New Materials
    public static final Tier FLINT = new SimpleTier(BlockTags.NEEDS_STONE_TOOL,
            150, 5.0f, 1.0f, 5, () -> Ingredient.of(Items.FLINT));
    public static final Tier BRONZE = new SimpleTier(BlockTags.NEEDS_IRON_TOOL,
            400, 6.0f, 2.0f, 14, () -> Ingredient.of(Items.COPPER_INGOT));
    public static final Tier WROUGHT_IRON = new SimpleTier(BlockTags.NEEDS_IRON_TOOL,
            300, 6.5f, 2.0f, 12, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier STEEL = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            800, 7.5f, 3.0f, 10, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier CAST_IRON = new SimpleTier(BlockTags.NEEDS_IRON_TOOL,
            200, 5.5f, 2.5f, 8, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier STAINLESS_STEEL = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            1000, 8.0f, 3.0f, 15, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier TITANIUM = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            1500, 9.0f, 4.0f, 20, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier TUNGSTEN_CARBIDE = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            2500, 11.0f, 5.0f, 10, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier INCONEL = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            2000, 8.5f, 3.5f, 18, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier HAFNIUM_CARBIDE = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            3000, 12.0f, 6.0f, 5, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier GRAPHENE_STEEL = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            4000, 15.0f, 7.0f, 25, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier CERMET = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            1800, 10.0f, 4.5f, 12, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier MARAGING_STEEL = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            2200, 9.5f, 4.0f, 22, () -> Ingredient.of(Items.IRON_INGOT));

    // New Materials Paxels
    public static final Tier FLINT_PAXEL = new SimpleTier(BlockTags.NEEDS_STONE_TOOL,
            450, 5.0f, 1.0f, 5, () -> Ingredient.of(Items.FLINT));
    public static final Tier BRONZE_PAXEL = new SimpleTier(BlockTags.NEEDS_IRON_TOOL,
            1200, 6.0f, 2.0f, 14, () -> Ingredient.of(Items.COPPER_INGOT));
    public static final Tier WROUGHT_IRON_PAXEL = new SimpleTier(BlockTags.NEEDS_IRON_TOOL,
            900, 6.5f, 2.0f, 12, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier STEEL_PAXEL = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            2400, 7.5f, 3.0f, 10, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier CAST_IRON_PAXEL = new SimpleTier(BlockTags.NEEDS_IRON_TOOL,
            600, 5.5f, 2.5f, 8, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier STAINLESS_STEEL_PAXEL = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            3000, 8.0f, 3.0f, 15, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier TITANIUM_PAXEL = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            4500, 9.0f, 4.0f, 20, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier TUNGSTEN_CARBIDE_PAXEL = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            7500, 11.0f, 5.0f, 10, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier INCONEL_PAXEL = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            6000, 8.5f, 3.5f, 18, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier HAFNIUM_CARBIDE_PAXEL = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            9000, 12.0f, 6.0f, 5, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier GRAPHENE_STEEL_PAXEL = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            12000, 15.0f, 7.0f, 25, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier CERMET_PAXEL = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            5400, 10.0f, 4.5f, 12, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier MARAGING_STEEL_PAXEL = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            6600, 9.5f, 4.0f, 22, () -> Ingredient.of(Items.IRON_INGOT));

    // New Materials Sworoes
    public static final Tier FLINT_SWOROE = new SimpleTier(BlockTags.NEEDS_STONE_TOOL,
            750, 15.0f, 3.0f, 5, () -> Ingredient.of(Items.FLINT));
    public static final Tier BRONZE_SWOROE = new SimpleTier(BlockTags.NEEDS_IRON_TOOL,
            2000, 20.0f, 4.0f, 14, () -> Ingredient.of(Items.COPPER_INGOT));
    public static final Tier WROUGHT_IRON_SWOROE = new SimpleTier(BlockTags.NEEDS_IRON_TOOL,
            1500, 22.0f, 4.5f, 12, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier STEEL_SWOROE = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            4000, 25.0f, 6.0f, 10, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier CAST_IRON_SWOROE = new SimpleTier(BlockTags.NEEDS_IRON_TOOL,
            1000, 18.0f, 5.5f, 8, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier STAINLESS_STEEL_SWOROE = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            5000, 28.0f, 7.0f, 15, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier TITANIUM_SWOROE = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            7500, 35.0f, 8.0f, 20, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier TUNGSTEN_CARBIDE_SWOROE = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            12500, 50.0f, 10.0f, 10, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier INCONEL_SWOROE = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            10000, 40.0f, 9.0f, 18, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier HAFNIUM_CARBIDE_SWOROE = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            15000, 60.0f, 12.0f, 5, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier GRAPHENE_STEEL_SWOROE = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            20000, 80.0f, 15.0f, 25, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier CERMET_SWOROE = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            9000, 45.0f, 10.0f, 12, () -> Ingredient.of(Items.IRON_INGOT));
    public static final Tier MARAGING_STEEL_SWOROE = new SimpleTier(BlockTags.NEEDS_DIAMOND_TOOL,
            11000, 42.0f, 9.5f, 22, () -> Ingredient.of(Items.IRON_INGOT));

    @Deprecated
    public static final Tier PAXEL = AMETHYST_PAXEL;
    @Deprecated
    public static final Tier SWOROE = AMETHYST_SWOROE;
}