package me.prorickey.smputilities;

import me.prorickey.smputilities.commands.smputilities.SUCommand;
import me.prorickey.smputilities.utils.Lag;
import me.prorickey.smputilities.utils.Plugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class SMPUtilities extends JavaPlugin {

    /* Developer Notes
    *  There are 35 java gamerules
    *
    *
    */


    @Override
    public void onEnable() {
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "SMPUtilities v" +  this.getDescription().getVersion() + " has started loading.");
        Bukkit.getServer().getConsoleSender().sendMessage(" ");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "   _____   __  __   _____   " + ChatColor.BLUE + " _    _   _     _   _   _   _     _              ");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "  / ____| |  \\/  | |  __ \\ " + ChatColor.BLUE + " | |  | | | |   (_) | | (_) | |   (_)             ");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + " | (___   | \\  / | | |__) |" + ChatColor.BLUE + " | |  | | | |_   _  | |  _  | |_   _    ___   ___ ");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "  \\___ \\  | |\\/| | |  ___/ " + ChatColor.BLUE + " | |  | | | __| | | | | | | | __| | |  / _ \\ / __|");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "  ____) | | |  | | | |     " + ChatColor.BLUE + " | |__| | | |_  | | | | | | | |_  | | |  __/ \\__ \\");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + " |_____/  |_|  |_| |_|     " + ChatColor.BLUE + "  \\____/   \\__| |_| |_| |_|  \\__| |_|  \\___| |___/");
        Bukkit.getServer().getConsoleSender().sendMessage(" ");
        Bukkit.getServer().getConsoleSender().sendMessage(" ");

        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "Loading plugin utitlites...");
        Plugin smpUtils = new Plugin(this);
        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Lag(), 100L, 1L);
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "Loaded plugin utitlites.");

        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "Loading commands...");
        this.getCommand("smputilities").setExecutor(new SUCommand());
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "    - Loaded command /smputilities");
        this.getCommand("su").setExecutor(new SUCommand());
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "    - Loaded command /su");
        this.getCommand("smputils").setExecutor(new SUCommand());
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "    - Loaded command /smputils");
        this.getCommand("sutils").setExecutor(new SUCommand());
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "    - Loaded command /sutils");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "Loaded all commands.");

        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "Loading events...");

        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "Loaded all events.");

    }

}
