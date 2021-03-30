package kotoff.main;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	Logger log = Logger.getLogger("Minecraft");
	
	public void onEnable() 
	{
		Bukkit.getPluginManager().registerEvents(new Handler(), this);
		
		log.info("[CC-WelcomeMsg] Plugin started!");
	}
	
	public void onDisable()
	{
		log.info("[CC-WelcomeMsg] Plugin stopped!");
	}
	
}
