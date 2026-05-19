package com.warpedlands.wlcommands.arguments.checkers;

public class IntegerArgChecker implements ArgChecker<Integer> {

    @Override
    public boolean checkLiteralArgument(String literalArgument) {
        try {
            Integer.parseInt(literalArgument);
            return "";
        } catch (NumberFormatException e) {
            return "@NUMBER_FORMAT_ERROR";
        }
    }

    @Override
    public Object convertLiteralArgument(String literalArgument) {
        return null;
    }
}
