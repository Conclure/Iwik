package me.conclure.killmanager.effects;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDeathEvent;

public abstract class Effect {
    private final String id;
    private final String displayName;
    private final String description;

    public Effect(String id, String displayName, String description) {
        this.id = id;
        this.displayName = displayName;
        this.description = description;
    }

    public String getId() {
        return this.id;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getDescription() {
        return this.description;
    }

    @EventHandler
    public void onPlayerDeath(EntityDeathEvent event) {
        if (event.getEntity() != null && event.getEntity() instanceof Player) {
            runEffect(event);
        }
    }


    public abstract void runEffect(EntityDeathEvent entityDeathEvent);
}
