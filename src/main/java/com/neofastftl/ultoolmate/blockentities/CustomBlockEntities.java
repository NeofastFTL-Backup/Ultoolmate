package com.neofastftl.ultoolmate.blockentities;

import com.neofastftl.ultoolmate.Ultoolmate;
import com.neofastftl.ultoolmate.blocks.CustomBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class CustomBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Ultoolmate.MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AlloySmelterControllerBlockEntity>> ALLOY_SMELTER_CONTROLLER_BE =
            BLOCK_ENTITIES.register("alloy_smelter_controller_be", () ->
                    BlockEntityType.Builder.of(AlloySmelterControllerBlockEntity::new,
                            CustomBlocks.ALLOY_SMELTER_CONTROLLER.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
