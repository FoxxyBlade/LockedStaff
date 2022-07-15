package com.lockeddevelopment.lockedstaff.Staff;

import com.lockeddevelopment.lockedstaff.Utils.chat;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;

public class StaffChat implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {

        }

        Player p = (Player) sender;
        if (!p.hasPermission("locked.staffchat")) {
            p.sendMessage(color("&1[LockedStaff]" + " &fYou dont have enough permissions!"));

        }
        if (args.length == 0) {
            p.sendMessage(color("&1[LockedStaff] " + " &cMesssage cannot be empty!"));
            return false;
        }

        String mess = "&1[LS] &f" + p.getName() + ": ";

        for (String s : args) {
            mess = mess + s + " ";
        }

        for (Player player : Bukkit.getOnlinePlayers()) {
            if (player.hasPermission("locked.staffchat")) {
                player.sendMessage(color(mess));
            }
        }
        return true;


    }

    private String color(String s) {
        s = ChatColor.translateAlternateColorCodes('&', s);
        return s;
    }
}
