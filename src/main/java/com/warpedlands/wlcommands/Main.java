package com.warpedlands.wlcommands;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(isDefaultPath("."));
        System.out.println(stripMethodPath("/god/create/new/motherfucking/", '/'));

    }
    public static boolean isDefaultPath(String path) {
        path = path.replaceAll("/", "");
        path = path.replaceAll("\\.", "");
        path = path.strip();
        return path.isEmpty();
    }

    public static String stripMethodPath(String path, char splitSymbol) {
        String[] pathArray = path.split(String.valueOf(splitSymbol));
        StringBuilder result = new StringBuilder();

        for(int i = 0; i< pathArray.length; i++) {
            String currentPath = pathArray[i];
            if(!currentPath.isEmpty()) {
                result.append(currentPath).append(".");
            }
        }

        String resultString = result.toString();

        if(resultString.charAt(resultString.length()-1) == '.') {
            resultString = resultString.substring(0, result.length()-1);
        }

        return resultString;
    }
}
