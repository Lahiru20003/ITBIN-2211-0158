package model;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Model.ConnectionProvider;

public class BookModel {
    public void addBook(String bookID, String name, String publisher, String price, String pYear) {
        try {
            Connection con = ConnectionProvider.getCone();
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO book VALUES ('" + bookID + "','" + name + "','" + publisher + "','" + price+ "','" + pYear + "')");
            JOptionPane.showMessageDialog(null, "Successfully updated");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Book ID already exists");
        }
    }
}
