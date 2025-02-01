package com.neofastftl.ultoolmate.items;

import com.neofastftl.ultoolmate.Ultoolmate;
import com.neofastftl.ultoolmate.items.tools.CustomPaxel;
import com.neofastftl.ultoolmate.items.tools.CustomSworoe;
import com.neofastftl.ultoolmate.items.tools.CustomTiers;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class CustomItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Ultoolmate.MOD_ID);


    //End Stone
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
    public static final DeferredItem<CustomPaxel> END_STONE_PAXEL= ITEMS.register("end_stone_paxel",
            () -> new CustomPaxel(CustomTiers.PAXEL, new Item.Properties()
                    .attributes(CustomPaxel.createAttributes(CustomTiers.PAXEL, 1.0F, 2.8f))));
    public static final DeferredItem<CustomSworoe> END_STONE_SWOROE= ITEMS.register("end_stone_sworoe",
            () -> new CustomSworoe(CustomTiers.SWOROE, new Item.Properties()
                    .attributes(CustomSworoe.createAttributes(CustomTiers.SWOROE, 11.0F, 7.8f))));


    //Netherrack
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
    public static final DeferredItem<CustomPaxel> NETHERRACK_PAXEL= ITEMS.register("netherrack_paxel",
            () -> new CustomPaxel(CustomTiers.PAXEL, new Item.Properties()
                    .attributes(CustomPaxel.createAttributes(CustomTiers.PAXEL, 1.0F, 2.8f))));
    public static final DeferredItem<CustomSworoe> NETHERRACK_SWOROE= ITEMS.register("netherrack_sworoe",
            () -> new CustomSworoe(CustomTiers.SWOROE, new Item.Properties()
                    .attributes(CustomSworoe.createAttributes(CustomTiers.SWOROE, 11.0F, 7.8f))));

    //Copper
    public static final DeferredItem<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(CustomTiers.COPPER, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(CustomTiers.COPPER, 1.0F, 2.8f))));
    public static final DeferredItem<AxeItem> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(CustomTiers.COPPER, new Item.Properties()
                    .attributes(AxeItem.createAttributes(CustomTiers.COPPER, 1.0F, 2.8f))));
    public static final DeferredItem<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(CustomTiers.COPPER, new Item.Properties()
                    .attributes(HoeItem.createAttributes(CustomTiers.COPPER, 1.0F, 2.8f))));
    public static final DeferredItem<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(CustomTiers.COPPER, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(CustomTiers.COPPER, 1.0F, 2.8f))));
    public static final DeferredItem<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(CustomTiers.COPPER, new Item.Properties()
                    .attributes(SwordItem.createAttributes(CustomTiers.COPPER, 1.0F, 2.8f))));
    public static final DeferredItem<ShearsItem> COPPER_SHEARS= ITEMS.register("copper_shears",
            () -> new ShearsItem(new Item.Properties().durability(250)));
    public static final DeferredItem<BrushItem> COPPER_BRUSH= ITEMS.register("copper_brush",
            () -> new BrushItem(new Item.Properties().durability(250)));
    public static final DeferredItem<CustomPaxel> COPPER_PAXEL= ITEMS.register("copper_paxel",
            () -> new CustomPaxel(CustomTiers.PAXEL, new Item.Properties()
                    .attributes(CustomPaxel.createAttributes(CustomTiers.PAXEL, 1.0F, 2.8f))));
    public static final DeferredItem<CustomSworoe> COPPER_SWOROE= ITEMS.register("copper_sworoe",
            () -> new CustomSworoe(CustomTiers.SWOROE, new Item.Properties()
                    .attributes(CustomSworoe.createAttributes(CustomTiers.SWOROE, 11.0F, 7.8f))));


    //Amethyst
    public static final DeferredItem<PickaxeItem> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(CustomTiers.AMETHYST, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(CustomTiers.AMETHYST, 1.0F, 2.8f))));
    public static final DeferredItem<AxeItem> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new AxeItem(CustomTiers.AMETHYST, new Item.Properties()
                    .attributes(AxeItem.createAttributes(CustomTiers.AMETHYST, 1.0F, 2.8f))));
    public static final DeferredItem<HoeItem> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
            () -> new HoeItem(CustomTiers.AMETHYST, new Item.Properties()
                    .attributes(HoeItem.createAttributes(CustomTiers.AMETHYST, 1.0F, 2.8f))));
    public static final DeferredItem<ShovelItem> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(CustomTiers.AMETHYST, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(CustomTiers.AMETHYST, 1.0F, 2.8f))));
    public static final DeferredItem<SwordItem> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () -> new SwordItem(CustomTiers.AMETHYST, new Item.Properties()
                    .attributes(SwordItem.createAttributes(CustomTiers.AMETHYST, 1.0F, 2.8f))));
    public static final DeferredItem<ShearsItem> AMETHYST_SHEARS= ITEMS.register("amethyst_shears",
            () -> new ShearsItem(new Item.Properties().durability(250)));
    public static final DeferredItem<BrushItem> AMETHYST_BRUSH= ITEMS.register("amethyst_brush",
            () -> new BrushItem(new Item.Properties().durability(250)));
    public static final DeferredItem<CustomPaxel> AMETHYST_PAXEL= ITEMS.register("amethyst_paxel",
            () -> new CustomPaxel(CustomTiers.PAXEL, new Item.Properties()
                    .attributes(CustomPaxel.createAttributes(CustomTiers.PAXEL, 1.0F, 2.8f))));
    public static final DeferredItem<CustomSworoe> AMETHYST_SWOROE= ITEMS.register("amethyst_sworoe",
            () -> new CustomSworoe(CustomTiers.SWOROE, new Item.Properties()
                    .attributes(CustomSworoe.createAttributes(CustomTiers.SWOROE, 11.0F, 7.8f))));


    //Raw Materials
    public static final DeferredItem<Item> RAW_ELECTRUM = ITEMS.register("raw_electrum",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REFINED_ELECTRUM_INGOT = ITEMS.register("refined_electrum_ingot",
            () -> new Item(new Item.Properties()));

    //Smithing Templates

    //Materials
    public static final DeferredItem<Item> END_STONE_ST = ITEMS.register("end_stone_st",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERRACK_ST = ITEMS.register("netherrack_st",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_ST = ITEMS.register("copper_st",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AMETHYST_ST = ITEMS.register("amethyst_st",
            () -> new Item(new Item.Properties()));


    //Tools
    public static final DeferredItem<Item> PAXEL_ST = ITEMS.register("paxel_st",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.ultoolmate.paxel_st.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SWOROE_ST = ITEMS.register("sworoe_st",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.ultoolmate.sworoe_st.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> HOE_ST = ITEMS.register("hoe_st",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.ultoolmate.hoe_st.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> AXE_ST = ITEMS.register("axe_st",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.ultoolmate.axe_st.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> PICKAXE_ST = ITEMS.register("pickaxe_st",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.ultoolmate.pickaxe_st.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SHOVEL_ST = ITEMS.register("shovel_st",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.ultoolmate.shovel_st.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SWORD_ST = ITEMS.register("sword_st",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.ultoolmate.sword_st.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SHEARS_ST = ITEMS.register("shears_st",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.ultoolmate.shears_st.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> BRUSH_ST = ITEMS.register("brush_st",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.ultoolmate.brush_st.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });



    //Placeholder Tools
    public static final DeferredItem<Item> PLACEHOLDER_PAXEL = ITEMS.register("placeholder_paxel",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.ultoolmate.placeholder.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> PLACEHOLDER_SWOROE = ITEMS.register("placeholder_sworoe",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.ultoolmate.placeholder.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> PLACEHOLDER_HOE = ITEMS.register("placeholder_hoe",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.ultoolmate.placeholder.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> PLACEHOLDER_AXE = ITEMS.register("placeholder_axe",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.ultoolmate.placeholder.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> PLACEHOLDER_SWORD = ITEMS.register("placeholder_sword",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.ultoolmate.placeholder.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> PLACEHOLDER_PICKAXE = ITEMS.register("placeholder_pickaxe",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.ultoolmate.placeholder.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> PLACEHOLDER_SHOVEL = ITEMS.register("placeholder_shovel",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.ultoolmate.placeholder.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> PLACEHOLDER_BRUSH = ITEMS.register("placeholder_brush",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.ultoolmate.placeholder.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> PLACEHOLDER_SHEARS = ITEMS.register("placeholder_shears",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.ultoolmate.placeholder.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}