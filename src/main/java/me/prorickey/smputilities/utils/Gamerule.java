package me.prorickey.smputilities.utils;

import org.bukkit.Bukkit;
import org.bukkit.GameRule;

public class Gamerule {

    public static void setGameruleBool(GameRule g, boolean v) {
        Bukkit.getWorlds().forEach(a -> {
            a.setGameRule(g, v);
        });
    }

    public static void setGameruleInt(GameRule g, int v) {
        Bukkit.getWorlds().forEach(a -> {
            a.setGameRule(g, v);
        });
    }

    public static boolean getGameruleBool(GameRule g) {
        return (boolean) Bukkit.getWorlds().get(0).getGameRuleValue(g);
    }

    public static int getGameruleInt(GameRule g) {
        return (int) Bukkit.getWorlds().get(0).getGameRuleValue(g);
    }

}
