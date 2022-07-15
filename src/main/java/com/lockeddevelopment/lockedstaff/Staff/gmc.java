package com.lockeddevelopment.lockedstaff.Staff;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gmc implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;

        p.setGameMode(GameMode.CREATIVE);
        p.sendMessage(color("&1[LS] &fYou are now in gamemode creative!"));

        if(args.length == 1){
            for(Player t : Bukkit.getOnlinePlayers()){
                p.sendMessage(color("&1[LS] &f You set " + t.getDisplayName() + " in gamemode creative!"));
                t.setGameMode(GameMode.CREATIVE);
                t.sendMessage(color("&1[LS] &f You are in gamemode creative!"));
            }
        }

        return false;
    }
    private String color(String s) {
        s = ChatColor.translateAlternateColorCodes('&', s);
        return s;
    }
}
