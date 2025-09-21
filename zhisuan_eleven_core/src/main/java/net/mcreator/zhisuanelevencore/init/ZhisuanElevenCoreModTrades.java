
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.zhisuanelevencore.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ZhisuanElevenCoreModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(ZhisuanElevenCoreModItems.MUSIC_DISC_1.get()), 10, 5, 0f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(ZhisuanElevenCoreModItems.MUSIC_DISC_2.get()), 10, 5, 0f));
	}
}
