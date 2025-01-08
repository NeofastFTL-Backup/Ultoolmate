package com.neofastftl.multimod.items;

import com.neofastftl.multimod.MultiMod;
import com.neofastftl.multimod.items.tools.CustomTiers;
import net.minecraft.world.item.*;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class CustomItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MultiMod.MOD_ID);

    public static final DeferredItem<PickaxeItem> END_STONE_PICKAXE = ITEMS.register("end_stone_pickaxe",
            () -> new PickaxeItem(CustomTiers.ENDSTONE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(CustomTiers.ENDSTONE, 1.0F, 2.8f))));
    public static final DeferredItem<AxeItem> END_STONE_AXE = ITEMS.register("end_stone_axe",
            () -> new AxeItem(CustomTiers.ENDSTONE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(CustomTiers.ENDSTONE, 1.0F, 2.8f))));
    public static final DeferredItem<HoeItem> END_STONE_HOE = ITEMS.register("end_stone_hoe",
            () -> new HoeItem(CustomTiers.ENDSTONE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(CustomTiers.ENDSTONE, 1.0F, 2.8f))));
    public static final DeferredItem<ShovelItem> END_STONE_SHOVEL = ITEMS.register("end_stone_shovel",
            () -> new ShovelItem(CustomTiers.ENDSTONE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(CustomTiers.ENDSTONE, 1.0F, 2.8f))));
    public static final DeferredItem<SwordItem> END_STONE_SWORD = ITEMS.register("end_stone_sword",
            () -> new SwordItem(CustomTiers.ENDSTONE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(CustomTiers.ENDSTONE, 1.0F, 2.8f))));
    public static final DeferredItem<ShearsItem> END_STONE_SHEARS= ITEMS.register("end_stone_shears",
            () -> new ShearsItem(new Item.Properties().durability(250)));
    public static final DeferredItem<BrushItem> END_STONE_BRUSH= ITEMS.register("end_stone_brush",
            () -> new BrushItem(new Item.Properties().durability(250)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}