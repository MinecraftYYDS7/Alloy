package top.friendcraft.game.alloy;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class AlloyModLoader {
    public static final String MOD_ID = "alloy";
    // We can use this if we don't want to use DeferredRegister
    public static final Logger LOGGER = LogUtils.getLogger();
    
    public static void init() {
        LOGGER.info("Common Mod Initializing...");
        LOGGER.info("Item Load Done!");
    }
}
