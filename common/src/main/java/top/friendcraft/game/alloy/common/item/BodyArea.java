package top.friendcraft.game.alloy.common.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.Slot;
import top.friendcraft.game.alloy.common.entity.Organ;
import top.friendcraft.game.alloy.core.init.IAlloyRegistry;

public class BodyArea implements IAlloyRegistry {
    Organ[] organData;
    Slot[] slotData;
    final ResourceLocation ID;

    public BodyArea(ResourceLocation id) {
        ID = id;
    }

    @Override
    public ResourceLocation getID() {
        return ID;
    }
}
