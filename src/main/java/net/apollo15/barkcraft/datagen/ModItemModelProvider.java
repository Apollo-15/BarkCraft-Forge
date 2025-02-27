package net.apollo15.barkcraft.datagen;

import net.apollo15.barkcraft.BarkCraft;
import net.apollo15.barkcraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();

    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BarkCraft.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.ACACIA_BARK);
        simpleItem(ModItems.BIRCH_BARK);
        simpleItem(ModItems.DARK_OAK_BARK);
        simpleItem(ModItems.JUNGLE_BARK);
        simpleItem(ModItems.OAK_BARK);
        simpleItem(ModItems.SPRUCE_BARK);
        simpleItem(ModItems.WARPED_BARK);
        simpleItem(ModItems.CRIMSON_BARK);
        simpleItem(ModItems.MANGROVE_BARK);
        simpleItem(ModItems.CHERRY_BARK);

        simpleItem(ModItems.RAW_BEETLE);
        simpleItem(ModItems.COOKED_BEETLE);

    }


    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        String itemPath = item.getId().getPath();
        ResourceLocation defaultTexture = new ResourceLocation(BarkCraft.MODID, "item/" + itemPath);
        ResourceLocation oldTexture = new ResourceLocation(BarkCraft.MODID, "item/" + itemPath + "_old");

        ItemModelBuilder builder = withExistingParent(itemPath, new ResourceLocation("item/generated"))
                .texture("layer0", defaultTexture);

        if (existingFileHelper.exists(oldTexture, TEXTURE)) {
            builder.override()
                    .predicate(new ResourceLocation("custom_model_data"), 1)
                    .model(withExistingParent(itemPath + "_old", new ResourceLocation("item/generated"))
                            .texture("layer0", oldTexture));
        }

        return builder;
    }


}

//    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
//        return withExistingParent(item.getId().getPath(),
//                new ResourceLocation("item/handheld")).texture("layer0",
//                new ResourceLocation(BarkCraft.MODID,"item/" + item.getId().getPath()));
//    }
