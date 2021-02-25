package se.aresiel.tutorial.registry;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GeometryArmorMaterial implements ArmorMaterial {

    private static int BASE_DURABILITY;
    private static int PROTECTION_VALUE;
    private static int enchantability;
    private static float knockbackResistance;
    private static int  toughness;

    public GeometryArmorMaterial(int level) {
        BASE_DURABILITY = (int) Math.pow(4, level)*50;
        PROTECTION_VALUE = (int) Math.pow(4, level);
        enchantability = (int) Math.pow(4, level);
        knockbackResistance = (float) Math.pow(2, level);
        toughness = (int) Math.pow(4, level);
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUE;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Registry.ITEM.get(Identifier.tryParse("minecraft:nether_star")));
    }

    @Override
    public String getName() {
        return "square";
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return knockbackResistance/10;
    }
}
