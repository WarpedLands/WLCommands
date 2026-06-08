package com.warpedlands.wlcommands.managers;

import com.warpedlands.wlcommands.meta.CommandMeta;

import java.util.HashMap;
import java.util.Map;

public class CommandManager {
    private Map<String, CommandMeta> registeredCommands = new HashMap<>();

    public CommandManager() {

    }

    public void registerCommand(CommandMeta commandMeta) {

    }

    public CommandMeta getCommand(String commandRoot) {
        return registeredCommands.get(commandRoot);
    }


}
