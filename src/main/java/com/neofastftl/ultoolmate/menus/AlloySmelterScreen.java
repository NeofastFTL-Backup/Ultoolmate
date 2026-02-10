package com.neofastftl.ultoolmate.menus;

import com.mojang.blaze3d.systems.RenderSystem;
import com.neofastftl.ultoolmate.Ultoolmate;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class AlloySmelterScreen extends AbstractContainerScreen<AlloySmelterMenu> {
    private static final ResourceLocation TEXTURE =
            ResourceLocation.fromNamespaceAndPath(Ultoolmate.MOD_ID, "textures/gui/alloy_smelter.png");
    private static final ResourceLocation STONE_BRICKS =
            ResourceLocation.withDefaultNamespace("textures/block/stone_bricks.png");
    private static final ResourceLocation SLOT_SPRITE =
            ResourceLocation.withDefaultNamespace("container/slot");
    private static final ResourceLocation OUTPUT_SLOT_SPRITE =
            ResourceLocation.withDefaultNamespace("container/furnace/output_slot");

    public AlloySmelterScreen(AlloySmelterMenu menu, Inventory inventory, Component component) {
        super(menu, inventory, component);
    }

    @Override
    protected void init() {
        super.init();
        this.inventoryLabelY = 10000;
        this.titleLabelY = 10000;
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float partialTick, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        // Draw stone bricks as background
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        guiGraphics.blit(STONE_BRICKS, x, y, 0, 0, imageWidth, imageHeight, 16, 16);

        // Draw the GUI texture with some transparency to let stone bricks show through
        // Note: This assumes the GUI texture has transparency or we want to blend it.
        // If the GUI texture is missing, it will be purple/black, so we might want to skip it or handle it.
        RenderSystem.enableBlend();
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 0.6F); // 60% opacity for the GUI texture
        guiGraphics.blit(TEXTURE, x, y, 0, 0, imageWidth, imageHeight);
        RenderSystem.disableBlend();
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

        renderSlots(guiGraphics, x, y);

        renderProgressArrow(guiGraphics, x, y);
    }

    private void renderSlots(GuiGraphics guiGraphics, int x, int y) {
        // Player Inventory Slots
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                guiGraphics.blitSprite(SLOT_SPRITE, x + 7 + j * 18, y + 83 + i * 18, 18, 18);
            }
        }

        // Hotbar Slots
        for (int i = 0; i < 9; i++) {
            guiGraphics.blitSprite(SLOT_SPRITE, x + 7 + i * 18, y + 141, 18, 18);
        }

        // Alloy Smelter Slots
        guiGraphics.blitSprite(SLOT_SPRITE, x + 43, y + 16, 18, 18); // Input 1 (44-1, 17-1)
        guiGraphics.blitSprite(SLOT_SPRITE, x + 61, y + 16, 18, 18); // Input 2 (62-1, 17-1)
        guiGraphics.blitSprite(SLOT_SPRITE, x + 52, y + 52, 18, 18); // Fuel
        guiGraphics.blitSprite(OUTPUT_SLOT_SPRITE, x + 112, y + 31, 24, 24); // Output (116-4, 35-4)
    }

    private void renderProgressArrow(GuiGraphics guiGraphics, int x, int y) {
        // progress logic would go here if needed
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float delta) {
        renderBackground(guiGraphics, mouseX, mouseY, delta);
        super.render(guiGraphics, mouseX, mouseY, delta);
        renderTooltip(guiGraphics, mouseX, mouseY);
    }
}
