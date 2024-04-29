package top.friendcraft.game.alloy.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Fireball;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.FireChargeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(FireChargeItem.class)
public abstract class MixinFireball extends Item {
    @Shadow protected abstract void playSound(Level level, BlockPos pos);

    public MixinFireball(Properties properties) {
        super(properties.food(new FoodProperties.Builder().nutrition(-1).alwaysEat().saturationMod(-1).build()));
    }

    @Unique
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        if (this.isEdible()) {
            ItemStack itemStack = player.getItemInHand(usedHand);
            if (player.canEat(this.getFoodProperties().canAlwaysEat())) {
                player.startUsingItem(usedHand);
                return InteractionResultHolder.consume(itemStack);
            } else {
                return InteractionResultHolder.fail(itemStack);
            }
        } else {
            ItemStack itemStack = player.getItemInHand(usedHand);
            level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.FIRECHARGE_USE, SoundSource.NEUTRAL, 0.5F, 0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F));
            player.getCooldowns().addCooldown(this, 10);
            if (!level.isClientSide) {
                Fireball flyingFireball = new LargeFireball(level, player, player.getX(), player.getY()+1, player.getZ(), 5);
                flyingFireball.setItem(itemStack);
                flyingFireball.shootFromRotation(player, player.getXRot(), player.getYRot(), (float)player.getZ(), 0.0F, 0.0F);
                level.addFreshEntity(flyingFireball);
                playSound(level, player.blockPosition());
            }
            player.awardStat(Stats.ITEM_USED.get(this));
            if (!player.getAbilities().instabuild) {
                itemStack.shrink(1);
            }
            return InteractionResultHolder.sidedSuccess(itemStack, level.isClientSide());
        }

    }

    /**
     * @author MiencraftYYDS7
     * @reason None
     */
    @Overwrite
    public InteractionResult useOn(UseOnContext context) {
        return InteractionResult.PASS;
    }

}
