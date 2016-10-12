package com.gwomark.wommod;

import com.gwomark.wommod.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by gwomark on 10/11/16.
*/

@Mod(modid="wommod", name="Wom Mod", version="1.10.2-1.0")
public class WomMod
{
    @Mod.Instance("wommod")
    public static WomMod instance;

    @SidedProxy(clientSide = "com.gwomark.wommod.proxy.ClientProxy", serverSide = "com.gwomark.wommod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }


}
