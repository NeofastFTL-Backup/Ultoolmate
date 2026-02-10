package com.neofastftl.ultoolmate.items;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaterialRegistry {
    private final DeferredRegister.Items items;
    private final List<DeferredItem<Item>> allTemplates = new ArrayList<>();
    private final Map<String, DeferredItem<Item>> templatesByMaterial = new HashMap<>();

    private final Map<String, MaterialColor> colorsByMaterial = new HashMap<>();
    private final Map<DeferredItem<Item>, MaterialColor> colorsByTemplate = new HashMap<>();

    public MaterialRegistry(DeferredRegister.Items items) {
        this.items = items;
    }

    public void registerMaterial(String materialName, MaterialColor color) {
        DeferredItem<Item> template = items.register(materialName + "_st",
                () -> new Item(new Item.Properties()));
        
        templatesByMaterial.put(materialName, template);
        colorsByMaterial.put(materialName, color);
        colorsByTemplate.put(template, color);
        allTemplates.add(template);
    }

    public List<DeferredItem<Item>> getAllTemplates() {
        return allTemplates;
    }

    public DeferredItem<Item> getTemplate(String material) {
        return templatesByMaterial.get(material);
    }

    public MaterialColor getColor(String material) {
        return colorsByMaterial.get(material);
    }

    public MaterialColor getTemplateColor(DeferredItem<Item> template) {
        return colorsByTemplate.get(template);
    }
}
