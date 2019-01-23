package com.teammetallurgy.atum.blocks.machines;

import javax.annotation.Nonnull;

import com.teammetallurgy.atum.blocks.base.IRenderMapper;
import com.teammetallurgy.atum.blocks.machines.tileentity.TileEntityKiln;
import com.teammetallurgy.atum.init.AtumBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BlockKilnFake extends BlockContainer implements IRenderMapper {
    public static final PropertyBool UP = PropertyBool.create("up");
    public static final PropertyBool EAST = PropertyBool.create("east");
    public static final PropertyBool NORTH = PropertyBool.create("north");

    public BlockKilnFake() {
        super(Material.ROCK, MapColor.SAND);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setSoundType(SoundType.STONE);
        this.setDefaultState(this.blockState.getBaseState().withProperty(UP, false).withProperty(EAST, false).withProperty(NORTH, false));
    }

	public BlockPos getPrimaryKilnBlock(World world, BlockPos pos) {
		IBlockState state = world.getBlockState(pos);
		BlockPos primaryPos = pos;
		System.out.println(state.getValue(UP) + " " + state.getValue(EAST) + " "  + state.getValue(NORTH));
		if(state.getValue(UP))
			primaryPos = primaryPos.offset(EnumFacing.UP);
		if(state.getValue(EAST))
			primaryPos = primaryPos.offset(EnumFacing.EAST);
		if(state.getValue(NORTH))
			primaryPos = primaryPos.offset(EnumFacing.SOUTH);
		
		return primaryPos;
	}

    @Override
    @Nonnull
    public ItemStack getPickBlock(@Nonnull IBlockState state, RayTraceResult target, @Nonnull World world, @Nonnull BlockPos pos, EntityPlayer player) {
        return new ItemStack(AtumBlocks.KILN);
    }

    @Override
    @Nonnull
    public IBlockState getStateFromMeta(int meta) {
        IBlockState state = this.getDefaultState();
        EnumFacing facing = EnumFacing.byHorizontalIndex(meta & 0x11b);
        return state.withProperty(UP, (meta & 0b001) == 1).withProperty(EAST, (meta & 0b010) > 0).withProperty(NORTH, (meta & 0b100) > 0);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        int meta = 0;
        if (state.getValue(UP)) {
            meta |= 0b001;
        }
        if (state.getValue(EAST)) {
            meta |= 0b010;
        }
        if (state.getValue(NORTH)) {
            meta |= 0b100;
        }
        return meta;
    }

    @Override
    @Nonnull
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }

    @Override
    @Nonnull
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, UP, NORTH, EAST);
    }

    @Override
    public IProperty[] getNonRenderingProperties() {
        return new IProperty[]{UP, NORTH, EAST};
    }
    
    @Override
    public boolean hasTileEntity(IBlockState state) {
    	return true;
    }

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityKiln();
	}
}