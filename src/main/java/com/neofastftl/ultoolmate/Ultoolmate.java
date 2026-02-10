
package com.neofastftl.ultoolmate;

import com.neofastftl.ultoolmate.blockentities.CustomBlockEntities;
import com.neofastftl.ultoolmate.blocks.CustomBlocks;
import com.neofastftl.ultoolmate.menus.CustomMenus;
import com.neofastftl.ultoolmate.items.CustomCreativeTabs;
import com.neofastftl.ultoolmate.items.CustomItems;
import net.minecraft.world.item.CreativeModeTabs;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Ultoolmate.MOD_ID)
public class Ultoolmate {
    public static final String MOD_ID = "ultoolmate";
    private static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public Ultoolmate(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);
        CustomCreativeTabs.register(modEventBus);
        CustomItems.register(modEventBus);
        CustomBlocks.register(modEventBus);
        CustomBlockEntities.register(modEventBus);
        CustomMenus.register(modEventBus);
        com.neofastftl.ultoolmate.recipes.CustomRecipes.register(modEventBus);
        com.neofastftl.ultoolmate.loot.CustomLootModifiers.register(modEventBus);


        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CustomCreativeTabs.ULTABMATE_TAB.getKey()) {

            // Register all tools from the registry
            CustomItems.getAllTools().forEach(item -> event.accept(item.get()));


            // Smithing Templates - Materials
            CustomItems.getAllMaterialTemplates().forEach(item -> event.accept(item.get()));

            // Smithing Templates - Tools
            CustomItems.getAllToolTemplates().forEach(item -> event.accept(item.get()));


            // Placeholders
            event.accept(CustomItems.PLACEHOLDER_PAXEL.get());
            event.accept(CustomItems.PLACEHOLDER_SWOROE.get());
            event.accept(CustomItems.PLACEHOLDER_HOE.get());
            event.accept(CustomItems.PLACEHOLDER_AXE.get());
            event.accept(CustomItems.PLACEHOLDER_SWORD.get());
            event.accept(CustomItems.PLACEHOLDER_PICKAXE.get());
            event.accept(CustomItems.PLACEHOLDER_SHOVEL.get());
            event.accept(CustomItems.PLACEHOLDER_BRUSH.get());
            event.accept(CustomItems.PLACEHOLDER_SHEARS.get());

            // Ores and Such - Electrum
            event.accept(CustomBlocks.RAW_ELECTRUM_ORE.get());
            event.accept(CustomBlocks.DEEPSLATE_RAW_ELECTRUM_ORE.get());
            event.accept(CustomBlocks.RAW_ELECTRUM_BLOCK.get());
            event.accept(CustomItems.RAW_ELECTRUM.get());
            event.accept(CustomItems.REFINED_ELECTRUM_INGOT.get());
            event.accept(CustomBlocks.REFINED_ELECTRUM_BLOCK.get());

            // Alloy Smelter
            event.accept(CustomBlocks.ALLOY_SMELTER_CONTROLLER.get());
            event.accept(CustomBlocks.ALLOY_SMELTER_CASING.get());
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }

        @SubscribeEvent
        public static void registerScreens(net.neoforged.neoforge.client.event.RegisterMenuScreensEvent event) {
            event.register(CustomMenus.ALLOY_SMELTER_MENU.get(), com.neofastftl.ultoolmate.menus.AlloySmelterScreen::new);
        }

        @SubscribeEvent
        public static void registerItemColors(net.neoforged.neoforge.client.event.RegisterColorHandlersEvent.Item event) {
            for (net.neoforged.neoforge.registries.DeferredItem<? extends net.minecraft.world.item.Item> tool : CustomItems.getAllTools()) {
                com.neofastftl.ultoolmate.items.MaterialColor color = CustomItems.getToolColor(tool);
                if (color != null) {
                    event.register((stack, tintIndex) -> tintIndex == 0 ? 0xFF000000 | color.getColor() : -1, tool.get());
                }
            }

            for (net.neoforged.neoforge.registries.DeferredItem<net.minecraft.world.item.Item> template : CustomItems.getAllMaterialTemplates()) {
                com.neofastftl.ultoolmate.items.MaterialColor color = CustomItems.getMaterialTemplateColor(template);
                if (color != null) {
                    event.register((stack, tintIndex) -> tintIndex == 0 ? 0xFF000000 | color.getColor() : -1, template.get());
                }
            }

            // Register placeholders with a default color (e.g., white or a specific grey) if needed, 
            // but for now, let's just make sure they are fully opaque if tinted.
            // If they are not meant to be tinted, tintIndex 0 will just return the color, 
            // which might be undesired if the texture is already colored.
            // Most of these placeholders seem to be generic grayscale textures intended for tinting.
            // Tool Templates - Distinct colors
            event.register((stack, tintIndex) -> tintIndex == 0 ? 0xFF55FF55 : -1, CustomItems.PAXEL_ST.get());     // Light Green
            event.register((stack, tintIndex) -> tintIndex == 0 ? 0xFFFF5555 : -1, CustomItems.SWOROE_ST.get());    // Light Red
            event.register((stack, tintIndex) -> tintIndex == 0 ? 0xFFFFAA00 : -1, CustomItems.AXE_ST.get());       // Gold/Orange
            event.register((stack, tintIndex) -> tintIndex == 0 ? 0xFF55FFFF : -1, CustomItems.PICKAXE_ST.get());   // Aqua/Light Blue
            event.register((stack, tintIndex) -> tintIndex == 0 ? 0xFFFFFF55 : -1, CustomItems.SHOVEL_ST.get());    // Yellow
            event.register((stack, tintIndex) -> tintIndex == 0 ? 0xFFFF55FF : -1, CustomItems.SWORD_ST.get());     // Light Purple/Magenta
            event.register((stack, tintIndex) -> tintIndex == 0 ? 0xFF5555FF : -1, CustomItems.HOE_ST.get());       // Blue
            event.register((stack, tintIndex) -> tintIndex == 0 ? 0xFFAAAAAA : -1, CustomItems.SHEARS_ST.get());    // Light Gray
            event.register((stack, tintIndex) -> tintIndex == 0 ? 0xFFFF7F50 : -1, CustomItems.BRUSH_ST.get());     // Coral/Orange-Red

            // Placeholder Templates - Grey/White
            event.register((stack, tintIndex) -> tintIndex == 0 ? 0xFFE0E0E0 : -1, 
                    CustomItems.PLACEHOLDER_PAXEL.get(),
                    CustomItems.PLACEHOLDER_SWOROE.get(),
                    CustomItems.PLACEHOLDER_HOE.get(),
                    CustomItems.PLACEHOLDER_AXE.get(),
                    CustomItems.PLACEHOLDER_SWORD.get(),
                    CustomItems.PLACEHOLDER_PICKAXE.get(),
                    CustomItems.PLACEHOLDER_SHOVEL.get(),
                    CustomItems.PLACEHOLDER_BRUSH.get(),
                    CustomItems.PLACEHOLDER_SHEARS.get()
            );
        }
    }
}
