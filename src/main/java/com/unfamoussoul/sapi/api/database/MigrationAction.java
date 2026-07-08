package com.unfamoussoul.sapi.api.database;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Действие миграции. В одной версии может быть множество таких действий.
 */
@FunctionalInterface
public interface MigrationAction {
    void apply(Connection connection) throws SQLException;
}