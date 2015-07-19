package com.pamelarowlett.lilysscarymod;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public abstract class ItemCrown 
	extends ItemArmor {
    protected ItemCrown(
    	ArmorMaterial material, 
    	ArmorRenderIndex renderIndex) {
    	super(material, renderIndex.getValue(), 0);
    }
}
