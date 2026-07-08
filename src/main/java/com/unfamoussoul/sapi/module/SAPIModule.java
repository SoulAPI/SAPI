package com.unfamoussoul.sapi.module;

import com.unfamoussoul.sapi.SAPI;
import com.unfamoussoul.sapi.api.command.DynamicCommand;
import com.unfamoussoul.sapi.api.config.ConfigHandler;
import com.unfamoussoul.sapi.api.database.DatabaseHandler;
import com.unfamoussoul.sapi.api.web.WebListener;
import com.unfamoussoul.sapi.locale.Locale;
import org.bukkit.event.Listener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.logging.Logger;

/**
 * Абстрактный класс модуля для расширения функциональности SAPI.
 * Модули загружаются динамически из папки modules.
 */
@SuppressWarnings("unused")
public abstract class SAPIModule {

    protected SAPIModule(SAPI plugin) {
        //
    }

    /**
     * Вызывается при загрузке модуля
     */
    public native void onEnable();

    /**
     * Вызывается при выгрузке модуля
     */
    public native void onDisable();

    /**
     * Добавляет команду на сервер
     */
    protected native void addCommand(DynamicCommand @NotNull ... commands);

    /**
     * Удаляет команду с сервера
     */
    protected native void removeCommand(DynamicCommand @NotNull ... commands);

    /**
     * Добавляет листенер ивентов с сервера
     */
    protected native void addListener(Listener @NotNull ... listeners);

    /**
     * Удаляет листенер ивентов с сервера
     */
    protected native void removeListener(Listener @NotNull ... listeners);

    /**
     * Добавляет веб-листенер с сервера
     * @param listener Веб-листенер для добавления
     * @param port Порт, на котором будет работать веб-листенер
     */
    protected native void addWebListener(WebListener listener, int port);

    /**
     * Удаляет веб-листенер с сервера
     */
    protected native void removeWebListener(WebListener @NotNull ... listeners);

    /**
     * Добавляет обработчик базы данных.
     * @param handler обработчик базы данных {@link DatabaseHandler}
     */
    protected native void addDatabaseHandler(DatabaseHandler handler);

    /**
     * Убирает обработчик базы данных.
     * @param handlers обработчики баз данных {@link DatabaseHandler}
     */
    protected native void removeDatabaseHandler(DatabaseHandler @NotNull ... handlers);

    /**
     * Загрузка локализации. После этого вы можете использовать getLocale() для получения локализированого текста
     */
    protected native void loadLocale(String defaultLanguage, String... languages);

    /**
     * Получить ConfigHandler переменную. После загрузки вы можете использовать её, чтобы работать с конфигом.
     */
    protected native ConfigHandler getConfigHandler(String configFile);

    /**
     * Получить Locale переменную. Обязательно используйте loadLocale(String... languages) перед этим!
     */
    public native Locale getLocale();

    /**
     * Инициализация persistent полей
     */
    protected native void initPersistentFields();

    /**
     * Сохранение всех persistent полей
     */
    public native void savePersistentFields();

    /**
     * Получить имя модуля
     */
    public native String getModuleName();

    /**
     * Получить логгер модуля. префикс "[SAPI:ИмяМодуля]"
     */
    public native Logger getLogger();

    /**
     * Язык по умолчанию
     */
    public native String getDefaultLanguage();

    /**
     * Получить другой модуль по имени
     *
     * @return модуль или null, если модуль не загружен
     */
    @Nullable
    public native SAPIModule getModule(@NotNull String moduleName);

    protected native void setAPI(ModuleAPI moduleAPI);

    protected native void setKey(@NotNull String key);

    protected native void setVersion(int version);

    @Nullable public native String getKey();

    public native int getVersion();

    public native ModuleAPI getAPI();

    public native SAPI getPlugin();
}