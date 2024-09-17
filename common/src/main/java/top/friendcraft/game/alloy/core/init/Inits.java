package top.friendcraft.game.alloy.core.init;


import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import top.friendcraft.game.alloy.AlloyModLoader;
import top.friendcraft.game.alloy.common.block.AlloyFurnace;
import top.friendcraft.game.alloy.common.item.Alloy;

public class Inits {
    public static final DeferredRegister<Item> Items;
    public static final DeferredRegister<Block> Blocks;
    public static final DeferredRegister<RecipeType<?>> Recipes;
    public static final DeferredRegister<RecipeSerializer<?>> Serializers;
    public static final DeferredRegister<BlockEntityType<?>> BlockEntities;
    public static final DeferredRegister<CreativeModeTab> Tabs;
    public static final DeferredRegister<Potion> Potions;

    public static final RegistrySupplier<Alloy> steel_ingot;
    public static final RegistrySupplier<Item> unfired_obsidianite;
    public static final PotionItem potiontest;
    public static final RegistrySupplier<CreativeModeTab> alloys;
    public static final RegistrySupplier<CreativeModeTab> materials;
    public static final RegistrySupplier<CreativeModeTab> potions;

    static {
        Items = DeferredRegister.create(AlloyModLoader.MOD_ID, Registries.ITEM);
        Blocks = DeferredRegister.create(AlloyModLoader.MOD_ID, Registries.BLOCK);
        Potions = DeferredRegister.create(AlloyModLoader.MOD_ID, Registries.POTION);
        Tabs = DeferredRegister.create(AlloyModLoader.MOD_ID, Registries.CREATIVE_MODE_TAB);
        Recipes = DeferredRegister.create(AlloyModLoader.MOD_ID, Registries.RECIPE_TYPE);
        Serializers = DeferredRegister.create(AlloyModLoader.MOD_ID, Registries.RECIPE_SERIALIZER);
        BlockEntities = DeferredRegister.create(AlloyModLoader.MOD_ID, Registries.BLOCK_ENTITY_TYPE);
    }

    static {
        alloys = Tabs.register("alloys", () -> top.friendcraft.game.alloy.core.init.Tabs.tab);
        materials = Tabs.register("materials", () -> top.friendcraft.game.alloy.core.init.Tabs.tabMaterial);
        potions = Tabs.register("potions", () -> top.friendcraft.game.alloy.core.init.Tabs.tabPotion);
    }

    static {
        // alloys
        steel_ingot = Items.register("steel_ingot", () -> new Alloy(new Item.Properties()));
        Items.register("obsidianite", () -> new Alloy(new Item.Properties()));
        // materials
        unfired_obsidianite = Items.register("unfired_obsidianite", () -> new Item(new Item.Properties().arch$tab(materials)));
        // potion mappings
        potiontest = new PotionItem(new Item.Properties().arch$tab(potions));
    }

    static {
        Blocks.register("alloy_furnace", () -> new AlloyFurnace(BlockBehaviour.Properties.of()));
    }

    public static void register() {
        Tabs.register();
        Items.register();
        Blocks.register();
        Potions.register();
        Recipes.register();
        Serializers.register();
        BlockEntities.register();
    }
}
