package top.friendcraft.game.alloy.core.api;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

public interface IItemstackHandler {
    static final int defaultSize = 1;
    NonNullList<ItemStack> raw();

    int slots();

    ItemStack getBySlot(int slot);
}
