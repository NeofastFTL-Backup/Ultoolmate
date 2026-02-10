package com.neofastftl.ultoolmate.menus;

import com.neofastftl.ultoolmate.Ultoolmate;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CustomMenus {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(BuiltInRegistries.MENU, Ultoolmate.MOD_ID);

    public static final net.neoforged.neoforge.registries.DeferredHolder<MenuType<?>, MenuType<AlloySmelterMenu>> ALLOY_SMELTER_MENU =
            MENUS.register("alloy_smelter", () -> net.neoforged.neoforge.common.extensions.IMenuTypeExtension.create(AlloySmelterMenu::new));

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
