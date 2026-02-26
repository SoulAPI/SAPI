package com.unfamoussoul.sapi.module;

import com.unfamoussoul.sapi.SAPI;
import com.unfamoussoul.sapi.api.command.DynamicCommand;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Абстрактный класс модуля для расширения функциональности SAPI.
 * Модули загружаются динамически из папки modules.
 */
public abstract class SAPIModule {

    protected SAPI plugin;

    protected SAPIModule(SAPI plugin) {}

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

    protected native void setKey(@NotNull String key);

    protected native void setVersion(int version);

    @Nullable protected native String getKey();

    protected native int getVersion();
}