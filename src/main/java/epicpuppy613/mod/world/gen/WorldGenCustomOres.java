package epicpuppy613.mod.world.gen;

import java.util.Random;

import epicpuppy613.mod.init.BlockEnderOres;
import epicpuppy613.mod.init.BlockInit;
import epicpuppy613.mod.init.BlockNetherOres;
import epicpuppy613.mod.init.BlockOres;
import epicpuppy613.mod.util.handlers.EnumHandler;
import epicpuppy613.mod.util.handlers.EnumHandlerEnd;
import epicpuppy613.mod.util.handlers.EnumHandlerNether;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator
{
	private WorldGenerator ore_overworld_rough_crystal;
	private WorldGenerator ore_overworld_crystal;
	private WorldGenerator ore_overworld_charged_crystal;
	private WorldGenerator ore_nether_crystal;
	private WorldGenerator ore_end_crystal;
	
	public WorldGenCustomOres() 
	{
		ore_overworld_rough_crystal = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.ROUGH_CRYSTAL), 15, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworld_crystal = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.CRYSTAL), 12, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworld_charged_crystal = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.CHARGED_CRYSTAL), 8, BlockMatcher.forBlock(Blocks.STONE));
		ore_nether_crystal = new WorldGenMinable(BlockInit.ORE_NETHER.getDefaultState().withProperty(BlockNetherOres.VARIANT, EnumHandlerNether.EnumType.CRYSTAL), 12, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_end_crystal = new WorldGenMinable(BlockInit.ORE_END.getDefaultState().withProperty(BlockEnderOres.VARIANT, EnumHandlerEnd.EnumType.CRYSTAL), 8, BlockMatcher.forBlock(Blocks.END_STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension()) 
		{
		case -1:
			
			runGenerator(ore_nether_crystal, world, random, chunkX, chunkZ, 12, 0, 256);
			
			break;
			
		case 0:
			
			runGenerator(ore_overworld_rough_crystal, world, random, chunkX, chunkZ, 12, 50, 100);
			runGenerator(ore_overworld_crystal, world, random, chunkX, chunkZ, 8, 10, 65);
			runGenerator(ore_overworld_charged_crystal, world, random, chunkX, chunkZ, 5, 0, 20);
			
			break;
			
		case 1:
			
			runGenerator(ore_end_crystal, world, random, chunkX, chunkZ, 8, 0, 256);
			
			break;
		
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) 
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++) 
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}
