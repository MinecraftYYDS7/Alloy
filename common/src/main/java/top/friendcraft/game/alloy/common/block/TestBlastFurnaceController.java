package top.friendcraft.game.alloy.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import top.friendcraft.game.alloy.AlloyModLoader;
import top.friendcraft.game.alloy.core.init.Init;

public class TestBlastFurnaceController extends BlastFurnaceControllerEntity{

    public TestBlastFurnaceController(BlockPos pos, BlockState blockState) {
        super(AlloyModLoader.initialization.blast_furnace_iron.get(), pos, blockState, 1);
    }
}
