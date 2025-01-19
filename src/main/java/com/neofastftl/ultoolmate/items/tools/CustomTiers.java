package com.neofastftl.ultoolmate.items.tools;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.common.Tags;

public class CustomTiers {
    public static final Tier ENDSTONE = new SimpleTier(Tags.Blocks.NEEDS_NETHERITE_TOOL,
            500, 10f, 7f, 30, () -> Ingredient.of(Items.END_STONE));
    public static final Tier NETHERRACK = new SimpleTier(Tags.Blocks.NEEDS_NETHERITE_TOOL,
            500, 10f, 7f, 30, () -> Ingredient.of(Items.NETHERRACK));
    public static final Tier END_STONE_PAXEL = new SimpleTier(Tags.Blocks.NEEDS_NETHERITE_TOOL,
            1250, 30f, 7f, 30, () -> Ingredient.of(Items.END_STONE_BRICKS));

}