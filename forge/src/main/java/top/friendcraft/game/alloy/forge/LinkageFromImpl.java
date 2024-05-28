package top.friendcraft.game.alloy.forge;

import net.minecraftforge.fml.ModList;

public class LinkageFromImpl {
    public static boolean isModLoading(String MODID) {
        return ModList.get().isLoaded(MODID);
    }
}
