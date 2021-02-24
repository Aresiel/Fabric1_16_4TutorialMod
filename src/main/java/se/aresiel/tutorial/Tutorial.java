package se.aresiel.tutorial;

import net.fabricmc.api.ModInitializer;
import se.aresiel.tutorial.registry.ModItems;

public class Tutorial implements ModInitializer {

    public static final String MOD_ID = "tutorialmod";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
