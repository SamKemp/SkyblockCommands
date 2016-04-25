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

    //Help strings
    public String Help1 = "&6&l=-=-=-=-= MultiCubeUK Skyblock =-=-=-=-=";
    public String Help2 = "&a/sb help&r &l-&r Shows this help";
    public String Help3 = "&a/sb start&r &l-&r Start you off with a new island";
    public String Help4 = "&a/sb restart&r &l-&r Resets your current island";
    public String Help5 = "&a/sb spawn&r &l-&r Sends you to the spawn of your island";
    public String Help6 = "&a/sb setspawn&r &l-&r Sets the spawn of your island";
    public String Help7 = "&a/sb setbiome (island|chunk|block) [biome]&r &l-&r Sets the biome of your island";
    public String Help8 = "&a/sb biomelist&r &l-&r Shows a list of allowed biomes for setbiome";

    @Override
    public void onEnable()
    {
        this.getCommand("skyblock").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (cmd.getName().equalsIgnoreCase("sb"))
        // If the player typed /sb then do the following...
        {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                PlayerName = player.getPlayerListName().toString();
                if (args[0].equalsIgnoreCase("start"))
                {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + message));
                    player.chat("/is spawn");
                    player.chat("/kit newisland");
                    return true;
                }
                else if (args[0].equalsIgnoreCase("restart"))
                {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + message));
                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "clear " + PlayerName);
                    player.chat("/is reset");
                    player.chat("/is reset");
                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "kit newisland " + PlayerName);
                    return true;
                }
                else if (args[0].equalsIgnoreCase("biomelist"))
                {
                    player.chat("/is biomelist");
                    return true;
                }
                else if (args[0].equalsIgnoreCase("spawn"))
                {
                    player.chat("/is spawn");
                    return true;
                }
                else if (args[0].equalsIgnoreCase("setspawn"))
                {
                    player.chat("/is setspawn");
                    return true;
                }
                else if(args[0].equalsIgnoreCase("setbiome"))
                {
                    if(args[1].equalsIgnoreCase("island"));
                    {
                        if(args[2].equalsIgnoreCase("DeepOcean"))
                        {
                            player.chat("/is setbiome island DeepOcean");
                        }
                        else if(args[2].equalsIgnoreCase("Desert"))
                        {
                            player.chat("/is setbiome island Desert");
                        }
                        else if(args[2].equalsIgnoreCase("ExtremeHills"))
                        {
                            player.chat("/is setbiome island ExtremeHills");
                        }
                        else if(args[2].equalsIgnoreCase("FolwerForest"))
                        {
                            player.chat("/is setbiome island FlowerForest");
                        }
                        else if(args[2].equalsIgnoreCase("Forest"))
                        {
                            player.chat("/is setbiome island Forest");
                        }
                        else if(args[2].equalsIgnoreCase("Hell"))
                        {
                            player.chat("/is setbiome island Hell");
                        }
                        else if(args[2].equalsIgnoreCase("Jungle"))
                        {
                            player.chat("/is setbiome island Jungle");
                        }
                        else if(args[2].equalsIgnoreCase("MushroomIsland"))
                        {
                            player.chat("/is setbiome island MushroomIsland");
                        }
                        else if(args[2].equalsIgnoreCase("Ocean"))
                        {
                            player.chat("/is setbiome island Ocean");
                        }
                        else if(args[2].equalsIgnoreCase("Plains"))
                        {
                            player.chat("/is setbiome island Plains");
                        }
                        else if(args[2].equalsIgnoreCase("Sky"))
                        {
                            player.chat("/is setbiome island Sky");
                        }
                        else if(args[2].equalsIgnoreCase("Swampland"))
                        {
                            player.chat("/is setbiome island Swampland");
                        }
                        else if(args[2].equalsIgnoreCase("Taiga"))
                        {
                            player.chat("/is setbiome island Taiga");
                        }
                    }
                    if (args[1].equalsIgnoreCase("chunk"))
                {
                    if(args[2].equalsIgnoreCase("DeepOcean"))
                    {
                        player.chat("/is setbiome chunk DeepOcean");
                    }
                    else if(args[2].equalsIgnoreCase("Desert"))
                    {
                        player.chat("/is setbiome chunk Desert");
                    }
                    else if(args[2].equalsIgnoreCase("ExtremeHills"))
                    {
                        player.chat("/is setbiome chunk ExtremeHills");
                    }
                    else if(args[2].equalsIgnoreCase("FolwerForest"))
                    {
                        player.chat("/is setbiome chunk FlowerForest");
                    }
                    else if(args[2].equalsIgnoreCase("Forest"))
                    {
                        player.chat("/is setbiome chunk Forest");
                    }
                    else if(args[2].equalsIgnoreCase("Hell"))
                    {
                        player.chat("/is setbiome chunk Hell");
                    }
                    else if(args[2].equalsIgnoreCase("Jungle"))
                    {
                        player.chat("/is setbiome chunk Jungle");
                    }
                    else if(args[2].equalsIgnoreCase("MushroomIsland"))
                    {
                        player.chat("/is setbiome chunk MushroomIsland");
                    }
                    else if(args[2].equalsIgnoreCase("Ocean"))
                    {
                        player.chat("/is setbiome chunk Ocean");
                    }
                    else if(args[2].equalsIgnoreCase("Plains"))
                    {
                        player.chat("/is setbiome chunk Plains");
                    }
                    else if(args[2].equalsIgnoreCase("Sky"))
                    {
                        player.chat("/is setbiome chunk Sky");
                    }
                    else if(args[2].equalsIgnoreCase("Swampland"))
                    {
                        player.chat("/is setbiome chunk Swampland");
                    }
                    else if(args[2].equalsIgnoreCase("Taiga"))
                    {
                        player.chat("/is setbiome chunk Taiga");
                    }
                }
                    else if (args[1].equalsIgnoreCase("block"))
                    {
                        if(args[2].equalsIgnoreCase("DeepOcean"))
                        {
                            player.chat("/is setbiome block DeepOcean");
                        }
                        else if(args[2].equalsIgnoreCase("Desert"))
                        {
                            player.chat("/is setbiome block Desert");
                        }
                        else if(args[2].equalsIgnoreCase("ExtremeHills"))
                        {
                            player.chat("/is setbiome block ExtremeHills");
                        }
                        else if(args[2].equalsIgnoreCase("FolwerForest"))
                        {
                            player.chat("/is setbiome block FlowerForest");
                        }
                        else if(args[2].equalsIgnoreCase("Forest"))
                        {
                            player.chat("/is setbiome block Forest");
                        }
                        else if(args[2].equalsIgnoreCase("Hell"))
                        {
                            player.chat("/is setbiome block Hell");
                        }
                        else if(args[2].equalsIgnoreCase("Jungle"))
                        {
                            player.chat("/is setbiome block Jungle");
                        }
                        else if(args[2].equalsIgnoreCase("MushroomIsland"))
                        {
                            player.chat("/is setbiome block MushroomIsland");
                        }
                        else if(args[2].equalsIgnoreCase("Ocean"))
                        {
                            player.chat("/is setbiome block Ocean");
                        }
                        else if(args[2].equalsIgnoreCase("Plains"))
                        {
                            player.chat("/is setbiome block Plains");
                        }
                        else if(args[2].equalsIgnoreCase("Sky"))
                        {
                            player.chat("/is setbiome block Sky");
                        }
                        else if(args[2].equalsIgnoreCase("Swampland"))
                        {
                            player.chat("/is setbiome block Swampland");
                        }
                        else if(args[2].equalsIgnoreCase("Taiga"))
                        {
                            player.chat("/is setbiome block Taiga");
                        }
                    }
                    return true;
                }
                else if(args[0].equalsIgnoreCase("help"))
                {
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', Help1));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', Help2));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', Help3));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', Help4));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', Help5));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', Help6));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', Help7));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', Help8));
                    return true;
                }
                else
                {
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', Help1));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', Help2));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', Help3));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', Help4));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', Help5));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', Help6));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', Help7));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', Help8));
                    return true;
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
