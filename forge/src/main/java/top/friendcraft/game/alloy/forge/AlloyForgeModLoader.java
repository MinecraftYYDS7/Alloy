package top.friendcraft.game.alloy.forge;

import dev.architectury.platform.forge.EventBuses;
import top.friendcraft.game.alloy.AlloyModLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AlloyModLoader.MOD_ID)
public class AlloyForgeModLoader {
    public AlloyForgeModLoader() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(AlloyModLoader.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        AlloyModLoader.init();
    }
}
