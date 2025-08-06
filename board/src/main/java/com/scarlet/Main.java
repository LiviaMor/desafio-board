package com.scarlet;

import com.scarlet.persistence.migration.MigrationStrategy;
import com.scarlet.ui.MainMenu;

import java.sql.SQLException;

import static com.scarlet.persistence.config.ConnectionConfig.getConnection;

public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}