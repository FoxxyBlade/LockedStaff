package com.lockeddevelopment.lockedstaff.Essentials;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Broadcast implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            if (sender instanceof Player) {
                Player p = (Player) sender;
                if(args.length >= 1){
                    StringBuilder text = new StringBuilder();
                    for(int i = 0 ; i <args.length ; i++){
                        text.append(args[i]).append("  ");
                    }

                    Bukkit.broadcastMessage(color("&1[LS] &f" + text.toString()));
                    return true;
                }

            }

        return false;
    }
    private String color(String s) {
        s = ChatColor.translateAlternateColorCodes('&', s);
        return s;
    }
}
