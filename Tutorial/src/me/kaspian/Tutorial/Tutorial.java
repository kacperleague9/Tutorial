package me.kaspian.Tutorial;

import org.bukkit.plugin.java.JavaPlugin;

import me.kaspian.Tutorial.Events.MoveEvent;
import net.md_5.bungee.api.ChatColor;

public class Tutorial extends JavaPlugin {
	
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n\nHello world!\n\n");
		getServer().getPluginManager().registerEvents(new MoveEvent(), this);
	}
	
	public void onDisable( ) {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "\n\nBye world!\n\n");
	}
}
