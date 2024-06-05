package fr.mikam06.nophantom;

import fr.mikam06.nophantom.event.NoPhantom;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        String version = Bukkit.getBukkitVersion().split("-")[0];
        if (version.compareTo("1.13") < 0) {
            getLogger().warning("This plugin is not compatible with versions below 1.13. Disabling...");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        getServer().getPluginManager().registerEvents(new NoPhantom(), this);
        System.out.println("NoPhantom has been enabled!");
    }
}