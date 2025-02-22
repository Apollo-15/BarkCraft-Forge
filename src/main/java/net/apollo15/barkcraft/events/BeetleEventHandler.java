package net.apollo15.barkcraft.events;

import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.item.ItemStack;
import net.apollo15.barkcraft.item.ModItems;
import net.apollo15.barkcraft.BarkCraft;

@Mod.EventBusSubscriber(modid = BarkCraft.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BeetleEventHandler {
    @SubscribeEvent
    public static void onChickenFed(PlayerInteractEvent.EntityInteract event) {
        if (event.getTarget() instanceof Chicken chicken) {
            ItemStack stack = event.getItemStack();
            if (stack.getItem() == ModItems.RAW_BEETLE.get() || stack.getItem() == ModItems.COOKED_BEETLE.get()) {
                Player player = event.getEntity();
                if (!player.getAbilities().instabuild) {
                    stack.shrink(1);
                }
                chicken.setInLove(player);
                event.setCanceled(true);
            }
        }
    }

}