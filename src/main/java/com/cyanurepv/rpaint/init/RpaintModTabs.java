
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.cyanurepv.rpaint.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RpaintModTabs {
	public static CreativeModeTab TAB_TAB_RPAINT;

	public static void load() {
		TAB_TAB_RPAINT = new CreativeModeTab("tabtab_rpaint") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.PAINTING);
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
