
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.cyanurepv.rpaint.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RpaintModTabs {
	public static CreativeModeTab TAB_R_PAINT_CREATIVE_TAB;

	public static void load() {
		TAB_R_PAINT_CREATIVE_TAB = new CreativeModeTab("tabr_paint_creative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.STRUCTURE_VOID);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
