/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.pamelarowlett.lilysscarymod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingEvent;

/**
 * Event handler to apply armor effects on living update.
 * @author jrowlett
 *
 */
public class ArmorEffectEventHandler {
    /**
     * Called on each living entity update.
     * @param event the event data.
     */
    @SubscribeEvent
    public final void onLivingUpdate(
        final LivingEvent.LivingUpdateEvent event) {
        if (!(event.getEntity() instanceof EntityPlayer)) {
            return;
        }

        EntityPlayer player = (EntityPlayer) event.getEntity();
        Iterable<ItemStack> playerArmor = player.getArmorInventoryList();
        for (ItemStack itemStack : playerArmor) {
            if (itemStack != null && itemStack.stackSize > 0) {
                Item item = itemStack.getItem();
                if (item instanceof IArmorEffect) {
                    this.updateArmorEffect(
                        player,
                        itemStack,
                        (IArmorEffect) item);
                }
            }
        }
    }

    /**
     * calls the armor effect interface and updates the player with the effect.
     * @param player the player entity.
     * @param itemStack the item stack with the armor.
     * @param armorEffect the armor effect interface.
     */
    private void updateArmorEffect(
        final EntityPlayer player,
        final ItemStack itemStack,
        final IArmorEffect armorEffect) {
        PotionEffect potionEffect =
            armorEffect.getPotionEffect(
            player,
            itemStack);
        if (potionEffect != null) {
            player.addPotionEffect(potionEffect);
        }
    }
}
