package com.warpedlands.wlcommands.context;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandContext {
    private final CommandSender sender;

    public CommandContext(CommandSender sender) {
        this.sender = sender;
    }

    public CommandSender getSender() {
        return sender;
    }
}