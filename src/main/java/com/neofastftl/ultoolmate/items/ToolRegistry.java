package com.neofastftl.ultoolmate.items;

import com.neofastftl.ultoolmate.items.tools.CustomPaxel;
import com.neofastftl.ultoolmate.items.tools.CustomSworoe;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolRegistry {
    private final DeferredRegister.Items items;
    private final List<DeferredItem<? extends Item>> allTools = new ArrayList<>();
    private final Map<String, Map<String, DeferredItem<? extends Item>>> toolsByMaterial = new HashMap<>();

    private final Map<String, MaterialColor> colorsByMaterial = new HashMap<>();
    private final Map<DeferredItem<? extends Item>, MaterialColor> colorsByTool = new HashMap<>();

    public ToolRegistry(DeferredRegister.Items items) {
        this.items = items;
    }

    public void registerToolSet(String materialName, Tier tier, Tier paxelTier, Tier sworoeTier, MaterialColor color) {
        Map<String, DeferredItem<? extends Item>> materialTools = new HashMap<>();

        materialTools.put("pickaxe", register(materialName + "_pickaxe",
                () -> new PickaxeItem(tier, new Item.Properties()
                        .attributes(PickaxeItem.createAttributes(tier, 1.0F, -2.8F))), color));
        materialTools.put("axe", register(materialName + "_axe",
                () -> new AxeItem(tier, new Item.Properties()
                        .attributes(AxeItem.createAttributes(tier, 6.0F, -3.1F))), color));
        materialTools.put("hoe", register(materialName + "_hoe",
                () -> new HoeItem(tier, new Item.Properties()
                        .attributes(HoeItem.createAttributes(tier, -2.0F, -1.0F))), color));
        materialTools.put("shovel", register(materialName + "_shovel",
                () -> new ShovelItem(tier, new Item.Properties()
                        .attributes(ShovelItem.createAttributes(tier, 1.5F, -3.0F))), color));
        materialTools.put("sword", register(materialName + "_sword",
                () -> new SwordItem(tier, new Item.Properties()
                        .attributes(SwordItem.createAttributes(tier, 3.0F, -2.4F))), color));

        materialTools.put("shears", register(materialName + "_shears",
                () -> new ShearsItem(new Item.Properties().durability(250)), color));
        materialTools.put("brush", register(materialName + "_brush",
                () -> new BrushItem(new Item.Properties().durability(250)), color));

        materialTools.put("paxel", register(materialName + "_paxel",
                () -> new CustomPaxel(paxelTier, new Item.Properties()
                        .attributes(CustomPaxel.createAttributes(paxelTier, 1.0F, -2.8F))), color));
        materialTools.put("sworoe", register(materialName + "_sworoe",
                () -> new CustomSworoe(sworoeTier, new Item.Properties()
                        .attributes(CustomSworoe.createAttributes(sworoeTier, 11.0F, -7.8F))), color));

        toolsByMaterial.put(materialName, materialTools);
        colorsByMaterial.put(materialName, color);
    }

    private <T extends Item> DeferredItem<T> register(String name, java.util.function.Supplier<T> supplier, MaterialColor color) {
        DeferredItem<T> item = items.register(name, supplier);
        allTools.add(item);
        colorsByTool.put(item, color);
        return item;
    }

    public List<DeferredItem<? extends Item>> getAllTools() {
        return allTools;
    }

    public DeferredItem<? extends Item> getTool(String material, String type) {
        Map<String, DeferredItem<? extends Item>> materialTools = toolsByMaterial.get(material);
        if (materialTools == null) return null;
        return materialTools.get(type);
    }

    public MaterialColor getColor(String material) {
        return colorsByMaterial.get(material);
    }

    public MaterialColor getToolColor(DeferredItem<? extends Item> tool) {
        return colorsByTool.get(tool);
    }
}
