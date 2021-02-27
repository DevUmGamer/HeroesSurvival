package dev.gamer.heroesSurvival;

import dev.gamer.heroesSurvival.commands.Fly;
import dev.gamer.heroesSurvival.commands.Lanterna;
import dev.gamer.heroesSurvival.commands.Site;
import dev.gamer.heroesSurvival.events.JoinQuitEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SurvivalHeroes extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("Testando!");
        loadCommands();
        loadEvents();
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("Testando!");
    }
    public void loadCommands(){
        getCommand("fly").setExecutor(new Fly());
        getCommand("luz").setExecutor(new Lanterna());
        getCommand("site").setExecutor(new Site());
    }
    public void loadEvents(){
        Bukkit.getPluginManager().registerEvents(new JoinQuitEvent(), this);
    }
    public static SurvivalHeroes getSurvivalHeroes(){
        return (SurvivalHeroes) Bukkit.getServer().getPluginManager().getPlugin("DevServerInf");
    }
}
