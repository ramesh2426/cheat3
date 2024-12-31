import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args){

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("MySQL JDBC Driver not found", e);
        }

        String CONN_STRING = "jdbc:mysql://localhost:3306/studentmca";
        String user = "root";  // Replace with your database user
        String password = "";  // Replace with your database password

        // Create a connection to the database and execute the query
        try (Connection connection = DriverManager.getConnection(CONN_STRING, user, password);
             Statement statement = connection.createStatement()) {

            // SQL query to create the table with the specified columns
            String query = "CREATE TABLE employees ("
                    + "ID INT(20) PRIMARY KEY, "
                    + "NAME VARCHAR(20) NOT NULL, "
                    + "LOCATION VARCHAR(20) NOT NULL, "
                    + "SALARY INT(10) NOT NULL"
                    + ")";

            // Execute the query
            statement.executeUpdate(query);
            System.out.println("Created Table Employees...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
