package top.friendcraft.game.alloy.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.common.MinecraftForge;
import top.friendcraft.game.alloy.AlloyModLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AlloyModLoader.MOD_ID)
public class AlloyForgeModLoader {
    public AlloyForgeModLoader() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(AlloyModLoader.MOD_ID, MinecraftForge.EVENT_BUS);
        AlloyModLoader.init();
    }
}
