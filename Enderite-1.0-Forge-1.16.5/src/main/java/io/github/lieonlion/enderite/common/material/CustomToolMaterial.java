package io.github.lieonlion.enderite.common.material;

import java.util.function.Supplier;

import io.github.lieonlion.enderite.core.init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum CustomToolMaterial implements IItemTier {
	
	ENDERITE_TOOLS(5, 2401, 12f, 6f, 25, () -> Ingredient.of(ItemInit.ENDERITE_GEM.get()));
	
	private final int level;
	private final int uses;
	private final float speed;
	private final float attackDamage;
	private final int enchantability;
	private final Ingredient repairMaterial;

	CustomToolMaterial(int level, int uses, float speed, float attackDamage, int enchantability,
			Supplier<Ingredient> repairMaterial) {
		this.level = level;
		this.uses = uses;
		this.speed = speed;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial.get();
	}

	@Override
	public int getUses() {
		return this.uses;
	}

	@Override
	public float getSpeed() {
		return this.speed;
	}

	@Override
	public float getAttackDamageBonus() {
		return this.attackDamage;
	}

	@Override
	public int getLevel() {
		return this.level;
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairMaterial;
	}
}