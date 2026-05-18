package com.warpedlands.wlcommands;

import com.warpedlands.wlcommands.annotations.CommandExecute;
import com.warpedlands.wlcommands.annotations.CommandRoot;

import java.util.UUID;

@CommandRoot("god")
public class GodCommand {
    // /god 60m Alexxxy

    @CommandExecute(".")
    public void execute(UUID player) {

    }


    @CommandExecute("god.<args>.")
    public void executeArg(UUID player) {

    }
}
