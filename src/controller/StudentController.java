package controller;

import view.NewStudent;

public class StudentController {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new NewStudent().setVisible(true);
        });
    }
}


