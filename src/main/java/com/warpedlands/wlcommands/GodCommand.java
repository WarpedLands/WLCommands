package com.warpedlands.wlcommands;

import com.warpedlands.wlcommands.annotations.CommandExecute;
import com.warpedlands.wlcommands.arguments.annotations.PlayerUUIDArgument;

import java.util.UUID;

@Command("god")
public class GodCommand {
    // /god 60m Alexxxy

    @CommandExecute("god")
    public void execute(@PlayerUUIDArgument(def = "me", other = true) UUID player) {

    }


    @CommandExecute("god.<args>.")
    public void execute(@PlayerUUIDArgument(def = "me", other = true) UUID player) {

    }
}
