package net.linkbrad.hiddendangers.fluid;


import net.minecraft.block.BlockState;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public abstract class HeavyMetalsFluid extends FlowableFluid {

    @Override
    protected boolean isInfinite(World world) {
        return false;
    }

    @Override
    protected void beforeBreakingBlock(WorldAccess world, BlockPos pos, BlockState state) {

    }

    @Override
    protected int getLevelDecreasePerBlock(WorldView world) {
        return 1;
    }

    @Override
    public int getLevel(FluidState state) {
        return 0;
    }

    @Override
    public int getTickRate(WorldView world) {
        return 20;
    }

    @Override
    protected float getBlastResistance() {
        return 100f;
    }

    @Override
    protected boolean canBeReplacedWith(FluidState state, BlockView world, BlockPos pos, Fluid fluid, Direction direction) {
        return false;

    }

    @Override
    public Fluid getStill() {
        return ModFluids.HEAVYMETALSSTILL;
    }

    @Override
    public Fluid getFlowing() {
        return ModFluids.HEAVYMETALSFLOWING;
    }

    @Override
    public Item getBucketItem() {
        return ModFluids.HEAVYMETALCONTAINER;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return ModFluids.HEAVYMETALBLOCK.getDefaultState().with(Properties.LEVEL_15, getBlockStateLevel(state));
    }

    @Override
    public boolean isStill(FluidState state) {
        return false;
    }

    @Override
    public boolean matchesType(Fluid fluid) {
        return fluid == getStill() || fluid == getFlowing();
    }

    public static class Flowing extends  HeavyMetalsFluid{
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        protected int getMaxFlowDistance(WorldView world) {
            return 12;
        }


        @Override
        public int getLevel(FluidState state) {
            return state.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState state) {
            return false;
        }
    }


    public static class Still extends  HeavyMetalsFluid{
        @Override
        protected int getMaxFlowDistance(WorldView world) {
            return 12;
        }

        @Override
        public int getLevel(FluidState state) {
            return 12;
        }

        @Override
        public boolean isStill(FluidState state) {
            return true;
        }



    }


}