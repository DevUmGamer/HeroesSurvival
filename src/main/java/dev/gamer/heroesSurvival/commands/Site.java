package dev.gamer.heroesSurvival.commands;

import dev.gamer.heroesSurvival.SurvivalHeroes;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Site implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        String pf = SurvivalHeroes.getSurvivalHeroes().getConfig().getString("Prefix").replace("&", "§");
        String s = SurvivalHeroes.getSurvivalHeroes().getConfig().getString("Site").replace("&", "§");
        String f = SurvivalHeroes.getSurvivalHeroes().getConfig().getString("Forum").replace("&", "§");
        String d = SurvivalHeroes.getSurvivalHeroes().getConfig().getString("Discord").replace("&", "§");

        if (command.getName().equalsIgnoreCase("site")){
            if(SurvivalHeroes.getSurvivalHeroes().getConfig().getString("Discord").equals("null")) {
                p.sendMessage(pf+" §5O servidor não possui um discord!");
            }else{
                p.sendMessage(pf+" §5O Discord do servidor é: §c"+ d);
            }
            if(SurvivalHeroes.getSurvivalHeroes().getConfig().getString("Forum").equals("null")) {
                p.sendMessage(pf+" §5O servidor não possui um forum!");
            }else{
                p.sendMessage(pf+" §5O Forum do servidor é: §c"+ f);
            }
            if(SurvivalHeroes.getSurvivalHeroes().getConfig().getString("Site").equals("null")) {
                p.sendMessage(pf+" §5O servidor não possui um Site!");
            }else{
                p.sendMessage(pf+" §5O Site do servidor é: §c"+ s);
            }
        }
        return false;
    }
}
