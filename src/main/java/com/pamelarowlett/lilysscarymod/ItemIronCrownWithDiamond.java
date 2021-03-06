/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.pamelarowlett.lilysscarymod;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Iron crown with diamond gem.
 * @author jrowlett
 *
 */
public class ItemIronCrownWithDiamond extends ItemCrown {
    /**
     * Registration ID for the item.
     */
    public static final String ID = "iron_crown_with_diamond";

    /**
     * unlocalized name of the item.
     */
    public static final String NAME = "d_iron_crown";

    /**
     * Custom armor material.
     */
    private static final ArmorMaterial IRON_CROWN_WITH_DIAMOND =
        EnumHelper.addArmorMaterial(
            "IRON_CROWN_WITH_DIAMOND",
            "lilysscarymod:d_iron_crown",
            7,
            new int[] {2, 5, 3, 1},
            25);

    /**
     * Initializes a new instance of the ItemIronCrownWithDiamond class.
     */
    public ItemIronCrownWithDiamond() {
        super(IRON_CROWN_WITH_DIAMOND);
        this.setUnlocalizedName(NAME);
    }
}
