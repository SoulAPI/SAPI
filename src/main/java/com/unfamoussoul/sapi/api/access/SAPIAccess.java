package com.unfamoussoul.sapi.api.access;

import org.bukkit.Server;

import java.util.logging.Logger;

/**
 * Пункт доступа к plugin переменной
 */
@SuppressWarnings("unused")
public interface SAPIAccess {

    /**
     * Получить язык сервера по умолчанию
     */
    String getDefaultLanguage();

    /**
     * Получить объект сервера
     */
    Server getServer();

    /**
     * Получить логгер. В контексте модуля — пишет от имени [SAPI:ModuleName]
     */
    Logger getLogger();
}

