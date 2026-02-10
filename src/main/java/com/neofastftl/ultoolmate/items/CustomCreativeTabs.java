package com.neofastftl.ultoolmate.items;

import com.neofastftl.ultoolmate.Ultoolmate;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CustomCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Ultoolmate.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ULTABMATE_TAB =
            CREATIVE_MODE_TABS.register("ultabmate_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab.ultoolmate.ultabmate"))
                    .icon(() -> new ItemStack(CustomItems.REFINED_ELECTRUM_INGOT.get()))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
