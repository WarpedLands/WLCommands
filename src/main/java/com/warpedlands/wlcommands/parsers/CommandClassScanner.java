package com.warpedlands.wlcommands.parsers;

import com.warpedlands.wlcommands.meta.CommandMeta;

public class CommandClassScanner {
    private String path;

    public CommandClassScanner(String path) {
        this.path = path;
    }

    public CommandMeta[] parseAllCommandMeta() {
        getClass().getClassLoader().get
    }

    public String getPath() {
        return path;
    }
}
