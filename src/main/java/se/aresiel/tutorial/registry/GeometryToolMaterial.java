package se.aresiel.tutorial.registry;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class GeometryToolMaterial implements ToolMaterial {

    private final int durability;
    private final float miningSpeedMulitplier;
    private final float attackDamage;
    private final int miningLevel;
    private final int enchantability;
    private final double attackSpeed;

    public GeometryToolMaterial(int level) {
        this.durability = (int) Math.pow(2,level);
        this.miningSpeedMulitplier = (float) Math.pow(2,level);
        this.attackDamage = (float) Math.pow(2,level);
        this.miningLevel = (int) Math.pow(2,level);
        this.enchantability = (int) Math.pow(2,level);
        this.attackSpeed = Math.pow( 2,level);
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return miningSpeedMulitplier;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return miningLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.NETHER_STAR);
    }

    public Object getAttackSpeed() {
        return attackSpeed;
    }
}
