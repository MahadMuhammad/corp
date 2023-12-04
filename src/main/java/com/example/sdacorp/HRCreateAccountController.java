package com.example.sdacorp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Objects;

public class HRCreateAccountController {

    @FXML
    private Label forclosing;

    @FXML
    private TextField address;

    @FXML
    private TextField contact;

    @FXML
    private DatePicker dob;

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

    @FXML
    private ComboBox<?> CreateFor;

    HRModel hrModel = new HRModel();


    ManagerMain.ManagerCRUD managerCRUD= new ManagerMain.ManagerCRUD();
    ManagerMain.Manager manager;








    @FXML
    void OnClickCreateBtn(ActionEvent event) {


        if(username.getText().isBlank() || address.getText().isBlank() || contact.getText().isBlank() ||dob == null || email.getText().isBlank()
                || name.getText().isBlank() || password.getText().isBlank() )
        {
            setlabel_registration.setText("Fill all the fields");
            return;
        }
        else if(Objects.equals(CreateFor.getValue(), "Manager"))
        {
            setlabel_registration.setText("Select Create For");
        }



    }


    @FXML
    void OnClickCreateAccount(ActionEvent event) throws IOException{

        hrModel.hr_CreateAccountPage(new Stage());
        close_stage();

    }


    @FXML
    void onclickrgistrationbtn(ActionEvent event) throws IOException {

        hrModel.hr_registrationpage(new Stage());
        close_stage();


    }

    @FXML
    void onclickupdateinfobtn(ActionEvent event) throws IOException {

        hrModel.hr_updateinfopage(new Stage());
        close_stage();


    }

    @FXML
    void OnClickHomeBtn(ActionEvent event)throws IOException {

        hrModel.hr_Homepage(new Stage());
        close_stage();

    }

    public void close_stage()
    {
        Stage closestage = (Stage) forclosing.getScene().getWindow();
        closestage.close();
    }







}
