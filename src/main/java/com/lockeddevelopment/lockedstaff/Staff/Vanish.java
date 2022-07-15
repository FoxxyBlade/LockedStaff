package com.lockeddevelopment.lockedstaff.Staff;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Vanish implements CommandExecutor {
    private ArrayList<Player> vanish = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        if(!vanish.contains(p)){
            vanish.add(p);
            p.sendMessage(color("&1[LS] &f You are vanished now!"));
            for(Player all : Bukkit.getOnlinePlayers()){
                if(p.hasPermission("locked.vanish")){
                    all.showPlayer(p);
                } else {
                    all.hidePlayer(p);
                }
            }
        }else {
            vanish.remove(p);
            p.sendMessage(color("&1[LS] &f You are no longer vanished!"));
            for(Player all : Bukkit.getOnlinePlayers()){
                all.showPlayer(p);
            }
        }

        return false;
    }
    private String color(String s) {
        s = ChatColor.translateAlternateColorCodes('&', s);
        return s;
    }
}
