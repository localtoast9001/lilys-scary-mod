/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.pamelarowlett.lilysscarymod;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;

/**
 * Base class of all crown items.
 * @author jrowlett
 *
 */
public abstract class ItemCrown
    extends ItemArmor {

    /**
     * Initializes a new instance of the ItemCrown class.
     * @param material the armor material.
     * @param renderIndex the render index.
     */
    protected ItemCrown(
        final ArmorMaterial material,
        final ArmorRenderIndex renderIndex) {
        super(material, renderIndex.getValue(), 0);
    }
}
