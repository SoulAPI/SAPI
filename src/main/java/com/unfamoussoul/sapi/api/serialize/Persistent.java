package com.unfamoussoul.sapi.api.serialize;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация для полей, которые должны автоматически сохраняться в .ser файл.
 * Пример:
 * <pre><code>
 *     \@Persistent(value = "player_phrases")
 *     private final Map<UUID, List<String>> playerPhrases = new HashMap<>();
 * </code></pre>
 * теперь любое изменение в playerPhrases будет сохраняться в файл plugins/SAPI/data/<имя_Модуля>/player_phrases.ser
 */
@SuppressWarnings("unused")
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Persistent {

    /**
     * Имя файла для сохранения
     */
    String value();
}