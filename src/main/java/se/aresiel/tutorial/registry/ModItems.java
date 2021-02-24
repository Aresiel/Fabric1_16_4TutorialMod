package se.aresiel.tutorial.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import se.aresiel.tutorial.Tutorial;

public class ModItems {
    public static final Item SQUARE = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "square"), SQUARE);
    }
}
