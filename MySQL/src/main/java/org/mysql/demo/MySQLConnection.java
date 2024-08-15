package org.mysql.demo;

import java.sql.*;

class MySqlConnection {

    public Connection getConnection() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "Vishnu@50";

        Connection connection = null;

        try {
            // Establishing a connection
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connection established successfully.");

            // Use the connection to interact with the database
            // ...

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to establish connection.");
        } 
    return connection;
    }
}

