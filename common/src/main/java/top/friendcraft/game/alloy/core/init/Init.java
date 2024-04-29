package top.friendcraft.game.alloy.core.init;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.Item;
import top.friendcraft.game.alloy.common.item.Alloy;
import top.friendcraft.game.alloy.common.item.VanillaMaterials;

public class Init extends top.friendcraft.game.alloy.core.api.Init {
    public final RegistrySupplier<Alloy> obsidianite = Items.register("obsidianite",
            ()->new Alloy(
                    new Item.Properties(), "obsidianite", 4,
                    VanillaMaterials.OBSIDIAN.get(), VanillaMaterials.CRYING_OBSIDIAN.get(),
                    VanillaMaterials.DIAMOND.get()));

    protected Init(String MOD_ID) {
        super(MOD_ID);
    }
    public static Init register(String MOD_ID) {
        Init init = new Init(MOD_ID);
        init.Items.register();
        return new Init(MOD_ID);
    }
}
