package net.apollo15.barkcraft.datagen;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> BARK = TagKey.create(Registries.ITEM,
                new ResourceLocation("barkcraft", "bark"));
    }
}