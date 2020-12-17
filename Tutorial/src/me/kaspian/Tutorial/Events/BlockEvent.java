package me.kaspian.Tutorial.Events;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.Plugin;

import me.kaspian.Tutorial.Tutorial;
import net.md_5.bungee.api.ChatColor;

public class BlockEvent implements Listener {
	
	@EventHandler
	public void onBreak(BlockBreakEvent event) {
		Block block = event.getBlock();
		Player player = event.getPlayer();
		Plugin plugin = Tutorial.getPlugin(Tutorial.class);
		
		Location b_loc = block.getLocation();
		player.sendMessage(ChatColor.GRAY + "Zniszczyles " + ChatColor.RED + block.getType().toString() + ChatColor.GRAY + " na kordach " + 
		ChatColor.GREEN + b_loc.getBlockX() + ", " + b_loc.getBlockY() + ", " + b_loc.getBlockZ());
		
		if(block.getType().equals(Material.DIAMOND_ORE)) {
			plugin.getServer().broadcastMessage(ChatColor.GRAY + "Player " + ChatColor.GREEN + event.getPlayer().getName() + ChatColor.GRAY + " zniszczyl " 
			+ ChatColor.GREEN + block.getType().toString());
		}
	}

	@EventHandler
	public void onPlace(BlockPlaceEvent event) {
		Block block = event.getBlock();
		Player player = event.getPlayer();
		
		Location b_loc = block.getLocation();
		player.sendMessage(ChatColor.GRAY + "Postawiles " + ChatColor.RED + block.getType().toString() + ChatColor.GRAY + " na kordach " + 
		ChatColor.GREEN + b_loc.getBlockX() + ", " + b_loc.getBlockY() + ", " + b_loc.getBlockZ());
	}

}
