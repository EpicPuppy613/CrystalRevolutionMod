package epicpuppy613.mod.init;

import java.util.ArrayList;
import java.util.List;

import epicpuppy613.mod.objects.armor.ArmorBase;
import epicpuppy613.mod.objects.items.ItemBase;
import epicpuppy613.mod.objects.tools.ToolAxe;
import epicpuppy613.mod.objects.tools.ToolHoe;
import epicpuppy613.mod.objects.tools.ToolPickaxe;
import epicpuppy613.mod.objects.tools.ToolShovel;
import epicpuppy613.mod.objects.tools.ToolSword;
import epicpuppy613.mod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial TOOL_ROUGH_CRYSTAL = EnumHelper.addToolMaterial("tool_rough_crystal", 1, 200, 5.0F, 1.0F, 5);
	public static final ArmorMaterial ARMOR_ROUGH_CRYSTAL = EnumHelper.addArmorMaterial("armor_rough_crystal", Reference.MODID + ":rough_crystal", 15, new int[]{2, 4, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	//Items
	public static final Item ROUGH_CRYSTAL = new ItemBase("rough_crystal");
	public static final Item CRYSTAL = new ItemBase("crystal");
	
	//Fuels
	public static final Item ROUGH_CRYSTAL_FUEL = new ItemBase("rough_crystal_fuel");
	public static final Item BASIC_CRYSTAL_FUEL = new ItemBase("basic_crystal_fuel");
	
	//Tools
	public static final Item ROUGH_CRYSTAL_AXE = new ToolAxe("rough_crystal_axe", TOOL_ROUGH_CRYSTAL);
	public static final Item ROUGH_CRYSTAL_HOE = new ToolHoe("rough_crystal_hoe", TOOL_ROUGH_CRYSTAL);
	public static final Item ROUGH_CRYSTAL_PICKAXE = new ToolPickaxe("rough_crystal_pickaxe", TOOL_ROUGH_CRYSTAL);
	public static final Item ROUGH_CRYSTAL_SHOVEL = new ToolShovel("rough_crystal_shovel", TOOL_ROUGH_CRYSTAL);
	public static final Item ROUGH_CRYSTAL_SWORD = new ToolSword("rough_crystal_sword", TOOL_ROUGH_CRYSTAL);
	
	//Armor
	public static final Item ROUGH_CRYSTAL_HELMET = new ArmorBase("rough_crystal_helmet", ARMOR_ROUGH_CRYSTAL, 1, EntityEquipmentSlot.HEAD);
	public static final Item ROUGH_CRYSTAL_CHESTPLATE = new ArmorBase("rough_crystal_chestplate", ARMOR_ROUGH_CRYSTAL, 1, EntityEquipmentSlot.CHEST);
	public static final Item ROUGH_CRYSTAL_LEGGINGS = new ArmorBase("rough_crystal_leggings", ARMOR_ROUGH_CRYSTAL, 2, EntityEquipmentSlot.LEGS);
	public static final Item ROUGH_CRYSTAL_BOOTS = new ArmorBase("rough_crystal_boots", ARMOR_ROUGH_CRYSTAL, 1, EntityEquipmentSlot.FEET);
}
