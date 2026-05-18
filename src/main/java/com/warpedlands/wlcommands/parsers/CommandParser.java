package com.warpedlands.wlcommands.parsers;

import com.warpedlands.wlcommands.annotations.CommandExecute;
import com.warpedlands.wlcommands.annotations.CommandRoot;
import com.warpedlands.wlcommands.exceptions.CommandParsingException;
import com.warpedlands.wlcommands.meta.CommandMeta;

import java.lang.reflect.Method;
import java.util.Arrays;

public class CommandParser {
    public CommandMeta parseCommandForMeta(Class<?> commandClass) throws CommandParsingException {
        if(!commandClass.isAnnotationPresent(CommandRoot.class)) {
            throw new CommandParsingException("Given class is not a command");
        }

        String commandRoot = commandClass.getAnnotation(CommandRoot.class).value();



        return null;
    }

    public CommandMeta parseMethodForMeta(Method method) {
        String absolutePath = getAbsolutePath(method);

        =

        return new CommandMeta(absolutePath, method);
    }


    public String getAbsolutePath(Method method) {
        String commandRoot = method.getClass().getAnnotation(CommandRoot.class).value();
        String methodPath = method.getAnnotation(CommandExecute.class).value();

        String absolutePath = commandRoot;

        if(!isDefaultPath(methodPath)) {
            absolutePath = commandRoot + "." + stripMethodPath(methodPath);
        }
        return absolutePath;
    }

    public Method[] getMethodBranches(Class<?> commandClass) {
        return (Method[]) Arrays.stream(commandClass.getMethods()).filter(method -> method.isAnnotationPresent(CommandExecute.class) && isDefaultPath(method.getAnnotation(CommandExecute.class).value())).toArray();
    }

    public char getSplitSymbol(String path) {
        if(path.split("\\.").length>path.split("/").length) {
            return '.';
        }
        return '/';
    }

    public String stripMethodPath(String path) {
        String[] pathArray = path.split(String.valueOf(getSplitSymbol(path)));
        StringBuilder result = new StringBuilder();

        for (String currentPath : pathArray) {
            if (!currentPath.isEmpty()) {
                result.append(currentPath).append(".");
            }
        }

        String resultString = result.toString();

        if(resultString.charAt(resultString.length()-1) == '.') {
            resultString = resultString.substring(0, result.length()-1);
        }

        return resultString;
    }


    public boolean isDefaultPath(String path) {
        path = path.replaceAll("/", "");
        path = path.replaceAll("\\.", "");
        path = path.strip();
        return path.isEmpty();
    }
}
