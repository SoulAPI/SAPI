package com.unfamoussoul.sapi.api.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Абстрактный класс для создания обработчика базы данных
 */
@SuppressWarnings("unused")
public abstract class DatabaseHandler implements AutoCloseable {

    /**
     * Создание обработчика базы данных.
     * @param config конфиг базы данных {@link DatabaseConfig}
     * @param migrations список миграций базы данных {@link Migration}
     */
    protected DatabaseHandler(DatabaseConfig config, List<Migration> migrations) {
        //
    }

    /**
     * Получить подключение к базе данных.
     * @return класс подключения к базе данных {@link Connection}
     * @throws SQLException если вы допустили ошибку в SQL записи.
     */
    public native Connection connection() throws SQLException;

    /**
     * Метод закрытия обработчика
     */
    @Override
    public native void close();
}