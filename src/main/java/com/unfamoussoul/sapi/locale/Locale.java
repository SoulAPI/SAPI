package com.unfamoussoul.sapi.locale;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.tag.resolver.TagResolver;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;

/**
 * Локализация
 */
@SuppressWarnings("unused")
public abstract class Locale {

    protected Locale(ClassLoader loader) {

    }

    /**
     * Загрузить локализацию
     */
    public abstract void load(Logger logger, String defaultLanguage, String @NotNull ... languages);

    /**
     * Получить локализированный Component по ключу key в стандартной локализации
     */
    public abstract @NotNull Component message(@NotNull String key, TagResolver... resolvers);

    /**
     * Получить локализированный Component по ключу key в локализации пользователя
     */
    public abstract @NotNull Component message(@NotNull CommandSender sender, @NotNull String key, TagResolver... resolvers);

    /**
     * Получить локализированный String по ключу key в стандартной локализации
     */
    public abstract @NotNull String messageRaw(@NotNull String key, TagResolver... resolvers);
}