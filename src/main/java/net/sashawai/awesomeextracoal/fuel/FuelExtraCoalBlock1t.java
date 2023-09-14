
package net.sashawai.awesomeextracoal.fuel;

import net.sashawai.awesomeextracoal.block.BlockExtraCoalBlock1;
import net.sashawai.awesomeextracoal.ElementsAwesomeExtraCoalMod;

import net.minecraft.item.ItemStack;

@ElementsAwesomeExtraCoalMod.ModElement.Tag
public class FuelExtraCoalBlock1t extends ElementsAwesomeExtraCoalMod.ModElement {
	public FuelExtraCoalBlock1t(ElementsAwesomeExtraCoalMod instance) {
		super(instance, 2);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockExtraCoalBlock1.block, (int) (1)).getItem())
			return 80000;
		return 0;
	}
}
