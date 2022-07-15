package com.lockeddevelopment.lockedstaff.Staff;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissionAttachment;

import java.util.HashMap;
import java.util.UUID;

public class RankCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        HashMap<UUID, PermissionAttachment> perms = new HashMap<>();

        if(sender instanceof Player){
            Player p = (Player) sender;


        }


        return false;
    }
}
