package fr.edenskull.onilpcraft.listeners;

import fr.edenskull.onilpcraft.OniLPCraft;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class OnPlayerEnterSlimeChunk implements Listener {

    private final OniLPCraft plugin;

    public OnPlayerEnterSlimeChunk(OniLPCraft plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerEnterSlimeChunk(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Location nextLocation = event.getTo();
        Location prevLocation = event.getFrom();

        if (!nextLocation.getChunk().equals(prevLocation.getChunk())) {
            if (nextLocation.getChunk().isSlimeChunk() && !prevLocation.getChunk().isSlimeChunk()) {
                String message = (ChatColor.GREEN + "You entered in a Slime Chunk");
                player.sendMessage(message);
            } else if (!nextLocation.getChunk().isSlimeChunk() && prevLocation.getChunk().isSlimeChunk()) {
                String message = (ChatColor.GREEN + "You leaved the Slime Chunk");
                player.sendMessage(message);
            }
        }
    }
}
