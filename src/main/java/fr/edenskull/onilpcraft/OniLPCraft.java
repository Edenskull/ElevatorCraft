package fr.edenskull.onilpcraft;

import fr.edenskull.onilpcraft.commands.CoolTrigger;
import fr.edenskull.onilpcraft.commands.LpCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class OniLPCraft extends JavaPlugin {

	@Override
	public void onEnable() {
		// Plugin startup logic
		System.out.println("Plugin OniLPCraft Enable");
		this.getCommand("lp").setExecutor(new LpCommand(this));
		getServer().getPluginManager().registerEvents(new CoolTrigger(), this);
	}

	@Override
	public void onDisable() {
		// Plugin shutdown logic
		System.out.println("Plugin OniLPCraft Disable");
	}
}
