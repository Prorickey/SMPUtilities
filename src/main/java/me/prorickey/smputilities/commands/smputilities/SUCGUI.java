package me.prorickey.smputilities.commands.smputilities;

import me.prorickey.smputilities.utils.Gamerule;
import me.prorickey.smputilities.utils.Item;
import me.prorickey.smputilities.utils.Lag;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameRule;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;

public class SUCGUI {

    public static void openGUI(Player p) {
        Inventory gui = Bukkit.getServer().createInventory(p, 54, ChatColor.translateAlternateColorCodes('&', "&aSMPUtilities"));

        ItemStack filler = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemMeta fillerMeta = filler.getItemMeta();
        assert fillerMeta != null;
        fillerMeta.setDisplayName(" ");
        filler.setItemMeta(fillerMeta);
        for(int i = 0; i < 54; i++) {
            gui.setItem(i, filler);
        }

        ItemStack it3 = new ItemStack(Material.EMERALD);
        ItemMeta it3Meta = it3.getItemMeta();
        it3Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Stats"));
        ArrayList<String> it3MetaLore = new ArrayList<>();
        it3MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&aOnline Players: " + Bukkit.getServer().getOnlinePlayers().toArray().length));
        it3Meta.setLore(it3MetaLore);
        it3.setItemMeta(it3Meta);
        gui.setItem(3, it3);


        ItemStack it4 = Item.getHead(p);
        gui.setItem(4, it4);

        ItemStack it5 = new ItemStack(Material.IRON_INGOT);
        ItemMeta it5Meta = it5.getItemMeta();
        it5Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Server"));
        ArrayList<String> it5MetaLore = new ArrayList<>();
        int tps = (int) Lag.getTPS();
        NumberFormat format = NumberFormat.getInstance();
        format.setRoundingMode(RoundingMode.DOWN);
        format.setMaximumFractionDigits(2);
        it5MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&aTPS: " + format.format(tps)));
        it5MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&aMemory Usage: " + ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1048576) + "/" + (Runtime.getRuntime().totalMemory() / 1048576)));
        it5Meta.setLore(it5MetaLore);
        it5.setItemMeta(it5Meta);
        gui.setItem(5, it5);

        ItemStack it18 = new ItemStack(Material.BOOK);;
        ItemMeta it18Meta = it18.getItemMeta();
        ArrayList<String> it18MetaLore = new ArrayList<>();
        if(Gamerule.getGameruleBool(GameRule.ANNOUNCE_ADVANCEMENTS)) {
            it18Meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
            it18MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&aValue: &bEnabled"));
        } else {
            it18MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&aValue: &cDisabled"));
        }
        it18Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        it18Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Announce Advancements"));
        it18MetaLore.add(" ");
        it18MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&7This gamerule determines if"));
        it18MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&7advancements will be announced"));
        it18MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&7or not."));
        it18Meta.setLore(it18MetaLore);
        it18.setItemMeta(it18Meta);
        gui.setItem(18, it18);

        ItemStack it19 = new ItemStack(Material.BOOK);;
        ItemMeta it19Meta = it19.getItemMeta();
        ArrayList<String> it19MetaLore = new ArrayList<>();
        if(Gamerule.getGameruleBool(GameRule.COMMAND_BLOCK_OUTPUT)) {
            it19Meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
            it19MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&aValue: &bEnabled"));
        } else {
            it19MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&aValue: &cDisabled"));
        }
        it19Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        it19Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Command Block Output"));
        it19MetaLore.add(" ");
        it19MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&7This gamerule determines if"));
        it19MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&7commands executed by command"));
        it19MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&7blocks will be broadcasted to ops."));
        it19Meta.setLore(it19MetaLore);
        it19.setItemMeta(it19Meta);
        gui.setItem(19, it19);

        ItemStack it20 = new ItemStack(Material.BOOK);;
        ItemMeta it20Meta = it20.getItemMeta();
        ArrayList<String> it20MetaLore = new ArrayList<>();
        if(Gamerule.getGameruleBool(GameRule.DISABLE_ELYTRA_MOVEMENT_CHECK)) {
            it20Meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
            it20MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&aValue: &bEnabled"));
        } else {
            it20MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&aValue: &cDisabled"));
        }
        it20Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        it20Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Disable Elytra Movement Check"));
        it20MetaLore.add(" ");
        it20MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&7This gamerule determines if"));
        it20MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&7the server will check a player's"));
        it20MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&7speed while they are using an elytra."));
        it20Meta.setLore(it20MetaLore);
        it20.setItemMeta(it20Meta);
        gui.setItem(20, it20);

        ItemStack it21 = new ItemStack(Material.BOOK);;
        ItemMeta it21Meta = it21.getItemMeta();
        ArrayList<String> it21MetaLore = new ArrayList<>();
        if(Gamerule.getGameruleBool(GameRule.DISABLE_RAIDS)) {
            it21Meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
            it21MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&aValue: &bEnabled"));
        } else {
            it21MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&aValue: &cDisabled"));
        }
        it21Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        it21Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Disable Raids"));
        it21MetaLore.add(" ");
        it21MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&7This gamerule determines if"));
        it21MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&7raids are disabled or not."));
        it21Meta.setLore(it21MetaLore);
        it21.setItemMeta(it21Meta);
        gui.setItem(21, it21);

        ItemStack it22 = new ItemStack(Material.BOOK);;
        ItemMeta it22Meta = it22.getItemMeta();
        ArrayList<String> it22MetaLore = new ArrayList<>();
        if(Gamerule.getGameruleBool(GameRule.DO_DAYLIGHT_CYCLE)) {
            it22Meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
            it22MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&aValue: &bEnabled"));
        } else {
            it22MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&aValue: &cDisabled"));
        }
        it22Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        it22Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Daylight Cycle"));
        it22MetaLore.add(" ");
        it22MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&7This gamerule determines if"));
        it22MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&7the daylight cycle is enabled."));
        it22Meta.setLore(it22MetaLore);
        it22.setItemMeta(it22Meta);
        gui.setItem(22, it22);

        ItemStack it23 = new ItemStack(Material.BOOK);;
        ItemMeta it23Meta = it23.getItemMeta();
        ArrayList<String> it23MetaLore = new ArrayList<>();
        if(Gamerule.getGameruleBool(GameRule.DO_ENTITY_DROPS)) {
            it23Meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
            it23MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&aValue: &bEnabled"));
        } else {
            it23MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&aValue: &cDisabled"));
        }
        it23Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        it23Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Entity Drops"));
        it23MetaLore.add(" ");
        it23MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&7This gamerule determines if"));
        it23MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&7entities that are not mobs"));
        it23MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&7drop items when killed."));
        it23Meta.setLore(it23MetaLore);
        it23.setItemMeta(it23Meta);
        gui.setItem(23, it23);

        ItemStack it24 = new ItemStack(Material.BOOK);;
        ItemMeta it24Meta = it24.getItemMeta();
        ArrayList<String> it24MetaLore = new ArrayList<>();
        if(Gamerule.getGameruleBool(GameRule.DO_FIRE_TICK)) {
            it24Meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
            it24MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&aValue: &bEnabled"));
        } else {
            it24MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&aValue: &cDisabled"));
        }
        it24Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        it24Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Fire Tick"));
        it24MetaLore.add(" ");
        it24MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&7This gamerule determines if"));
        it24MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&7fire will spread and naturally"));
        it24MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&7extinguish."));
        it24Meta.setLore(it24MetaLore);
        it24.setItemMeta(it24Meta);
        gui.setItem(24, it24);

        ItemStack it25 = new ItemStack(Material.BOOK);;
        ItemMeta it25Meta = it25.getItemMeta();
        ArrayList<String> it25MetaLore = new ArrayList<>();
        if(Gamerule.getGameruleBool(GameRule.DO_INSOMNIA)) {
            it25Meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
            it25MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&aValue: &bEnabled"));
        } else {
            it25MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&aValue: &cDisabled"));
        }
        it25Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        it25Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Insomia"));
        it25MetaLore.add(" ");
        it25MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&7This gamerule determines if"));
        it25MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&7phantomes can spawn in the"));
        it25MetaLore.add(ChatColor.translateAlternateColorCodes('&', "&7nighttime"));
        it24Meta.setLore(it25MetaLore);
        it25.setItemMeta(it25Meta);
        gui.setItem(25, it25);


        p.openInventory(gui);
    }

}
