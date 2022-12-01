package me.fast.application;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static me.fast.application.Item.cc;

public class ClickListener implements Listener {


    public static List<Player> list = new ArrayList<>();

    @EventHandler
    public void onItemClick(PlayerInteractEvent e) {
            Player p = e.getPlayer();
            if (Objects.requireNonNull(e.getItem()).getType() == Material.BLAZE_ROD) {
                if (e.getAction().equals(Action.LEFT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                    if (Objects.requireNonNull(e.getItem().getItemMeta()).getDisplayName().equalsIgnoreCase(cc("&5&ke &d&lMagic Wand &5&ke"))) {
                        if (!list.contains(p)) {
                            p.setInvisible(true);
                            list.add(p);
                            p.sendMessage(cc("&5&ke &d&lMagic Wand &5&ke &7>> &fYour wand is turned on you're now invisible."));
                        } else {
                            p.setInvisible(false);
                            list.remove(p);
                            p.sendMessage(cc("&5&ke &d&lMagic Wand &5&ke &7>> &fYour wand is turned off you're now visible."));
                        }
                    }
                }

            }


    }


}
