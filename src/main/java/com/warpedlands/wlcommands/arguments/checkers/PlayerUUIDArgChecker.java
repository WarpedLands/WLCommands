package com.warpedlands.wlcommands.arguments.checkers;

import org.bukkit.Bukkit;

public class PlayerUUIDArgChecker implements ArgChecker {

    @Override
    public String checkLiteralArgument(String argument) {
        if(Bukkit.getServer().getPlayer(argument) != null) {
            return "";
        }
        //other future logic
        return "@PLAYER_NOT_PRESENT";
    }
}
