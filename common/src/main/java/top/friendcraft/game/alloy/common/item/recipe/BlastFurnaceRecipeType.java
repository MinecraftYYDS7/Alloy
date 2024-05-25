package top.friendcraft.game.alloy.common.item.recipe;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeType;
import top.friendcraft.game.alloy.AlloyModLoader;
import top.friendcraft.game.alloy.core.init.IAlloyRegistry;

public class BlastFurnaceRecipeType implements RecipeType<IBlastFurnaceRecipe>, IAlloyRegistry {
    public static final String id = "blasting";
    public static final BlastFurnaceRecipeType INSTANCE = new BlastFurnaceRecipeType();

    @Override
    public ResourceLocation getID() {
        return new ResourceLocation(AlloyModLoader.MOD_ID, id);
    }
}
