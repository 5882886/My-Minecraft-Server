package org.zhisuan11.zhisuan11core;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;


public final class Zhisuan11core extends JavaPlugin {

    //全局变量代表主类
    static Zhisuan11core main;


    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("  欢迎您使用智算11班服务器插件！ ");
        System.out.println(" █████    █████      █       █   ");
        System.out.println("     █    █         ██      ██   ");
        System.out.println("    █     █████      █       █   ");
        System.out.println("  █           █      █       █   ");
        System.out.println(" █████    █████     ███     ███  ");


        Bukkit.getPluginCommand("zhisuan11").setExecutor(new Zhisuan11Command_main());
        Bukkit.getPluginCommand("tp").setExecutor(new Zhisuan11Command_tp());
        Bukkit.getPluginCommand("zhisuan11").setTabCompleter(new Zhisuan11TabCompleter());
        Bukkit.getPluginManager().registerEvents(new JoinInfo(), this);
        Bukkit.getPluginManager().registerEvents(new JoinItem(), this);


        //生成配置文件
        saveDefaultConfig();


        //实现定时循环发送服务器公告



        List<String> announcement = getConfig().getStringList("BroadCast.content");
        String bool = getConfig().getString("BroadCast.enabled");
        int interval = getConfig().getInt("BroadCast.interval");

        if (bool != null && bool.equals("true")) {
            getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
                @Override
                public void run() {
                    for (String message : announcement) {
                        message = ChatColor.translateAlternateColorCodes('&', message);
                        getServer().broadcastMessage(message);
                    }

                }
            }, 20L * 15, 20L * interval);   //加载插件15秒后发送第一次公告，此后每interval秒发送一次
        }
        
        main = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("  感谢您使用智算11班服务器插件！ ");
        System.out.println(" █████    █████      █       █   ");
        System.out.println("     █    █         ██      ██   ");
        System.out.println("    █     █████      █       █   ");
        System.out.println("  █           █      █       █   ");
        System.out.println(" █████    █████     ███     ███  ");
    }
}
