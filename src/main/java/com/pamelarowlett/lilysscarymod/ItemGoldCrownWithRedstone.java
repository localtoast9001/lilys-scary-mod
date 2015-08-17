/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.pamelarowlett.lilysscarymod;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Gold crown with redstone gem item.
 * @author jrowlett
 *
 */
public class ItemGoldCrownWithRedstone extends ItemCrown {
    /**
     * Registration ID for the item.
     */
    public static final String ID = "gold_crown_with_redstone";

    /**
     * unlocalized name of the item.
     */
    public static final String NAME = "r_gold_crown";

    /**
     * Custom armor material.
     */
    private static final ArmorMaterial GOLD_CROWN_WITH_REDSTONE =
        EnumHelper.addArmorMaterial(
            "GOLD_CROWN_WITH_REDSTONE",
            "lilysscarymod:r_gold_crown",
            7,
            new int[] {2, 5, 3, 1},
            25);

    /**
     * Initializes a new instance of the ItemGoldCrownWithRedstone class.
     */
    public ItemGoldCrownWithRedstone() {
        super(GOLD_CROWN_WITH_REDSTONE);
        this.setUnlocalizedName(NAME);
    }
}
