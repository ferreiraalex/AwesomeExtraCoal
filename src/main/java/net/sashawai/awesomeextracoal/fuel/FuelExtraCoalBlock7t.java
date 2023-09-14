
package net.sashawai.awesomeextracoal.fuel;

import net.sashawai.awesomeextracoal.block.BlockExtraCoalBlock7;
import net.sashawai.awesomeextracoal.ElementsAwesomeExtraCoalMod;

import net.minecraft.item.ItemStack;

@ElementsAwesomeExtraCoalMod.ModElement.Tag
public class FuelExtraCoalBlock7t extends ElementsAwesomeExtraCoalMod.ModElement {
	public FuelExtraCoalBlock7t(ElementsAwesomeExtraCoalMod instance) {
		super(instance, 16);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockExtraCoalBlock7.block, (int) (1)).getItem())
			return 500000000;
		return 0;
	}
}
