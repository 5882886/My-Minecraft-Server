
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zhisuanelevencore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.zhisuanelevencore.ZhisuanElevenCoreMod;

public class ZhisuanElevenCoreModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, ZhisuanElevenCoreMod.MODID);
	public static final RegistryObject<PaintingVariant> TUAN_HUI = REGISTRY.register("tuan_hui", () -> new PaintingVariant(48, 48));
	public static final RegistryObject<PaintingVariant> TUAN_QI = REGISTRY.register("tuan_qi", () -> new PaintingVariant(48, 32));
	public static final RegistryObject<PaintingVariant> ACADEMY_1 = REGISTRY.register("academy_1", () -> new PaintingVariant(32, 32));
	public static final RegistryObject<PaintingVariant> ACADEMY_2 = REGISTRY.register("academy_2", () -> new PaintingVariant(32, 80));
	public static final RegistryObject<PaintingVariant> ZHISUAN_ELEVEN_ICON = REGISTRY.register("zhisuan_eleven_icon", () -> new PaintingVariant(32, 32));
}
