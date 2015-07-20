/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.pamelarowlett.lilysscarymod;

/**
 * Render Index for armor.
 * @author jrowlett
 * 0 is cloth, 1 is chain, 2 is
 * iron, 3 is diamond and 4 is gold.
 *
 */
public enum ArmorRenderIndex {
    /**
     * Cloth render index.
     */
    CLOTH(0),

    /**
     * Chain render index.
     */
    CHAIN(1),

    /**
     * Iron render index.
     */
    IRON(2),

    /**
     * diamond render index.
     */
    DIAMOND(3),

    /**
     * gold render index.
     */
    GOLD(4);

    /**
     * the value.
     */
    private int value;

    /**
     * Gets the value.
     * @return the value of the enum.
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Initializes a new instance of the ArmorRenderIndex enum.
     * @param indexValue the value of the enum.
     */
    private ArmorRenderIndex(final int indexValue) {
        this.value = indexValue;
    }
}
