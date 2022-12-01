package me.fast.application;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Application extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ClickListener(), this);
        getServer().getPluginManager().registerEvents(new OtherListeners(), this);
        Objects.requireNonNull(getCommand("getwand")).setExecutor(new Command());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
