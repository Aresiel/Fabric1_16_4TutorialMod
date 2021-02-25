package se.aresiel.tutorial.registry;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import se.aresiel.tutorial.Tutorial;

public class ModItems {

    //Items / Weapons
    public static final Item POINT = new GeometryToolItem(0);
    public static final Item LINE = new GeometryToolItem(1);
    public static final Item SQUARE = new GeometryToolItem(2);

    //Armor
    public static final ArmorMaterial squareArmorMaterial = new GeometryArmorMaterial(2);

    public static final Item SQUARE_HELMET = new ArmorItem(squareArmorMaterial, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item SQUARE_CHESTPLATE = new ArmorItem(squareArmorMaterial, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item SQUARE_LEGGINGS = new ArmorItem(squareArmorMaterial, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item SQUARE_BOOTS = new ArmorItem(squareArmorMaterial, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "point"), POINT);
        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "line"), LINE);
        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "square"), SQUARE);

        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "square_helmet"), SQUARE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "square_chestplate"), SQUARE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "square_leggings"), SQUARE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "square_boots"), SQUARE_BOOTS);
    }
}
