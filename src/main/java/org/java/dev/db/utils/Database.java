package org.java.dev.db.utils;

import org.java.dev.Main;
import org.java.dev.properties.PropertyService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static final Database INSTANCE = new Database();
    private Connection connection;
    private Database () {
        String url = PropertyService.getDbProperty("url");
        String user = PropertyService.getDbProperty("user");
        String password = PropertyService.getDbProperty("password");
        try {
            connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static Database getInstance(){
        return INSTANCE;
    }
    public Connection getConnection() {
        return connection;
    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
