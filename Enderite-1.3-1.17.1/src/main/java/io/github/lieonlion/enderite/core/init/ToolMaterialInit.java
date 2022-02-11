package io.github.lieonlion.enderite.core.init;

import java.util.function.Supplier;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class ToolMaterialInit implements Tier {
	
	public static final Tier ENDERITE = new ToolMaterialInit(6.0f, 25, 5, 20.0f, 2401, () -> Ingredient.of(ItemInit.ENDERITE_INGOT.get()));
    public static final Tier OBSIDIAN_INFUSED = new ToolMaterialInit(6.0f, 30, 5, 45.0f, 2771, () -> Ingredient.of(ItemInit.OBSIDIAN_INFUSED_ENDERITE_INGOT.get()));

    private final float attackDamageBonus, speed;
    private final int enchantability, harvestLevel, durability;
    private final Supplier<Ingredient> repairMaterial;

    public ToolMaterialInit(float attackDamageBonus, int enchantability, int harvestLevel, float speed, int durability, Supplier<Ingredient> repairMaterial) {
        this.attackDamageBonus = attackDamageBonus;
        this.enchantability = enchantability;
        this.harvestLevel = harvestLevel;
        this.speed = speed;
        this.durability = durability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamageBonus;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public int getLevel() {
        return this.harvestLevel;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public int getUses() {
        return this.durability;
    }
}