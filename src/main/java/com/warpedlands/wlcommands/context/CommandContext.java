package com.warpedlands.wlcommands.context;

import org.bukkit.command.CommandSender;

public class CommandContext {
    private final CommandSender sender;
    private final Argument[] arguments;

    public CommandContext(CommandSender sender, Argument[] arguments) {
        this.sender = sender;
        this.arguments = arguments;
    }
    
    public Argument[] getArguments() {
        return arguments;
    }

    public CommandSender getSender() {
        return sender;
    }
}