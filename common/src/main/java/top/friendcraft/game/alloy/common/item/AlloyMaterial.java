package top.friendcraft.game.alloy.common.item;

import net.minecraft.world.item.Item;

public interface AlloyMaterial {
    static AlloyMaterial getFromValina(Item item) {
        return new ValinaAlloyMaterial(item);
    }

    static FuelMaterial getFromValina(Item item, int lvl, int temperature) {
        return new FuelMaterial(item, lvl, temperature);
    }

    Item getItem();
    int getTemperature();
    String getNameSpace();
}
