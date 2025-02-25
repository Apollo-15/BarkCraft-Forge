package net.apollo15.barkcraft.item;

import net.apollo15.barkcraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.apollo15.barkcraft.BarkCraft;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BarkCraft.MODID);

    public static final RegistryObject<CreativeModeTab> BARKCRAFT_INGREDIENTS_TAB = CREATIVE_MODE_TABS.register("barkcraft_ingredients_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OAK_BARK.get()))
                .title(Component.translatable("creativetab.barkcraft_ingredients_tab"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModItems.OAK_BARK.get());
                    output.accept(ModItems.BIRCH_BARK.get());
                    output.accept(ModItems.DARK_OAK_BARK.get());
                    output.accept(ModItems.SPRUCE_BARK.get());
                    output.accept(ModItems.ACACIA_BARK.get());
                    output.accept(ModItems.JUNGLE_BARK.get());
                    output.accept(ModItems.CHERRY_BARK.get());
                    output.accept(ModItems.MANGROVE_BARK.get());
                    output.accept(ModItems.CRIMSON_BARK.get());
                    output.accept(ModItems.WARPED_BARK.get());

                    output.accept(ModItems.RAW_BEETLE.get());
                    output.accept(ModItems.COOKED_BEETLE.get());
                })
                .build());

    public static final RegistryObject<CreativeModeTab> BARKCRAFT_BLOCKS_TAB = CREATIVE_MODE_TABS.register("barkcraft_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.OAK_BARK_BLOCK.get()))
                .title(Component.translatable("creativetab.barkcraft_blocks_tab"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModBlocks.OAK_BARK_BLOCK.get());
                    output.accept(ModBlocks.BIRCH_BARK_BLOCK.get());
                    output.accept(ModBlocks.DARK_OAK_BARK_BLOCK.get());
                    output.accept(ModBlocks.SPRUCE_BARK_BLOCK.get());
                    output.accept(ModBlocks.ACACIA_BARK_BLOCK.get());
                    output.accept(ModBlocks.JUNGLE_BARK_BLOCK.get());
                    output.accept(ModBlocks.CHERRY_BARK_BLOCK.get());
                    output.accept(ModBlocks.MANGROVE_BARK_BLOCK.get());
                })
                .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
