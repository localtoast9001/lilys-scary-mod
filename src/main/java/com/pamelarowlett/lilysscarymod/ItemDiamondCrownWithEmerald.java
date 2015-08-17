/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.pamelarowlett.lilysscarymod;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * A diamond crown with emerald gem.
 * @author jrowlett
 *
 */
public class ItemDiamondCrownWithEmerald extends ItemCrown {
    /**
     * Registration ID for the item.
     */
    public static final String ID = "diamond_crown_with_emerald";

    /**
     * unlocalized name of the item.
     */
    public static final String NAME = "e_diamond_crown";

    /**
     * Custom armor material.
     */
    private static final ArmorMaterial DIAMOND_CROWN_WITH_EMERALD =
        EnumHelper.addArmorMaterial(
            "DIAMOND_CROWN_WITH_EMERALD",
            "lilysscarymod:e_diamond_crown",
            7,
            new int[] {2, 5, 3, 1},
            25);

    /**
     * Initializes a new instance of the ItemDiamondCrown class.
     */
    public ItemDiamondCrownWithEmerald() {
        super(DIAMOND_CROWN_WITH_EMERALD);
        this.setUnlocalizedName(NAME);
    }
}
