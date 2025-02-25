package net.apollo15.barkcraft.datagen;

import net.apollo15.barkcraft.BarkCraft;
import net.apollo15.barkcraft.item.ModItems;
import net.apollo15.barkcraft.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {

    public ModItemTagProvider(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, BarkCraft.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModTags.Items.BARK)
            .add(ModItems.ACACIA_BARK.get())
            .add(ModItems.BIRCH_BARK.get())
            .add(ModItems.DARK_OAK_BARK.get())
            .add(ModItems.JUNGLE_BARK.get())
            .add(ModItems.OAK_BARK.get())
            .add(ModItems.SPRUCE_BARK.get())
            .add(ModItems.WARPED_BARK.get())
            .add(ModItems.CRIMSON_BARK.get())
            .add(ModItems.MANGROVE_BARK.get())
            .add(ModItems.CHERRY_BARK.get());
    }
}
