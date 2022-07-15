package com.lockeddevelopment.lockedstaff.Staff;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Invsee implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            if(args.length == 1){
                Player p = (Player) sender;

                Player toInvsee = Bukkit.getPlayer(args[0]);
                if(toInvsee != null){
                    p.openInventory(toInvsee.getInventory());
                }

            }
        }

        return false;
    }
}
