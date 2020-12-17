package me.kaspian.Tutorial.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.ChatColor;

public class MoveEvent implements Listener {
	
	@EventHandler
	public void onMove (PlayerMoveEvent event) {	
		
		Player player = event.getPlayer();
		Inventory pInver = player.getInventory();
		ItemStack item = new ItemStack(Material.ANVIL, 1);
		
		if(!player.isOnGround()) {
			pInver.addItem(item);
			player.sendMessage(ChatColor.RED + "Ruszasz sie");
		}
	}
}
