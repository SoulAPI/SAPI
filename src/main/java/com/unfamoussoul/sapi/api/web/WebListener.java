package com.unfamoussoul.sapi.api.web;

import io.javalin.Javalin;
import io.javalin.config.JavalinConfig;
import org.eclipse.jetty.util.thread.QueuedThreadPool;

import java.util.function.Consumer;


/**
 * Класс для создания веб-сервера на основе Javalin. Позволяет создавать и управлять веб-приложением,
 * а также предоставляет доступ к пулу потоков и самому приложению для настройки и обработки запросов.
 */
@SuppressWarnings("unused")
public abstract class WebListener {

    /**
     * Создать Javalin приложение с конфигурацией
     * @param config конфигурация для Javalin приложения
     */
    protected native Javalin create(Consumer<JavalinConfig> config);

    /**
     * Запустить Javalin приложение на указанном порту
     * @param port порт для прослушивания
     */
    public native void start(int port);

    /**
     * Остановить Javalin приложение
     */
    public native void stop();

    protected native QueuedThreadPool getThreadPool();

    protected native Javalin getApp();
}
