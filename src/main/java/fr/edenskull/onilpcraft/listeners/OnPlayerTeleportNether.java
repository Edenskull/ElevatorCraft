package fr.edenskull.onilpcraft.listeners;

import fr.edenskull.onilpcraft.OniLPCraft;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class OnPlayerTeleportNether implements Listener {

    private final OniLPCraft plugin;

    public OnPlayerTeleportNether(OniLPCraft plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerEnterNether(PlayerPortalEvent event) {
        if (event.getCause().equals(PlayerTeleportEvent.TeleportCause.NETHER_PORTAL)) {
            if (event.getTo().getWorld().getEnvironment().equals(World.Environment.NETHER)) {
                final String title = (ChatColor.LIGHT_PURPLE + event.getPlayer().getDisplayName() + " enter the nether world");
                new BukkitRunnable() {

                    @Override
                    public void run() {
                        Bukkit.getOnlinePlayers().forEach(receiver -> receiver.sendTitle(title, "", 15, 50, 15));
                    }
                }.runTaskLater(plugin, 40);
            }
        }
    }

}
