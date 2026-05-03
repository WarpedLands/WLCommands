package com.warpedlands.wlcommands.meta;

public class ArgMeta {
    private final Class<?> argClass;
    private final boolean isNeeded;
    private final Object defaultValue;
    private final String name;

    public ArgMeta(Class<?> argClass, boolean isNeeded, Object defaultValue, String name) {
        this.argClass = argClass;
        this.isNeeded = isNeeded;
        this.defaultValue = defaultValue;
        this.name = name;
    }

    public Class<?> getArgClass() {
        return argClass;
    }

    public boolean isNeeded() {
        return isNeeded;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }

    public String getName() {
        return name;
    }
}