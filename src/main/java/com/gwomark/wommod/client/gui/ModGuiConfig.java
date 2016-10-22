package com.gwomark.wommod.client.gui;

import com.gwomark.wommod.handler.ConfigurationHandler;
import com.gwomark.wommod.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

/**
 * Created by gwomark on 10/20/16.
 */


/**
 * Defines what the Gui configuration page looks like for our mod specifically
 *
 */

public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig (GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
