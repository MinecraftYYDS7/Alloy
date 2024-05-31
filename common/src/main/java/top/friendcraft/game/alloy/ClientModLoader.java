package top.friendcraft.game.alloy;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import top.friendcraft.game.alloy.AlloyModLoader;
import top.friendcraft.game.alloy.core.init.ClientInit;

@Environment(EnvType.CLIENT)
public class ClientModLoader {
    public static ClientInit initialization;
    public static void init() {
        initialization = ClientInit.register(AlloyModLoader.MOD_ID);
    }
}
