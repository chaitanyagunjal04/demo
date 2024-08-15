
import java.sql.*;

class MySqlConnection {
    public static void main(String[] args) {
        System.out.println("This is mySQL Connection class");
        
        MySqlConnection con = new MySqlConnection();
        con.getConnection();

    }

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
        } finally {
            // Close the connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    return connection;
    }
}

