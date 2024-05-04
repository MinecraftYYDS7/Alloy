package top.friendcraft.game.alloy.core.api;

import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;

public class Init {
    protected final DeferredRegister<Item> Items;
    protected final DeferredRegister<Block> Blocks;
    protected final DeferredRegister<RecipeType<?>> Recipes;

    protected Init(String MOD_ID) {
        this.Items = DeferredRegister.create(MOD_ID, Registries.ITEM);
        this.Blocks = DeferredRegister.create(MOD_ID, Registries.BLOCK);
        this.Recipes = DeferredRegister.create(MOD_ID, Registries.RECIPE_TYPE);
    }
}
