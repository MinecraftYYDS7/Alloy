package top.friendcraft.game.alloy;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;
import top.friendcraft.game.alloy.core.api.Init;

public class AlloyModLoader {
    public static final String MOD_ID = "alloy";
    // We can use this if we don't want to use DeferredRegister
    public static final Logger LOGGER = LogUtils.getLogger();
    public static Init.ItemInit Items;
    
    public static void init() {
        LOGGER.info("Common Mod Initializing...");
        Init init = top.friendcraft.game.alloy.core.init.Init.register(MOD_ID);
        Items = init.Items;
        LOGGER.info("Item Load Done!");
    }
}
