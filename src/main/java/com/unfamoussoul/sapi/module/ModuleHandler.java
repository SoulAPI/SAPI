package com.unfamoussoul.sapi.module;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

/**
 * Загрузчик и выгрузчик модулей
 */
public interface ModuleHandler {

    boolean loadModule(@NotNull String moduleName);

    boolean unloadModule(@NotNull String moduleName);

    void reloadModules();

    boolean isUnloaded(@NotNull String moduleName);

    @Nullable ModuleContainer getLoadedModule(@NotNull String moduleName);

    Set<String> getLoadedModules();

    Set<String> getAvailableModules();

}