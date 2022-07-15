package com.lockeddevelopment.lockedstaff.Staff;

import com.lockeddevelopment.lockedstaff.Utils.chat;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class gms implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player p = (Player) sender;

        p.setGameMode(GameMode.SURVIVAL);
        p.sendMessage(chat.color("&1[LS] &f You are now in gms!"));
        if(args.length == 1){
            for(Player t : Bukkit.getOnlinePlayers()){
                t.setGameMode(GameMode.SURVIVAL);
                t.sendMessage(chat.color("&1[LS] &f You are now in gms!"));
                p.sendMessage(chat.color("&1[LS] &f You have " + t.getName() + " in gms!"));
            }
        }

        return false;
    }
}
