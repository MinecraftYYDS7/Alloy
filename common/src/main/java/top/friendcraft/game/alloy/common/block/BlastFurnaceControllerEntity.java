package top.friendcraft.game.alloy.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import top.friendcraft.game.alloy.AlloyModLoader;
import top.friendcraft.game.alloy.network.client.render.BlastingMenu;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public abstract class BlastFurnaceControllerEntity extends BaseContainerBlockEntity {
    private final int xp;
    protected int[] sizes;
    protected ArrayList<NonNullList<ItemStack>> handlers;
    protected int[] indexes;
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

    public BlastFurnaceControllerEntity(BlockEntityType<?> type, BlockPos pos, BlockState blockState, int exp) {
        super(type, pos, blockState);
        xp = exp;
        sizes = new int[]{5 * level() + 1, (int) Math.round(level() * 1.5) + 3, level() > 3 ? 1 : 2, level() > 3 ? 1 : 2};
        handlers = new ArrayList<>();
        for (int i = 0; i < Arrays.stream(sizes).sum(); i++) {
            handlers.add(NonNullList.withSize(sizes[i], ItemStack.EMPTY));
        }
        indexes = new int[]{0, 50, 52, 54};
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
        return Arrays.stream(sizes).sum();
    }

    @Override
    public boolean isEmpty() {
        boolean p = true;
        for (NonNullList<ItemStack> handler :
                handlers) {
            p = p && isEmpty(handler);
        }
        return p;
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
        return getHandler(slot).get(slot);
    }

    @Override
    public ItemStack removeItem(int slot, int amount) {
        ItemStack g = getHandler(slot).get(slot);
        g.setCount(g.getCount()-amount);
        return getHandler(slot).set(slot, g);
    }

    @Override
    public ItemStack removeItemNoUpdate(int slot) {
        return getHandler(slot).remove(slot);
    }

    @Override
    public void setItem(int slot, ItemStack stack) {
        getHandler(slot).set(slot, stack);
    }

    @Override
    public boolean stillValid(Player player) {
        return Container.stillValidBlockEntity(this, player);
    }

    @Override
    public void clearContent() {
        for (NonNullList<ItemStack> handler:
             handlers) {
            handler.clear();
        }
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        tag.putShort("Progress", (short) progress);
        tag.putShort("CookingTime", (short) cookingtime);
    }

    protected NonNullList<ItemStack> getHandler(int slot) {
        NonNullList<ItemStack> handler = null;
        boolean flag = false;
        if (!(slot < 0 || slot > (17 + indexes[3]))) {
            for (int i = 0; i < indexes.length; i++) {
                if (slot > indexes[i]){
                    handler = handlers.get(i);
                    flag = true;
                }
            }
        }
        if (!flag){
            throw new NullPointerException("Slot Not Defined");
        }
        return handler;
    }

    @Override
    public void startOpen(Player player) {
        super.startOpen(player);
    }

    @Override
    public void stopOpen(Player player){

    }
}