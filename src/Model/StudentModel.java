package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import Model.ConnectionProvider;
import javax.swing.JOptionPane;

public class StudentModel {
    public boolean saveStudent(String studentID, String firstName, String lastName, String facultyName, String courseName) {
        try {
            Connection con = ConnectionProvider.getCone();
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO student VALUES ('" + studentID + "','" + firstName + "','" + lastName + "','" + facultyName + "','" + courseName + "')");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Student ID already exists");
            return false;
        }
    }
}

