package com.warpedlands.wlcommands.meta;

import java.lang.reflect.Method;

public final class CommandMeta {
    private String commandName;
    private Object[] neededArguments;
    private Method execute;
}