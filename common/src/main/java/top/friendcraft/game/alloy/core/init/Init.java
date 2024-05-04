package top.friendcraft.game.alloy.core.init;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.RecipeType;
import top.friendcraft.game.alloy.common.item.Alloy;
import top.friendcraft.game.alloy.common.item.VanillaMaterials;

public class Init extends top.friendcraft.game.alloy.core.api.Init {
    public final RegistrySupplier<Alloy> obsidianite = Items.register("obsidianite",
            ()->new Alloy(
                    new Item.Properties(), "obsidianite", 4,
                    VanillaMaterials.OBSIDIAN.get(), VanillaMaterials.CRYING_OBSIDIAN.get(),
                    VanillaMaterials.DIAMOND.get()));
    public final RegistrySupplier<Alloy> bedrockite = Items.register("bedrockite",
            ()->new Alloy(
                    new Item.Properties(), "bedrockite", 8,
                    VanillaMaterials.NETHERITE_INGOT.get(), VanillaMaterials.NETHER_STAR.get(),
                    VanillaMaterials.BEDROCK.get()));

    protected Init(String MOD_ID) {
        super(MOD_ID);
    }
    public static Init register(String MOD_ID) {
        Init init = new Init(MOD_ID);
        init.Items.register();
        init.Blocks.register();
        init.Recipes.register();
        return new Init(MOD_ID);
    }
}
