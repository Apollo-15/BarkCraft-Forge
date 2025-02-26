package net.apollo15.barkcraft.datagen.recipes;

import net.apollo15.barkcraft.block.ModBlocks;
import net.apollo15.barkcraft.datagen.ModRecipeProvider;
import net.apollo15.barkcraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;

import java.util.function.Consumer;

public class BarkBlocksRecipes extends ModRecipeProvider {

    public BarkBlocksRecipes(PackOutput pOutput) {
        super(pOutput);
    }

    public static void addBarkBlocksRecipes(Consumer<FinishedRecipe> consumer) {
        // Bark from Bark Blocks

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.OAK_BARK.get(), 9)
                .requires(ModBlocks.OAK_BARK_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.OAK_BARK_BLOCK.get()), has(ModBlocks.OAK_BARK_BLOCK.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BIRCH_BARK.get(), 9)
                .requires(ModBlocks.BIRCH_BARK_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.BIRCH_BARK_BLOCK.get()), has(ModBlocks.BIRCH_BARK_BLOCK.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ACACIA_BARK.get(), 9)
                .requires(ModBlocks.ACACIA_BARK_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ACACIA_BARK_BLOCK.get()), has(ModBlocks.ACACIA_BARK_BLOCK.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MANGROVE_BARK.get(), 9)
                .requires(ModBlocks.MANGROVE_BARK_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.MANGROVE_BARK_BLOCK.get()), has(ModBlocks.MANGROVE_BARK_BLOCK.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DARK_OAK_BARK.get(), 9)
                .requires(ModBlocks.DARK_OAK_BARK_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.DARK_OAK_BARK_BLOCK.get()), has(ModBlocks.DARK_OAK_BARK_BLOCK.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CHERRY_BARK.get(), 9)
                .requires(ModBlocks.CHERRY_BARK_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.CHERRY_BARK_BLOCK.get()), has(ModBlocks.CHERRY_BARK_BLOCK.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.JUNGLE_BARK.get(), 9)
                .requires(ModBlocks.JUNGLE_BARK_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.JUNGLE_BARK_BLOCK.get()), has(ModBlocks.JUNGLE_BARK_BLOCK.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SPRUCE_BARK.get(), 9)
                .requires(ModBlocks.SPRUCE_BARK_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SPRUCE_BARK_BLOCK.get()), has(ModBlocks.SPRUCE_BARK_BLOCK.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CRIMSON_BARK.get(), 9)
                .requires(ModBlocks.CRIMSON_BARK_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.CRIMSON_BARK_BLOCK.get()), has(ModBlocks.CRIMSON_BARK_BLOCK.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.WARPED_BARK.get(), 9)
                .requires(ModBlocks.WARPED_BARK_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.WARPED_BARK_BLOCK.get()), has(ModBlocks.WARPED_BARK_BLOCK.get()))
                .save(consumer);

    }
}
