package dev.gamer.heroesSurvival.commands;

import dev.gamer.heroesSurvival.SurvivalHeroes;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        String pf = SurvivalHeroes.getSurvivalHeroes().getConfig().getString("Prefix").replace("&", "§");
        if(command.getName().equalsIgnoreCase("fly")) {
            if (sender instanceof Player) {
                if (p.hasPermission("Ari.Fly")) {
                    if (p.getAllowFlight() == false){
                        p.setAllowFlight(true);
                        p.sendMessage(pf+ " $eFly ativado!");
                    } else {
                        p.setAllowFlight(false);
                        p.sendMessage(pf+ " $cFly desativado!");
                    }
                }
            }
        }
        return false;
    }
}
