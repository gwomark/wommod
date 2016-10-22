package com.gwomark.wommod.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by gwomark on 10/13/16.
 */
public class ConfigurationHandler
{
    public static Configuration configuration;

    public static void init(File configFile)
    {
        // Create the configuration object
        configuration = new Configuration(configFile);

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
