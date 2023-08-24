package com.cyanurepv.rpaint.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import com.cyanurepv.rpaint.RpaintMod;

public class ProcessCommande1Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		RpaintMod.LOGGER.info("Rpaint charg\u00E9! V1.0.2. Code sous DMCA.");
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal("RPaint charg\u00E9. Code du mod sous DMCA."), true);
	}
}
