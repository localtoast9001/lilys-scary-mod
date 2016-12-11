/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.pamelarowlett.lilysscarymod;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Iron crown with redstone gem.
 * @author jrowlett
 *
 */
public class ItemIronCrownWithRedstone extends ItemCrown {
    /**
     * Registration ID for the item.
     */
    public static final String ID = "iron_crown_with_redstone";

    /**
     * unlocalized name of the item.
     */
    public static final String NAME = "r_iron_crown";

    /**
     * Custom armor material.
     */
    private static final ArmorMaterial IRON_CROWN_WITH_REDSTONE =
        EnumHelper.addArmorMaterial(
            "IRON_CROWN_WITH_REDSTONE",
            "lilysscarymod:r_iron_crown",
            7,
            new int[] {2, 5, 3, 1},
            25,
            SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_iron")),
            1.0f);

    /**
     * Initializes a new instance of the ItemIronCrownWithRedstone class.
     */
    public ItemIronCrownWithRedstone() {
        super(IRON_CROWN_WITH_REDSTONE);
        this.setUnlocalizedName(NAME);
    }
}
