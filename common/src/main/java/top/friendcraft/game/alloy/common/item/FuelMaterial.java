package top.friendcraft.game.alloy.common.item;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

public class FuelMaterial implements AlloyMaterial {
    private final Item item;
    public int lvl;
    private int temperature;

    FuelMaterial(Item item, int level, int temperature) {
        this.item = item;
        this.lvl = level;
        this.temperature = temperature;
    }

    @Override
    public Item getItem() {
        return item;
    }

    @Override
    public int getTemperature() {
        return temperature;
    }

    @Override
    public String getNameSpace() {
        return BuiltInRegistries.ITEM.getKey(item).getNamespace();
    }


}
