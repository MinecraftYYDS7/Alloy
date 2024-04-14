package top.friendcraft.game.alloy.common.item;

import net.minecraft.world.item.Item;

public class FuelMaterial implements AlloyMaterial {
    private Item item;
    public int lvl;
    public int temprature;

    FuelMaterial(Item item, int level, int temprature) {
        this.item = item;
        lvl = level;
        this.temprature = temprature;
    }

    @Override
    public Item getItem() {
        return item;
    }

    @Override
    public String getNameSpace() {
        return null;
    }
}
