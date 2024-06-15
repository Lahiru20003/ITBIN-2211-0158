package model;

import java.sql.Connection;
import javax.swing.JOptionPane;
import Model.ConnectionProvider;

public class DBSearch {
    private final Connection connection;

    public DBSearch() {
        connection = ConnectionProvider.getCone();
    }

    public boolean authenticateUser(String username, String password) {
        String hardcodedUsername = "lahiru";
        String hardcodedPassword = "12345";

        return username.equals(hardcodedUsername) && password.equals(hardcodedPassword);
    }
}

