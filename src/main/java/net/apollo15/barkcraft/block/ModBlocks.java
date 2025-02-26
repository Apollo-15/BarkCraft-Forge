package net.apollo15.barkcraft.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.apollo15.barkcraft.BarkCraft;
import net.apollo15.barkcraft.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BarkCraft.MODID);

    public static final RegistryObject<Block> OAK_BARK_BLOCK = registerBlock("oak_bark_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> BIRCH_BARK_BLOCK = registerBlock("birch_bark_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD)));

    public static final RegistryObject<Block> ACACIA_BARK_BLOCK = registerBlock("acacia_bark_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD)));

    public static final RegistryObject<Block> CHERRY_BARK_BLOCK = registerBlock("cherry_bark_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD)));

    public static final RegistryObject<Block> DARK_OAK_BARK_BLOCK = registerBlock("dark_oak_bark_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD)));

    public static final RegistryObject<Block> JUNGLE_BARK_BLOCK = registerBlock("jungle_bark_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD)));

    public static final RegistryObject<Block> MANGROVE_BARK_BLOCK = registerBlock("mangrove_bark_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD)));

    public static final RegistryObject<Block> SPRUCE_BARK_BLOCK = registerBlock("spruce_bark_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD)));

    public static final RegistryObject<Block> CRIMSON_BARK_BLOCK = registerBlock("crimson_bark_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> WARPED_BARK_BLOCK = registerBlock("warped_bark_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registryBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
