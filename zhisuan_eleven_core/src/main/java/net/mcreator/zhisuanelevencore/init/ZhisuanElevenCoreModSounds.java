
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zhisuanelevencore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.zhisuanelevencore.ZhisuanElevenCoreMod;

public class ZhisuanElevenCoreModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ZhisuanElevenCoreMod.MODID);
	public static final RegistryObject<SoundEvent> THE_INTERNATIONALE = REGISTRY.register("the_internationale", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zhisuan_eleven_core", "the_internationale")));
	public static final RegistryObject<SoundEvent> SCHOOL_SONG = REGISTRY.register("school_song", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zhisuan_eleven_core", "school_song")));
}
