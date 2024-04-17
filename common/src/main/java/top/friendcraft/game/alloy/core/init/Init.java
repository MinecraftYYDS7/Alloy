package top.friendcraft.game.alloy.core.init;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.Item;
import top.friendcraft.game.alloy.AlloyModLoader;
import top.friendcraft.game.alloy.common.item.Alloy;
import top.friendcraft.game.alloy.common.item.ValinaMaterials;

public class Init extends top.friendcraft.game.alloy.core.api.Init {
    protected Init() {
        super(AlloyModLoader.MOD_ID);
    }
    public class ItemInit extends top.friendcraft.game.alloy.core.api.Init.ItemInit {
        public final RegistrySupplier<Alloy> obsidianite = Items.register("obsidianite", ()->
                new Alloy(new Item.Properties(), "obsidianite", 4,
                        ValinaMaterials.OBSIDIAN.getMaterial(), ValinaMaterials.CRYING_OBSIDIAN.getMaterial(),
                        ValinaMaterials.DIAMOND.getMaterial()));
    }
}
