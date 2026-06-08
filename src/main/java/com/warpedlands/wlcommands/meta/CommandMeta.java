package com.warpedlands.wlcommands.meta;

import java.lang.reflect.Method;

public final class CommandMeta {
    private final String path;
    private final ArgMeta[] neededArguments;
    private final Method execute;
    private final String permission;
    private final CommandMeta[] subCommands;


    public CommandMeta(String path, ArgMeta[] neededArguments, CommandMeta[] subCommands, Method execute, String permission) {
        this.path = path;
        this.subCommands = subCommands;
        this.neededArguments = neededArguments;
        this.execute = execute;
        this.permission = permission;
    }

    public String getPath() {
        return path;
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