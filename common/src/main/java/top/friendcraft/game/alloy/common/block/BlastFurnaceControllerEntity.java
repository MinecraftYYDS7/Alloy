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

public class BlastFurnaceControllerEntity extends BaseContainerBlockEntity {
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
    protected static final int SLOT_INPUT_11 = 10;
    protected static final int SLOT_INPUT_12 = 11;
    protected static final int SLOT_INPUT_13 = 12;
    protected static final int SLOT_INPUT_14 = 13;
    protected static final int SLOT_INPUT_15 = 14;
    protected static final int SLOT_INPUT_16 = 15;
    protected static final int SLOT_INPUT_17 = 16;
    protected static final int SLOT_INPUT_18 = 17;
    protected static final int SLOT_INPUT_19 = 18;
    protected static final int SLOT_INPUT_20 = 19;
    protected static final int SLOT_INPUT_21 = 20;
    protected static final int SLOT_INPUT_22 = 21;
    protected static final int SLOT_INPUT_23 = 22;
    protected static final int SLOT_INPUT_24 = 23;
    protected static final int SLOT_INPUT_25 = 24;
    protected static final int SLOT_INPUT_26 = 25;
    protected static final int SLOT_INPUT_27 = 26;
    protected static final int SLOT_INPUT_28 = 27;
    protected static final int SLOT_INPUT_29 = 28;
    protected static final int SLOT_INPUT_30 = 29;
    protected static final int SLOT_INPUT_31 = 30;
    protected static final int SLOT_INPUT_32 = 31;
    protected static final int SLOT_INPUT_33 = 32;
    protected static final int SLOT_INPUT_34 = 33;
    protected static final int SLOT_INPUT_35 = 34;
    protected static final int SLOT_INPUT_36 = 35;
    protected static final int SLOT_INPUT_37 = 36;
    protected static final int SLOT_INPUT_38 = 37;
    protected static final int SLOT_INPUT_39 = 38;
    protected static final int SLOT_INPUT_40 = 39;
    protected static final int SLOT_FUEL_1 = 40;
    protected static final int SLOT_FUEL_2 = 41;
    protected static final int SLOT_OUTPUT = 42;
    protected static final int SLOT_PRODUCT = 43;

    public BlastFurnaceControllerEntity(BlockEntityType<?> type, BlockPos pos, BlockState blockState) {
        super(type, pos, blockState);
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable(String.format("container.%s.blast_furnace", AlloyModLoader.MOD_ID));
    }

    @Override
    protected AbstractContainerMenu createMenu(int containerId, Inventory inventory) {
        return null;
    }

    @Override
    public int getContainerSize() {
        return 44;
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