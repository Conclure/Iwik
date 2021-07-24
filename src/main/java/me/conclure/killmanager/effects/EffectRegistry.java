package me.conclure.killmanager.effects;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EffectRegistry {
    private final Map<String,Effect> map;

    public EffectRegistry(Collection<Effect> effects) {
        this.map = new HashMap<>();
    }
}
