package org.zhisuan11.zhisuan11core;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getServer;


public class Zhisuan11Command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        //    /zhisuan11 ……或 /zs ……

        Player player = (Player) sender;
        FileConfiguration config = Zhisuan11core.main.getConfig();

        if(args.length == 1 && args[0].equals("help")){
            sender.sendMessage(ChatColor.DARK_GRAY + "插件帮助");
            sender.sendMessage(ChatColor.BLUE + "/zs info   - 插件信息");
            sender.sendMessage(ChatColor.BLUE + "/zs reload - 重载插件配置文件");
            return true;
        }  //   指令/zs help

        if(args.length == 1 && args[0].equals("info")){
            sender.sendMessage(ChatColor.DARK_GRAY + "插件信息");
            sender.sendMessage(ChatColor.BLUE + " - 本插件为天津大学2024级智算11班服务器专用插件");
            sender.sendMessage(ChatColor.BLUE + " - 如遇bug请至Github或\"11班MC\"微信群提交");
            return true;
        }  //   指令/zs info

        if (args[0].equals("broadcast")) {
            String announcement = "[公告]" + config.getString("BroadCast.content");

            if(args.length == 1) {
                sender.sendMessage("用法：/zs broadcast [服务器公告内容]");
                return true;
            }

            if (args.length == 2) {
                if (!args[1].equals("send")) {
                    String value = args[1];
                    config.set("BroadCast.content", value);     //修改公告内容
                    Zhisuan11core.main.saveConfig();            //保存配置文件
                    sender.sendMessage(ChatColor.BLUE + "服务器公告已刷新！");
                    return true;
                }    //     指令/zs broadcast ……
                else {
                    String message = ChatColor.translateAlternateColorCodes('&', announcement);
                    getServer().broadcastMessage(message);
                    sender.sendMessage(ChatColor.BLUE + "已发送服务器公告！");
                    return true;
                }   //      指令/zs broadcast send
            }

        }

        if (args[0].equals("tp")) {
            Player targetPlayer = player.getServer().getPlayer(args[2]);
            Player sendPlayer = (Player) sender;

            if (args.length == 5) {
                double x = Double.parseDouble(args[2]);
                double y = Double.parseDouble(args[3]);
                double z = Double.parseDouble(args[4]);
                Location location = new Location(player.getWorld(), x, y, z);
                sendPlayer.teleport(location);
                sendPlayer.sendMessage("你已被传送至: " + x + ", " + y + ", " + z);
                return true;
            }

            else if (args.length == 4) {
                if (targetPlayer != null) {
                    sendPlayer.teleport(targetPlayer);
                    sender.sendMessage("你已被传送至：" + targetPlayer.getName());
                    return true;
                }
            }

            else {
                sender.sendMessage("命令格式错误，请重试！");
                return true;
            }
        }       //指令    /zs tp ……

        if(args.length == 1 && args[0].equals("reload")) {
            sender.sendMessage(ChatColor.BLUE + "[zhisuan11core]正在重载插件配置……");
            Zhisuan11core.main.reloadConfig();
            sender.sendMessage(ChatColor.BLUE + "[zhisuan11core]配置文件重载完成！");
            return true;
        }   //   指令/zs reload

        else {
            sender.sendMessage("欢迎使用zhisuan11core MC服务器插件！");
        }

        return false;
    }
}
