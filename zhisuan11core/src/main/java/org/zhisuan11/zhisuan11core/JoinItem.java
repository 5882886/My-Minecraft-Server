package org.zhisuan11.zhisuan11core;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class JoinItem implements Listener {

    @EventHandler

    //初始物品套装
    public void onPlayerJoin(PlayerJoinEvent event) {


        if (!event.getPlayer().hasPlayedBefore()) {      //检查是否为第一次登录

            //获取first-join-item的节点内容并返回一个列表itemsConfig
            //List<?> 代表列表中包含多种数据类型

            ItemStack item1 = new ItemStack(Material.STONE_PICKAXE, 1);
            ItemStack item2 = new ItemStack(Material.STONE_SWORD, 1);
            ItemStack item3 = new ItemStack(Material.STONE_AXE, 1);
            ItemStack item4 = new ItemStack(Material.STONE_SHOVEL, 1);
            ItemStack item5 = new ItemStack(Material.STONE_HOE, 1);

            event.getPlayer().getInventory().addItem(item1, item2, item3, item4, item5);

            //发送查收信息
            event.getPlayer().sendMessage("初始物品已发放，请查收！");
        }
    }
}
