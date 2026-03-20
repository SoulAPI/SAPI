package com.unfamoussoul.sapi.api.module;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация для указания приоритета загрузки модуля.
 * Чем меньше значение, тем раньше загрузится модуль.
 * По умолчанию приоритет равен 100.
 * <pre><code>
 *     \@ModulePriority(10)
 *     public class MyModule extends SAPIModule { ... }
 * </code></pre>
 */
@SuppressWarnings("unused")
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ModulePriority {

    /**
     * Приоритет загрузки. Чем меньше значение, тем раньше загрузится модуль.
     */
    int value() default 100;
}

