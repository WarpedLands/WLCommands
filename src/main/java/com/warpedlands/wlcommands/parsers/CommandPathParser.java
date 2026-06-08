package com.warpedlands.wlcommands.parsers;

import com.warpedlands.wlcommands.annotations.CommandExecute;
import com.warpedlands.wlcommands.annotations.CommandRoot;

import java.lang.reflect.Method;

public class CommandPathParser {
    public String getAbsolutePath(Method method) {
        String commandRoot = method.getClass().getAnnotation(CommandRoot.class).value();
        String methodPath = method.getAnnotation(CommandExecute.class).value();

        String absolutePath = commandRoot;

        if(!isDefaultPath(methodPath)) {
            absolutePath = commandRoot + "." + stripMethodPath(methodPath);
        }
        return absolutePath;
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
