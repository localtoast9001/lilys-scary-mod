package com.pamelarowlett.lilysscarymod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
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
     * Gets created by FML to specialize client vs. server calls.
     */
    @SidedProxy(
        clientSide = "com.pamelarowlett.lilysscarymod.ClientProxy",
        serverSide = "com.pamelarowlett.lilysscarymod.ServerProxy")
    public static CommonProxy proxy;
    
    private static ItemGoldCrown goldCrown;    
    
    /**
     * Init event.
     * @param event
     */
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	this.initCrowns();
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
}
