package spigot.dicegame.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Random;

public class Roll implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Random random = new Random();

        for (int i = 0; i < 1; i++) {
            Bukkit.broadcastMessage( sender.getName() + "* " + "rolls the dice " + (random.nextInt(6) + 1));
        }

        return true;
    }
}
