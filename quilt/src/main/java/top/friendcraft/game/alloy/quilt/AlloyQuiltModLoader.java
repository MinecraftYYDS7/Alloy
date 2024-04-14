package top.friendcraft.game.alloy.quilt;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;
import top.friendcraft.game.alloy.fabriclike.AlloyClothesModLoader;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class AlloyQuiltModLoader implements ModInitializer {
    private static final Logger LOGGER = LogUtils.getLogger();
    @Override
    public void onInitialize(ModContainer mod) {
        AlloyClothesModLoader.init();
        LOGGER.info("Quilt Module Initializing...");
    }
}
