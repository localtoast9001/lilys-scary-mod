/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.pamelarowlett.lilysscarymod;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

/**
 * A diamond crown with no gem.
 * @author jrowlett
 *
 */
public class ItemDiamondCrown extends ItemCrown {
    /**
     * Registration ID for the item.
     */
    public static final String ID = "diamond_crown";

    /**
     * unlocalized name of the item.
     */
    public static final String NAME = "n_diamond_crown";

    /**
     * Custom armor material.
     */
    private static final ArmorMaterial DIAMOND_CROWN =
        EnumHelper.addArmorMaterial(
            "DIAMOND_CROWN",
            "lilysscarymod:n_diamond_crown",
            7,
            new int[] {2, 5, 3, 1},
            25,
            SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_diamond")),
            1.0f);

    /**
     * Initializes a new instance of the ItemDiamondCrown class.
     */
    public ItemDiamondCrown() {
        super(DIAMOND_CROWN);
        this.setUnlocalizedName(NAME);
    }
}
