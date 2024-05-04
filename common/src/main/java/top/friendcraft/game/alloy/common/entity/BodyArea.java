package top.friendcraft.game.alloy.common.entity;

import net.minecraft.resources.ResourceLocation;
import top.friendcraft.game.alloy.common.entity.Organ;
import top.friendcraft.game.alloy.core.init.IAlloyRegistry;

public class BodyArea implements IAlloyRegistry {
    Organ[] organData;
    int[] slotData;
    final ResourceLocation ID;

    public BodyArea(ResourceLocation id) {
        ID = id;
    }

    @Override
    public ResourceLocation getID() {
        return ID;
    }
}
