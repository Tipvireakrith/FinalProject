package com.example.finalproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Label status;

    public void signup() {
        String usernameText = username.getText();
        String passwordText = password.getText();

        // Check if the username and password are valid
        if (usernameText.isEmpty() || passwordText.isEmpty()) {
            status.setText("Please enter a username and password.");
        } else { status.setText("Sign up successful!");
        }
    }


}
