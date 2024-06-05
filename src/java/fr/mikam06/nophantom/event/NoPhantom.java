package fr.mikam06.nophantom.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class NoPhantom implements Listener {
    @EventHandler
    public void onPhantomSpawn(org.bukkit.event.entity.EntitySpawnEvent event) {
        if (event.getEntityType() == org.bukkit.entity.EntityType.PHANTOM) {
            event.setCancelled(true);
        }
    }

}
