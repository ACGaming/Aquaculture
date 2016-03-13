package com.teammetallurgy.aquaculture.items.meta;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

public class MetaItem extends Item {
    ArrayList<SubItem> subItems;

    public MetaItem() {
        super();
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }

    public int addSubItem(SubItem subItem) {
        if (subItems == null)
            subItems = new ArrayList<SubItem>();

        subItems.add(subItem);
        return subItems.size() - 1;
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        int i = MathHelper.clamp_int(itemStack.getItemDamage(), 0, subItems.size() - 1);
        String uname = subItems.get(i).getUnlocalizedName(itemStack);
        uname = uname.replace(" ", "_");
        return "item." + uname;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> itemStackList) {
        for (SubItem subItem : subItems) {
            itemStackList.add(subItem.getItemStack());
        }
    }

    // ItemRedirects
    @Override
    public ItemStack onItemUseFinish(ItemStack itemStack, World world, EntityPlayer player) {
        int damage = itemStack.getItemDamage();
        if (damage >= 0 && damage < subItems.size()) {
            return subItems.get(damage).onEaten(itemStack, world, player);
        }

        return itemStack;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack itemStack) {
        int damage = itemStack.getItemDamage();
        if (damage >= 0 && damage < subItems.size()) {
            return subItems.get(damage).getMaxItemUseDuration(itemStack);
        }

        return 0;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack itemStack) {
        int damage = itemStack.getItemDamage();
        if (damage >= 0 && damage < subItems.size()) {
            return subItems.get(damage).getItemUseAction(itemStack);
        }

        return EnumAction.NONE;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        int damage = itemStack.getItemDamage();
        if (damage >= 0 && damage < subItems.size()) {
            return subItems.get(damage).onItemRightClick(itemStack, world, player);
        }

        return itemStack;
    }
}
