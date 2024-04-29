package top.friendcraft.game.alloy.common.item;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import top.friendcraft.game.alloy.AlloyModLoader;

public class VanillaAlloyMaterial implements AlloyMaterial {
    private final Item item;
    private int temperature;
    private static final int defaultT = 600;

    public VanillaAlloyMaterial(Item item) {
        this(item, defaultT);
    }

    public VanillaAlloyMaterial(Item item, int temperature) {
        this.item = item;
        this.temperature = temperature;
    }

    @Override
    public Item getItem() {
        return item;
    }

    @Override
    public String getNameSpace() {
        AlloyModLoader.LOGGER.info(item.toString());
        return "minecraft";
    }

    @Override
    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return this.getNameSpace() + ":" +
                BuiltInRegistries.ITEM.getKey(item).getPath();
    }
}
