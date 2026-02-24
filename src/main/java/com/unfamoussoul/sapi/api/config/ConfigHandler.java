package com.unfamoussoul.sapi.api.config;

import org.bukkit.configuration.file.FileConfiguration;
import org.jetbrains.annotations.NotNull;

/**
 * Менеджер конфигурации для модулей
 */
public interface ConfigHandler {

    @NotNull FileConfiguration getConfig();

    void saveConfig();

    void reloadConfig();
}