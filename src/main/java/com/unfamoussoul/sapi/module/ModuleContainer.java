package com.unfamoussoul.sapi.module;

import com.unfamoussoul.sapi.module.loader.ChildFirstClassLoader;

/**
 * Контейнер с информацией о модуле
 */
public record ModuleContainer(SAPIModule module, ChildFirstClassLoader classLoader) {}
