
package net.mcreator.modsmc.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;

import net.mcreator.modsmc.ModsmcModElements;

@ModsmcModElements.ModElement.Tag
public class AFuel extends ModsmcModElements.ModElement {
	public AFuel(ModsmcModElements instance) {
		super(instance, 1);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(Blocks.CHISELED_QUARTZ_BLOCK, (int) (1)).getItem())
			event.setBurnTime(1600);
	}
}
