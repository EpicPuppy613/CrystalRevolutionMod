package epicpuppy613.mod.init;

import java.util.ArrayList;
import java.util.List;
import epicpuppy613.mod.objects.blocks.BlockBase;
import epicpuppy613.mod.objects.blocks.BlockBasicMachineFrame;
import epicpuppy613.mod.objects.blocks.BlockRoughMachineFrame;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Materials
	public static final Block ROUGH_CRYSTAL_MACHINE_FRAME = new BlockRoughMachineFrame("rough_crystal_machine_frame");
	public static final Block ROUGH_CRYSTAL_BLOCK = new BlockBase("rough_crystal_block", Material.IRON);
	public static final Block BASIC_CRYSTAL_MACHINE_FRAME = new BlockBasicMachineFrame("basic_crystal_machine_frame");
	public static final Block CRYSTAL_BLOCK = new BlockBase("crystal_block", Material.IRON);
	
	//Ores
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	public static final Block ORE_NETHER = new BlockNetherOres("ore_nether", "nether");
	public static final Block ORE_END = new BlockEnderOres("ore_end", "end");
}
