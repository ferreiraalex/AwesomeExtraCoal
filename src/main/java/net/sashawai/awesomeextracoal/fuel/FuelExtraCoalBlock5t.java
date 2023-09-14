
package net.sashawai.awesomeextracoal.fuel;

import net.sashawai.awesomeextracoal.block.BlockExtraCoalBlock5;
import net.sashawai.awesomeextracoal.ElementsAwesomeExtraCoalMod;

import net.minecraft.item.ItemStack;

@ElementsAwesomeExtraCoalMod.ModElement.Tag
public class FuelExtraCoalBlock5t extends ElementsAwesomeExtraCoalMod.ModElement {
	public FuelExtraCoalBlock5t(ElementsAwesomeExtraCoalMod instance) {
		super(instance, 14);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockExtraCoalBlock5.block, (int) (1)).getItem())
			return 50000000;
		return 0;
	}
}
