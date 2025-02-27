package net.apollo15.barkcraft.datagen.recipes;

import net.apollo15.barkcraft.BarkCraft;
import net.apollo15.barkcraft.block.ModBlocks;
import net.apollo15.barkcraft.datagen.ModRecipeProvider;
import net.apollo15.barkcraft.util.ModTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;

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
                .define('S', Items.STICK)
                .define('C', ModTags.Items.COALS)
                .define('W', ItemTags.create(ModTags.Blocks.BARK_BLOCKS.location()))
                .unlockedBy("has_coal", has(ModTags.Items.COALS))
                .save(consumer);

//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.CAMPFIRE, 1)
//                .pattern(" S ")
//                .pattern("SCS")
//                .pattern("WWW")
//                .define('S', Items.STICK)
//                .define('C', Tags.Items.ORES_COAL)
//                .define('W', ModBlocks.BIRCH_BARK_BLOCK.get())
//                .unlockedBy(getHasName(Items.COAL), has(Tags.Items.ORES_COAL))
//                .save(consumer, BarkCraft.MODID + ":campfire_birch_bark_block");
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.CAMPFIRE, 1)
//                .pattern(" S ")
//                .pattern("SCS")
//                .pattern("WWW")
//                .define('S', Items.STICK)
//                .define('C', Items.COAL)
//                .define('W', ModBlocks.ACACIA_BARK_BLOCK.get())
//                .unlockedBy(getHasName(Items.COAL), has(Tags.Items.ORES_COAL))
//                .save(consumer, BarkCraft.MODID + ":campfire_acacia_bark_block");
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.CAMPFIRE, 1)
//                .pattern(" S ")
//                .pattern("SCS")
//                .pattern("WWW")
//                .define('S', Items.STICK)
//                .define('C', Items.COAL)
//                .define('W', ModBlocks.SPRUCE_BARK_BLOCK.get())
//                .unlockedBy(getHasName(Items.COAL), has(Tags.Items.ORES_COAL))
//                .save(consumer, BarkCraft.MODID + ":campfire_spruce_bark_block");
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.CAMPFIRE, 1)
//                .pattern(" S ")
//                .pattern("SCS")
//                .pattern("WWW")
//                .define('S', Items.STICK)
//                .define('C', Items.COAL)
//                .define('W', ModBlocks.DARK_OAK_BARK_BLOCK.get())
//                .unlockedBy(getHasName(Items.COAL), has(Items.COAL))
//                .save(consumer, BarkCraft.MODID + ":campfire_dark_oak_bark_block");
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.CAMPFIRE, 1)
//                .pattern(" S ")
//                .pattern("SCS")
//                .pattern("WWW")
//                .define('S', Items.STICK)
//                .define('C', Items.COAL)
//                .define('W', ModBlocks.JUNGLE_BARK_BLOCK.get())
//                .unlockedBy(getHasName(Items.COAL), has(Items.COAL))
//                .save(consumer, BarkCraft.MODID + ":campfire_jungle_bark_block");
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.CAMPFIRE, 1)
//                .pattern(" S ")
//                .pattern("SCS")
//                .pattern("WWW")
//                .define('S', Items.STICK)
//                .define('C', Items.COAL)
//                .define('W', ModBlocks.MANGROVE_BARK_BLOCK.get())
//                .unlockedBy(getHasName(Items.COAL), has(Items.COAL))
//                .save(consumer, BarkCraft.MODID + ":campfire_mangrove_bark_block");
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.CAMPFIRE, 1)
//                .pattern(" S ")
//                .pattern("SCS")
//                .pattern("WWW")
//                .define('S', Items.STICK)
//                .define('C', Items.COAL)
//                .define('W', ModBlocks.CHERRY_BARK_BLOCK.get())
//                .unlockedBy(getHasName(Items.COAL), has(Items.COAL))
//                .save(consumer, BarkCraft.MODID + ":campfire_cherry_bark_block");
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.CAMPFIRE, 1)
//                .pattern(" S ")
//                .pattern("SCS")
//                .pattern("WWW")
//                .define('S', Items.STICK)
//                .define('C', Items.COAL)
//                .define('W', ModBlocks.CRIMSON_BARK_BLOCK.get())
//                .unlockedBy(getHasName(Items.COAL), has(Items.COAL))
//                .save(consumer, BarkCraft.MODID + ":campfire_crimson_bark_block");
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.CAMPFIRE, 1)
//                .pattern(" S ")
//                .pattern("SCS")
//                .pattern("WWW")
//                .define('S', Items.STICK)
//                .define('C', Items.COAL)
//                .define('W', ModBlocks.WARPED_BARK_BLOCK.get())
//                .unlockedBy(getHasName(Items.COAL), has(Items.COAL))
//                .save(consumer, BarkCraft.MODID + ":campfire_warped_bark_block");
    }

}
