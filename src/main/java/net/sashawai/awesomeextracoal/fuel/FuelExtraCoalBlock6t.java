
package net.sashawai.awesomeextracoal.fuel;

import net.sashawai.awesomeextracoal.block.BlockExtraCoalBlock6;
import net.sashawai.awesomeextracoal.ElementsAwesomeExtraCoalMod;

import net.minecraft.item.ItemStack;

@ElementsAwesomeExtraCoalMod.ModElement.Tag
public class FuelExtraCoalBlock6t extends ElementsAwesomeExtraCoalMod.ModElement {
	public FuelExtraCoalBlock6t(ElementsAwesomeExtraCoalMod instance) {
		super(instance, 15);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockExtraCoalBlock6.block, (int) (1)).getItem())
			return 250000000;
		return 0;
	}
}
