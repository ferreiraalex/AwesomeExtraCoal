
package net.sashawai.awesomeextracoal.fuel;

import net.sashawai.awesomeextracoal.block.BlockExtraCoalBlock8;
import net.sashawai.awesomeextracoal.ElementsAwesomeExtraCoalMod;

import net.minecraft.item.ItemStack;

@ElementsAwesomeExtraCoalMod.ModElement.Tag
public class FuelEctraCoalBlock8t extends ElementsAwesomeExtraCoalMod.ModElement {
	public FuelEctraCoalBlock8t(ElementsAwesomeExtraCoalMod instance) {
		super(instance, 17);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockExtraCoalBlock8.block, (int) (1)).getItem())
			return 750000000;
		return 0;
	}
}
