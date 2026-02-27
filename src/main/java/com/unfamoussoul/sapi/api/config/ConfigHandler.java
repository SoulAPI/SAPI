package com.unfamoussoul.sapi.api.config;

import org.bukkit.configuration.file.FileConfiguration;
import org.jetbrains.annotations.NotNull;

/**
 * Менеджер конфигурации для модулей
 */
@SuppressWarnings("unused")
public abstract class ConfigHandler {

    /**
     * Получить файл конфига
     */
    public native @NotNull FileConfiguration getConfig();

    /**
     * Сохранить изменения в файле конфига
     */
    public native void saveConfig();

    /**
     * Перезагрузить конфиг
     */
    public native void reloadConfig();
}