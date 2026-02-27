package com.unfamoussoul.sapi.module;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

/**
 * Загрузчик и выгрузчик модулей
 */
@SuppressWarnings("unused")
public abstract class ModuleHandler {

    public native boolean loadModule(@NotNull String moduleName);

    public native boolean unloadModule(@NotNull String moduleName);

    public native void reloadModules();

    public native boolean isUnloaded(@NotNull String moduleName);

    @Nullable public native ModuleContainer getLoadedModule(@NotNull String moduleName);

    public native Set<String> getLoadedModules();

    public native Set<String> getAvailableModules();

}