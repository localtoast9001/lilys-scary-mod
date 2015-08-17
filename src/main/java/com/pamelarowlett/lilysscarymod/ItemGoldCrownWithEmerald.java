/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.pamelarowlett.lilysscarymod;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * A gold crown with emerald gem.
 * @author jrowlett
 *
 */
public class ItemGoldCrownWithEmerald extends ItemCrown {
    /**
     * Registration ID for the item.
     */
    public static final String ID = "gold_crown_with_emerald";

    /**
     * unlocalized name of the item.
     */
    public static final String NAME = "e_gold_crown";

    /**
     * Custom armor material.
     */
    private static final ArmorMaterial GOLD_CROWN_WITH_EMERALD =
        EnumHelper.addArmorMaterial(
            "GOLD_CROWN_WITH_EMERALD",
            "lilysscarymod:e_gold_crown",
            7,
            new int[] {2, 5, 3, 1},
            25);

    /**
     * Initializes a new instance of the ItemGoldCrownWithEmerald class.
     */
    public ItemGoldCrownWithEmerald() {
        super(GOLD_CROWN_WITH_EMERALD);
        this.setUnlocalizedName(NAME);
    }
}
