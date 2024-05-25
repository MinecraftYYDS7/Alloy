package top.friendcraft.game.alloy.common.item.recipe;

import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import top.friendcraft.game.alloy.common.block.BlastFurnaceControllerEntity;

public record GenericBlastingRecipe(ResourceLocation id, ItemStack result, int exp, NonNullList<Ingredient> inputs) implements IBlastFurnaceRecipe {

    @Override
    public boolean matches(BlastFurnaceControllerEntity container, Level level) {

        return false;
    }

    @Override
    public ItemStack assemble(BlastFurnaceControllerEntity container, RegistryAccess registryAccess) {
        return result;
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResultItem(RegistryAccess registryAccess) {
        return result.copy();
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return GenericSerializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return BlastFurnaceRecipeType.INSTANCE;
    }
}
