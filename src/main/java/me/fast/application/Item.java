package me.fast.application;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Item {

    public static ItemStack item;

    //ChatColor Function
    public static String cc(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

    //Giving the player the Item
    public static void giveItem(Player p) {
        item = new ItemStack(Material.BLAZE_ROD);
        ItemMeta itemMeta = item.getItemMeta();
        List<String> itemLore = new ArrayList<>();

        itemLore.add(cc("&7To use please click on this Item."));
        itemLore.add(cc("&7This Item is Bound to: &l" + p.getDisplayName()));
        Objects.requireNonNull(itemMeta).setLore(itemLore);
        itemMeta.setUnbreakable(true);
        itemMeta.setDisplayName(cc("&5&ke &d&lMagic Wand &5&ke"));
        item.setItemMeta(itemMeta);
        p.getInventory().setItemInMainHand(item);
    }



}
