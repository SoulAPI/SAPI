package com.unfamoussoul.sapi.api.serialize;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация для полей, которые должны автоматически сохраняться в .ser файл
 */
@SuppressWarnings("unused")
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Persistent {

    /**
     * Имя файла для сохранения
     */
    String value();
    
    /**
     * Интервал авто-сохранения в тиках.
     * Стандартно 10 секунд
     * 0 секунд - отключено
     */
    long autoSave() default 200L;
}