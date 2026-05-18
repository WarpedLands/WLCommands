package com.warpedlands.wlcommands.meta;

import com.warpedlands.wlcommands.context.Bias;

import java.lang.reflect.Method;

public final class CommandMeta {
    private final String path;
    private final ArgMeta[] neededArguments;
    private final Method execute;
    private final String permission;
    private final Bias bias;

    public CommandMeta(String path, ArgMeta[] neededArguments, Method execute, String permission, Bias bias) {
        this.path = path;
        this.neededArguments = neededArguments;
        this.execute = execute;
        this.permission = permission;
        this.bias = bias;
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

    public Bias getBias() {
        return bias;
    }
}