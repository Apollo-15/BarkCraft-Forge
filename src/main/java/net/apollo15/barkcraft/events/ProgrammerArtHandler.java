package net.apollo15.barkcraft.events;

import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.apollo15.barkcraft.BarkCraft;

import java.util.HashSet;
import java.util.Set;

@Mod.EventBusSubscriber(modid = BarkCraft.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ProgrammerArtHandler {
    private static boolean lastState = false;

    private static final String[] ITEM_IDS = {
            "barkcraft:birch_bark",
            "barkcraft:spruce_bark",
            "barkcraft:oak_bark",
            "barkcraft:dark_oak_bark",
            "barkcraft:jungle_bark",
            "barkcraft:acacia_bark"
    };

    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            boolean isProgrammerArtEnabled = isProgrammerArtActive();

            if (isProgrammerArtEnabled != lastState) {
                lastState = isProgrammerArtEnabled;
                updateItemModelData(isProgrammerArtEnabled);
            }
        }
    }

    private static boolean isProgrammerArtActive() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.getResourcePackRepository() == null) return false;
        Set<String> enabledPacks = new HashSet<>(mc.getResourcePackRepository().getSelectedIds());
        return enabledPacks.contains("programmer_art");
    }

    private static void updateItemModelData(boolean useOldTextures) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null) return;

        mc.execute(() -> {
            for (ItemStack stack : mc.player.getInventory().items) {
                String itemKey = ForgeRegistries.ITEMS.getKey(stack.getItem()).toString();
                for (String id : ITEM_IDS) {
                    if (itemKey.equals(id)) {
                        stack.getOrCreateTag().putInt("CustomModelData", useOldTextures ? 1 : 0);
                    }
                }
            }
        });
    }

    @SubscribeEvent
    public static void onItemToss(ItemTossEvent event) {
        ItemStack stack = event.getEntity().getItem();
        String itemKey = ForgeRegistries.ITEMS.getKey(stack.getItem()).toString();
        for (String id : ITEM_IDS) {
            if (itemKey.equals(id)) {
                stack.getOrCreateTag().putInt("CustomModelData", lastState ? 1 : 0);
            }
        }
    }

    @SubscribeEvent
    public static void onItemPickup(PlayerEvent.ItemPickupEvent event) {
        ItemStack stack = event.getStack();
        String itemKey = ForgeRegistries.ITEMS.getKey(stack.getItem()).toString();
        for (String id : ITEM_IDS) {
            if (itemKey.equals(id)) {
                stack.getOrCreateTag().putInt("CustomModelData", lastState ? 1 : 0);
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        if (player.level().isClientSide) {
            for (ItemStack stack : player.getInventory().items) {
                String itemKey = ForgeRegistries.ITEMS.getKey(stack.getItem()).toString();
                for (String id : ITEM_IDS) {
                    if (itemKey.equals(id)) {
                        stack.getOrCreateTag().putInt("CustomModelData", lastState ? 1 : 0);
                    }
                }
            }
        }
    }
}
