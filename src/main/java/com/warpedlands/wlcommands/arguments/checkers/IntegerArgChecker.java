package com.warpedlands.wlcommands.arguments.checkers;

public class IntegerArgChecker implements ArgChecker {

    @Override
    public String checkLiteralArgument(String literalArgument) {
        try {
            Integer.parseInt(literalArgument);
            return "";
        } catch (NumberFormatException e) {
            return "@NUMBER_FORMAT_ERROR";
        }
    }
}
