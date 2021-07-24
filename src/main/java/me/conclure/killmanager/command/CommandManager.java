package me.conclure.killmanager.command;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.plugin.SimplePluginManager;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CommandManager implements TabExecutor {
    private final Map<String,Command> commandMap;
    private final Executor executor;
    private final String topLevelName;

    public CommandManager(Collection<Command> commands, String topLevelName) {
        this.topLevelName = topLevelName;
        this.commandMap = new HashMap<>();
        this.executor = Executors.newSingleThreadExecutor(new ThreadFactoryBuilder()
                .setUncaughtExceptionHandler((t,e) -> e.printStackTrace())
                .setDaemon(true)
                .setNameFormat("KillManagerCommandExecutor")
                .build());

        this.registerCommands(commands);
    }

    private void registerCommands(Collection<Command> commands) {
        for (Command command : commands) {
            this.commandMap.put(command.getName().toLowerCase(),command);
        }
    }

    @Override
    public boolean onCommand(CommandSender commandSender, org.bukkit.command.Command command, String s, String[] strings) {
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, org.bukkit.command.Command command, String s, String[] strings) {

        return null;
    }
}
