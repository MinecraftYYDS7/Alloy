package top.friendcraft.game.alloy.fabric;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;
import top.friendcraft.game.alloy.fabriclike.AlloyClothesModLoader;
import net.fabricmc.api.ModInitializer;

public class AlloyFabricModLoader implements ModInitializer {
    private static final Logger LOGGER = LogUtils.getLogger();
    @Override
    public void onInitialize() {
        AlloyClothesModLoader.init();
        LOGGER.info("Fabric Module Initializing...");
    }
}
