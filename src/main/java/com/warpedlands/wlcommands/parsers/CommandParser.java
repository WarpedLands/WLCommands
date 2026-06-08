package com.warpedlands.wlcommands.parsers;

import com.warpedlands.wlcommands.WLCommands;
import com.warpedlands.wlcommands.annotations.CommandExecute;
import com.warpedlands.wlcommands.annotations.CommandRoot;
import com.warpedlands.wlcommands.exceptions.CommandParsingException;
import com.warpedlands.wlcommands.meta.CommandMeta;
import org.checkerframework.checker.units.qual.A;

import java.lang.reflect.Method;
import java.util.Arrays;

public class CommandParser {
    private final ArgParser argParser = new ArgParser(WLCommands.getArgManager());
    private final CommandPathParser commandPathParser = new CommandPathParser();
    private final Class<?> commandClass;

    public CommandParser(Class<?> commandClass) {
        this.commandClass = commandClass;
    }

    public CommandMeta parseCommandForMeta() throws CommandParsingException {
        if(!commandClass.isAnnotationPresent(CommandRoot.class)) {
            throw new CommandParsingException("Given class is not a command");
        }

        String commandRoot = commandClass.getAnnotation(CommandRoot.class).value();

        if(!hasCommandMethods()) {
            throw new CommandParsingException("Given class doesn't have any command methods");
        }



        return new CommandMeta();
    }

    public CommandMeta parseMethodForMeta(Method method) {
        CommandPathParser commandPathParser = new CommandPathParser();
        String absolutePath = commandPathParser.getAbsolutePath(method);
        return new CommandMeta(absolutePath, argParser.getArgsMetaFromMethod(method), method, "");
    }

    public boolean hasCommandMethods() {
        return Arrays.stream(commandClass.getMethods()).anyMatch(method -> method.isAnnotationPresent(CommandExecute.class));
    }

    public Method getMainMethod() {
        return Arrays.stream(commandClass.getMethods()).filter(method -> method.isAnnotationPresent(CommandExecute.class) && commandPathParser.isDefaultPath(method.getAnnotation(CommandExecute.class).value())).findFirst().get();
    }

    public Method[] getSubMethodBranches() {
        return (Method[]) Arrays.stream(commandClass.getMethods()).filter(method -> method.isAnnotationPresent(CommandExecute.class) && !commandPathParser.isDefaultPath(method.getAnnotation(CommandExecute.class).value())).toArray();
    }


}
