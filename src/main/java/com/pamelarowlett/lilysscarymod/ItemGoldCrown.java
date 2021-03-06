/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.pamelarowlett.lilysscarymod;

import net.minecraftforge.common.util.EnumHelper;

/**
 * Gold Crown with no gem item.
 * @author jrowlett
 *
 */
public class ItemGoldCrown extends ItemCrown {
    /**
     * Registration ID for the item.
     */
    public static final String ID = "gold_crown";

    /**
     * unlocalized name of the item.
     */
    public static final String NAME = "n_gold_crown";

    /**
     * Custom armor material.
     */
    private static final ArmorMaterial GOLD_CROWN =
        EnumHelper.addArmorMaterial(
            "GOLD_CROWN",
            "lilysscarymod:n_gold_crown",
            7,
            new int[] {2, 5, 3, 1},
            25);

    /**
     * Initializes a new instance of the ItemGoldCrown class.
     */
    public ItemGoldCrown() {
        super(GOLD_CROWN);
        this.setUnlocalizedName(NAME);
    }
}
