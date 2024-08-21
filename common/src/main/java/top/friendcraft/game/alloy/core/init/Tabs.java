package top.friendcraft.game.alloy.core.init;

import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class Tabs {
    public static final CreativeModeTab tab = CreativeTabRegistry.create(Component.translatable("itemGroup.alloy.alloys"), () -> new ItemStack(Inits.steel_ingot.get()));
}
