package top.friendcraft.game.alloy.core.init;

import dev.architectury.registry.registries.RegistrySupplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import top.friendcraft.game.alloy.network.client.render.BlastingMenu;

@Environment(EnvType.CLIENT)
public class ClientInit extends top.friendcraft.game.alloy.core.api.ClientInit {

    public final RegistrySupplier<MenuType<?>> blasting = Menus.register("blast_furnace",
            () -> new MenuType<>(BlastingMenu::new, FeatureFlags.DEFAULT_FLAGS));
    protected ClientInit(String MOD_ID) {
        super(MOD_ID);
    }
    public static ClientInit register(String MOD_ID) {
        ClientInit init = new ClientInit(MOD_ID);
        init.Menus.register();
        return init;
    }
}
