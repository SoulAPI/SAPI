package com.unfamoussoul.sapi.api.database;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Класс конфигурации для работы с базами данных.
 * @param url JDBC строка подключения.
 * @param username в случае с базой данных, которым нужен пользователь для подключения (PostgreSQL, MySQL, MariaDB).
 * @param password в случае с базой данных, которым нужен пароль для подключения (PostgreSQL, MySQL, MariaDB).
 * @param maxPoolSize
 * @param minIdle
 * @param connectionTimeoutMs
 * @param idleTimeoutMs
 * @param maxLifetimeMs
 * @param type тип базы данных {@link DatabaseType}
 */
@SuppressWarnings("unused")
public record DatabaseConfig(
    String url,
    String username,
    String password,
    int maxPoolSize,
    int minIdle,
    long connectionTimeoutMs,
    long idleTimeoutMs,
    long maxLifetimeMs,
    DatabaseType type
) {

    /**
     * Создание стандартной конфигурации для SQLite на JDBC строке.
     * @param url JDBC строка подключения.
     * @return конфиг для создания экземпляра класса {@link DatabaseHandler}.
     */
    @Contract("_ -> new")
    public static @NotNull DatabaseConfig forSqlite(String url) {
        return new DatabaseConfig(url, null, null, 5, 2, 30_000, 600_000, 1_800_000, DatabaseType.SQLITE);
    }

    /**
     * Создание стандартной конфигурации для PostgreSQL на JDBC строке, пользователе и пароле.
     * @param url JDBC строка подключения.
     * @param user пользователь.
     * @param password пароль.
     * @return конфиг для создания экземпляра класса {@link DatabaseHandler}.
     */
    @Contract("_, _, _ -> new")
    public static @NotNull DatabaseConfig forPostgresql(String url, String user, String password) {
        return new DatabaseConfig(url, user, password, 10, 4, 30_000, 600_000, 1_800_000, DatabaseType.POSTGRESQL);
    }

    @Contract("_, _, _ -> new")
    public static @NotNull DatabaseConfig forMysql(String url, String user, String password) {
        return new DatabaseConfig(url, user, password, 10, 4, 30_000, 600_000, 1_800_000, DatabaseType.MYSQL);
    }

    @Contract("_, _, _ -> new")
    public static @NotNull DatabaseConfig forMariadb(String url, String user, String password) {
        return new DatabaseConfig(url, user, password, 10, 4, 30_000, 600_000, 1_800_000, DatabaseType.MARIADB);
    }
}