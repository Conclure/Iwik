package me.conclure.killmanager.command;

public class Command {
    private final String name;

    public Command(String name) {
        this.name = name;
    }

    protected final String getName() {
        return this.name;
    }
}
