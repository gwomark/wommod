package com.gwomark.wommod.item.base;

import net.minecraft.client.renderer.ItemMeshDefinition;

/**
 *
 * All credit here goes to Pahimar and the Equivalent Exchange 3 mod
 *
 * url to github repo: https://github.com/pahimar/Equivalent-Exchange-3
 *
 * Created by gwomark on 10/21/16.
 */
public interface IItemVariantHolder<Template extends ItemBase>
{
    public Template getItem();

    public String[] getVariants();

    //TODO: Figure out what MeshDefinitions are
    public ItemMeshDefinition getCustomMeshDefinition();
}
