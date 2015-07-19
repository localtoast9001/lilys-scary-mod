package com.pamelarowlett.lilysscarymod;

/**
 * Render Index for armor
 * @author jrowlett
 * 0 is cloth, 1 is chain, 2 is
 * iron, 3 is diamond and 4 is gold.
 *
 */
public enum ArmorRenderIndex {
	CLOTH(0),
	CHAIN(1),
	IRON(2),
	DIAMOND(3),
	GOLD(4);
	
	/**
	 * the value.
	 */
	private int value;
	
	/**
	 * Gets the value.
	 * @return
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
