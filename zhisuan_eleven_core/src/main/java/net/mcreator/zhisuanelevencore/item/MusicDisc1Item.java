
package net.mcreator.zhisuanelevencore.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDisc1Item extends RecordItem {
	public MusicDisc1Item() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("zhisuan_eleven_core:the_internationale")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 2100);
	}
}
