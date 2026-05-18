package com.warpedlands.wlcommands;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;

public class ArgManager {
    private final Map<Annotation, Class<?>> registeredArguments = new HashMap<>();

    public void registerArgument(Annotation argumentAnnotation, Class<?> argumentClass) {
        registeredArguments.put(argumentAnnotation, argumentClass);
    }

    public boolean isClassValid(Class<?> argumentClass) {
        return registeredArguments.containsValue(argumentClass);
    }

    public boolean isPairValid(Annotation argumentAnnotation, Class<?> argumentClass) {
        return registeredArguments.get(argumentAnnotation).equals(argumentClass);
    }
}
