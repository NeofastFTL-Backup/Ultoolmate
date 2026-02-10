package com.neofastftl.ultoolmate.blocks;

import com.neofastftl.ultoolmate.Ultoolmate;
import com.neofastftl.ultoolmate.items.CustomItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CustomBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Ultoolmate.MOD_ID);

    public static final DeferredBlock<Block> RAW_ELECTRUM_ORE = registerBlock("raw_electrum_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.NETHER_GOLD_ORE)));

    public static final DeferredBlock<Block> DEEPSLATE_RAW_ELECTRUM_ORE = registerBlock("deepslate_raw_electrum_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> RAW_ELECTRUM_BLOCK = registerBlock("raw_electrum_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.COPPER_GRATE)));

    public static final DeferredBlock<Block> REFINED_ELECTRUM_BLOCK = registerBlock("refined_electrum_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.COPPER_GRATE)));

    public static final DeferredBlock<AlloySmelterControllerBlock> ALLOY_SMELTER_CONTROLLER = registerBlock("alloy_smelter_controller",
            () -> new AlloySmelterControllerBlock(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> ALLOY_SMELTER_CASING = registerBlock("alloy_smelter_casing",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        CustomItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
