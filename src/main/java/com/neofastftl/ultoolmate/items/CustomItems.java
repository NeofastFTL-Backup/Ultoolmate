package com.neofastftl.multimod.items;

import com.neofastftl.multimod.Ultoolmate;
import com.neofastftl.multimod.items.tools.CustomTiers;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CustomItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Ultoolmate.MOD_ID);

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


    public static final DeferredItem<PickaxeItem> NETHERRACK_PICKAXE = ITEMS.register("netherrack_pickaxe",
            () -> new PickaxeItem(CustomTiers.NETHERRACK, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(CustomTiers.NETHERRACK, 1.0F, 2.8f))));
    public static final DeferredItem<AxeItem> NETHERRACK_AXE = ITEMS.register("netherrack_axe",
            () -> new AxeItem(CustomTiers.NETHERRACK, new Item.Properties()
                    .attributes(AxeItem.createAttributes(CustomTiers.NETHERRACK, 1.0F, 2.8f))));
    public static final DeferredItem<HoeItem> NETHERRACK_HOE = ITEMS.register("netherrack_hoe",
            () -> new HoeItem(CustomTiers.NETHERRACK, new Item.Properties()
                    .attributes(HoeItem.createAttributes(CustomTiers.NETHERRACK, 1.0F, 2.8f))));
    public static final DeferredItem<ShovelItem> NETHERRACK_SHOVEL = ITEMS.register("netherrack_shovel",
            () -> new ShovelItem(CustomTiers.NETHERRACK, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(CustomTiers.NETHERRACK, 1.0F, 2.8f))));
    public static final DeferredItem<SwordItem> NETHERRACK_SWORD = ITEMS.register("netherrack_sword",
            () -> new SwordItem(CustomTiers.NETHERRACK, new Item.Properties()
                    .attributes(SwordItem.createAttributes(CustomTiers.NETHERRACK, 1.0F, 2.8f))));
    public static final DeferredItem<ShearsItem> NETHERRACK_SHEARS= ITEMS.register("netherrack_shears",
            () -> new ShearsItem(new Item.Properties().durability(250)));
    public static final DeferredItem<BrushItem> NETHERRACK_BRUSH= ITEMS.register("netherrack_brush",
            () -> new BrushItem(new Item.Properties().durability(250)));




    public static final DeferredItem<Item> END_STONE_ST = ITEMS.register("end_stone_st",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERRACK_ST = ITEMS.register("netherrack_st",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}