package kotoff.main;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Handler implements Listener {
	
	@EventHandler
	public void join(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		p.sendMessage(ChatColor.RED + "[CreepCrafter 1.15.2] " + ChatColor.GREEN + "Добро пожаловать на сервер!");
	}
	
}
