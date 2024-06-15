package controller;

import model.BookModel;

public class BookController {
    private BookModel bookModel;

    public BookController() {
        this.bookModel = new BookModel();
    }

    public void addBook(String bookID, String name, String publisher, String price, String pYear) {
        bookModel.addBook(bookID, name, publisher, price, pYear);
    }
}
