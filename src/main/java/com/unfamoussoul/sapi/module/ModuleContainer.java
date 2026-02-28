package com.unfamoussoul.sapi.module;

import java.net.URLClassLoader;

/**
 * Контейнер с информацией о модуле
 */
public record ModuleContainer(SAPIModule module, URLClassLoader classLoader) {}
