package com.warpedlands.wlcommands.parsers;

import com.warpedlands.wlcommands.annotations.CommandRoot;
import com.warpedlands.wlcommands.exceptions.CommandParsingException;
import com.warpedlands.wlcommands.meta.CommandMeta;
import org.reflections.Reflections;

import java.util.HashSet;
import java.util.Set;

public class CommandClassScanner {
    private String path;

    public CommandClassScanner(String path) {
        this.path = path;
    }

    public CommandMeta[] parseAllRootCommandMeta() {
        Set<CommandMeta> resultSet = new HashSet<>();
        Reflections reflections = new Reflections();
        Set<Class<?>> commandClasses = reflections.getTypesAnnotatedWith(CommandRoot.class);
        for(Class<?> commandClass : commandClasses) {
            CommandParser parser = new CommandParser(commandClass);
            try {
                resultSet.add(parser.parseCommandForMeta());
            } catch (CommandParsingException e) {
                System.out.println();
            }
        }
        return resultSet.toArray(new CommandMeta[0]);
    }

    public String getPath() {
        return path;
    }
}
