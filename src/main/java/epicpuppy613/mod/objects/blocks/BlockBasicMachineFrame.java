package epicpuppy613.mod.objects.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBasicMachineFrame extends BlockBase 
{
	
	public BlockBasicMachineFrame(String name) 
	{
		super(name ,Material.IRON);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) 
	{
		return false;
	}
}
