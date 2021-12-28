package io.github.lieonlion.enderite.core.init;

import io.github.lieonlion.enderite.core.BaseToolMaterial;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public final class ToolMaterialInit {
    protected static final Tier ENDERITE = new BaseToolMaterial(6.0f, 25, 5, 20.0f, 2401, () -> Ingredient.of(ItemInit.ENDERITE_INGOT.get()));
    private ToolMaterialInit() {}
}