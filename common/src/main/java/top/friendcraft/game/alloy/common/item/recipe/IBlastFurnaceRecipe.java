package top.friendcraft.game.alloy.common.item.recipe;

import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;
import top.friendcraft.game.alloy.common.block.BlastFurnaceControllerEntity;

public interface IBlastFurnaceRecipe extends Recipe<BlastFurnaceControllerEntity> {
    @Override
    default RecipeType<?> getType() {
        return BlastFurnaceRecipeType.INSTANCE;
    }
}
