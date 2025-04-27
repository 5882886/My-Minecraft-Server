package org.zhisuan11.zhisuan11core;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

import static org.bukkit.Bukkit.getServer;


public class Zhisuan11Command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        //    /zhisuan11 ……或 /zs ……

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
            }

            if (args.length == 2) {
                if (!args[1].equals("send")) {
                    String value = args[1];
                    config.set("BroadCast.content", value);     //修改公告内容
                    Zhisuan11core.main.saveConfig();            //保存配置文件
                    sender.sendMessage(ChatColor.BLUE + "服务器公告已刷新！");
                }    //     指令/zs broadcast ……
                else {
                    String message = ChatColor.translateAlternateColorCodes('&', announcement);
                    getServer().broadcastMessage(message);
                    sender.sendMessage(ChatColor.BLUE + "已发送服务器公告！");
                }   //      指令/zs broadcast send
            }

        }



        if(args.length == 1 && args[0].equals("reload")){
            sender.sendMessage(ChatColor.BLUE + "[zhisuan11core]正在重载插件配置……");
            Zhisuan11core.main.reloadConfig();
            sender.sendMessage(ChatColor.BLUE + "[zhisuan11core]配置文件重载完成！");
            return true;
        }   //   指令/zs reload


        return false;
    }
}
