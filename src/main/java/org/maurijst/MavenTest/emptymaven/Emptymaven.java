package org.maurijst.MavenTest.emptymaven;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Emptymaven extends JavaPlugin {

	Logger log = Logger.getLogger("Emptymaven");

	@Override
	public void onEnable() {
		// Plugin startup logic
		log.info("plugin enabled");
	}

	@Override
	public void onDisable() {
		// Plugin shutdown logic
		log.info("plugin disabled");
	}
}
