package top.friendcraft.game.alloy.common.item;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

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
    public List<Item> getRecipeBy() {
        List<Item> recipeBy = new ArrayList<>();
        for (AlloyMaterial fronting:
             this.fronting) {
            recipeBy.set(this.fronting.indexOf(fronting), fronting.getItem());
        }
        return recipeBy;
    }
}
