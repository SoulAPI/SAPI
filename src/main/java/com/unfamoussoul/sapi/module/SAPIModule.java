package com.unfamoussoul.sapi.module;

import com.unfamoussoul.sapi.SAPI;
import com.unfamoussoul.sapi.api.command.DynamicCommand;
import com.unfamoussoul.sapi.api.config.ConfigHandler;
import com.unfamoussoul.sapi.locale.Locale;
import org.bukkit.event.Listener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * Абстрактный класс модуля для расширения функциональности SAPI.
 * Модули загружаются динамически из папки modules.
 */
@SuppressWarnings("unused")
public abstract class SAPIModule {

    protected SAPI plugin;

    protected final List<Listener> registeredListeners = new ArrayList<>();
    protected final List<DynamicCommand> registeredCommands = new ArrayList<>();

    protected SAPIModule(SAPI plugin) {
        this.plugin = plugin;
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
    protected native Locale getLocale();

    protected native void setKey(@NotNull String key);

    protected native void setVersion(int version);

    @Nullable public native String getKey();

    public native int getVersion();
}