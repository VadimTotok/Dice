package spigot.dicegame.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Random;

public class Roll implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }

        Random random = new Random();
        Player player = (Player) sender;

        int numDice = 1;

        int rollResult = random.nextInt(6) + 1;
        player.sendMessage(String.format("%s rolled %d", player.getName(), rollResult));

        return true;
    }
}
