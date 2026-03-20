package com.unfamoussoul.sapi.api.module;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Маркерная аннотация для критически важных модулей.
 * Если модуль с этой аннотацией не удаётся загрузить при старте плагина,
 * весь плагин SAPI будет отключён.
 * <pre><code>
 *     \@CriticalModule
 *     public class MyModule extends SAPIModule { ... }
 * </code></pre>
 */
@SuppressWarnings("unused")
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CriticalModule {
}

