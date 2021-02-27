package dev.gamer.heroesSurvival.luckblocks;

import dev.gamer.heroesSurvival.SurvivalHeroes;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.Arrays;

public class LuckyBlockGive implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // /giveluck NICK Quantidade
        Player player = (Player) sender;
        String pf = SurvivalHeroes.getSurvivalHeroes().getConfig().getString("Prefix").replace("&", "§");
        if(command.getName().equalsIgnoreCase("giveluck")){
            if (args.length == 2){
                String pName = args[1];
                Player p = Bukkit.getPlayer (pName);
                if (p != null){
                    if (args[2] != null){
                        try {
                            int qtd = Integer.parseInt(args[2]);
                            ItemStack head = new ItemStack(Material.PLAYER_HEAD, qtd);
                            SkullMeta meta = (SkullMeta) head.getItemMeta();
                            meta.setOwner("ABigDwarf");
                            meta.setDisplayName("§6Lucky Block");
                            meta.setLore(Arrays.asList("§6Luck Block", "§3Raridade §8* §9Lendário"));
                            head.setItemMeta(meta);
                            p.getInventory().addItem(head);
                        } catch (NumberFormatException e) {
                            player.sendMessage("Error");
                        }
                    }
                }
            }else {
                player.sendMessage(pf+" /giveluck NICK Quantidade");
            }
        }
        return false;
        /*
        #######Ignore IT########

        * Player p = (Player)sender;
        if(args.length == 0) {
            p.sendMessage("Use /fragmentos give <nick> <quantia>")
            return true;
        }
        if(args[0].equalsIgnoreCase("give")) {
            if(args.length == 1) {
                if(p.hasPermission("fragmento.give")) {
                    p.sendMessage("§7Use /fragmentos give <nick> <quantia>");
                    return true;
                }
                }
                    Player target = Bukkit.getPlayerExact(args[1]);
                    if(args.length == 2) {
                    if(target != null) {
                        p.sendMessage("§7Use /fragmentos give <nick> <quantia>");
                            return true;
                        }else {
                            p.sendMessage("§cPlayer offline");
                        }
                    }
                    try {
                        Integer quantia = Integer.parseInt(args[2]);
                        if(!(quantia <= 0)) {
                            ItemStack it = Main.getManager().getIT();
                            it.setAmount(quantia);
                            p.getInventory().addItem(it);

                            p.sendMessage("§aQuantia enviada com sucesso");
                        }
                    } catch (NumberFormatException e) {
                        p.sendMessage("§cNao e um numero");


            }
        * */
    }
}
