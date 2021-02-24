package se.aresiel.tutorial.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import se.aresiel.tutorial.Tutorial;

public class ModItems {
    public static final GeometryToolItem POINT = new GeometryToolItem(0);
    public static final GeometryToolItem LINE = new GeometryToolItem(1);
    public static final GeometryToolItem SQUARE = new GeometryToolItem(2);

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "point"), POINT);
        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "line"), LINE);
        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "square"), SQUARE);
    }
}
