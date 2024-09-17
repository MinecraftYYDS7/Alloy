package top.friendcraft.game.alloy.core.init;

import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class Tabs {
    public static final CreativeModeTab tab = CreativeTabRegistry.create(Component.translatable("itemGroup.alloy.alloys"), () -> new ItemStack(Inits.steel_ingot.get()));
    public static final CreativeModeTab tabMaterial = CreativeTabRegistry.create(Component.translatable("itemGroup.alloy.materials"), () -> new ItemStack(Inits.unfired_obsidianite.get()));
    public static final CreativeModeTab tabPotion = CreativeTabRegistry.create(Component.translatable("itemGroup.alloy.potions"), () -> new ItemStack(Inits.unfired_obsidianite.get()));
}
