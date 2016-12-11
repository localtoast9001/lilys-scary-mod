/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.pamelarowlett.lilysscarymod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

/**
 * Implemented by ItemArmor classes to apply special effects
 * when worn.
 * @author jrowlett
 *
 */
public interface IArmorEffect {
    /**
     * Gets the potion effect to apply when wearing the armor.
     * @param player the player wearing the armor.
     * @param itemStack the armor inventory item stack.
     * @return the potion effect to apply or null to apply no effect.
     */
    PotionEffect getPotionEffect(
        EntityPlayer player,
        ItemStack itemStack);
}
