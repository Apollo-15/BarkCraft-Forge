package net.apollo15.barkcraft.util;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> BARK = TagKey.create(net.minecraft.core.registries.Registries.ITEM,
                new net.minecraft.resources.ResourceLocation("barkcraft", "bark"));
    }
}