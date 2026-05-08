package com.warpedlands.wlcommands.parsers;

import com.warpedlands.wlcommands.Command;
import com.warpedlands.wlcommands.meta.CommandMeta;

public class CommandParser {
    public CommandMeta parseCommandForMeta(Class<?> commandClass) {
        String commandName;

        if(commandClass.isAnnotationPresent(Command.class)) {

        }


        return new CommandMeta();
    }
}
