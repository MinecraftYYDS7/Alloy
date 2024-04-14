package top.friendcraft.game.alloy.fabriclike;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;
import top.friendcraft.game.alloy.AlloyModLoader;

public class AlloyClothesModLoader {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static void init() {
        AlloyModLoader.init();
        LOGGER.info("Fabrics Module Initializing...");
    }
}
