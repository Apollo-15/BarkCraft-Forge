package net.apollo15.barkcraft.datagen;

import net.apollo15.barkcraft.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.apollo15.barkcraft.BarkCraft;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BarkCraft.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(ModBlocks.ACACIA_BARK_BLOCK);
        blockWithItem(ModBlocks.BIRCH_BARK_BLOCK);
        blockWithItem(ModBlocks.CHERRY_BARK_BLOCK);
        blockWithItem(ModBlocks.DARK_OAK_BARK_BLOCK);
        blockWithItem(ModBlocks.JUNGLE_BARK_BLOCK);
        blockWithItem(ModBlocks.MANGROVE_BARK_BLOCK);
        blockWithItem(ModBlocks.OAK_BARK_BLOCK);
        blockWithItem(ModBlocks.SPRUCE_BARK_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}