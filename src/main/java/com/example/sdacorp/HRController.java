package com.example.sdacorp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

import java.sql.SQLException;


public class HRController {

    @FXML
    private Label hrname;

    @FXML
    private Label hremail;

    @FXML
    private Label hrphone;

    @FXML
    private Label hraddress;

    HRModel hrModel=new HRModel();

    private int hr_id;

    public void sethr_id(int id) {
        hr_id = id;
    }

    HRMain.HRCRUD hrCRUD = new HRMain.HRCRUD();
    HRMain.HR hr;

    public void HRpage(Stage stage) throws IOException {

        // Fetch HR information here, just before displaying the scene
        try {
            hr = hrCRUD.getHR(hr_id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HR.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        // Access the HRController instance associated with the loaded FXML
        HRController hrController = fxmlLoader.getController();

        String name = hr.getName();
        String address = hr.getAddress();
        String ph = hr.getContact();
        String email = hr.getEmail();

        hrController.hrname.setText(name);
        hrController.hraddress.setText(address);
        hrController.hrphone.setText(ph);
        hrController.hremail.setText(email);

        // Set up the stage
        stage.setResizable(false);
        stage.setTitle("HR Page");
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    void onclickrgistrationbtn() throws IOException {

            hrModel.hr_registrationpage(new Stage());

    }

    @FXML
    void onclickupdateinfobtn() throws IOException {

            hrModel.hr_updateinfopage(new Stage());
    }
}
