package top.friendcraft.game.alloy.common.block.fabric;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import top.friendcraft.game.alloy.common.block.BlastFurnaceControllerEntity;

public class UseHookImpl {
    public static void doUse(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit, BlastFurnaceControllerEntity entity) {
        if (!level.isClientSide){
            MenuProvider screenHandlerFactory = state.getMenuProvider(level, pos);
            ServerPlayer player_ = (ServerPlayer) player;
            if (screenHandlerFactory != null) {
                player_.openMenu(screenHandlerFactory);
            }
        }
    }
}
