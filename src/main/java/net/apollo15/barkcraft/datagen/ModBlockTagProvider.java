package net.apollo15.barkcraft.datagen;

import net.apollo15.barkcraft.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.apollo15.barkcraft.BarkCraft;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {


    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BarkCraft.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModTags.Blocks.BARK_BLOCKS)
            .add(ModBlocks.OAK_BARK_BLOCK.get())
            .add(ModBlocks.BIRCH_BARK_BLOCK.get())
            .add(ModBlocks.ACACIA_BARK_BLOCK.get())
            .add(ModBlocks.SPRUCE_BARK_BLOCK.get())
            .add(ModBlocks.JUNGLE_BARK_BLOCK.get())
            .add(ModBlocks.DARK_OAK_BARK_BLOCK.get())
            .add(ModBlocks.CHERRY_BARK_BLOCK.get())
            .add(ModBlocks.MANGROVE_BARK_BLOCK.get())
            .add(ModBlocks.CRIMSON_BARK_BLOCK.get())
            .add(ModBlocks.WARPED_BARK_BLOCK.get());

    }
}
