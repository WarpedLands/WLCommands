package com.warpedlands.wlcommands.interceptors;

import com.warpedlands.wlcommands.context.CommandContext;
import com.warpedlands.wlcommands.meta.CommandMeta;

public interface CommandInterceptor {
    boolean onCommand(CommandContext context, CommandMeta meta);
}
