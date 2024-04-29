package top.friendcraft.game.alloy.core.api;

import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class Init {
    protected final DeferredRegister<Item> Items;

    protected Init(String MOD_ID) {
        this.Items = DeferredRegister.create(MOD_ID, Registries.ITEM);
    }
}
