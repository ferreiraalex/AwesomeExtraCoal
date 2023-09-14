
package net.sashawai.awesomeextracoal.creativetab;

import net.sashawai.awesomeextracoal.block.BlockExtraCoalBlock2;
import net.sashawai.awesomeextracoal.ElementsAwesomeExtraCoalMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsAwesomeExtraCoalMod.ModElement.Tag
public class TabAwesomeExtraCoal extends ElementsAwesomeExtraCoalMod.ModElement {
	public TabAwesomeExtraCoal(ElementsAwesomeExtraCoalMod instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabawesome_extra_coal") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockExtraCoalBlock2.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
