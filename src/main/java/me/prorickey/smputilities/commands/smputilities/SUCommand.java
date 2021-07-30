package me.prorickey.smputilities.commands.smputilities;

import me.prorickey.smputilities.utils.GUI;
import me.prorickey.smputilities.utils.Item;
import me.prorickey.smputilities.utils.Plugin;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class SUCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if(!sender.hasPermission("su.command")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7[&a&lSU&7] &bSMPUtilities running on version &6v" + Plugin.getPlugin().getDescription().getVersion()));
            return true;
        }

        if(args.length == 0) {
            if(!sender.hasPermission("su.command.gui")) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cYou don't have permission to open the gui"));
                return true;
            } else {
                if(!(sender instanceof Player)) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cOnly player's can open the gui"));
                }

                assert sender instanceof Player;
                SUCGUI.openGUI((Player) sender);

                return true;
            }
        }

        return true;
    }
}
