package top.friendcraft.game.alloy.mixin;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import top.friendcraft.game.alloy.common.entity.BodyController;

@Mixin(Player.class)
public abstract class MixinPlayer extends LivingEntity {
    @Unique
    BodyController bodyController;

    protected MixinPlayer(EntityType<? extends LivingEntity> entityType, Level level) {
        super(entityType, level);
    }

    @Unique
    public BodyController getBodyController() {
        if (this.bodyController == null) {
            createBodyController();
        }
        return this.bodyController;
    }

    @Unique
    public void createBodyController() {
        this.bodyController = new BodyController();
    }
}
