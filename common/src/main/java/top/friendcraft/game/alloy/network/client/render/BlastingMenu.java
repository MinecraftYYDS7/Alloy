package top.friendcraft.game.alloy.network.client.render;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.StackedContents;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import top.friendcraft.game.alloy.ClientModLoader;
import top.friendcraft.game.alloy.common.block.BlastFurnaceControllerEntity;

public class BlastingMenu extends RecipeBookMenu<BlastFurnaceControllerEntity> {
    private final Inventory playerInventory;
    private int level;
    private ContainerData data;
    private BlastingMenu(MenuType<?> menuType, int containerId, Inventory playerInventory, int level) {
        super(menuType, containerId);
        this.playerInventory = playerInventory;
        this.level = level;
    }

    public BlastingMenu(int containerId, Inventory playerInventory){
        this(ClientModLoader.initialization.blasting.get(), containerId, playerInventory, 0);
    }

    public BlastingMenu(int containerId, Inventory playerInventory, int level, ContainerData data) {
        this(ClientModLoader.initialization.blasting.get(), containerId, playerInventory, level);
        this.data = data;
    }

    @Override
    public void fillCraftSlotsStackedContents(StackedContents itemHelper) {

    }

    @Override
    public void clearCraftingContent() {

    }

    @Override
    public boolean recipeMatches(Recipe<? super BlastFurnaceControllerEntity> recipe) {
        return recipe.matches();
    }

    @Override
    public int getResultSlotIndex() {
        return 0;
    }

    @Override
    public int getGridWidth() {
        return 0;
    }

    @Override
    public int getGridHeight() {
        return 0;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public RecipeBookType getRecipeBookType() {
        return RecipeBookType.BLAST_FURNACE;
    }

    @Override
    public boolean shouldMoveToInventory(int slotIndex) {
        return false;
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        ItemStack quickStack = ItemStack.EMPTY;
        Slot quickSlot = getSlot(index);

        return quickStack;
    }

    @Override
    public boolean stillValid(Player player) {
        return AbstractContainerMenu.stillValid(player， );
    }
}
