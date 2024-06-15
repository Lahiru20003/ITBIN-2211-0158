package Model;

import java.sql.*;

public class ConnectionProvider {
    public static Connection getCone() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load the MySQL JDBC driver
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lms", // Database URL
                "root", // Database username
                "" // Database password (empty for default)
            );
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public static Connection getCon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
