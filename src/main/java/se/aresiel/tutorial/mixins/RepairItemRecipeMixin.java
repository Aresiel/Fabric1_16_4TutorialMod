package se.aresiel.tutorial.mixins;

import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.Item;
import net.minecraft.recipe.RepairItemRecipe;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.util.registry.Registry;

@Mixin(RepairItemRecipe.class)
public class RepairItemRecipeMixin {
    @Inject(method = "matches", at = @At("HEAD"), cancellable = true)
    private void cancelWithItem(CraftingInventory craftingInventory, World world, CallbackInfoReturnable<Boolean> cir) {
        for (int i = 0; i < craftingInventory.size(); i++) {

            Item item = craftingInventory.getStack(i).getItem();
            Item point = Registry.ITEM.get(Identifier.tryParse("tutorialmod:point"));
            Item line = Registry.ITEM.get(Identifier.tryParse("tutorialmod:line"));
            Item square = Registry.ITEM.get(Identifier.tryParse("tutorialmod:square"));

            if (item == point || item == line || item == square) {
                cir.setReturnValue(false);
                return;
            }
        }
    }
}