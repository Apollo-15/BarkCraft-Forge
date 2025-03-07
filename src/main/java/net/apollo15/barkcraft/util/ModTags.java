package net.apollo15.barkcraft.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> BARKS_STICKS = TagKey.create(Registries.ITEM,
                new ResourceLocation("barkcraft", "bark_sticks"));

        public static final TagKey<Item> COALS = TagKey.create(Registries.ITEM,
                new ResourceLocation("barkcraft", "coal"));

        public static final TagKey<Item> BARKS = TagKey.create(Registries.ITEM,
                new ResourceLocation("barkcraft", "bark"));

    }

    public static class Blocks {
        public static final TagKey<Block> BARK_BLOCKS = TagKey.create(Registries.BLOCK,
                new ResourceLocation("barkcraft", "bark"));
    }
}