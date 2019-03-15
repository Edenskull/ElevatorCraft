package fr.edenskull.onilpcraft.listeners;

import fr.edenskull.onilpcraft.OniLPCraft;
import org.bukkit.ChatColor;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class OnPlayerScanChunk implements Listener {
    private final OniLPCraft plugin;

    public OnPlayerScanChunk(OniLPCraft plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerScanChunk(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Material item = event.getMaterial();
        int diamondCounter = 0;
        ChatColor color;

        if (item.equals(Material.STICK) && (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK))) {

            Chunk chunk = player.getLocation().getChunk();
            int chunkX = chunk.getX() << 4;
            int chunkZ = chunk.getZ() << 4;

            for (int runX = chunkX; runX < chunkX + 16; runX++) {
                for (int runZ = chunkZ; runZ < chunkZ + 16; runZ++) {
                    for (int runY = 1; runY < 128; runY++) {

                        if (player.getWorld().getBlockAt(runX, runY, runZ).getType().equals(Material.DIAMOND_ORE)) {
                            diamondCounter++;
                        }

                    }
                }
            }
            switch (diamondCounter) {
                case 0:
                    color = ChatColor.WHITE;
                    break;
                case 1:
                    color = ChatColor.WHITE;
                    break;
                case 2:
                    color = ChatColor.GREEN;
                    break;
                case 3:
                    color = ChatColor.GOLD;
                    break;
                case 4:
                    color = ChatColor.DARK_PURPLE;
                    break;
                case 5:
                    color = ChatColor.DARK_RED;
                    break;
                default:
                    color = ChatColor.DARK_RED;
                    break;
            }
            player.sendMessage("There is " + color + diamondCounter + ChatColor.RESET + " diamond block ore in this chunk");
        }
    }

}
