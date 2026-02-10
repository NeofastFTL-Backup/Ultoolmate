package com.neofastftl.ultoolmate.menus;

import com.neofastftl.ultoolmate.blockentities.AlloySmelterControllerBlockEntity;
import com.neofastftl.ultoolmate.blocks.CustomBlocks;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.neoforged.neoforge.items.SlotItemHandler;

public class AlloySmelterMenu extends AbstractContainerMenu {
    private final AlloySmelterControllerBlockEntity blockEntity;
    private final Level level;
    private final ContainerData data;

    public AlloySmelterMenu(int containerId, Inventory inv, FriendlyByteBuf extraData) {
        this(containerId, inv, inv.player.level().getBlockEntity(extraData.readBlockPos()), new SimpleContainerData(2));
    }

    public AlloySmelterMenu(int containerId, Inventory inv, BlockEntity entity, ContainerData data) {
        super(CustomMenus.ALLOY_SMELTER_MENU.get(), containerId);
        checkContainerSize(inv, 4);
        blockEntity = (AlloySmelterControllerBlockEntity) entity;
        this.level = inv.player.level();
        this.data = data;

        addPlayerInventory(inv);
        addPlayerHotbar(inv);

        IItemHandler inventory = blockEntity.getInventory();
        this.addSlot(new SlotItemHandler(inventory, 0, 44, 17)); // Input 1
        this.addSlot(new SlotItemHandler(inventory, 1, 62, 17)); // Input 2
        this.addSlot(new SlotItemHandler(inventory, 2, 53, 53)); // Fuel
        this.addSlot(new SlotItemHandler(inventory, 3, 116, 35)); // Output

        addDataSlots(data);
    }

    @Override
    public ItemStack quickMoveStack(Player playerIn, int index) {
        Slot sourceSlot = slots.get(index);
        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyStack = sourceStack.copy();

        if (index < 36) {
            if (!moveItemStackTo(sourceStack, 36, 40, false)) {
                return ItemStack.EMPTY;
            }
        } else if (index < 40) {
            if (!moveItemStackTo(sourceStack, 0, 36, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            return ItemStack.EMPTY;
        }

        if (sourceStack.isEmpty()) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }

        sourceSlot.onTake(playerIn, sourceStack);
        return copyStack;
    }

    @Override
    public boolean stillValid(Player player) {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()), player, CustomBlocks.ALLOY_SMELTER_CONTROLLER.get());
    }

    private void addPlayerInventory(Inventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(Inventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }
}
