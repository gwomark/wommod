package com.gwomark.wommod.handler;

import com.gwomark.wommod.reference.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

/**
 * Created by gwomark on 10/13/16.
 */
public class ConfigurationHandler
{
    public static Configuration configuration;

    public  static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.getModID().equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }

    public static void loadConfiguration ()
    {
        try
        {
            // Load the configuration file
            configuration.load();

            //Read in the configuration file
            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
        }
        catch (Exception e)
        {
            // Log the exception
        }
        finally
        {
            if (configuration.hasChanged())
            {
                // Save the configuration file
                configuration.save();
            }
        }
    }
}
