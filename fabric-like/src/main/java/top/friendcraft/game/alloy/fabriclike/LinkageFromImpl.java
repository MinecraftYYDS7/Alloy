package top.friendcraft.game.alloy.fabriclike;

import net.fabricmc.fabric.impl.gametest.FabricGameTestModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class LinkageFromImpl {
    public static boolean isModLoading(String MODID) {
        return FabricLoader.getInstance().isModLoaded(MODID);
    }
}
