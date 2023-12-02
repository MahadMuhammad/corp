package com.example.sdacorp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HRUpdateInfoController {

    HRModel hrModel = new HRModel();

    @FXML
    private TextField add;

    @FXML
    private TextField contact;

    @FXML
    private TextField email;

    @FXML
    private TextField password;

    @FXML
    private Label updlabel;

    @FXML
    private TextField username;



    @FXML
    void onclickupdatebtn() {

        updlabel.setText("UPDATED");

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
