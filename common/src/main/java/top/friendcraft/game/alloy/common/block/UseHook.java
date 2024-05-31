package top.friendcraft.game.alloy.common.block;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class UseHook {
    @ExpectPlatform
    public static void doUse(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit, BlastFurnaceControllerEntity entity) {

    }
}
