package net.apollo15.barkcraft.datagen.recipes;

import net.apollo15.barkcraft.BarkCraft;
import net.apollo15.barkcraft.block.ModBlocks;
import net.apollo15.barkcraft.datagen.ModRecipeProvider;
import net.apollo15.barkcraft.util.ModTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

public class CampFireRecipes extends ModRecipeProvider {

    public CampFireRecipes(PackOutput pOutput) {
        super(pOutput);
    }

    public static void addCampFireRecipes(Consumer<FinishedRecipe> consumer) {
        // Campfires with bark blocks
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.CAMPFIRE, 1)
                .pattern(" S ")
                .pattern("SCS")
                .pattern("WWW")
                .define('S', ModTags.Items.BARKS_STICKS)
                .define('C', ModTags.Items.COALS)
                .define('W', ModBlocks.OAK_BARK_BLOCK.get())
                .unlockedBy(getHasName(Items.COAL), has(ModTags.Items.COALS))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.CAMPFIRE, 1)
                .pattern(" S ")
                .pattern("SCS")
                .pattern("WWW")
                .define('S', ModTags.Items.BARKS_STICKS)
                .define('C', ModTags.Items.COALS)
                .define('W', ModBlocks.BIRCH_BARK_BLOCK.get())
                .unlockedBy(getHasName(Items.COAL), has(ModTags.Items.COALS))
                .save(consumer, BarkCraft.MODID + ":campfire_birch_bark_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.CAMPFIRE, 1)
                .pattern(" S ")
                .pattern("SCS")
                .pattern("WWW")
                .define('S', ModTags.Items.BARKS_STICKS)
                .define('C', ModTags.Items.COALS)
                .define('W', ModBlocks.ACACIA_BARK_BLOCK.get())
                .unlockedBy(getHasName(Items.COAL), has(ModTags.Items.COALS))
                .save(consumer, BarkCraft.MODID + ":campfire_acacia_bark_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.CAMPFIRE, 1)
                .pattern(" S ")
                .pattern("SCS")
                .pattern("WWW")
                .define('S', ModTags.Items.BARKS_STICKS)
                .define('C', ModTags.Items.COALS)
                .define('W', ModBlocks.SPRUCE_BARK_BLOCK.get())
                .unlockedBy(getHasName(Items.COAL), has(ModTags.Items.COALS))
                .save(consumer, BarkCraft.MODID + ":campfire_spruce_bark_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.CAMPFIRE, 1)
                .pattern(" S ")
                .pattern("SCS")
                .pattern("WWW")
                .define('S', ModTags.Items.BARKS_STICKS)
                .define('C', ModTags.Items.COALS)
                .define('W', ModBlocks.DARK_OAK_BARK_BLOCK.get())
                .unlockedBy(getHasName(Items.COAL), has(ModTags.Items.COALS))
                .save(consumer, BarkCraft.MODID + ":campfire_dark_oak_bark_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.CAMPFIRE, 1)
                .pattern(" S ")
                .pattern("SCS")
                .pattern("WWW")
                .define('S', ModTags.Items.BARKS_STICKS)
                .define('C', ModTags.Items.COALS)
                .define('W', ModBlocks.JUNGLE_BARK_BLOCK.get())
                .unlockedBy(getHasName(Items.COAL), has(ModTags.Items.COALS))
                .save(consumer, BarkCraft.MODID + ":campfire_jungle_bark_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.CAMPFIRE, 1)
                .pattern(" S ")
                .pattern("SCS")
                .pattern("WWW")
                .define('S', ModTags.Items.BARKS_STICKS)
                .define('C', ModTags.Items.COALS)
                .define('W', ModBlocks.MANGROVE_BARK_BLOCK.get())
                .unlockedBy(getHasName(Items.COAL), has(ModTags.Items.COALS))
                .save(consumer, BarkCraft.MODID + ":campfire_mangrove_bark_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.CAMPFIRE, 1)
                .pattern(" S ")
                .pattern("SCS")
                .pattern("WWW")
                .define('S', ModTags.Items.BARKS_STICKS)
                .define('C', ModTags.Items.COALS)
                .define('W', ModBlocks.CHERRY_BARK_BLOCK.get())
                .unlockedBy(getHasName(Items.COAL), has(ModTags.Items.COALS))
                .save(consumer, BarkCraft.MODID + ":campfire_cherry_bark_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.CAMPFIRE, 1)
                .pattern(" S ")
                .pattern("SCS")
                .pattern("WWW")
                .define('S', ModTags.Items.BARKS_STICKS)
                .define('C', ModTags.Items.COALS)
                .define('W', ModBlocks.CRIMSON_BARK_BLOCK.get())
                .unlockedBy(getHasName(Items.COAL), has(ModTags.Items.COALS))
                .save(consumer, BarkCraft.MODID + ":campfire_crimson_bark_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.CAMPFIRE, 1)
                .pattern(" S ")
                .pattern("SCS")
                .pattern("WWW")
                .define('S', ModTags.Items.BARKS_STICKS)
                .define('C', ModTags.Items.COALS)
                .define('W', ModBlocks.WARPED_BARK_BLOCK.get())
                .unlockedBy(getHasName(Items.COAL), has(ModTags.Items.COALS))
                .save(consumer, BarkCraft.MODID + ":campfire_warped_bark_block");

        // Soul Campfires with bark blocks

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.SOUL_CAMPFIRE, 1)
                .pattern(" S ")
                .pattern("SCS")
                .pattern("WWW")
                .define('S', ModTags.Items.BARKS_STICKS)
                .define('C', Items.SOUL_SOIL)
                .define('W', ModBlocks.OAK_BARK_BLOCK.get())
                .unlockedBy(getHasName(Items.SOUL_SOIL), has(Items.SOUL_SOIL))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.SOUL_CAMPFIRE, 1)
                .pattern(" S ")
                .pattern("SCS")
                .pattern("WWW")
                .define('S', ModTags.Items.BARKS_STICKS)
                .define('C', Items.SOUL_SOIL)
                .define('W', ModBlocks.BIRCH_BARK_BLOCK.get())
                .unlockedBy(getHasName(Items.SOUL_SOIL), has(Items.SOUL_SOIL))
                .save(consumer, BarkCraft.MODID + ":soul_campfire_birch_bark_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.SOUL_CAMPFIRE, 1)
                .pattern(" S ")
                .pattern("SCS")
                .pattern("WWW")
                .define('S', ModTags.Items.BARKS_STICKS)
                .define('C', Items.SOUL_SOIL)
                .define('W', ModBlocks.ACACIA_BARK_BLOCK.get())
                .unlockedBy(getHasName(Items.SOUL_SOIL), has(Items.SOUL_SOIL))
                .save(consumer, BarkCraft.MODID + ":soul_campfire_acacia_bark_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.SOUL_CAMPFIRE, 1)
                .pattern(" S ")
                .pattern("SCS")
                .pattern("WWW")
                .define('S', ModTags.Items.BARKS_STICKS)
                .define('C', Items.SOUL_SOIL)
                .define('W', ModBlocks.SPRUCE_BARK_BLOCK.get())
                .unlockedBy(getHasName(Items.SOUL_SOIL), has(Items.SOUL_SOIL))
                .save(consumer, BarkCraft.MODID + ":soul_campfire_spruce_bark_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.SOUL_CAMPFIRE, 1)
                .pattern(" S ")
                .pattern("SCS")
                .pattern("WWW")
                .define('S', ModTags.Items.BARKS_STICKS)
                .define('C', Items.SOUL_SOIL)
                .define('W', ModBlocks.DARK_OAK_BARK_BLOCK.get())
                .unlockedBy(getHasName(Items.SOUL_SOIL), has(Items.SOUL_SOIL))
                .save(consumer, BarkCraft.MODID + ":soul_campfire_dark_oak_bark_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.SOUL_CAMPFIRE, 1)
                .pattern(" S ")
                .pattern("SCS")
                .pattern("WWW")
                .define('S', ModTags.Items.BARKS_STICKS)
                .define('C', Items.SOUL_SOIL)
                .define('W', ModBlocks.JUNGLE_BARK_BLOCK.get())
                .unlockedBy(getHasName(Items.SOUL_SOIL), has(Items.SOUL_SOIL))
                .save(consumer, BarkCraft.MODID + ":soul_campfire_jungle_bark_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.SOUL_CAMPFIRE, 1)
                .pattern(" S ")
                .pattern("SCS")
                .pattern("WWW")
                .define('S', ModTags.Items.BARKS_STICKS)
                .define('C', Items.SOUL_SOIL)
                .define('W', ModBlocks.MANGROVE_BARK_BLOCK.get())
                .unlockedBy(getHasName(Items.SOUL_SOIL), has(Items.SOUL_SOIL))
                .save(consumer, BarkCraft.MODID + ":soul_campfire_mangrove_bark_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.SOUL_CAMPFIRE, 1)
                .pattern(" S ")
                .pattern("SCS")
                .pattern("WWW")
                .define('S', ModTags.Items.BARKS_STICKS)
                .define('C', Items.SOUL_SOIL)
                .define('W', ModBlocks.CHERRY_BARK_BLOCK.get())
                .unlockedBy(getHasName(Items.SOUL_SOIL), has(Items.SOUL_SOIL))
                .save(consumer, BarkCraft.MODID + ":soul_campfire_cherry_bark_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.SOUL_CAMPFIRE, 1)
                .pattern(" S ")
                .pattern("SCS")
                .pattern("WWW")
                .define('S', ModTags.Items.BARKS_STICKS)
                .define('C', Items.SOUL_SOIL)
                .define('W', ModBlocks.CRIMSON_BARK_BLOCK.get())
                .unlockedBy(getHasName(Items.SOUL_SOIL), has(Items.SOUL_SOIL))
                .save(consumer, BarkCraft.MODID + ":soul_campfire_crimson_bark_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.CAMPFIRE, 1)
                .pattern(" S ")
                .pattern("SCS")
                .pattern("WWW")
                .define('S', ModTags.Items.BARKS_STICKS)
                .define('C', Items.SOUL_SOIL)
                .define('W', ModBlocks.WARPED_BARK_BLOCK.get())
                .unlockedBy(getHasName(Items.SOUL_SOIL), has(Items.SOUL_SOIL))
                .save(consumer, BarkCraft.MODID + ":soul_campfire_warped_bark_block");
    }

}
