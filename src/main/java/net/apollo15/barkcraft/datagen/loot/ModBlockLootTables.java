package net.apollo15.barkcraft.datagen.loot;

import net.apollo15.barkcraft.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.ACACIA_BARK_BLOCK.get());
        this.dropSelf(ModBlocks.BIRCH_BARK_BLOCK.get());
        this.dropSelf(ModBlocks.CHERRY_BARK_BLOCK.get());
        this.dropSelf(ModBlocks.DARK_OAK_BARK_BLOCK.get());
        this.dropSelf(ModBlocks.JUNGLE_BARK_BLOCK.get());
        this.dropSelf(ModBlocks.MANGROVE_BARK_BLOCK.get());
        this.dropSelf(ModBlocks.OAK_BARK_BLOCK.get());
        this.dropSelf(ModBlocks.SPRUCE_BARK_BLOCK.get());
        this.dropSelf(ModBlocks.WARPED_BARK_BLOCK.get());
        this.dropSelf(ModBlocks.CRIMSON_BARK_BLOCK.get());
    }

    protected LootTable.Builder createSimpleOreDrop(Block pBlock, Item pItem) {
        return createSilkTouchDispatchTable(pBlock,
                (LootPoolEntryContainer.Builder)
                        this.applyExplosionDecay(pBlock, LootItem.lootTableItem(pItem)
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}