
package net.mcreator.zhisuanelevencore.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDisc2Item extends RecordItem {
	public MusicDisc2Item() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("zhisuan_eleven_core:school_song")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 1340);
	}
}
