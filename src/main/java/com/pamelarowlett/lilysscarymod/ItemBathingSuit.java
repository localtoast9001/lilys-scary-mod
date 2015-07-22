/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.pamelarowlett.lilysscarymod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * Base class for bathing suits.
 * @author jrowlett
 *
 */
public class ItemBathingSuit extends ItemArmor {
    /**
     * ID for registration.
     */
    public static final String ID = "bathing_suit";

    /**
     * Unlocalized name.
     */
    private static final String NAME = "bathing_suit";
    
    /**
     * Skin layer for the bathing suit.
     */
    private static final int LAYER = 2;

    /**
     * Custom armor material.
     */
    private static final ArmorMaterial BATHING_SUIT =
        EnumHelper.addArmorMaterial(
            "BATHING_SUIT",
            "lilysscarymod:bathing_suit",
            7,
            new int[] {2, 5, 3, 1},
            25);

    /**
     * Initializes a new instance of the ItemBathingSuit class.
     */
    public ItemBathingSuit() {
        super(BATHING_SUIT, LAYER, ArmorType.LEGGINGS.ordinal());
        this.setUnlocalizedName(NAME);
    }
    
    @Override 
    public void onUpdate(
    	ItemStack item,
    	World world,
    	Entity entity,
    	int par4,
    	boolean par5) {
    	super.onUpdate(item, world, entity, par4, par5);
    	EntityPlayer player = (EntityPlayer) entity;
    	System.out.println("---");
    	System.out.println(new Integer(par4).toString());
    	System.out.println(new Boolean(par5).toString());
    	System.out.println(player.getCurrentArmor(0));
    	System.out.println(player.getCurrentArmor(1));
    	System.out.println(player.getCurrentArmor(2));
    	System.out.println(player.getCurrentArmor(3));
		System.out.println("Adding water breathing effect.");
    	player.addPotionEffect(
    		new PotionEffect(Potion.waterBreathing.id, 500));
    }
}
