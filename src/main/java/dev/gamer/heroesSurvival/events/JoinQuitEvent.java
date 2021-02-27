package dev.gamer.heroesSurvival.events;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinQuitEvent implements Listener {
    @EventHandler
    public void onJoinEvent(PlayerJoinEvent event){
        event.setJoinMessage(null);
        event.setJoinMessage("§b[+] "+event.getPlayer().getName()+" $7Entrou no servidor!");
    }
    @EventHandler
    public void onQuitEvent(PlayerQuitEvent event){
        event.setQuitMessage(null);
        event.setQuitMessage("§b[+] "+event.getPlayer().getName()+" $7Entrou no servidor!");
    }
}
