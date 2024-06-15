package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Model.ConnectionProvider;

public class ReturnBookModel {

    public ResultSet searchIssuedBook(String bookId, String studentId) {
        try {
            Connection con = ConnectionProvider.getCone();
            Statement st = con.createStatement();
            return st.executeQuery("select * from issue where bookID='" + bookId + "' and studentID='" + studentId + "'");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Error");
            return null;
        }
    }

    public void returnBook(String bookId, String studentId) {
        try {
            Connection con = ConnectionProvider.getCone();
            Statement st = con.createStatement();
            st.executeUpdate("update issue set returnBook='YES' where studentID='" + studentId + "' and bookID='" + bookId + "'");
            JOptionPane.showMessageDialog(null, "Book successfully returned");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Error");
        }
    }
}
