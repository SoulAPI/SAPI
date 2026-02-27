package com.unfamoussoul.sapi.api.config;

import org.bukkit.configuration.file.FileConfiguration;
import org.jetbrains.annotations.NotNull;

/**
 * Менеджер конфигурации для модулей
 */
@SuppressWarnings("unused")
public interface ConfigHandler {

    /**
     * Получить файл конфига
     */
    @NotNull FileConfiguration getConfig();

    /**
     * Сохранить изменения в файле конфига
     */
    void saveConfig();

    /**
     * Перезагрузить конфиг
     */
    void reloadConfig();
}