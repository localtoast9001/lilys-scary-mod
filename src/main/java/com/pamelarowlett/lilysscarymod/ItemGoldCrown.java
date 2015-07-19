package com.pamelarowlett.lilysscarymod;

import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;

public class ItemGoldCrown extends ItemCrown {
	
	public static final String ID = "gold_crown";
	
	public static final String NAME = "gold_crown";
	
	public static final ArmorMaterial GOLD_CROWN = EnumHelper.addArmorMaterial(
		"GOLD_CROWN",
		"lilysscarymod:gold_crown",
		7, 
		new int[] {2, 5, 3, 1},
		25);
		
	public ItemGoldCrown() {
		super(GOLD_CROWN, ArmorRenderIndex.CHAIN);
		this.setUnlocalizedName(NAME);
	}
}
