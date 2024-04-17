package top.friendcraft.game.alloy.common.item;

import com.google.gson.JsonObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

import java.util.List;


public abstract class AbstractAlloyItem extends Item {
    public AbstractAlloyItem(Properties properties) {
        super(properties);
    }

    /**
     * get Namespace and get Key
     *
     * @return namespace and key in this item
     */
    @Override
    public String toString() {
        return BuiltInRegistries.ITEM.getKey(this).getNamespace() + ":" +
                BuiltInRegistries.ITEM.getKey(this).getPath();
    }

    public abstract List<Item> getRecipeBy(JsonObject jsonObject);
}
