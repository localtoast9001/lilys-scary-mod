/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.pamelarowlett.lilysscarymod;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Gold crown with diamond gem.
 * @author jrowlett
 *
 */
public class ItemGoldCrownWithDiamond extends ItemCrown {
    /**
     * Registration ID for the item.
     */
    public static final String ID = "gold_crown_with_diamond";

    /**
     * unlocalized name of the item.
     */
    public static final String NAME = "d_gold_crown";

    /**
     * Custom armor material.
     */
    private static final ArmorMaterial GOLD_CROWN_WITH_DIAMOND =
        EnumHelper.addArmorMaterial(
            "GOLD_CROWN_WITH_DIAMOND",
            "lilysscarymod:d_gold_crown",
            7,
            new int[] {2, 5, 3, 1},
            25);

    /**
     * Initializes a new instance of the ItemGoldCrownWithDiamond class.
     */
    public ItemGoldCrownWithDiamond() {
        super(GOLD_CROWN_WITH_DIAMOND);
        this.setUnlocalizedName(NAME);
    }
}
