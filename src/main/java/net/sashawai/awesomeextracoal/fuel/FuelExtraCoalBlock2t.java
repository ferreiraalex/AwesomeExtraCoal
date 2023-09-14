
package net.sashawai.awesomeextracoal.fuel;

import net.sashawai.awesomeextracoal.block.BlockExtraCoalBlock2;
import net.sashawai.awesomeextracoal.ElementsAwesomeExtraCoalMod;

import net.minecraft.item.ItemStack;

@ElementsAwesomeExtraCoalMod.ModElement.Tag
public class FuelExtraCoalBlock2t extends ElementsAwesomeExtraCoalMod.ModElement {
	public FuelExtraCoalBlock2t(ElementsAwesomeExtraCoalMod instance) {
		super(instance, 4);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockExtraCoalBlock2.block, (int) (1)).getItem())
			return 400000;
		return 0;
	}
}
