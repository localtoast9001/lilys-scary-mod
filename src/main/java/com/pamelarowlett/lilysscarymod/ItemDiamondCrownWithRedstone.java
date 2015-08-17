/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.pamelarowlett.lilysscarymod;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * A diamond crown with a redstone gem.
 * @author jrowlett
 *
 */
public class ItemDiamondCrownWithRedstone extends ItemCrown {
    /**
     * Registration ID for the item.
     */
    public static final String ID = "diamond_crown_with_redstone";

    /**
     * unlocalized name of the item.
     */
    public static final String NAME = "r_diamond_crown";

    /**
     * Custom armor material.
     */
    private static final ArmorMaterial DIAMOND_CROWN_WITH_REDSTONE =
        EnumHelper.addArmorMaterial(
            "DIAMOND_CROWN_WITH_REDSTONE",
            "lilysscarymod:r_diamond_crown",
            7,
            new int[] {2, 5, 3, 1},
            25);

    /**
     * Initializes a new instance of the ItemDiamondCrownWithRedstone class.
     */
    public ItemDiamondCrownWithRedstone() {
        super(DIAMOND_CROWN_WITH_REDSTONE);
        this.setUnlocalizedName(NAME);
    }
}
