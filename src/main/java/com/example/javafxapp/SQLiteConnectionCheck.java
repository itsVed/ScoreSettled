package com.example.javafxapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnectionCheck {

    public static void main(String[] args) {
        String url = "jdbc:sqlite:mydatabase.db"; // Replace with your database file name

        // Attempt to connect to the SQLite database
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Connection to SQLite has been established.");
            }
        } catch (SQLException e) {
            System.out.println("Failed to connect to SQLite: " + e.getMessage());
        }
    }
}
