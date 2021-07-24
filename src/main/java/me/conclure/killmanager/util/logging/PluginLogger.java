package me.conclure.killmanager.util.logging;

import java.util.logging.Logger;

public class PluginLogger {
    private final Logger delegate;

    public PluginLogger(Logger delegate) {
        this.delegate = delegate;
    }
}
