package spigot.dicegame;

import org.bukkit.plugin.java.JavaPlugin;
import spigot.dicegame.commands.Roll;

public final class DiceGame extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("roll").setExecutor(new Roll());
    }
}