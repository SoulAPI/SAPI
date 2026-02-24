package com.unfamoussoul.sapi;

import com.unfamoussoul.sapi.module.ModuleHandler;
import org.bukkit.command.CommandMap;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class SAPI extends JavaPlugin {

    public abstract CommandMap getCommandMap();

    public abstract ModuleHandler getModuleHandler();
}
