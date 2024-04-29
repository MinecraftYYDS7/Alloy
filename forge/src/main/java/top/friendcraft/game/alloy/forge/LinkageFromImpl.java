package top.friendcraft.game.alloy.forge;

import net.minecraftforge.fml.ModList;
import net.minecraftforge.forgespi.language.IModInfo;

public class LinkageFromImpl {
    public static boolean isModLoading(String MODID) {
        for (IModInfo modInfo :
                ModList.get().getMods()) {
            if (MODID.equals(modInfo.getModId())) {
                return true;
            }
        }
        return false;
    }
}
