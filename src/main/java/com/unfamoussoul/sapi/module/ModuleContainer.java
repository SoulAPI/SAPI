package com.unfamoussoul.sapi.module;

/**
 * Контейнер с информацией о модуле
 */
public record ModuleContainer(SAPIModule module, ClassLoader classLoader) {}
