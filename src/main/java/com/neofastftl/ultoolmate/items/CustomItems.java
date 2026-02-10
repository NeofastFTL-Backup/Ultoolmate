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

    private static final ToolRegistry TOOL_REGISTRY = new ToolRegistry(ITEMS);
    private static final MaterialRegistry MATERIAL_REGISTRY = new MaterialRegistry(ITEMS);

    static {
        TOOL_REGISTRY.registerToolSet("end_stone", CustomTiers.ENDSTONE, CustomTiers.ENDSTONE_PAXEL, CustomTiers.ENDSTONE_SWOROE, MaterialColor.END_STONE);
        TOOL_REGISTRY.registerToolSet("netherrack", CustomTiers.NETHERRACK, CustomTiers.NETHERRACK_PAXEL, CustomTiers.NETHERRACK_SWOROE, MaterialColor.NETHERRACK);
        TOOL_REGISTRY.registerToolSet("copper", CustomTiers.COPPER, CustomTiers.COPPER_PAXEL, CustomTiers.COPPER_SWOROE, MaterialColor.COPPER);
        TOOL_REGISTRY.registerToolSet("amethyst", CustomTiers.AMETHYST, CustomTiers.AMETHYST_PAXEL, CustomTiers.AMETHYST_SWOROE, MaterialColor.AMETHYST);

        TOOL_REGISTRY.registerToolSet("flint", CustomTiers.FLINT, CustomTiers.FLINT_PAXEL, CustomTiers.FLINT_SWOROE, MaterialColor.FLINT);
        TOOL_REGISTRY.registerToolSet("bronze", CustomTiers.BRONZE, CustomTiers.BRONZE_PAXEL, CustomTiers.BRONZE_SWOROE, MaterialColor.BRONZE);
        TOOL_REGISTRY.registerToolSet("wrought_iron", CustomTiers.WROUGHT_IRON, CustomTiers.WROUGHT_IRON_PAXEL, CustomTiers.WROUGHT_IRON_SWOROE, MaterialColor.WROUGHT_IRON);
        TOOL_REGISTRY.registerToolSet("steel", CustomTiers.STEEL, CustomTiers.STEEL_PAXEL, CustomTiers.STEEL_SWOROE, MaterialColor.STEEL);
        TOOL_REGISTRY.registerToolSet("cast_iron", CustomTiers.CAST_IRON, CustomTiers.CAST_IRON_PAXEL, CustomTiers.CAST_IRON_SWOROE, MaterialColor.CAST_IRON);
        TOOL_REGISTRY.registerToolSet("stainless_steel", CustomTiers.STAINLESS_STEEL, CustomTiers.STAINLESS_STEEL_PAXEL, CustomTiers.STAINLESS_STEEL_SWOROE, MaterialColor.STAINLESS_STEEL);
        TOOL_REGISTRY.registerToolSet("titanium", CustomTiers.TITANIUM, CustomTiers.TITANIUM_PAXEL, CustomTiers.TITANIUM_SWOROE, MaterialColor.TITANIUM);
        TOOL_REGISTRY.registerToolSet("tungsten_carbide", CustomTiers.TUNGSTEN_CARBIDE, CustomTiers.TUNGSTEN_CARBIDE_PAXEL, CustomTiers.TUNGSTEN_CARBIDE_SWOROE, MaterialColor.TUNGSTEN_CARBIDE);
        TOOL_REGISTRY.registerToolSet("inconel", CustomTiers.INCONEL, CustomTiers.INCONEL_PAXEL, CustomTiers.INCONEL_SWOROE, MaterialColor.INCONEL);
        TOOL_REGISTRY.registerToolSet("hafnium_carbide", CustomTiers.HAFNIUM_CARBIDE, CustomTiers.HAFNIUM_CARBIDE_PAXEL, CustomTiers.HAFNIUM_CARBIDE_SWOROE, MaterialColor.HAFNIUM_CARBIDE);
        TOOL_REGISTRY.registerToolSet("graphene_steel", CustomTiers.GRAPHENE_STEEL, CustomTiers.GRAPHENE_STEEL_PAXEL, CustomTiers.GRAPHENE_STEEL_SWOROE, MaterialColor.GRAPHENE_STEEL);
        TOOL_REGISTRY.registerToolSet("cermet", CustomTiers.CERMET, CustomTiers.CERMET_PAXEL, CustomTiers.CERMET_SWOROE, MaterialColor.CERMET);
        TOOL_REGISTRY.registerToolSet("maraging_steel", CustomTiers.MARAGING_STEEL, CustomTiers.MARAGING_STEEL_PAXEL, CustomTiers.MARAGING_STEEL_SWOROE, MaterialColor.MARAGING_STEEL);

        MATERIAL_REGISTRY.registerMaterial("end_stone", MaterialColor.END_STONE);
        MATERIAL_REGISTRY.registerMaterial("netherrack", MaterialColor.NETHERRACK);
        MATERIAL_REGISTRY.registerMaterial("copper", MaterialColor.COPPER);
        MATERIAL_REGISTRY.registerMaterial("amethyst", MaterialColor.AMETHYST);

        MATERIAL_REGISTRY.registerMaterial("flint", MaterialColor.FLINT);
        MATERIAL_REGISTRY.registerMaterial("bronze", MaterialColor.BRONZE);
        MATERIAL_REGISTRY.registerMaterial("wrought_iron", MaterialColor.WROUGHT_IRON);
        MATERIAL_REGISTRY.registerMaterial("steel", MaterialColor.STEEL);
        MATERIAL_REGISTRY.registerMaterial("cast_iron", MaterialColor.CAST_IRON);
        MATERIAL_REGISTRY.registerMaterial("stainless_steel", MaterialColor.STAINLESS_STEEL);
        MATERIAL_REGISTRY.registerMaterial("titanium", MaterialColor.TITANIUM);
        MATERIAL_REGISTRY.registerMaterial("tungsten_carbide", MaterialColor.TUNGSTEN_CARBIDE);
        MATERIAL_REGISTRY.registerMaterial("inconel", MaterialColor.INCONEL);
        MATERIAL_REGISTRY.registerMaterial("hafnium_carbide", MaterialColor.HAFNIUM_CARBIDE);
        MATERIAL_REGISTRY.registerMaterial("graphene_steel", MaterialColor.GRAPHENE_STEEL);
        MATERIAL_REGISTRY.registerMaterial("cermet", MaterialColor.CERMET);
        MATERIAL_REGISTRY.registerMaterial("maraging_steel", MaterialColor.MARAGING_STEEL);
    }

    @SuppressWarnings("unchecked")
    public static <T extends Item> DeferredItem<T> getTool(String material, String type) {
        return (DeferredItem<T>) TOOL_REGISTRY.getTool(material, type);
    }

    public static List<DeferredItem<? extends Item>> getAllTools() {
        return TOOL_REGISTRY.getAllTools();
    }

    public static DeferredItem<Item> getMaterialTemplate(String material) {
        return MATERIAL_REGISTRY.getTemplate(material);
    }

    public static List<DeferredItem<Item>> getAllMaterialTemplates() {
        return MATERIAL_REGISTRY.getAllTemplates();
    }

    public static List<DeferredItem<Item>> getAllToolTemplates() {
        return List.of(PAXEL_ST, SWOROE_ST, HOE_ST, AXE_ST, PICKAXE_ST, SHOVEL_ST, SWORD_ST, SHEARS_ST, BRUSH_ST);
    }

    public static MaterialColor getToolMaterialColor(String material) {
        return TOOL_REGISTRY.getColor(material);
    }

    public static MaterialColor getToolColor(DeferredItem<? extends Item> tool) {
        return TOOL_REGISTRY.getToolColor(tool);
    }

    public static MaterialColor getMaterialTemplateColor(DeferredItem<Item> template) {
        return MATERIAL_REGISTRY.getTemplateColor(template);
    }


    //Raw Materials
    public static final DeferredItem<Item> RAW_ELECTRUM = ITEMS.register("raw_electrum",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REFINED_ELECTRUM_INGOT = ITEMS.register("refined_electrum_ingot",
            () -> new Item(new Item.Properties()));


    //Tools Templates
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