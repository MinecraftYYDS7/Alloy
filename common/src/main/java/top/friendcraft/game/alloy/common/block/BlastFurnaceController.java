package top.friendcraft.game.alloy.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import top.friendcraft.game.alloy.common.item.AlloyMaterial;
import top.friendcraft.game.alloy.common.item.FuelMaterial;

public class BlastFurnaceController extends BaseEntityBlock {
    public BlastFurnaceController(Properties properties) {
        super(properties);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return null;
    }

    public boolean isCanBurning(FuelMaterial fuel, AlloyMaterial... buringMaterial){
        int lvl = fuel.lvl;
        int temprature = fuel.getTemperature();
        return true;
    }
}
