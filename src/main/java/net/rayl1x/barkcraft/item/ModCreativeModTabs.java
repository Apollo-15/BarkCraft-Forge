package net.rayl1x.barkcraft.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rayl1x.barkcraft.BarkCraft;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BarkCraft.MODID);

    public static final RegistryObject<CreativeModeTab> BARKCRAFT_INGREDIENTS_TAB = CREATIVE_MODE_TABS.register("minefear_ingredients_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OAK_BARK.get( )))
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

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
