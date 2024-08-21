package top.friendcraft.game.alloy.core.init;


import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import top.friendcraft.game.alloy.AlloyModLoader;
import top.friendcraft.game.alloy.common.item.Alloy;

public class Inits {
    public static final DeferredRegister<Item> Items;
    public static final DeferredRegister<Block> Blocks;
    public static final DeferredRegister<RecipeType<?>> Recipes;
    public static final DeferredRegister<RecipeSerializer<?>> Serializers;
    public static final DeferredRegister<BlockEntityType<?>> BlockEntities;
    static {
        Items = DeferredRegister.create(AlloyModLoader.MOD_ID, Registries.ITEM);
        Blocks = DeferredRegister.create(AlloyModLoader.MOD_ID, Registries.BLOCK);
        Recipes = DeferredRegister.create(AlloyModLoader.MOD_ID, Registries.RECIPE_TYPE);
        Serializers = DeferredRegister.create(AlloyModLoader.MOD_ID, Registries.RECIPE_SERIALIZER);
        BlockEntities = DeferredRegister.create(AlloyModLoader.MOD_ID, Registries.BLOCK_ENTITY_TYPE);
    }
    static {
        Items.register("steel_ingot", ()->new Alloy(new Item.Properties()));
    }
}
