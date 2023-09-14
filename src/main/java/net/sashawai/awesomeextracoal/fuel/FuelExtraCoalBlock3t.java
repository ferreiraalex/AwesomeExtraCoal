
package net.sashawai.awesomeextracoal.fuel;

import net.sashawai.awesomeextracoal.block.BlockExtraCoalBlock3;
import net.sashawai.awesomeextracoal.ElementsAwesomeExtraCoalMod;

import net.minecraft.item.ItemStack;

@ElementsAwesomeExtraCoalMod.ModElement.Tag
public class FuelExtraCoalBlock3t extends ElementsAwesomeExtraCoalMod.ModElement {
	public FuelExtraCoalBlock3t(ElementsAwesomeExtraCoalMod instance) {
		super(instance, 12);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockExtraCoalBlock3.block, (int) (1)).getItem())
			return 2000000;
		return 0;
	}
}
