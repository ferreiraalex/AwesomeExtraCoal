
package net.sashawai.awesomeextracoal.fuel;

import net.sashawai.awesomeextracoal.block.BlockExtraCoalBlock4;
import net.sashawai.awesomeextracoal.ElementsAwesomeExtraCoalMod;

import net.minecraft.item.ItemStack;

@ElementsAwesomeExtraCoalMod.ModElement.Tag
public class FuelExtraCoalBlock4t extends ElementsAwesomeExtraCoalMod.ModElement {
	public FuelExtraCoalBlock4t(ElementsAwesomeExtraCoalMod instance) {
		super(instance, 13);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockExtraCoalBlock4.block, (int) (1)).getItem())
			return 10000000;
		return 0;
	}
}
