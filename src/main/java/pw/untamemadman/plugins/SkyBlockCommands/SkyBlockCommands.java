package pw.untamemadman.plugins.SkyBlockCommands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by untamemadman on 22/04/2016.
 */
public class SkyBlockCommands extends JavaPlugin {

    public static String prefix = "&7[&aMulti&cCube&5Uk&7]&b ";
    public static String message = "Transporting you to your new island";
    public String PlayerName = "";

    @Override
    public void onEnable() {
        this.getCommand("skyblock").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (cmd.getName().equalsIgnoreCase("skyblock"))
        // If the player typed /skyblock then do the following...
        {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                PlayerName = player.getPlayerListName().toString();
                if (args[0].equalsIgnoreCase("start")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + message));
                    player.chat("/is reset");
                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "kit newisland " + PlayerName);
                    return true;
                } else if (args[0].equalsIgnoreCase("restart")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + message));
                    player.chat("/is reset");
                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "kit newisland " + PlayerName);
                    return true;
                } else {
                    return false;
                }
            } else {
                sender.sendMessage("This command can only be run by a player!");
                return true;
            }
        } else if (cmd.getName().equalsIgnoreCase("sb"))
        // If the player typed /sb then do the following...
        {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                PlayerName = player.getPlayerListName().toString();
                if (args[0].equalsIgnoreCase("start"))
                {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + message));
                    player.chat("/is reset");
                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "kit newisland " + PlayerName);
                    return true;
                }
                else if (args[0].equalsIgnoreCase("restart"))
                {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + message));
                    player.chat("/is reset");
                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "kit newisland " + PlayerName);
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                sender.sendMessage("This command can only be run by a player!");
                return true;
            }
        }
        //If this has happened the function will return true.
        // If this hasn't happened the value of false will be returned.
        return false;
    }
}
