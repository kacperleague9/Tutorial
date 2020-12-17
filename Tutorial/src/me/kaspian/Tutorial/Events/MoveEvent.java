package me.kaspian.Tutorial.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class MoveEvent implements Listener {
	
	@EventHandler
	public void onMove (PlayerMoveEvent event) {
		System.out.println("UCIEKAJ TO GALI");
	}

}
