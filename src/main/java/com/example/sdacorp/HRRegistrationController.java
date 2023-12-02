package com.example.sdacorp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HRRegistrationController {

    @FXML
    private TextField add;

    @FXML
    private TextField contact;

    @FXML
    private TextField dob;

    @FXML
    private TextField email;

    @FXML
    private TextField name;

    @FXML
    private TextField password;

    @FXML
    private Label setlabel_registration;

    @FXML
    private TextField username;

    HRModel hrModel = new HRModel();




    @FXML
    void onclickregisterbtn(ActionEvent event) {

        if(username.getText().isBlank() || add.getText().isBlank() || contact.getText().isBlank() ||dob.getText().isBlank() || email.getText().isBlank()
        || name.getText().isBlank() || password.getText().isBlank() )
        {
            setlabel_registration.setText("Fill all the fields");
        }

    }

    @FXML
    void onclickrgistrationbtn(ActionEvent event) throws IOException {

        hrModel.hr_registrationpage(new Stage());


    }

    @FXML
    void onclickupdateinfobtn(ActionEvent event) throws IOException {

        hrModel.hr_updateinfopage(new Stage());


    }







}
