package top.friendcraft.game.alloy.common.item;

import net.minecraft.world.item.Item;
import top.friendcraft.game.alloy.core.init.Inits;

public class Alloy extends Item {
    public Alloy(Properties properties) {
        super(properties.arch$tab(Inits.alloys.get()));
    }
}
