package com.unfamoussoul.sapi;

import com.unfamoussoul.sapi.module.ModuleHandler;
import org.bukkit.command.CommandMap;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Главный класс SAPI. Отсюда можно использовать JavaPlugin методы
 */
@SuppressWarnings("unused")
public abstract class SAPI extends JavaPlugin {

    public abstract String getDefaultLanguage();

    public abstract CommandMap getCommandMap();

    public abstract ModuleHandler getModuleHandler();
}
