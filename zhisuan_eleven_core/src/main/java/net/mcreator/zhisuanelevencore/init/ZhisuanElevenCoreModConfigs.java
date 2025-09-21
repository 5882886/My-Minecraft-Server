package net.mcreator.zhisuanelevencore.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.mcreator.zhisuanelevencore.configuration.ConfigConfiguration;
import net.mcreator.zhisuanelevencore.ZhisuanElevenCoreMod;

@Mod.EventBusSubscriber(modid = ZhisuanElevenCoreMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ZhisuanElevenCoreModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigConfiguration.SPEC, "ZhisuanEleven.toml");
		});
	}
}
