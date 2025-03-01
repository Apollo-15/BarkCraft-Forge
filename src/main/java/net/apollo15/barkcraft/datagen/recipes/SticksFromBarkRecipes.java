package net.apollo15.barkcraft.datagen.recipes;

import net.apollo15.barkcraft.datagen.ModRecipeProvider;
import net.apollo15.barkcraft.util.ModTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;


public class SticksFromBarkRecipes extends ModRecipeProvider {

    public SticksFromBarkRecipes(PackOutput pOutput) {
        super(pOutput);
    }

    public static void addSticksFromBarkRecipes(Consumer<FinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STICK, 2)
                .requires(ModTags.Items.BARKS)
                .unlockedBy("has_bark", has(ModTags.Items.BARKS))
                .save(consumer);
    }
}
