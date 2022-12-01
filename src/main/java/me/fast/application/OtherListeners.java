package me.fast.application;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;



import static me.fast.application.Item.*;

public class OtherListeners implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        if (!e.getPlayer().hasPlayedBefore()) {
            giveItem(e.getPlayer());
        }
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        e.getDrops().remove(item);
    }

    @EventHandler
    public void onRespawn(PlayerRespawnEvent e) {
        if (!e.getPlayer().getInventory().contains(item)) {
            Player p = e.getPlayer();
            giveItem(p);
            p.sendMessage(cc("&5&ke &d&lMagic Wand &5&ke &7>> Your Wand is back in your inventory."));
        }
    }

}
