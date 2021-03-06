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
     * Gold crown with diamond gem item.
     */
    private static ItemGoldCrownWithDiamond goldCrownWithDiamond;

    /**
     * Gold crown with emerald gem item.
     */
    private static ItemGoldCrownWithEmerald goldCrownWithEmerald;

    /**
     * Gold crown with redstone gem item.
     */
    private static ItemGoldCrownWithRedstone goldCrownWithRedstone;

    /**
     * Iron Crown item.
     */
    private static ItemIronCrown ironCrown;

    /**
     * Iron crown with diamond gem item.
     */
    private static ItemIronCrownWithDiamond ironCrownWithDiamond;

    /**
     * Iron crown with emerald gem item.
     */
    private static ItemIronCrownWithEmerald ironCrownWithEmerald;

    /**
     * Iron crown with flint gem item.
     */
    private static ItemIronCrownWithFlint ironCrownWithFlint;

    /**
     * Iron crown with redstone gem item.
     */
    private static ItemIronCrownWithRedstone ironCrownWithRedstone;

    /**
     * Diamond Crown item.
     */
    private static ItemDiamondCrown diamondCrown;

    /**
     * Diamond crown with emerald gem item.
     */
    private static ItemDiamondCrownWithEmerald diamondCrownWithEmerald;

    /**
     * Diamond crown with redstone gem item.
     */
    private static ItemDiamondCrownWithRedstone diamondCrownWithRedstone;

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
        this.registerCrownItems();
        this.initCrownRecipes();
    }

    /**
     * Registers crown items.
     */
    private void registerCrownItems() {
        goldCrown = new ItemGoldCrown();
        GameRegistry.registerItem(goldCrown, ItemGoldCrown.ID);
        proxy.registerInventoryModel(goldCrown, ItemGoldCrown.ID, 0);

        goldCrownWithDiamond = new ItemGoldCrownWithDiamond();
        GameRegistry.registerItem(
            goldCrownWithDiamond,
            ItemGoldCrownWithDiamond.ID);
        proxy.registerInventoryModel(
            goldCrownWithDiamond,
            ItemGoldCrownWithDiamond.ID,
            0);

        goldCrownWithEmerald = new ItemGoldCrownWithEmerald();
        GameRegistry.registerItem(
            goldCrownWithEmerald,
            ItemGoldCrownWithEmerald.ID);
        proxy.registerInventoryModel(
            goldCrownWithEmerald,
            ItemGoldCrownWithEmerald.ID,
            0);

        goldCrownWithRedstone = new ItemGoldCrownWithRedstone();
        GameRegistry.registerItem(
            goldCrownWithRedstone,
            ItemGoldCrownWithRedstone.ID);
        proxy.registerInventoryModel(
            goldCrownWithRedstone,
            ItemGoldCrownWithRedstone.ID,
            0);

        ironCrown = new ItemIronCrown();
        GameRegistry.registerItem(ironCrown, ItemIronCrown.ID);
        proxy.registerInventoryModel(ironCrown, ItemIronCrown.ID, 0);

        ironCrownWithDiamond = new ItemIronCrownWithDiamond();
        GameRegistry.registerItem(
            ironCrownWithDiamond,
            ItemIronCrownWithDiamond.ID);
        proxy.registerInventoryModel(
            ironCrownWithDiamond,
            ItemIronCrownWithDiamond.ID,
            0);

        ironCrownWithEmerald = new ItemIronCrownWithEmerald();
        GameRegistry.registerItem(
            ironCrownWithEmerald,
            ItemIronCrownWithEmerald.ID);
        proxy.registerInventoryModel(
            ironCrownWithEmerald,
            ItemIronCrownWithEmerald.ID,
            0);

        ironCrownWithFlint = new ItemIronCrownWithFlint();
        GameRegistry.registerItem(
            ironCrownWithFlint,
            ItemIronCrownWithFlint.ID);
        proxy.registerInventoryModel(
            ironCrownWithFlint,
            ItemIronCrownWithFlint.ID,
            0);

        ironCrownWithRedstone = new ItemIronCrownWithRedstone();
        GameRegistry.registerItem(
            ironCrownWithRedstone,
            ItemIronCrownWithRedstone.ID);
        proxy.registerInventoryModel(
            ironCrownWithRedstone,
            ItemIronCrownWithRedstone.ID,
            0);

        diamondCrown = new ItemDiamondCrown();
        GameRegistry.registerItem(diamondCrown, ItemDiamondCrown.ID);
        proxy.registerInventoryModel(diamondCrown, ItemDiamondCrown.ID, 0);

        diamondCrownWithEmerald = new ItemDiamondCrownWithEmerald();
        GameRegistry.registerItem(
            diamondCrownWithEmerald,
            ItemDiamondCrownWithEmerald.ID);
        proxy.registerInventoryModel(
            diamondCrownWithEmerald,
            ItemDiamondCrownWithEmerald.ID,
            0);

        diamondCrownWithRedstone = new ItemDiamondCrownWithRedstone();
        GameRegistry.registerItem(
            diamondCrownWithRedstone,
            ItemDiamondCrownWithRedstone.ID);
        proxy.registerInventoryModel(
            diamondCrownWithRedstone,
            ItemDiamondCrownWithRedstone.ID,
            0);
    }

    /**
     * Initializes crown recipes.
     */
    private void initCrownRecipes() {
        // register basic crowns with no gems.
        ItemStack goldCrownStack = new ItemStack(goldCrown, 1, 0);
        ItemStack ironCrownStack = new ItemStack(ironCrown, 1, 0);
        ItemStack diamondCrownStack = new ItemStack(diamondCrown, 1, 0);
        ItemStack goldIngot = new ItemStack(Items.gold_ingot, 1, 0);
        ItemStack ironIngot = new ItemStack(Items.iron_ingot, 1, 0);
        ItemStack diamond = new ItemStack(Items.diamond, 1, 0);
        ItemStack redstone = new ItemStack(Items.redstone, 1, 0);
        ItemStack flint = new ItemStack(Items.flint, 1, 0);
        ItemStack emerald = new ItemStack(Items.emerald, 1, 0);
        GameRegistry.addRecipe(
            goldCrownStack,
            "   ",
            "III",
            'I', goldIngot);
        GameRegistry.addRecipe(
            ironCrownStack,
            "   ",
            "III",
            'I', ironIngot);
        GameRegistry.addRecipe(
            diamondCrownStack,
            "   ",
            "III",
            'I', diamond);

        // register diamond crowns with gems.
        GameRegistry.addRecipe(
            new ItemStack(diamondCrownWithEmerald, 1, 0),
            "G ",
            "C ",
            'G', emerald,
            'C', diamondCrownStack);

        GameRegistry.addRecipe(
            new ItemStack(diamondCrownWithRedstone, 1, 0),
            "G ",
            "C ",
            'G', redstone,
            'C', diamondCrownStack);

        // register gold crowns with gems.
        GameRegistry.addRecipe(
            new ItemStack(goldCrownWithDiamond, 1, 0),
            "G ",
            "C ",
            'G', diamond,
            'C', goldCrownStack);

        GameRegistry.addRecipe(
            new ItemStack(goldCrownWithEmerald, 1, 0),
            "G ",
            "C ",
            'G', emerald,
            'C', goldCrownStack);

        GameRegistry.addRecipe(
            new ItemStack(goldCrownWithRedstone, 1, 0),
            "G ",
            "C ",
            'G', redstone,
            'C', goldCrownStack);

        // register iron crowns with gems.
        GameRegistry.addRecipe(
            new ItemStack(ironCrownWithDiamond, 1, 0),
            "G ",
            "C ",
            'G', diamond,
            'C', ironCrownStack);

        GameRegistry.addRecipe(
            new ItemStack(ironCrownWithEmerald, 1, 0),
            "G ",
            "C ",
            'G', emerald,
            'C', ironCrownStack);

        GameRegistry.addRecipe(
            new ItemStack(ironCrownWithFlint, 1, 0),
            "G ",
            "C ",
            'G', flint,
            'C', ironCrownStack);

        GameRegistry.addRecipe(
            new ItemStack(ironCrownWithRedstone, 1, 0),
            "G ",
            "C ",
            'G', redstone,
            'C', ironCrownStack);
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
