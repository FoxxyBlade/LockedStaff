package com.lockeddevelopment.lockedstaff.Utils;

import org.bukkit.ChatColor;


public class chat {


    public static String color(String s) {
        s = ChatColor.translateAlternateColorCodes('&', s);
        return s;
    }
}
