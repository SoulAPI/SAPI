package com.unfamoussoul.sapi.module;

import com.unfamoussoul.sapi.api.command.DynamicCommand;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Абстрактный класс модуля для расширения функциональности SAPI.
 * Модули загружаются динамически из папки modules.
 */
public interface SAPIModule {

    /**
     * Вызывается при загрузке модуля
     */
    void onEnable();

    /**
     * Вызывается при выгрузке модуля
     */
    void onDisable();

    /**
     * Добавляет команду на сервер
     */
    void addCommand(DynamicCommand @NotNull ... commands);

    /**
     * Удаляет команду с сервера
     */
    void removeCommand(DynamicCommand @NotNull ... commands);

    void setKey(@NotNull String key);

    void setVersion(int version);

    @Nullable String getKey();

    int getVersion();
}