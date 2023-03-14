package com.example.finalproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Label status;

    public void login() {
        String usernameText = username.getText();
        String passwordText = password.getText();

        // Check if the username and password are valid
        if (usernameText.isEmpty() || passwordText.isEmpty()) {
            status.setText("Please enter a username and password.");
        } else {
            // TODO: Add logic to check if the username and password match what is stored
            // If they match, log the user in and navigate to the main page
            // If they don't match, show an error message
        }
    }

}
