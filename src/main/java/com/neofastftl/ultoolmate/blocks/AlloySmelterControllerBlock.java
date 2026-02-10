package com.neofastftl.ultoolmate.blocks;

import com.mojang.serialization.MapCodec;
import com.neofastftl.ultoolmate.blockentities.AlloySmelterControllerBlockEntity;
import com.neofastftl.ultoolmate.blockentities.CustomBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class AlloySmelterControllerBlock extends BaseEntityBlock {
    public static final MapCodec<AlloySmelterControllerBlock> CODEC = simpleCodec(AlloySmelterControllerBlock::new);

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    public AlloySmelterControllerBlock(Properties properties) {
        super(properties);
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new AlloySmelterControllerBlockEntity(pos, state);
    }

    public static final TagKey<Item> PAXELS_TAG = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("neofastftl", "paxels"));

    @Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (stack.is(PAXELS_TAG)) {
            if (!level.isClientSide) {
                BlockEntity entity = level.getBlockEntity(pos);
                if (entity instanceof AlloySmelterControllerBlockEntity controller) {
                    if (controller.checkMultiblock()) {
                        player.sendSystemMessage(Component.literal("Multiblock formed with paxel!"));
                    } else {
                        player.sendSystemMessage(Component.literal("Multiblock is incomplete!"));
                    }
                }
            }
            return ItemInteractionResult.sidedSuccess(level.isClientSide);
        }
        return super.useItemOn(stack, state, level, pos, player, hand, hitResult);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (!level.isClientSide) {
            BlockEntity entity = level.getBlockEntity(pos);
            if (entity instanceof AlloySmelterControllerBlockEntity controller) {
                if (controller.checkMultiblock()) {
                    player.openMenu(controller, pos);
                } else {
                    player.sendSystemMessage(Component.literal("Multiblock is incomplete!"));
                }
            }
        }
        return InteractionResult.SUCCESS;
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        return createTickerHelper(type, CustomBlockEntities.ALLOY_SMELTER_CONTROLLER_BE.get(),
                AlloySmelterControllerBlockEntity::tick);
    }
}
