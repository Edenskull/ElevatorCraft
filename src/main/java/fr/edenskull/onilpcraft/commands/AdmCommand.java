package fr.edenskull.onilpcraft.commands;

import fr.edenskull.onilpcraft.OniLPCraft;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class AdmCommand implements CommandExecutor {
	private final OniLPCraft plugin;

	public AdmCommand(OniLPCraft plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (args[0].equalsIgnoreCase("broadcast")) {
				if (args.length > 2) {
					String s = "";
					for (int x = 2; x < args.length; x++){
						s = s.concat(args[x] + " ");
					}
					final String message = s;
					Bukkit.getOnlinePlayers().forEach(receiver -> receiver.sendTitle(args[1], message, 5, 20, 5));
				} else {
					sender.sendMessage("Too few arguments");
				}
			}
		} else {
			sender.sendMessage("You are not a player");
			return false;
		}
		return false;
	}

}
