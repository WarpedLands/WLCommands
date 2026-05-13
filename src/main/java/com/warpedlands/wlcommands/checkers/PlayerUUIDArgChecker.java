package com.warpedlands.wlcommands.checkers;

import com.warpedlands.wlcommands.annotations.PlayerUUIDArgument;

public class PlayerUUIDArgChecker<UUID> extends ArgChecker<UUID> {

    public PlayerUUIDArgChecker() {
        super(PlayerUUIDArgument.class);
    }

    @Override
    boolean checkSelectArgument(Object argument) {
        return fals;
    }
}
