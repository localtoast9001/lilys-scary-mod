/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.pamelarowlett.lilysscarymod;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;

/**
 * Base class of all crown items.
 * @author jrowlett
 *
 */
public abstract class ItemCrown
    extends ItemArmor {

    /**
     * Render index for the texture.
     */
    private static final int DEFAULT_ARMOR_RENDER_INDEX = 1;

    /**
     * Initializes a new instance of the ItemCrown class.
     * @param material the armor material.
     */
    protected ItemCrown(
        final ArmorMaterial material) {
        this(material, DEFAULT_ARMOR_RENDER_INDEX);
    }

    /**
     * Initializes a new instance of the ItemCrown class.
     * @param material the armor material.
     * @param renderIndex the render index.
     */
    protected ItemCrown(
        final ArmorMaterial material,
        final int renderIndex) {
        super(material, renderIndex, EntityEquipmentSlot.HEAD);
    }
}
