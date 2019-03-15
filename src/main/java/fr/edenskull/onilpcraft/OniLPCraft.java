package fr.edenskull.onilpcraft;

import fr.edenskull.onilpcraft.commands.ChunkDeleter;
import fr.edenskull.onilpcraft.commands.LpCommand;
import fr.edenskull.onilpcraft.listeners.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class OniLPCraft extends JavaPlugin {

	@Override
	public void onEnable() {
		// Plugin startup logic
		System.out.println("Plugin OniLPCraft Enable");
		this.getCommand("lp").setExecutor(new LpCommand(this));
		this.getCommand("clearchunk").setExecutor(new ChunkDeleter(this));
		this.getServer().getPluginManager().registerEvents(new OnPlayerTeleportNether(this), this);
		this.getServer().getPluginManager().registerEvents(new OnPlayerTeleportEnder(this), this);
		this.getServer().getPluginManager().registerEvents(new OnPlayerEnterSlimeChunk(this), this);
		this.getServer().getPluginManager().registerEvents(new OnPlayerScanChunk(this), this);
		this.getServer().getPluginManager().registerEvents(new BiomeTempure(this), this);
	}

	@Override
	public void onDisable() {
		// Plugin shutdown logic
		System.out.println("Plugin OniLPCraft Disable");
	}
}
