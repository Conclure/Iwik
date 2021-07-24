package me.conclure.killmanager.effects;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class EffectManager {
    private final Map<Player,Effect> effectMap;

    public EffectManager() {
        effectMap = new HashMap<>();
    }
}
