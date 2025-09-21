
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zhisuanelevencore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.zhisuanelevencore.item.ZhisuanElevenLogoItem;
import net.mcreator.zhisuanelevencore.item.MusicDisc2Item;
import net.mcreator.zhisuanelevencore.item.MusicDisc1Item;
import net.mcreator.zhisuanelevencore.ZhisuanElevenCoreMod;

public class ZhisuanElevenCoreModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ZhisuanElevenCoreMod.MODID);
	public static final RegistryObject<Item> MUSIC_DISC_1 = REGISTRY.register("music_disc_1", () -> new MusicDisc1Item());
	public static final RegistryObject<Item> ZHISUAN_ELEVEN_LOGO = REGISTRY.register("zhisuan_eleven_logo", () -> new ZhisuanElevenLogoItem());
	public static final RegistryObject<Item> MUSIC_DISC_2 = REGISTRY.register("music_disc_2", () -> new MusicDisc2Item());
	// Start of user code block custom items
	// End of user code block custom items
}
