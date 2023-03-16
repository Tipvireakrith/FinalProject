package com.example.finalproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController{
    private String  Username;
    private String  Email;
    private String Password;
    private String  Confirmpassword;
    SignUpController(String Username, String Email, String Password, String Confirmpassword){
        this.Username = Username;
        this.Email = Email;
        this.Password = Password;
        this.Confirmpassword = Confirmpassword;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getConfirmpassword() {
        return Confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        Confirmpassword = confirmpassword;
    }
}