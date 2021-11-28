package io.github.lieonlion.enderite.core.init;

import io.github.lieonlion.enderite.Enderite;
import io.github.lieonlion.enderite.core.BaseArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public final class ArmorMaterialInit {
    public static final ArmorMaterial ENDERITE = new BaseArmorMaterial(25, new int[] { 568, 694, 702, 535},
            new int[] { 5, 8, 10, 5 }, 0.2f, 4f, Enderite.MODID + ":enderite",
            SoundEvents.ARMOR_EQUIP_NETHERITE, () -> Ingredient.of(ItemInit.ENDERITE_GEM.get()));

    private ArmorMaterialInit() {
    }
}