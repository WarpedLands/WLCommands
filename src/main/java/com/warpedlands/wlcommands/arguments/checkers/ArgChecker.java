package com.warpedlands.wlcommands.arguments.checkers;

public interface ArgChecker<T> {

    boolean checkLiteralArgument(String literalArgument);


    T convertLiteralArgument(String literalArgument);

}
