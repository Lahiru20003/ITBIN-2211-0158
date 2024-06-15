package controller;

import model.DBSearch;

public class LoginController {
    private DBSearch dbSearch;

    public LoginController() {
        dbSearch = new DBSearch();
    }

    public boolean authenticateUser(String username, String password) {
        return dbSearch.authenticateUser(username, password);
    }
}
