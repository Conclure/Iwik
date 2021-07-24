package me.conclure.killmanager;

import org.bukkit.plugin.java.JavaPlugin;

public final class KillManagerLoader extends JavaPlugin {
    private final KillManagerPlugin plugin = new KillManagerPlugin(this);

    @Override
    public void onLoad() {
        this.plugin.load();
    }

    @Override
    public void onEnable() {
        this.plugin.enable();
    }

    @Override
    public void onDisable() {
        this.plugin.disable();
    }
}
