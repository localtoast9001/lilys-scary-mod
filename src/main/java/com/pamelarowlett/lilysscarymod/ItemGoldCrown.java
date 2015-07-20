/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.pamelarowlett.lilysscarymod;

/**
 * Gold Crown item.
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
    public static final String NAME = "gold_crown";

    /**
     * Custom armor material.
     */
    public static final ArmorMaterial GOLD_CROWN =
        EnumHelper.addArmorMaterial(
            "GOLD_CROWN",
            "lilysscarymod:gold_crown",
            7,
            new int[] {2, 5, 3, 1},
            25);

    /**
     * Initializes a new instance of the ItemGoldCrown class.
     */
    public ItemGoldCrown() {
        super(GOLD_CROWN, ArmorRenderIndex.CHAIN);
        this.setUnlocalizedName(NAME);
    }
}
