package com.warpedlands.wlcommands.checkers;

import java.lang.annotation.Annotation;

public abstract class ArgChecker<T> {
    private T prefferedArgument;
    private final Class<? extends Annotation> connectedAnnotation;

    public ArgChecker(Class<? extends Annotation> connectedAnnotation) {
        this.connectedAnnotation = connectedAnnotation;
    }

    public Class<? extends Annotation> getConnectedAnnotation() {
        return connectedAnnotation;
    }

    abstract boolean checkSelectArgument(T argument);


}
