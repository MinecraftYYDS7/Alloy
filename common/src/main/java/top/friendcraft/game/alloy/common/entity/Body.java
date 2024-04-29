package top.friendcraft.game.alloy.common.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.Slot;
import top.friendcraft.game.alloy.core.init.IAlloyRegistry;

import java.util.Map;

public class Body implements IAlloyRegistry {
    Properties properties;
    @Override
    public ResourceLocation getID() {
        return properties.ID();
    }
    static class Properties extends top.friendcraft.game.alloy.core.api.Properties {
        private Map<Organ[], Slot[]> X;
        private Map<Organ[], Slot[]> F;
        private Map<Organ[], Slot[]> S;
        private Map<Organ[], Slot[]> E;
        private Map<Organ[], Slot[]> Z;
        private Map<Organ[], Slot[]> H;
        private Properties(String MODID, String ID) {
            super(MODID, ID);
        }
    }
}
