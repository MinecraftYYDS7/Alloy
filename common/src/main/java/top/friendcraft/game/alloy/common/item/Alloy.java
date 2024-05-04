package top.friendcraft.game.alloy.common.item;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.data.recipes.CraftingRecipeBuilder;
import net.minecraft.world.item.Items;
import top.friendcraft.game.alloy.core.init.IAlloyRegistry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alloy extends AbstractAlloyItem implements AlloyMaterial {
    public final String id;
    public int level;
    public FuelMaterial fuel;
    public List<AlloyMaterial> fronting;
    public Alloy(Properties properties, String id, int level, AlloyMaterial... fronting) {
        super(properties);
        this.id = id;
        this.level = level;
        this.fronting = new ArrayList<>();
        this.fronting.addAll(Arrays.asList(fronting));
    }

    @Override
    public Item getItem() {
        return this;
    }

    @Override
    public int getTemperature() {
        return 0;
    }

    @Override
    public String getNameSpace() {
        return BuiltInRegistries.ITEM.getKey(this).getNamespace();
    }


    @Override
    public List<Item> getRecipeBy(JsonObject jsonObject) {
        JsonArray ingredients = (JsonArray) jsonObject.get("ingredients");
        List<JsonElement> item_tags = ingredients.asList();
        for (JsonElement element: item_tags){
            JsonObject tag = (JsonObject) element;
        }
        List<Item> recipeBy = new ArrayList<>();
        for (AlloyMaterial fronting:
             this.fronting) {
            recipeBy.set(this.fronting.indexOf(fronting), fronting.getItem());
        }
        return recipeBy;
    }
}
