/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.pamelarowlett.lilysscarymod;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Iron crown with emerald gem.
 * @author jrowlett
 *
 */
public class ItemIronCrownWithEmerald extends ItemCrown {
    /**
     * Registration ID for the item.
     */
    public static final String ID = "iron_crown_with_emerald";

    /**
     * unlocalized name of the item.
     */
    public static final String NAME = "e_iron_crown";

    /**
     * Custom armor material.
     */
    private static final ArmorMaterial IRON_CROWN_WITH_EMERALD =
        EnumHelper.addArmorMaterial(
            "IRON_CROWN_WITH_EMERALD",
            "lilysscarymod:e_iron_crown",
            7,
            new int[] {2, 5, 3, 1},
            25);

    /**
     * Initializes a new instance of the ItemIronCrownWithEmerald class.
     */
    public ItemIronCrownWithEmerald() {
        super(IRON_CROWN_WITH_EMERALD);
        this.setUnlocalizedName(NAME);
    }
}
