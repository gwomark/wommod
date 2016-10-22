package com.gwomark.wommod;

import com.gwomark.wommod.proxy.IProxy;
import com.gwomark.wommod.reference.Reference;
import com.gwomark.wommod.handler.ConfigurationHandler;
import com.gwomark.wommod.util.LogHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by gwomark on 10/11/16.
*/

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class WomMod
{
    // This is the instance of our mod class;
    @Mod.Instance(Reference.MOD_ID)
    public static WomMod instance;

    // Here is an istance of our proxy
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    // Handles preinitialization events
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        LogHelper.info("Pre Initialization Complete!");
    }

    // Handles initialization events
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete!");

    }

    // Handles post initialization events
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }


}
