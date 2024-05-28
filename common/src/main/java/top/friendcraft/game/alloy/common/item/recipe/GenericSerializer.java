package top.friendcraft.game.alloy.common.item.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;

public class GenericSerializer implements RecipeSerializer<GenericBlastingRecipe> {
    public static final String id = "blasting";
    public static final GenericSerializer INSTANCE = new GenericSerializer();

    @Override
    public GenericBlastingRecipe fromJson(ResourceLocation recipeId, JsonObject serializedRecipe) {
        ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(serializedRecipe, "output"));
        JsonArray ingredients = GsonHelper.getAsJsonArray(serializedRecipe, "ingredients");
        int cookingtime = GsonHelper.getAsInt(serializedRecipe, "cookingtime");
        NonNullList<Ingredient> inputs = NonNullList.withSize(ingredients.size(), Ingredient.EMPTY);

        for (int i = 0; i < ingredients.size(); i++) {
            inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
        }
        int exp = (inputs.size() - 1) / 5;
        return new GenericBlastingRecipe(recipeId, output, cookingtime, exp, inputs);
    }

    @Override
    public GenericBlastingRecipe fromNetwork(ResourceLocation recipeId, FriendlyByteBuf buffer) {
        int[] array = buffer.readVarIntArray();
        int exp = array[0];
        int size = array[1];
        int cookingtime = array[2];
        NonNullList<Ingredient> ingredients = NonNullList.withSize(size, Ingredient.EMPTY);
        ingredients.replaceAll(ignored -> Ingredient.fromNetwork(buffer));
        ItemStack result = buffer.readItem();
        return new GenericBlastingRecipe(recipeId, result, cookingtime, exp, ingredients);
    }

    @Override
    public void toNetwork(FriendlyByteBuf buffer, GenericBlastingRecipe recipe) {
        buffer.writeVarIntArray(new int[]{recipe.exp(), recipe.inputs().size(), recipe.cookingtime()});
        for (Ingredient ing : recipe.inputs()) {
            ing.toNetwork(buffer);
        }
        buffer.writeItem(recipe.result());
    }
}
