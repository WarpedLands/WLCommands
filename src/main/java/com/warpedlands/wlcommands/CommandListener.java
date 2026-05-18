package com.warpedlands.wlcommands;

import com.warpedlands.wlcommands.context.CommandContext;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.util.Arrays;

public class CommandListener implements Listener {
    @EventHandler()
    public void onCommand(PlayerCommandPreprocessEvent event) {
        Player player = event.getPlayer();

        String commandName = event.getMessage().split(" ")[0].replaceAll("/", "");

        String[] unparsedArgs = Arrays.copyOfRange(event.getMessage().split(" "), 1, event.getMessage().split(" ").length);

        for(String arg : unparsedArgs) {

        }

        //CommandContext context = new CommandContext((CommandSender) player, );
    }
}
