package fr.edenskull.onilpcraft.commands;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

public class CoolTrigger implements Listener {

	@EventHandler
	public void onPlayerEnterNether(PlayerPortalEvent event) {
		if (event.getCause().equals(PlayerTeleportEvent.TeleportCause.NETHER_PORTAL)) {
			if (event.getTo().getWorld().getEnvironment().equals(World.Environment.NETHER)) {
				Bukkit.getOnlinePlayers().forEach();
			}
		}
	}

}
