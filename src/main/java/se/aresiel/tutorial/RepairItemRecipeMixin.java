package se.aresiel.tutorial;

import net.minecraft.inventory.CraftingInventory;
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
            if (craftingInventory.getStack(i).getItem() == Registry.ITEM.get(Identifier.tryParse("tutorialmod:line"))) {
                cir.setReturnValue(false);
                return;
            }
        }
    }
}