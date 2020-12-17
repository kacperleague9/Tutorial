package me.kaspian.Tutorial.Events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import net.md_5.bungee.api.ChatColor;

public class InteractEvent implements Listener {

	@EventHandler
	public void OnInteract(PlayerInteractEvent event) {
		Action action = event.getAction();
		Player player = event.getPlayer();
		Block block = event.getClickedBlock();
		
		if(action.equals(Action.LEFT_CLICK_BLOCK)) {
			if(block.getType().equals(Material.EMERALD_BLOCK)) {
				if (player.getHealth() != 20) {
					player.setHealth(player.getHealth() + 1);
					player.sendMessage(ChatColor.GREEN + "Uleczono :)");
				}
 			}else {
				player.sendMessage(ChatColor.RED + block.getType().toString() + ChatColor.GRAY + " nie leczy.");
			}
		}
	}
	
}
