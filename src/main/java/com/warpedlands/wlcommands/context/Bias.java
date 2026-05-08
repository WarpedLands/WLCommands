package com.warpedlands.wlcommands.context;

public class Bias {
    private ArgumentType[] argumentTypes;

    public Bias(ArgumentType... argumentTypes) {
        this.argumentTypes = argumentTypes;
    }

    public boolean hasArgumentType(ArgumentType type) {
        for(ArgumentType argumentType : argumentTypes) {
            if(argumentType.equals(type)) {
                return true;
            }
        }
        return false;
    }
}
