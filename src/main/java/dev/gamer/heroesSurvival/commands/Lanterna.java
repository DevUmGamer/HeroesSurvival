package dev.gamer.heroesSurvival.commands;

import dev.gamer.heroesSurvival.SurvivalHeroes;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

public class Lanterna implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        String pf = SurvivalHeroes.getSurvivalHeroes().getConfig().getString("Prefix").replace("&", "§");
        if (command.getName().equalsIgnoreCase("luz")) {
            if (sender instanceof Player) {
                if (p.hasPermission("Ari.Luz")) {
                    if (p.hasPotionEffect(PotionEffectType.NIGHT_VISION)) {
                        p.removePotionEffect(PotionEffectType.NIGHT_VISION);
                        p.sendMessage(pf + " $cLanterna desativada!");
                    } else {
                        p.addPotionEffect(PotionEffectType.NIGHT_VISION.createEffect(Integer.MAX_VALUE, 20));
                        p.sendMessage(pf + " $eLanterna ativada!");
                    }
                }
            }
        }
        return false;
    }
}
