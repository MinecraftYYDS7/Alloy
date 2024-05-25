package top.friendcraft.game.alloy.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;
import top.friendcraft.game.alloy.common.item.AlloyMaterial;
import top.friendcraft.game.alloy.common.item.FuelMaterial;

import java.util.ArrayList;
import java.util.List;

public class BlastFurnaceController extends BaseEntityBlock {
    public BlastFurnaceController(Properties properties) {
        super(properties);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new TestBlastFurnaceController(pos, state);
    }

    public static boolean isCanBurning(FuelMaterial fuel, AlloyMaterial... burningMaterial) {
        int lvl = fuel.lvl;
        int temperature = fuel.getTemperature();
        List<Integer> material_temperature = new ArrayList<>();
        List<Integer> material_lvl = new ArrayList<>();
        for (AlloyMaterial material : burningMaterial) {
            material_temperature.add(material.getTemperature());
        }
        int average = (int) material_temperature.stream().mapToDouble(e -> e).sum();
        return average > temperature;
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (!level.isClientSide){
            if (level.getBlockEntity(pos) instanceof BlastFurnaceControllerEntity entity) {
                player.openMenu(entity);
            }
        }
        return InteractionResult.SUCCESS;
    }
}
