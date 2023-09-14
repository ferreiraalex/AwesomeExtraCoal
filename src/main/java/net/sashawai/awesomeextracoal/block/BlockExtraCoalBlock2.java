
package net.sashawai.awesomeextracoal.block;

import net.sashawai.awesomeextracoal.creativetab.TabAwesomeExtraCoal;
import net.sashawai.awesomeextracoal.ElementsAwesomeExtraCoalMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

@ElementsAwesomeExtraCoalMod.ModElement.Tag
public class BlockExtraCoalBlock2 extends ElementsAwesomeExtraCoalMod.ModElement {
	@GameRegistry.ObjectHolder("awesome_extra_coal:extra_coal_block_2")
	public static final Block block = null;
	public BlockExtraCoalBlock2(ElementsAwesomeExtraCoalMod instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("extra_coal_block_2"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("awesome_extra_coal:extra_coal_block_2", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("extra_coal_block_2");
			setSoundType(SoundType.GROUND);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabAwesomeExtraCoal.tab);
		}
	}
}
