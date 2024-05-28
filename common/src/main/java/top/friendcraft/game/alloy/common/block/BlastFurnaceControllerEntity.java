package top.friendcraft.game.alloy.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import top.friendcraft.game.alloy.AlloyModLoader;
import top.friendcraft.game.alloy.network.client.render.BlastingMenu;

import java.util.AbstractList;
import java.util.Iterator;

public abstract class BlastFurnaceControllerEntity extends BaseContainerBlockEntity {
    protected int[] sizes;
    protected int inputsSize;
    protected int outputsSize;
    protected int fuelsSize;
    protected int upgradeSize;
    protected NonNullList<ItemStack>[] handlers;
    protected NonNullList<ItemStack> inputsHandler;
    protected NonNullList<ItemStack> outputsHandler;
    protected NonNullList<ItemStack> fuelsHandler;
    protected NonNullList<ItemStack> upgradeHandler;
    protected int[] indexes;
    protected int inputsIndex;
    protected int outputsIndex;
    protected int fuelsIndex;
    protected int upgradesIndex;
    protected int progress;
    protected int cookingtime;
    protected ContainerData data = new ContainerData() {
        @Override
        public int get(int index) {
            return switch (index) {
                case 0 -> BlastFurnaceControllerEntity.this.progress;
                case 1 -> BlastFurnaceControllerEntity.this.cookingtime;
                default -> 0;
            };
        }

        @Override
        public void set(int index, int value) {
            switch (index) {
                case 0:
                    BlastFurnaceControllerEntity.this.progress = value;
                case 1:
                    BlastFurnaceControllerEntity.this.cookingtime = value;
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    };
    private final int xp;

    public BlastFurnaceControllerEntity(BlockEntityType<?> type, BlockPos pos, BlockState blockState, int exp) {
        super(type, pos, blockState);
        xp = exp;
        inputsSize = 5 * level() + 1;
        upgradeSize = (int) Math.round(level() * 1.5) + 3;
        fuelsSize = outputsSize = level() > 3 ? 1 : 2;
        inputsHandler = NonNullList.withSize(inputsSize, ItemStack.EMPTY);
        outputsHandler = NonNullList.withSize(outputsSize, ItemStack.EMPTY);
        fuelsHandler = NonNullList.withSize(fuelsSize, ItemStack.EMPTY);
        upgradeHandler = NonNullList.withSize(upgradeSize, ItemStack.EMPTY);
        int index = 0;
        inputsIndex = index;
        index += inputsSize;
        outputsIndex = index;
        index += outputsSize;
        fuelsIndex = index;
        index += fuelsSize;
        upgradesIndex = index;
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
        return new BlastingMenu(containerId, inventory, level(), data);
    }

    @Override
    public int getContainerSize() {
        return upgradeSize + 5 * level() + 1;
    }

    @Override
    public boolean isEmpty() {
        return isEmpty(inputsHandler) && isEmpty(outputsHandler) && isEmpty(fuelsHandler) && isEmpty(upgradeHandler);
    }

    public boolean isEmpty(AbstractList<?> handler) {
        Iterator<?> var1 = handler.iterator();

        ItemStack itemStack;
        do {
            if (!var1.hasNext()) {
                return true;
            }

            itemStack = (ItemStack) var1.next();
        } while (itemStack.isEmpty());

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

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        tag.putShort("Progress", (short) progress);
        tag.putShort("CookingTime", (short) cookingtime);
    }


}