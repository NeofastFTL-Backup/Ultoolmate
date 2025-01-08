package com.neofastftl.multimod.items.tools;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.common.Tags;

public class CustomTiers {
    public static final Tier ENDSTONE = new SimpleTier(Tags.Blocks.NEEDS_NETHERITE_TOOL,
            300, 7f, 7f, 30, () -> Ingredient.of(Items.END_STONE));

}