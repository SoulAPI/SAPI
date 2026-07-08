package com.unfamoussoul.sapi.api.database;

/**
 * Класс, который нужен для хранения версии и действий.
 * Просто храните миграции таким образом и база данных автоматически при запуске {@link DatabaseHandler} мигрировать на самую новую версию.
 * <p>
 * Пример:
 * <pre><code>
 * public class TestDatabaseHandler extends DatabaseHandler {
 *
 *     protected TestDatabaseHandler(DatabaseConfig config) {
 *         super(
 *                 config,
 *                 List.of(
 *                 // Создаём базу данных players в первой версии.
 *                 new Migration(1, c -> c.createStatement()
 *                         .execute("CREATE TABLE players (id INTEGER PRIMARY KEY, name TEXT)")),
 *                 // При обновлении кода потребовалось добавить колонку score в базу данных. При запуске модуля база данных сама обновится до второй версии.
 *                 new Migration(2, c -> c.createStatement()
 *                         .execute("ALTER TABLE players ADD COLUMN score INTEGER DEFAULT 0"))
 *         ));
 *     }
 * }
 * </code></pre>
 * @param version версия миграции
 * @param action действие миграции {@link MigrationAction}
 */
public record Migration(int version, MigrationAction action) {}