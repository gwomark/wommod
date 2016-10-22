package com.gwomark.wommod.item.base;

import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.item.Item;

/**
 *
 *
 *
 * Created by gwomark on 10/21/16.
 */
public class ItemBase extends Item implements IItemVariantHolder<ItemBase>
{
    // This holds the name of the item
    private final String BASE_NAME;

    // Use an array to hold the variants of a particular Item
    private final String[] VARIANTS;

    public ItemBase(String name, String[] variants)
    {
        super();
        setRegistryName(name);
        setUnlocalizedName(name);
        // TODO: Set creative tab up for mod, then register items to creative tab
        //setCreativeTab()

    }


}
