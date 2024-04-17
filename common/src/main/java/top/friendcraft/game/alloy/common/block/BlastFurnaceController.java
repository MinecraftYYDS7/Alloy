package top.friendcraft.game.alloy.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
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
        return null;
    }

    public boolean isCanBurning(FuelMaterial fuel, AlloyMaterial... burningMaterial) {
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

    public class BlastFurnaceControllerEntity extends BlockEntity {
        protected static final int SLOT_INPUT_1 = 0;
        protected static final int SLOT_INPUT_2 = 1;
        protected static final int SLOT_INPUT_3 = 2;
        protected static final int SLOT_INPUT_4 = 3;
        protected static final int SLOT_INPUT_5 = 4;
        protected static final int SLOT_INPUT_6 = 5;
        protected static final int SLOT_INPUT_7 = 6;
        protected static final int SLOT_INPUT_8 = 7;
        protected static final int SLOT_INPUT_9 = 8;
        protected static final int SLOT_INPUT_10 = 9;
        protected static final int SLOT_INPUT_11 = 10;
        protected static final int SLOT_INPUT_12 = 11;
        protected static final int SLOT_INPUT_13 = 12;
        protected static final int SLOT_INPUT_14 = 13;
        protected static final int SLOT_INPUT_15 = 14;
        protected static final int SLOT_INPUT_16 = 15;
        protected static final int SLOT_INPUT_17 = 16;
        protected static final int SLOT_INPUT_18 = 17;
        protected static final int SLOT_INPUT_19 = 18;
        protected static final int SLOT_INPUT_20 = 19;
        protected static final int SLOT_INPUT_21 = 20;
        protected static final int SLOT_INPUT_22 = 21;
        protected static final int SLOT_INPUT_23 = 22;
        protected static final int SLOT_INPUT_24 = 23;
        protected static final int SLOT_INPUT_25 = 24;
        protected static final int SLOT_INPUT_26 = 25;
        protected static final int SLOT_INPUT_27 = 26;
        protected static final int SLOT_INPUT_28 = 27;
        protected static final int SLOT_INPUT_29 = 28;
        protected static final int SLOT_INPUT_30 = 29;
        protected static final int SLOT_INPUT_31 = 30;
        protected static final int SLOT_INPUT_32 = 31;
        protected static final int SLOT_INPUT_33 = 32;
        protected static final int SLOT_INPUT_34 = 33;
        protected static final int SLOT_INPUT_35 = 34;
        protected static final int SLOT_INPUT_36 = 35;
        protected static final int SLOT_INPUT_37 = 36;
        protected static final int SLOT_INPUT_38 = 37;
        protected static final int SLOT_INPUT_39 = 38;
        protected static final int SLOT_INPUT_40 = 39;
        protected static final int SLOT_FUEL_1 = 40;
        protected static final int SLOT_FUEL_2 = 41;
        protected static final int SLOT_OUTPUT = 42;
        protected static final int SLOT_PRODUCT = 43;

        public BlastFurnaceControllerEntity(BlockEntityType<?> type, BlockPos pos, BlockState blockState) {
            super(type, pos, blockState);
        }
    }
}
