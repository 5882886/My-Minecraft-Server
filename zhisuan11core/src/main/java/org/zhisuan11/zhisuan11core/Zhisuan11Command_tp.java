package org.zhisuan11.zhisuan11core;


import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Zhisuan11Command_tp implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        Player player = (Player) sender;

        Player targetPlayer = player.getServer().getPlayer(args[1]);
        Player sendPlayer = (Player) sender;

        if (args.length == 4) {
            double x = Double.parseDouble(args[1]);
            double y = Double.parseDouble(args[2]);
            double z = Double.parseDouble(args[3]);
            Location location = new Location(player.getWorld(), x, y, z);
            sendPlayer.teleport(location);
            sendPlayer.sendMessage("你已被传送至: " + x + ", " + y + ", " + z);
            return true;
        }

        else if (args.length == 2 && args[1].equals("spawn")) {
            Location spawnLocation = player.getWorld().getSpawnLocation();
            sendPlayer.teleport(spawnLocation);
        }

        else if (args.length == 2  && targetPlayer != null) {

            sendPlayer.teleport(targetPlayer);
            sender.sendMessage("你已被传送至：" + targetPlayer.getName());
            return true;

        }

        else {
            sender.sendMessage("命令格式错误，请重试！");
            return true;
        }
               //指令    /zs tp ……


        return false;
    }
}
