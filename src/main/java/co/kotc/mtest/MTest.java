package co.kotc.mtest;

import org.bukkit.plugin.java.JavaPlugin;

public class MTest extends JavaPlugin{
	public final class PluginTest extends JavaPlugin{
		public void onEnable() {
			getLogger().info("onEnable has been invoked!");			
		}
	 
		public void onDisable() {
			getLogger().info("onDisable has been invoked!");
		}
	}
}
