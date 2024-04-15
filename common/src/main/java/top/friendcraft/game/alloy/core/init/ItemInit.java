package top.friendcraft.game.alloy.core.init;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import top.friendcraft.game.alloy.AlloyModLoader;
import top.friendcraft.game.alloy.common.item.Alloy;
import top.friendcraft.game.alloy.common.item.ValinaMaterials;

public class ItemInit {
    public static final DeferredRegister<Item> Items = DeferredRegister.create(AlloyModLoader.MOD_ID, Registries.ITEM);
    public static final RegistrySupplier<Alloy> obsidian = Items.register("obsidianite", ()->
            new Alloy(new Item.Properties(), "obsidianite", 4,
                    ValinaMaterials.OBSIDIAN.getMaterial(), ValinaMaterials.CRYING_OBSIDIAN.getMaterial(),
                    ValinaMaterials.DIAMOND.getMaterial()));
    public static void register(){
        Items.register();
    }
}
