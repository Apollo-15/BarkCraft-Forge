package net.rayl1x.barkcraft.events;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rayl1x.barkcraft.BarkCraft;
import net.rayl1x.barkcraft.item.ModItems;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@Mod.EventBusSubscriber(modid = BarkCraft.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BarkEventHandler {

    private static Map<Block, Block> getStrippables() {
        try {
            Field field = AxeItem.class.getDeclaredField("STRIPPABLES");
            field.setAccessible(true);
            return (Map<Block, Block>) field.get(null);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Failed to access STRIPPABLES field", e);
        }
    }

    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        Player player = event.getEntity();
        Level level = event.getLevel();

        ItemStack heldItem = player.getMainHandItem();
        if (!(heldItem.getItem() instanceof AxeItem)){
            return;
        }

        BlockState blockState = level.getBlockState(event.getPos());
        if (!isStrippableLog(blockState)){
            return;
        }

        player.swing(event.getHand());

        level.playSound(null, event.getPos(), SoundEvents.AXE_STRIP,
                SoundSource.BLOCKS, 1.0F, 1.0F);

        int barkAmount = ThreadLocalRandom.current().nextInt(1, 4);

        ItemStack bark = getBarkItemForLog(blockState);
        if (bark != null){
            BlockState strippedState = getStrippedLog(blockState);

            strippedState = strippedState.setValue(BlockStateProperties.AXIS, blockState.getValue(BlockStateProperties.AXIS)); // Preserve orientation
            level.setBlock(event.getPos(), strippedState, 11);
            if(!level.isClientSide){
                Block.popResource(level, event.getPos(), bark);
                for (int i = 0; i < barkAmount; i++) {
                    Block.popResource(level, event.getPos(), bark);
                }
            }

        }
        heldItem.hurtAndBreak(1, player, (p) -> p.broadcastBreakEvent(event.getHand()));

        event.setCanceled(true);
    }

    private static boolean isStrippableLog(BlockState state){
        return getStrippables().containsKey(state.getBlock());
    }

    private static BlockState getStrippedLog(BlockState state){
        return getStrippables().get(state.getBlock()).defaultBlockState();
    }

    private static ItemStack getBarkItemForLog(BlockState state){
        if (state.is(Blocks.OAK_LOG)){
            return new ItemStack(ModItems.OAK_BARK.get());
        } else if (state.is(Blocks.BIRCH_LOG)) {
            return new ItemStack(ModItems.BIRCH_BARK.get());
        } else if (state.is(Blocks.SPRUCE_LOG)) {
            return new ItemStack(ModItems.SPRUCE_BARK.get());
        } else if (state.is(Blocks.JUNGLE_LOG)) {
            return new ItemStack(ModItems.JUNGLE_BARK.get());
        } else if (state.is(Blocks.DARK_OAK_LOG)) {
            return new ItemStack(ModItems.DARK_OAK_BARK.get());
        } else if (state.is(Blocks.ACACIA_LOG)) {
            return new ItemStack(ModItems.ACACIA_BARK.get());
        } else if (state.is(Blocks.MANGROVE_LOG)) {
            return new ItemStack(ModItems.MANGROVE_BARK.get());
        } else if (state.is(Blocks.CHERRY_LOG)) {
            return new ItemStack(ModItems.CHERRY_BARK.get());
        } else if (state.is(Blocks.WARPED_STEM)) {
            return new ItemStack(ModItems.WARPED_BARK.get());
        } else if (state.is(Blocks.CRIMSON_STEM)) {
            return new ItemStack(ModItems.CRIMSON_BARK.get());
        }
        return null;
    }

}