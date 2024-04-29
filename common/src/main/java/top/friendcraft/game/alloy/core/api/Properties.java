package top.friendcraft.game.alloy.core.api;

import net.minecraft.resources.ResourceLocation;

public class Properties {
    private final ResourceLocation ID;
    public Properties(ResourceLocation ID) {
        this.ID = ID;
    }
    public Properties(String MODID, String ID) {
        this(new ResourceLocation(MODID, ID));
    }
    public ResourceLocation ID(){
        return ID;
    }
}
