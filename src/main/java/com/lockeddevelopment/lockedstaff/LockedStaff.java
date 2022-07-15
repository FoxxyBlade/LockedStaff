package com.lockeddevelopment.lockedstaff;

import com.lockeddevelopment.lockedstaff.Essentials.*;
import com.lockeddevelopment.lockedstaff.Staff.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class LockedStaff extends JavaPlugin {

    public static LockedStaff INSTANCE;


    @Override
    public void onEnable() {
        INSTANCE = this;
        //Staff
        getCommand("lockedchat").setExecutor(new StaffChat());
        getCommand("gmc").setExecutor(new gmc());
        getCommand("gms").setExecutor(new gms());
        getCommand("invsee").setExecutor(new Invsee());
        getCommand("vanish").setExecutor(new Vanish());


        //Essentials
        getCommand("bc").setExecutor(new Broadcast());
        getCommand("trade").setExecutor(new TradeComman());


    }

    @Override
    public void onDisable() {
        INSTANCE = null;
        // Plugin shutdown logic
    }
}
