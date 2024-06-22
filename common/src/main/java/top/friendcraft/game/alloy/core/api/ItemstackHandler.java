package top.friendcraft.game.alloy.core.api;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

public class ItemstackHandler implements IItemstackHandler{
    private NonNullList<ItemStack> handler;
    public ItemstackHandler(int size) {
        handler = NonNullList.withSize(size, ItemStack.EMPTY);
    }
    public ItemstackHandler() {
        this(IItemstackHandler.defaultSize);
    }

    @Override
    public NonNullList<ItemStack> raw() {
        return handler;
    }

    @Override
    public int slots() {
        return handler.size();
    }

    @Override
    public ItemStack getBySlot(int slot) {
        return handler.get(slot);
    }
}
