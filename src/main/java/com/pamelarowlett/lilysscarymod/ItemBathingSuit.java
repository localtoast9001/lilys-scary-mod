/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.pamelarowlett.lilysscarymod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Base class for bathing suits.
 * @author jrowlett
 *
 */
public class ItemBathingSuit extends ItemArmor implements IArmorEffect {
    /**
     * ID for registration.
     */
    public static final String ID = "bathing_suit";

    /**
     * Unlocalized name.
     */
    private static final String NAME = "bathing_suit";

    /**
     * Skin layer for the bathing suit.
     */
    private static final int LAYER = 2;

    /**
     * Duration for the water breathing effect.
     */
    private static final int WATER_BREATHING_DURATION = 50;

    /**
     * Custom armor material.
     */
    private static final ArmorMaterial BATHING_SUIT =
        EnumHelper.addArmorMaterial(
            "BATHING_SUIT",
            "lilysscarymod:bathing_suit",
            1,
            new int[] {1, 1, 1, 1},
            0,
            SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_leather")),
            1.0f);

    /**
     * Initializes a new instance of the ItemBathingSuit class.
     */
    public ItemBathingSuit() {
        super(
            BATHING_SUIT,
            LAYER,
            EntityEquipmentSlot.LEGS);
        this.setUnlocalizedName(NAME);
    }

    /**
     * Gets the potion effect to apply when wearing the armor.
     * @param player the player wearing the armor.
     * @param itemStack the armor inventory item stack.
     * @return the potion effect to apply or null to apply no effect.
     */
    @Override
    public final PotionEffect getPotionEffect(
        final EntityPlayer player,
        final ItemStack itemStack) {
        return new PotionEffect(
            Potion.REGISTRY.getObject(new ResourceLocation("water_breathing")),
            WATER_BREATHING_DURATION);
    }
}
