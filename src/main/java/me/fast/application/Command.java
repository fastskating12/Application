package me.fast.application;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static me.fast.application.Item.giveItem;

public class Command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {

        if (sender instanceof Player p) {
            giveItem(p);
        }


        return true;
    }
}
