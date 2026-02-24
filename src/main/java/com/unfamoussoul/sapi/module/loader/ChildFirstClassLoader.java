package com.unfamoussoul.sapi.module.loader;

import org.jetbrains.annotations.NotNull;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * Приоритет загрузки классов
 */
public abstract class ChildFirstClassLoader extends URLClassLoader {

    protected ChildFirstClassLoader(@NotNull URL[] urls, @NotNull ClassLoader parent) {
        super(urls, parent);
    }
}
