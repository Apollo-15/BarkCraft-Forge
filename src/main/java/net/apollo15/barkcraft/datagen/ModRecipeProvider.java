package net.apollo15.barkcraft.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.apollo15.barkcraft.BarkCraft;
import net.apollo15.barkcraft.datagen.recipes.*;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {

    }

    protected static void campfireCooking(Consumer<FinishedRecipe> consumer, ItemLike input, ItemLike output, float experience, int cookingTime) {
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(input), RecipeCategory.MISC, output, experience, cookingTime)
                .unlockedBy("has_" + getItemName(input), has(input))
                .save(consumer, new ResourceLocation(BarkCraft.MODID, getItemName(output) + "_from_campfire_cooking"));
    }
}
