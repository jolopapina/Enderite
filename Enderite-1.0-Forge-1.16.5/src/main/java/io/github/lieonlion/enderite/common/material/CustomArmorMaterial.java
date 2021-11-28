package io.github.lieonlion.enderite.common.material;

import java.util.function.Supplier;

import io.github.lieonlion.enderite.core.init.ItemInit;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum CustomArmorMaterial implements IArmorMaterial {
	
	ENDERITE_ARMOR("enderite", 1, new int[] { 5, 8, 10, 5 }, 25, SoundEvents.ARMOR_EQUIP_NETHERITE, 4f, 0.2f,
			() -> Ingredient.of(ItemInit.ENDERITE_GEM.get()));

	private static final int[] baseDurability = {568, 694, 702, 535};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] armorVal;
	private final int enchantability;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackResistance;
	private final Ingredient repairIngredient;

	CustomArmorMaterial(String name, int durabilityMultiplier, int[] armorVal, int enchantability,
			SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.armorVal = armorVal;
		this.enchantability = enchantability;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = repairIngredient.get();
	}
	
	@Override
	public int getDurabilityForSlot(EquipmentSlotType p_200896_1_) {
		return baseDurability[p_200896_1_.getIndex()] * this.durabilityMultiplier;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlotType p_200902_1_) {
		return this.armorVal[p_200902_1_.getIndex()];
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getEquipSound() {
		return this.equipSound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}

}
