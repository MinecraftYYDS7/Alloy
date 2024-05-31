package top.friendcraft.game.alloy.core.api;

import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;

public class ClientInit extends Init {
    protected final DeferredRegister<MenuType<?>> Menus;
    protected ClientInit(String MOD_ID) {
        super(MOD_ID);
        Menus = DeferredRegister.create(MOD_ID, Registries.MENU);
    }
}
