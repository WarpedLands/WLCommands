package com.warpedlands.wlcommands.meta;

import java.lang.reflect.Method;

public final class CommandMeta {
    private final String commandName;
    private final ArgMeta[] neededArguments;
    private final Method execute;
    private final String permission;

    public CommandMeta(String commandName, ArgMeta[] neededArguments, Method execute, String permission) {
        this.commandName = commandName;
        this.neededArguments = neededArguments;
        this.execute = execute;
        this.permission = permission;
    }

    public String getCommandName() {
        return commandName;
    }

    public ArgMeta[] getNeededArguments() {
        return neededArguments;
    }

    public Method getExecute() {
        return execute;
    }

    public String getPermission() {
        return permission;
    }
}