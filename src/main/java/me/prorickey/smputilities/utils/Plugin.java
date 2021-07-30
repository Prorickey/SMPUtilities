package me.prorickey.smputilities.utils;

import org.bukkit.plugin.PluginDescriptionFile;

public class Plugin {

    private static org.bukkit.plugin.Plugin plugin = null;
    private Integer v = null;

    public Plugin(org.bukkit.plugin.Plugin p) {
        plugin = p;
    }

    public static org.bukkit.plugin.Plugin getPlugin() {
        return plugin;
    }

}
