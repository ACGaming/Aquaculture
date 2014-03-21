package rebelkeithy.mods.aquaculture.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import rebelkeithy.mods.aquaculture.EntityCustomFishHook;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemAdminFishingRod extends ItemAquaculture {
	public Icon usingIcon;

	public ItemAdminFishingRod(int i, int d) {
		super(i);
		setMaxDamage(d);
		setMaxStackSize(1);
	}

	@SideOnly(Side.CLIENT)
	/**
	 * Returns True is the item is renderer in full 3D when hold.
	 */
	@Override
	public boolean isFull3D() {
		return true;
	}

	@SideOnly(Side.CLIENT)
	/**
	 * Returns true if this item should be rotated by 180 degrees around the Y axis when being held in an entities
	 * hands.
	 */
	@Override
	public boolean shouldRotateAroundWhenRendering() {
		return true;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		if(entityplayer.fishEntity != null) {
			int i = entityplayer.fishEntity.catchFish();
			// itemstack.damageItem(i, entityplayer);
			entityplayer.swingItem();

			if(!itemstack.hasTagCompound())
				itemstack.setTagCompound(new NBTTagCompound("tag"));

			NBTTagCompound tag = itemstack.getTagCompound();
			tag.setBoolean("using", false);
		} else {
			if(!itemstack.hasTagCompound())
				itemstack.setTagCompound(new NBTTagCompound("tag"));

			NBTTagCompound tag = itemstack.getTagCompound();
			
			world.playSoundAtEntity(entityplayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
			if(!world.isRemote) {
				world.spawnEntityInWorld(new EntityCustomFishHook(world, entityplayer, true, tag.getInteger("lureType"), tag.getInteger("color")));
			}
			entityplayer.swingItem();
			
			tag.setBoolean("using", true);
		}
		return itemstack;
	}

	@Override
	public Icon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining) {
		if(!stack.hasTagCompound())
			stack.setTagCompound(new NBTTagCompound("tag"));

		NBTTagCompound tag = stack.getTagCompound();

		if(tag.hasKey("using")) {
			boolean using = tag.getBoolean("using");
			if(using)
				return usingIcon;
		}

		return itemIcon;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		super.registerIcons(par1IconRegister);

		usingIcon = par1IconRegister.registerIcon("aquaculture:AdminFishingRodUsing");
	}
}