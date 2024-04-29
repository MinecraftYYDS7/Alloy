package top.friendcraft.game.alloy.core.api;

import dev.architectury.injectables.annotations.ExpectPlatform;

public class Linkage {
    @ExpectPlatform
    public static boolean isModLoading(String MODID) {
        return false;
    }
}
