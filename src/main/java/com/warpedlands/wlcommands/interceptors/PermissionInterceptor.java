package com.warpedlands.wlcommands.interceptors;

import com.warpedlands.wlcommands.context.CommandContext;
import com.warpedlands.wlcommands.meta.CommandMeta;

public class PermissionInterceptor implements CommandInterceptor {

    @Override
    public boolean onCommand(CommandContext context, CommandMeta meta) {
        if(!context.getSender().hasPermission(meta.getPermission())) {
            return false;
        }

        return true;
    }
}
