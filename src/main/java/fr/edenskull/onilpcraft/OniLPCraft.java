package fr.edenskull.onilpcraft;

import fr.edenskull.onilpcraft.commands.LpCommand;
import fr.edenskull.onilpcraft.listeners.OnPlayerEnterSlimeChunk;
import fr.edenskull.onilpcraft.listeners.OnPlayerScanChunk;
import fr.edenskull.onilpcraft.listeners.OnPlayerTeleportEnder;
import fr.edenskull.onilpcraft.listeners.OnPlayerTeleportNether;
import org.bukkit.plugin.java.JavaPlugin;

public final class OniLPCraft extends JavaPlugin {

	@Override
	public void onEnable() {
		// Plugin startup logic
		System.out.println("Plugin OniLPCraft Enable");
		this.getCommand("lp").setExecutor(new LpCommand(this));
		this.getServer().getPluginManager().registerEvents(new OnPlayerTeleportNether(this), this);
		this.getServer().getPluginManager().registerEvents(new OnPlayerTeleportEnder(this), this);
		this.getServer().getPluginManager().registerEvents(new OnPlayerEnterSlimeChunk(this), this);
		this.getServer().getPluginManager().registerEvents(new OnPlayerScanChunk(this), this);
	}

	@Override
	public void onDisable() {
		// Plugin shutdown logic
		System.out.println("Plugin OniLPCraft Disable");
	}
}
