package top.friendcraft.game.alloy.core.api;

import top.friendcraft.game.alloy.core.init.IAlloyRegistry;

import java.util.function.Supplier;

public interface Manager<T extends IAlloyRegistry> extends Supplier<T> {
    T get();
}
