package top.friendcraft.game.alloy.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import top.friendcraft.game.alloy.AlloyModLoader;
import top.friendcraft.game.alloy.network.client.render.BlastingMenu;

public abstract class BlastFurnaceControllerEntity extends BaseContainerBlockEntity {
    protected static final int SLOT_INPUT_1 = 0;
    protected static final int SLOT_INPUT_2 = 1;
    protected static final int SLOT_INPUT_3 = 2;
    protected static final int SLOT_INPUT_4 = 3;
    protected static final int SLOT_INPUT_5 = 4;
    protected static final int SLOT_INPUT_6 = 5;
    protected static final int SLOT_INPUT_7 = 6;
    protected static final int SLOT_INPUT_8 = 7;
    protected static final int SLOT_INPUT_9 = 8;
    protected static final int SLOT_INPUT_10 = 9;
    protected static final int SLOT_FUEL_1 = 40;
    protected static final int SLOT_FUEL_2 = 41;
    protected static final int SLOT_OUTPUT = 42;
    private int xp;

    public BlastFurnaceControllerEntity(BlockEntityType<?> type, BlockPos pos, BlockState blockState, int exp) {
        super(type, pos, blockState);
        xp = exp;
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable(String.format("container.%s.blast_furnace", AlloyModLoader.MOD_ID));
    }

    protected int level() {
        return xp;
    }

    @Override
    protected AbstractContainerMenu createMenu(int containerId, Inventory inventory) {
        return new BlastingMenu(containerId, inventory);
    }

    @Override
    public int getContainerSize() {
        return ((int) Math.round(level() * 1.5) + 3) + 5 * level() + 1;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public ItemStack getItem(int slot) {
        return null;
    }

    @Override
    public ItemStack removeItem(int slot, int amount) {
        return null;
    }

    @Override
    public ItemStack removeItemNoUpdate(int slot) {
        return null;
    }

    @Override
    public void setItem(int slot, ItemStack stack) {

    }

    @Override
    public boolean stillValid(Player player) {
        return false;
    }

    @Override
    public void clearContent() {

    }
}