package com.warpedlands.wlcommands.context;

import java.util.Arrays;

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
        //Arrays.stream(argumentTypes).filter()
        return false;
    }
}
