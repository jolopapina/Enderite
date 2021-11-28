package io.github.lieonlion.enderite.core.init;

import io.github.lieonlion.enderite.Enderite;
import io.github.lieonlion.enderite.common.material.CustomArmorMaterial;
import io.github.lieonlion.enderite.common.material.CustomToolMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ItemInit {
	private ItemInit() {}
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Enderite.MODID);
	
	// Items
	public static final RegistryObject<Item> ENDERITE_GEM = ITEMS.register("enderite_gem", 
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC).fireResistant()));
	
	public static final RegistryObject<Item> RAW_ENDERITE = ITEMS.register("raw_enderite", 
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC).fireResistant()));
	
	public static final RegistryObject<Item> COOKED_ENDERITE = ITEMS.register("cooked_enderite", 
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC).fireResistant()));
	
	// Block Items
		public static final RegistryObject<BlockItem> ENDERITE_BLOCK_ITEM = ITEMS.register("enderite_block", 
				() -> new BlockItem(BlockInit.ENDERITE_BLOCK.get(), 
				new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS).fireResistant()));
		
		public static final RegistryObject<BlockItem> ENDERITE_ORE_ITEM = ITEMS.register("enderite_ore", 
				() -> new BlockItem(BlockInit.ENDERITE_ORE.get(), 
				new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS).fireResistant()));
		
		// Tools
		public static final RegistryObject<SwordItem> ENDERITE_SWORD = ITEMS.register("enderite_sword", 
				() -> new SwordItem(CustomToolMaterial.ENDERITE_TOOLS, 3, -2.4f, 
				new Item.Properties().tab(ItemGroup.TAB_COMBAT).fireResistant()));
		
		public static final RegistryObject<ShovelItem> ENDERITE_SHOVEL = ITEMS.register("enderite_shovel", 
				() -> new ShovelItem(CustomToolMaterial.ENDERITE_TOOLS, 1.5f, -3f, 
				new Item.Properties().tab(ItemGroup.TAB_TOOLS).fireResistant()));
		
		public static final RegistryObject<PickaxeItem> ENDERITE_PICKAXE = ITEMS.register("enderite_pickaxe", 
				() -> new PickaxeItem(CustomToolMaterial.ENDERITE_TOOLS, (int) 1.5f, -2.8f, 
						new Item.Properties().tab(ItemGroup.TAB_TOOLS).fireResistant()));
		
		public static final RegistryObject<AxeItem> ENDERITE_AXE = ITEMS.register("enderite_axe", 
				() -> new AxeItem(CustomToolMaterial.ENDERITE_TOOLS, 5f, -3f, 
						new Item.Properties().tab(ItemGroup.TAB_TOOLS).fireResistant()));
		
		public static final RegistryObject<HoeItem> ENDERITE_HOE = ITEMS.register("enderite_hoe", 
				() -> new HoeItem(CustomToolMaterial.ENDERITE_TOOLS, (int) -6, 0f, 
						new Item.Properties().tab(ItemGroup.TAB_TOOLS).fireResistant()));
		
		// Armor
		public static final RegistryObject<ArmorItem> ENDERITE_HELMET = ITEMS.register("enderite_helmet", 
				() -> new ArmorItem(CustomArmorMaterial.ENDERITE_ARMOR, EquipmentSlotType.HEAD, 
				new Item.Properties().tab(ItemGroup.TAB_COMBAT).fireResistant()));
		
		public static final RegistryObject<ArmorItem> ENDERITE_CHESTPLATE = ITEMS.register("enderite_chestplate", 
				() -> new ArmorItem(CustomArmorMaterial.ENDERITE_ARMOR, EquipmentSlotType.CHEST, 
				new Item.Properties().tab(ItemGroup.TAB_COMBAT).fireResistant()));
		
		public static final RegistryObject<ArmorItem> ENDERITE_LEGGINGS = ITEMS.register("enderite_leggings", 
				() -> new ArmorItem(CustomArmorMaterial.ENDERITE_ARMOR, EquipmentSlotType.LEGS, 
				new Item.Properties().tab(ItemGroup.TAB_COMBAT).fireResistant()));
		
		public static final RegistryObject<ArmorItem> ENDERITE_BOOTS = ITEMS.register("enderite_boots", 
				() -> new ArmorItem(CustomArmorMaterial.ENDERITE_ARMOR, EquipmentSlotType.FEET, 
				new Item.Properties().tab(ItemGroup.TAB_COMBAT).fireResistant()));
}