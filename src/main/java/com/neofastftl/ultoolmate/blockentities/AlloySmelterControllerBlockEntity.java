package com.neofastftl.ultoolmate.blockentities;

import com.neofastftl.ultoolmate.blocks.CustomBlocks;
import com.neofastftl.ultoolmate.menus.AlloySmelterMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.SimpleContainerData;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.items.ItemStackHandler;
import org.jetbrains.annotations.Nullable;

public class AlloySmelterControllerBlockEntity extends BlockEntity implements MenuProvider {
    private boolean isFormed = false;
    private int checkTicker = 0;

    private final ItemStackHandler inventory = new ItemStackHandler(4) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    public AlloySmelterControllerBlockEntity(BlockPos pos, BlockState state) {
        super(CustomBlockEntities.ALLOY_SMELTER_CONTROLLER_BE.get(), pos, state);
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("block.ultoolmate.alloy_smelter_controller");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
        return new AlloySmelterMenu(id, inventory, this, new SimpleContainerData(2));
    }

    public ItemStackHandler getInventory() {
        return inventory;
    }

    public static void tick(Level level, BlockPos pos, BlockState state, AlloySmelterControllerBlockEntity blockEntity) {
        if (level.isClientSide) return;

        blockEntity.checkTicker++;
        if (blockEntity.checkTicker >= 20) {
            blockEntity.checkTicker = 0;
            blockEntity.isFormed = blockEntity.checkMultiblock();
        }
    }

    public boolean checkMultiblock() {
        if (level == null) return false;

        // We search for a 3x3x3 hollow cube near the controller position.
        // Requirements:
        // - Outer shell must be Alloy Smelter Casing blocks, except that one shell block can be this controller.
        // - Inner 1x1x1 must be air (no blocks).
        // - The controller must lie on the outer shell of the detected cube.

        for (int dx = -2; dx <= 0; dx++) {
            for (int dy = -2; dy <= 0; dy++) {
                for (int dz = -2; dz <= 0; dz++) {
                    BlockPos origin = worldPosition.offset(dx, dy, dz);
                    if (is3x3x3HollowShellAt(origin)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private boolean isOnShell(BlockPos origin, BlockPos pos) {
        // Checks whether pos is on the 3x3x3 shell starting at origin (inclusive) to origin+(2,2,2)
        int ox = origin.getX();
        int oy = origin.getY();
        int oz = origin.getZ();
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        boolean within = (x >= ox && x <= ox + 2) && (y >= oy && y <= oy + 2) && (z >= oz && z <= oz + 2);
        if (!within) return false;
        boolean onMinMaxX = (x == ox) || (x == ox + 2);
        boolean onMinMaxY = (y == oy) || (y == oy + 2);
        boolean onMinMaxZ = (z == oz) || (z == oz + 2);
        // On shell if on any of the outer faces
        return onMinMaxX || onMinMaxY || onMinMaxZ;
    }

    private boolean is3x3x3HollowShellAt(BlockPos start) {
        // Ensure controller is on the shell for this candidate
        if (!isOnShell(start, worldPosition)) return false;

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                for (int z = 0; z < 3; z++) {
                    BlockPos current = start.offset(x, y, z);
                    boolean shell = (x == 0 || x == 2 || y == 0 || y == 2 || z == 0 || z == 2);

                    if (shell) {
                        // Shell blocks must be casing, except the controller position which is allowed
                        if (current.equals(worldPosition)) continue; // controller on shell is allowed

                        BlockState state = level.getBlockState(current);
                        if (!state.is(CustomBlocks.ALLOY_SMELTER_CASING.get())) {
                            return false;
                        }
                    } else {
                        // Inside must be air
                        if (!level.isEmptyBlock(current)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override
    protected void saveAdditional(CompoundTag tag, net.minecraft.core.HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.putBoolean("isFormed", isFormed);
        tag.put("Inventory", inventory.serializeNBT(registries));
    }

    @Override
    protected void loadAdditional(CompoundTag tag, net.minecraft.core.HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        isFormed = tag.getBoolean("isFormed");
        inventory.deserializeNBT(registries, tag.getCompound("Inventory"));
    }
}
