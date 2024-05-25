package top.friendcraft.game.alloy.core.api;

import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class Init {
    protected final DeferredRegister<Item> Items;
    protected final DeferredRegister<Block> Blocks;
    protected final DeferredRegister<RecipeType<?>> Recipes;
    protected final DeferredRegister<RecipeSerializer<?>> Serializers;
    protected final DeferredRegister<MenuType<?>> Menus;
    protected final DeferredRegister<BlockEntityType<?>> BlockEntities;

    protected Init(String MOD_ID) {
        Items = DeferredRegister.create(MOD_ID, Registries.ITEM);
        Blocks = DeferredRegister.create(MOD_ID, Registries.BLOCK);
        Recipes = DeferredRegister.create(MOD_ID, Registries.RECIPE_TYPE);
        Serializers = DeferredRegister.create(MOD_ID, Registries.RECIPE_SERIALIZER);
        Menus = DeferredRegister.create(MOD_ID, Registries.MENU);
        BlockEntities = DeferredRegister.create(MOD_ID, Registries.BLOCK_ENTITY_TYPE);
    }
}
