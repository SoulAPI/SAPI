package com.unfamoussoul.sapi.api.module;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация для указания зависимостей модуля.
 * Модули-зависимости будут загружены перед текущим модулем.
 * <pre><code>
 *     \@ModuleDependency({"TextAPI", "SomeOtherModule"})
 *     public class MyModule extends SAPIModule { ... }
 * </code></pre>
 */
@SuppressWarnings("unused")
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ModuleDependency {

    /**
     * Имена модулей, от которых зависит текущий модуль.
     */
    String[] value();
}

