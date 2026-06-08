package com.warpedlands.wlcommands;

import com.warpedlands.wlcommands.managers.ArgManager;
import com.warpedlands.wlcommands.managers.CommandManager;

import java.util.logging.Logger;

public class WLCommands {
    private static final ArgManager argManager = new ArgManager();
    private static final CommandManager commandManager = new CommandManager();

    public WLCommands(Logger logger) {

    }

    public static CommandManager getCommandManager() {
        return commandManager;
    }

    public static ArgManager getArgManager() {
        return argManager;
    }

}