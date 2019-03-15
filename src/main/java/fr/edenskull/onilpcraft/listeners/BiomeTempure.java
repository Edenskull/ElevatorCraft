package fr.edenskull.onilpcraft.listeners;

import fr.edenskull.onilpcraft.OniLPCraft;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class BiomeTempure implements Listener {
    private final OniLPCraft plugin;

    public BiomeTempure(OniLPCraft plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerChangeBiome(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        World world = event.getPlayer().getWorld();
        Location nextLocation = event.getTo();
        Location prevLocation = event.getFrom();

        int rayNewX = (int) nextLocation.getX();
        int rayNewZ = (int) nextLocation.getY();
        int rayOldX = (int) prevLocation.getX();
        int rayOldZ = (int) prevLocation.getY();

        if (!world.getBiome(rayNewX, rayNewZ).equals(world.getBiome(rayOldX, rayOldZ))) {
            String message = (ChatColor.BLUE + world.getBiome(rayNewX, rayNewZ).name());
            player.sendTitle(message,"", 15, 50, 15);
        }
    }

}
