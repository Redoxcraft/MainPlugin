package de.redoxcraft.mainplugin.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.redoxcraft.mainplugin.commands.AdvenCommand;
import de.redoxcraft.mainplugin.commands.GmCommand;
import de.redoxcraft.mainplugin.commands.SpecCommand;
import de.redoxcraft.mainplugin.commands.SvCommand;
import de.redoxcraft.mainplugin.listener.MainListener;

public class Main extends JavaPlugin {
	
	private static Main plugin;

	public void onEnable() {
		plugin = this;
		
		System.out.println(this.getDescription().getName() + " " + this.getDescription().getVersion() + " geladen.");
		
		PluginManager PluginManager = Bukkit.getPluginManager();
		PluginManager.registerEvents(new MainListener(), this);
		getCommand("gm").setExecutor(new GmCommand());
		getCommand("sv").setExecutor(new SvCommand());
		getCommand("spec").setExecutor(new SpecCommand());
		getCommand("adven").setExecutor(new AdvenCommand());
	}
	
	public static Main getPlugin( ) { 
		return plugin;
	}
	
}
