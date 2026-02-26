package com.unfamoussoul.sapi;

import com.unfamoussoul.sapi.locale.Locale;
import com.unfamoussoul.sapi.module.ModuleHandler;
import org.bukkit.command.CommandMap;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Главный класс SAPI. Отсюда можно использовать JavaPlugin методы
 */
public abstract class SAPI extends JavaPlugin {

    public abstract Locale getLocale();

    public abstract CommandMap getCommandMap();

    public abstract ModuleHandler getModuleHandler();
}
