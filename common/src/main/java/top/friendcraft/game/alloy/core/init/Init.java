package top.friendcraft.game.alloy.core.init;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import top.friendcraft.game.alloy.common.block.BlastFurnaceController;
import top.friendcraft.game.alloy.common.block.TestBlastFurnaceController;
import top.friendcraft.game.alloy.common.item.Alloy;
import top.friendcraft.game.alloy.common.item.VanillaMaterials;
import top.friendcraft.game.alloy.common.item.recipe.BlastFurnaceRecipeType;
import top.friendcraft.game.alloy.common.item.recipe.GenericSerializer;
import top.friendcraft.game.alloy.network.client.render.BlastingMenu;

public class Init extends top.friendcraft.game.alloy.core.api.Init {
    public final RegistrySupplier<Alloy> obsidianite = Items.register("obsidianite",
            () -> new Alloy(
                    new Item.Properties(), "obsidianite", 4,
                    VanillaMaterials.OBSIDIAN.get(), VanillaMaterials.CRYING_OBSIDIAN.get(),
                    VanillaMaterials.DIAMOND.get()));
    public final RegistrySupplier<Alloy> bedrockite = Items.register("bedrockite",
            () -> new Alloy(
                    new Item.Properties(), "bedrockite", 8,
                    VanillaMaterials.NETHERITE_INGOT.get(), VanillaMaterials.NETHER_STAR.get(),
                    VanillaMaterials.BEDROCK.get()));
    public final RegistrySupplier<BlastFurnaceController> test = Blocks.register("test_block_blasting",
            () -> new BlastFurnaceController(BlockBehaviour.Properties.of().sound(SoundType.STONE)));
    public final RegistrySupplier<RecipeType<?>> blasting = Recipes.register(BlastFurnaceRecipeType.id,
            () -> BlastFurnaceRecipeType.INSTANCE);    public final RegistrySupplier<MenuType<?>> blast_furnace = Menus.register("blast_furnace",
            () -> new MenuType<>(BlastingMenu::new, FeatureFlags.DEFAULT_FLAGS));
    public final RegistrySupplier<RecipeSerializer<?>> blasting_ = Serializers.register(GenericSerializer.id,
            () -> GenericSerializer.INSTANCE);
    protected Init(String MOD_ID) {
        super(MOD_ID);
    }

    public static Init register(String MOD_ID) {
        Init init = new Init(MOD_ID);
        init.Items.register();
        init.Blocks.register();
        init.Recipes.register();
        init.Serializers.register();
        init.Menus.register();
        init.BlockEntities.register();
        return new Init(MOD_ID);
    }    public final RegistrySupplier<BlockEntityType<?>> blast_furnace_iron = BlockEntities.register("iron_blast_furnace",
            () -> BlockEntityType.Builder.of(TestBlastFurnaceController::new, test.get()).build(null));






}
