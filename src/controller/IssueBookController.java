package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import Model.ConnectionProvider;

public class IssueBookController {
    public void issueBook(String bookID, String studentID, String issueDate, String dueDate) {
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        String returnBook = "No";
        try {
            Connection con = ConnectionProvider.getCone();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM book WHERE bookID='" + bookID + "'");
            if (rs.next()) {
                ResultSet rsl = st.executeQuery("SELECT * FROM student WHERE studentID='" + studentID + "'");
                if (rsl.next()) {
                    st.executeUpdate("INSERT INTO issue VALUES ('" + bookID + "', '" + studentID + "', '" + issueDate + "', '" + dueDate + "', '" + returnBook + "')");
                    JOptionPane.showMessageDialog(null, "Book successfully issued");
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect studentID"); 
                }
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect BookID"); 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection error"); 
        }
    }
}
