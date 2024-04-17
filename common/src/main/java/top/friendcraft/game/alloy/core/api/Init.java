package top.friendcraft.game.alloy.core.api;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import top.friendcraft.game.alloy.AlloyModLoader;
import top.friendcraft.game.alloy.common.item.Alloy;
import top.friendcraft.game.alloy.common.item.ValinaMaterials;

public class Init {
    private final String MOD_ID;
    public ItemInit Items;

    protected Init(String MOD_ID) {
        this.MOD_ID = MOD_ID;
    }

    protected void addItems(ItemInit init){
        Items = init;
    }

    public static Init register(String MOD_ID) {
        Init init = new Init(MOD_ID);
        init.new ItemInit().Items.register();
        return init;
    }
    public class ItemInit{
        protected final DeferredRegister<Item> Items = DeferredRegister.create(MOD_ID, Registries.ITEM);
    }
}
