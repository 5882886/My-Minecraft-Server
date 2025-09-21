
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zhisuanelevencore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.zhisuanelevencore.ZhisuanElevenCoreMod;

public class ZhisuanElevenCoreModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ZhisuanElevenCoreMod.MODID);
	public static final RegistryObject<CreativeModeTab> ZHISUAN_ELEVEN = REGISTRY.register("zhisuan_eleven",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.zhisuan_eleven_core.zhisuan_eleven")).icon(() -> new ItemStack(ZhisuanElevenCoreModItems.ZHISUAN_ELEVEN_LOGO.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ZhisuanElevenCoreModItems.MUSIC_DISC_1.get());
				tabData.accept(ZhisuanElevenCoreModItems.ZHISUAN_ELEVEN_LOGO.get());
				tabData.accept(ZhisuanElevenCoreModItems.MUSIC_DISC_2.get());
			}).build());
}
