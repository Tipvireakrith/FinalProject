package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SwithScence {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void SignUp(ActionEvent signup) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        stage = (Stage) ((Node) signup.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Sing Up");
        stage.show();
    }

    public void Login(ActionEvent signup1) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage = (Stage) ((Node) signup1.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();
    }

    public void MainMenu(ActionEvent signup1) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        stage = (Stage) ((Node) signup1.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Menu");
        stage.show();
    }


    @FXML
    private Button CreateAccount;
    @FXML
    void Create(ActionEvent event) throws IOException{
        System.out.println("Goto");
        Parent root = FXMLLoader.load(getClass().getResource("MenuButton.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Menu");
        stage.show();
    }


    @FXML
    private Button check;
    @FXML
    void check(ActionEvent event) throws IOException{
        System.out.println("Check button");
        Parent root = FXMLLoader.load(getClass().getResource("Attendace.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Menu");
        stage.show();

    }


    public void CheckName (ActionEvent checkname) throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("History.fxml"));
        stage = (Stage) ((Node) checkname.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("History");
        stage.show();

    }
    public void aboutUs (ActionEvent Aboutus) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("About Us.fxml"));
        stage = (Stage) ((Node) Aboutus.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("AboutUs");
        stage.show();
    }
    public void back (ActionEvent back) throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("MenuButton.fxml"));
        stage = (Stage) ((Node) back.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Menu");
        stage.show();

    }


}
