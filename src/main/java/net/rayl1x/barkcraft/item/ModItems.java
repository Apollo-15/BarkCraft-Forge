package net.rayl1x.barkcraft.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rayl1x.barkcraft.BarkCraft;
import net.rayl1x.barkcraft.item.custom.FuelItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BarkCraft.MODID);

    public static final RegistryObject<Item> OAK_BARK = ITEMS.register("oak_bark",
            () -> new FuelItem(new Item.Properties(), 200));

    public static final RegistryObject<Item> BIRCH_BARK = ITEMS.register("birch_bark",
            () -> new FuelItem(new Item.Properties(), 200));

    public static final RegistryObject<Item> ACACIA_BARK = ITEMS.register("acacia_bark",
            () -> new FuelItem(new Item.Properties(), 200));

    public static final RegistryObject<Item> CHERRY_BARK = ITEMS.register("cherry_bark",
            () -> new FuelItem(new Item.Properties(), 200));

    public static final RegistryObject<Item> DARK_OAK_BARK = ITEMS.register("dark_oak_bark",
            () -> new FuelItem(new Item.Properties(), 200));

    public static final RegistryObject<Item> JUNGLE_BARK = ITEMS.register("jungle_bark",
            () -> new FuelItem(new Item.Properties(), 200));

    public static final RegistryObject<Item> MANGROVE_BARK = ITEMS.register("mangrove_bark",
            () -> new FuelItem(new Item.Properties(), 200));

    public static final RegistryObject<Item> SPRUCE_BARK = ITEMS.register("spruce_bark",
            () -> new FuelItem(new Item.Properties(), 200));

    public static final RegistryObject<Item> CRIMSON_BARK = ITEMS.register("crimson_bark",
            () -> new FuelItem(new Item.Properties(), 200));

    public static final RegistryObject<Item> WARPED_BARK = ITEMS.register("warped_bark",
            () -> new FuelItem(new Item.Properties(), 200));

    public static final RegistryObject<Item> RAW_BEETLE = ITEMS.register("raw_beetle",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(1)
                    .saturationMod(0.1f)
                    .build()
            )));

    public static final RegistryObject<Item> COOKED_BEETLE = ITEMS.register("cooked_beetle",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationMod(0.3f)
                    .build()
            )));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
