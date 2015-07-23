/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.pamelarowlett.lilysscarymod;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Lily's Scary Mod (Lily is 5 years old).
 * @author jrowlett
 *
 */
@Mod(
    modid = LilysScaryMod.MODID,
    version = LilysScaryMod.VERSION)
public class LilysScaryMod {
    /**
     * Mod id.
     */
    public static final String MODID = "lilysscarymod";

    /**
     * Mod version.
     */
    public static final String VERSION = "1.0";

    /**
     * Metadata for the water breathing potion items.
     */
    private static final int[] WATER_BREATHING_META = new int[] {8237, 8269};

    /**
     * Gets created by FML to specialize client vs. server calls.
     */
    @SidedProxy(
        clientSide = "com.pamelarowlett.lilysscarymod.ClientProxy",
        serverSide = "com.pamelarowlett.lilysscarymod.ServerProxy")
    public static CommonProxy proxy;

    /**
     * Gold Crown item.
     */
    private static ItemGoldCrown goldCrown;

    /**
     * Bathing Suit.
     */
    private static ItemBathingSuit bathingSuit;

    /**
     * Init event.
     * @param event initialization parameters.
     */
    @EventHandler
    public final void init(final FMLInitializationEvent event) {
        this.initCrowns();
        this.initBathingSuits();
    }

    /**
     * Post-init event.
     * @param event post init parameters.
     */
    @EventHandler
    public final void postInit(final FMLPostInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new ArmorEffectEventHandler());
    }

    /**
     * Registers crown items and recipes.
     */
    private void initCrowns() {
        goldCrown = new ItemGoldCrown();
        GameRegistry.registerItem(goldCrown, ItemGoldCrown.ID);
        proxy.registerInventoryModel(goldCrown, ItemGoldCrown.ID, 0);

        ItemStack crownStack = new ItemStack(goldCrown, 1, 0);
        ItemStack goldIngot = new ItemStack(Items.gold_ingot, 1, 0);
        ItemStack diamond = new ItemStack(Items.diamond, 1, 0);
        GameRegistry.addRecipe(
            crownStack,
            " D ",
            "III",
            'D', diamond,
            'I', goldIngot);
    }

    /**
     * Registers bathing suits and recipes.
     */
    private void initBathingSuits() {
        bathingSuit = new ItemBathingSuit();
        GameRegistry.registerItem(bathingSuit, ItemBathingSuit.ID);
        proxy.registerInventoryModel(bathingSuit, ItemBathingSuit.ID, 0);

        //recipe.
        ItemStack bathingSuitStack = new ItemStack(bathingSuit, 1, 0);
        ItemStack leather = new ItemStack(Items.leather, 1, 0);
        for (int i = 0; i < WATER_BREATHING_META.length; i++) {
            ItemStack waterBreathingPotion = new ItemStack(
                Items.potionitem,
                1,
                WATER_BREATHING_META[i]);
            GameRegistry.addRecipe(
                bathingSuitStack,
                "LPL",
                "LLL",
                " L ",
                'L', leather,
                'P', waterBreathingPotion);
        }
    }
}
