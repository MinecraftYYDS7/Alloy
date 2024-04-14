package top.friendcraft.game.alloy.common.item;

import net.minecraft.world.item.Item;
import top.friendcraft.game.alloy.AlloyModLoader;

public class ValinaAlloyMaterial implements AlloyMaterial {
    private final Item item;
    public ValinaAlloyMaterial(Item item){
        this.item = item;
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
}
