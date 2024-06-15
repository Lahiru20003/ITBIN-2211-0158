package controller;

import model.ReturnBookModel;
import java.sql.ResultSet;

public class ReturnBookController {
    private ReturnBookModel model;

    public ReturnBookController() {
        model = new ReturnBookModel();
    }

    public ResultSet searchIssuedBook(String bookId, String studentId) {
        return model.searchIssuedBook(bookId, studentId);
    }

    public void returnBook(String bookId, String studentId) {
        model.returnBook(bookId, studentId);
    }
}
