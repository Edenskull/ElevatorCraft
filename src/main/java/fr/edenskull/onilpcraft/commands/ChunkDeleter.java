package fr.edenskull.onilpcraft.commands;

import fr.edenskull.onilpcraft.OniLPCraft;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChunkDeleter implements CommandExecutor {
    private final OniLPCraft plugin;

    public ChunkDeleter(OniLPCraft plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Chunk chunk = player.getLocation().getChunk();

            int chunkX = chunk.getX() << 4;
            int chunkZ = chunk.getZ() << 4;

            for (int runX = chunkX; runX < chunkX + 16; runX++) {
                for (int runZ = chunkZ; runZ < chunkZ + 16; runZ++) {
                    for (int runY = 1; runY < 128; runY++) {
                        player.getWorld().getBlockAt(runX, runY, runZ).setType(Material.AIR);
                    }
                }
            }
            player.sendMessage("Chunk has been cleared");
            return true;
        } else {
            sender.sendMessage("You are not a player");
            return false;
        }
    }
}
